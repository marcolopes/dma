/*
   file: Microscope.java
   author: Doug Lea
   history:
   initial version: Mon Sep  4 20:19:46 1995  Doug Lea  (dl at gee)
   v2: Thu Sep  7 07:11:52 1995  Doug Lea  (dl at gee)
	  Changed move finder to use early reply thread.
	  refactored to make User class symmetrical with auto mover.
	  other misc cosmetics.
   v3: Sat Oct  7 09:50:48 1995  Doug Lea  (dl at gee)
	   Ran through beta upgrade and fixed to work with beta.
   Wed Feb 14 06:47:27 1996  Doug Lea  (dl at gee)
	   Experimented with thread control to make better-behaved
	   with netscape-2, that seems to not deal with priorities and/or yielding
	   correctly.

 */

package applets;

import java.awt.*;
import java.util.Vector;

/* 
   Microscope implements a version of the 7th Guest
   game found looking in the Microscope in the laboratory.

   classes:

   Microscope: 
	 The java.applet.Applet. Handles state of game, presentation and user interaction

   Board:
	 The internal representation of tiles on the board

   Player:
	 The representation of players/tiles

   Move:
	 Representation of a transition from one board state to another

   Mover:
	 Abstract class for either user or auto mover

   AutoMover extends Mover
	 A search engine for finding good moves, designed to run as a thread

   User extends Mover
	 Transform clicks into user moves
*/
public class Microscope extends java.applet.Applet {

	// representations:

	Board board;        // The current board representation
	Player player;      // current player (BLUE, GREEN)
	Vector history;     // List of completed moves;
	AutoMover auto;     // The move finder.
	User user;          // Mover for user moves
	Mover mover;        // the current Mover (always == auto or user or null)

	// constructors and initializers:

	public Microscope() {  
		auto = new AutoMover(this);
		user = new User(this);
		mover = null;
		board = new Board();
		player = Player.Blue;
		history = new Vector();
	}

	public void init()  {
		//    resize((Board.RANKS + 3) * CELL_SIZE, (Board.RANKS + 1) * CELL_SIZE);
		restartGame();
	}

	synchronized void restartGame() {

		board.reset();
		board.occupy(Player.Blue,   0,             0);
		board.occupy(Player.Blue,   Board.RANKS-1, Board.RANKS-1);
		board.occupy(Player.Green,  0,             Board.RANKS-1);
		board.occupy(Player.Green,  Board.RANKS-1, 0);
		player = Player.Blue;

		history.removeAllElements();
		stopMover();
	}

	// process a move (called only from mover)

	public synchronized void move(Move m) {
		if (m.isLegal()) {
			m.commit();
			board = m.board();
			player = m.player().opponent();
			history.addElement(m);
		}
		mover = null;
		repaint();
	}

	// start up a Mover
	synchronized void startMover(Mover m) {
		if (mover == null) {
			mover = m;
			mover.startTurn(new Board(board), player);
		}
	}

	// stop current Mover
	synchronized void stopMover() {
		if (mover != null) {
			mover.cancel();
			mover = null;
		}
	}

	// handle auto/cancel button
	synchronized void findOrCancel() {
		if (mover == null) startMover(auto);
		else stopMover();
	}

	// handle Undo button
	synchronized void undo() {
		if (mover == null) {
			if (history.size() <= 1)
				restartGame();
			else {
				history.removeElementAt(history.size()-1);
				Move m = (Move)(history.lastElement());
				board = m.board();
				player = m.player().opponent();
			}
		}
	}

	// handle click on tile
	synchronized void userMove(int row, int col) {
		startMover(user);
		user.choose(row, col);
	}

	// Presentation:
	
	// First, some constants and utilities for screen presentation

	static final int CELL_SIZE = 40; // size of a tile/cell 

	static final int BUTTON_OFFSET = 5; // buttons 5 pixels smaller than tiles
	static final int BUTTON_WIDTH = CELL_SIZE * 2;
	static final int BUTTON_HEIGHT = CELL_SIZE - 2 * BUTTON_OFFSET;
	static final int BUTTON_X = Board.RANKS + 1;

	static final Color paleGreen = new Color(152, 251, 152);
	static final Color darkGreen = new Color(60, 179, 113);
	static final Color buttonColor = Color.pink;
	static final Color possibleMoveColor = Color.yellow;

	public static Color displayColor(Player pl) {
		if (pl.isBlue()) return Color.blue;
		else if (pl.isGreen()) return darkGreen;
		else return Color.white;
	}

	public static Color lightDisplayColor(Player pl) {
		if (pl.isBlue()) return Color.cyan;
		else if (pl.isGreen()) return paleGreen;
		else return Color.gray;
	}

	public void paint(Graphics g) {

		// the cells
		for (int row = 0; row < Board.RANKS; row++) {
			for (int col = 0; col < Board.RANKS; col++) {

				// Highlight selected tile and legal destinations
				if (user.placing()) {
					if (user.hasMovedFrom(row, col)) 
						g.setColor(lightDisplayColor(player));
					else if (user.canMoveTo(row, col))
						g.setColor(possibleMoveColor);
					else
						g.setColor(displayColor(board.occupant(row, col)));
				}

				else
					g.setColor(displayColor(board.occupant(row, col)));

				// tiles are just filled rectangles
				g.fillRect(row * CELL_SIZE, col * CELL_SIZE, CELL_SIZE, CELL_SIZE);
			}
		}

		// the grid over the cells
		g.setColor(Color.black);
		for ( int i = 0; i <= Board.RANKS; i++) {
			g.drawLine(0, i * CELL_SIZE, Board.RANKS * CELL_SIZE, i * CELL_SIZE);
			g.drawLine(i * CELL_SIZE, 0, i * CELL_SIZE, Board.RANKS * CELL_SIZE);
		}

		// the buttons
		for (int i = 0; i < Board.RANKS; ++i) {

			switch(i) {
			case 0: g.setColor(lightDisplayColor(player)); break;
			default: g.setColor(buttonColor);              break;
			}
			g.fillRect(BUTTON_X * CELL_SIZE + BUTTON_OFFSET, 
					i * CELL_SIZE + BUTTON_OFFSET, 
					BUTTON_WIDTH, 
					BUTTON_HEIGHT);

			String label = null;
			switch(i) {
			case 0: label = "Score: " + board.score(player);
			break;
			case 1: if (mover != null && mover.placing()) label = "Cancel";
			else label = "Auto (" + auto.level() + ")";
			break;
			case 2: label = "++Level"; break;
			case 3: label = "--Level"; break;
			case 4: label = "  Pass";  break;
			case 5: label = "  Undo";  break;
			case 6: label = " Reset";  break;
			default: break;
			}
			g.setColor(Color.black);
			g.drawString(label, BUTTON_X * CELL_SIZE + 10, i * CELL_SIZE + 25);
		}

		if (mover == auto && auto.placing()) auto.go();
	}


	// Interaction:

	public synchronized boolean mouseUp (Event evt, int x, int y) {

		int row = x / CELL_SIZE;
		int col = y / CELL_SIZE;

		if (Board.inBounds(row, col)) { // cell selection
			userMove(row, col);
		}
		else if (x >= BUTTON_X) {       // button selection
			switch (col) {
			case 0:  break;
			case 1: findOrCancel(); break;
			case 2: auto.changeLevel(1); break;
			case 3: auto.changeLevel(-1); break;
			case 4: userMove(Move.PASS_VALUE, Move.PASS_VALUE); break;
			case 5: undo(); break;
			case 6: restartGame(); break;
			default: break;
			}
		}

		repaint();
		return true;
	}

}

/*
  Player is just a glorified enumeration
*/
class Player {

	public static final int EMPTY = 0;
	public static final int BLUE = 1;
	public static final int GREEN = 2;
	public static final int ILLEGAL_PLAYER_VALUE = 3;

	public static final Player Empty   = new Player(EMPTY);
	public static final Player Blue    = new Player(BLUE);
	public static final Player Green   = new Player(GREEN);
	public static final Player Illegal = new Player(ILLEGAL_PLAYER_VALUE);

	private int code_;

	public Player(int code)       { code_ = code; }
	public Player(Player p)       { code_ = p.code_; }

	public boolean same(Player p) { return code_ == p.code_; }

	public boolean isEmpty()      { return code_ == EMPTY; }
	public boolean isBlue()       { return code_ == BLUE; }
	public boolean isGreen()      { return code_ == GREEN; }
	public boolean isLegal()      { return code_ <= GREEN; }

	public Player opponent()      { if (isGreen()) return Blue;
	else if (isBlue()) return Green;
	else return Illegal;
	}

}

/*
   Board configurations are represented by bit vectors.
   Since there are only 49 cells, the bits can be held in `longs',
   one for each player.

   This code is really ugly; hand-tuned to speed up the move finder,
   plus some probably-superstitious code to work around
   some apparent strangenesses with bit operations on longs.
*/
final class Board   {

	/* 
	 First, some Constants and utilities that might as well be here
	 */

	public static final int RANKS = 7;
	public static final int CELLS = RANKS * RANKS;

	public static boolean inBounds(int row, int col) {
		return (0 <= row)  && (row < RANKS) && (0 <= col) && (col < RANKS);
	}

	// The representation

	long blue_;      // bit vector; true if occupied by blue
	long green_;     // same for green;
	long mark_;      // 1 bit marker used by the finder in course of search.
	// Doesn't really belong here, but put here anyway
	// since it uses same bit-poking mechanics as other ops.

	// constructors and intializers:

	public Board()             { blue_ = 0L; green_ = 0L; mark_ = 0L; }
	public Board(Board b)      { blue_ = b.blue_; green_ = b.green_; mark_ = 0L; }

	public void copyState(Board b) { blue_ = b.blue_; green_ = b.green_; }
	public void reset()            { blue_ = 0L; green_ = 0L; mark_ = 0L; }

	// state accessors:

	public Player occupant(int row, int col) {
		if (!inBounds(row, col)) return Player.Illegal;

		int i = row + col * RANKS;
		long m = 1L << i;
		long t = blue_ & m;
		if (t != 0L) return Player.Blue;
		t = green_ & m;
		if (t != 0L) return Player.Green;
		return Player.Empty;
	}

	public int numberOccupiedBy(Player player) {
		int c = 0;
		long m = 1L;

		if (player.isBlue()) {
			for (int i = 0; i < CELLS; ++i) {
				if ((blue_ & m) != 0L) ++c; 
				m <<= 1;
			}
		}
		else if (player.isGreen()) {
			for (int i = 0; i < CELLS; ++i) {
				if ((green_ & m) != 0L) ++c; 
				m <<= 1;
			}
		}
		else if (player.isEmpty()) {
			for (int i = 0; i < CELLS; ++i) {
				if (((blue_ | green_) & m) == 0L) ++c; 
				m <<= 1;
			}
		}
		return c;
	}

	public int score(Player player) {
		return numberOccupiedBy(player) - numberOccupiedBy(player.opponent());
	}

	// actions

	// place a tile without taking opponent tiles

	public void occupy(Player player, int row, int col) {
		int i = row + col * RANKS;
		long m = 1L << i;
		long nm = ~m;
		long tb = 0L;
		long tg = 0L;
		if (player.isBlue())  { 
			tb = blue_ | m;
			tg = green_ & nm;
		}
		else if (player.isGreen()) { 
			tb = blue_ & nm;
			tg = green_ | m;
		}
		else { 
			tb = blue_ & nm;
			tg = green_ & nm;
		}
		blue_ = tb;
		green_ = tg;
	}

	// place a tile, taking all adjacent tiles of opponent

	public void take(Player player, int row, int col) {

		boolean blu = player.isBlue();
		if (!blu && !player.isGreen()) return;

		int loR = row - 1;
		if (loR < 0) loR = 0;
		int hiR = row + 1;
		if (hiR >= RANKS) hiR = RANKS-1;

		int loC = col - 1;
		if (loC < 0) loC = 0;
		int hiC = col + 1;
		if (hiC >= RANKS) hiC = RANKS-1;

		for (int i = loR; i <= hiR; ++i) {
			for (int j = loC; j <= hiC; ++j) {
				int idx = i + j * RANKS;
				long m = 1L << idx;
				long nm = ~m;

				if (blu) {
					long tg = green_ & m;
					if (tg != 0L || (i == row && j == col)) {
						tg = green_ & nm;
						green_ = tg;
						long tb = blue_ | m;
						blue_ = tb;
					}
				}
				else {
					long tb = blue_ & m;
					if (tb != 0L || (i == row && j == col)) {
						tb = blue_ & nm;
						blue_ = tb;
						long tg = green_ | m;
						green_ = tg;
					}
				}
			}
		}
	}

	// Helpers for the move finder

	public void clearMarks() { mark_ = 0L; }

	public boolean marked(int row, int col) {
		int i = row + col * RANKS;
		long m = 1L << i;
		long tb = mark_ & m;
		return (tb != 0L);
	}

	public void mark(int row, int col) {
		int i = row + col * RANKS;
		long m = 1L << i;
		long tb = mark_ | m;
		mark_ = tb;
	}

}

/*
   Moves represent transitions across Board states
*/
final class Move  {

	static final int NO_VALUE = -1;     // row/col value if not yet set
	static final int PASS_VALUE = -2;   // special value for pass moves

	// utilities for classifying moves

	public static boolean twoFrom(int a, int b) { 
		return (a - b == 2) || (b - a == 2); 
	}

	public static boolean withinTwo(int a, int b) { 
		int diff = a - b; return -2 <= diff && diff <= 2;
	}

	// representations

	private int fromRow;
	private int fromCol;

	private int toRow;
	private int toCol;

	private Player player_;
	private Board board_;

	// constructors and intializers

	public Move() { 
		fromRow = NO_VALUE; fromCol = NO_VALUE;
		toRow = NO_VALUE;   toCol = NO_VALUE;
		player_ = Player.Illegal;
		board_ = null;
	}

	public Move(Move m) { // initialize from another move
		fromRow = m.fromRow;  fromCol = m.fromCol;
		toRow = m.toRow;      toCol = m.toCol;
		player_ = m.player_;
		board_ = m.board_;
	}

	public void reset() {
		fromRow = NO_VALUE;
		fromCol = NO_VALUE;
		toRow = NO_VALUE;
		toCol = NO_VALUE;
	}

	// setters:

	public void player(Player p)          { player_ = p;  }
	public void board(Board b)            { board_ = b;  }
	public void from(int sr, int sc)      { fromRow = sr; fromCol = sc;  }
	public void to(int dr, int dc)        { toRow = dr;   toCol = dc; }

	public void fromTo(Move m) { // copy from/to from another move
		fromRow = m.fromRow;
		fromCol = m.fromCol;
		toRow = m.toRow;
		toCol = m.toCol;
	}

	// accessors:

	public boolean isFrom(int r, int c) { return fromRow == r && fromCol == c; }
	public boolean isTo(int r, int c)   { return toRow == r && toCol == c; }
	public Board board()                { return board_; }
	public Player player()              { return player_; }

	// status checks:

	public boolean isPass() { // is this a `pass' move?
		return toRow == PASS_VALUE || fromRow == PASS_VALUE;
	}

	public boolean isJump() {
		return (twoFrom(fromRow, toRow) || twoFrom(fromCol, toCol));
	}

	public boolean hasFrom() { // is from set?
		return fromRow != NO_VALUE && fromCol != NO_VALUE;
	}

	public boolean hasTo() { // is to set?
		return toRow != NO_VALUE && toCol != NO_VALUE;
	}

	public boolean possibleTo(int r, int c) { // is (r, c) a legal `to'?
		return hasFrom() &&
				withinTwo(fromRow, r) &&
				withinTwo(fromCol, c) &&
				board_.occupant(r, c).isEmpty();
	}

	public boolean isLegal() {
		if (isPass()) return true;
		if (!board_.occupant(toRow, toCol).isEmpty()) return false;
		if (!board_.occupant(fromRow, fromCol).same(player_)) return false;
		if (!(withinTwo(fromRow, toRow) && withinTwo(fromCol, toCol))) return false;
		return true;
	}

	// actions

	public void commit() { // update board to reflect move
		if (isLegal() && !isPass())  {
			if (isJump()) board_.occupy(Player.Empty, fromRow, fromCol);
			board_.take(player_, toRow, toCol);
		}
	}

}

/*
  Mover is an abstract class to simplify code dealing with
  either user moves or auto moves.
*/
abstract class Mover {

	// caller for move callbacks
	protected Microscope game;

	protected Mover(Microscope ap) { game = ap; }

	// start a turn as player on given board
	public abstract void startTurn(Board b, Player p);

	// cancel current partial move
	public abstract void cancel();

	// return true if move not yet ready
	public abstract boolean placing();

}


/*
  User builds moves via instructions/clicks by users
  (as passed through by Microscope.mouseUp)
*/
class User extends Mover {

	private Move current;

	public User(Microscope ap) { super(ap); current = null; }

	public synchronized void startTurn(Board b, Player p) {
		current = new Move();
		current.board(b);
		current.player(p);
	}


	public boolean placing() { 
		return current != null && current.hasFrom() && !current.hasTo(); 
	}

	public synchronized void cancel() { 
		if (current != null) {
			current.reset(); 
			current = null; 
		}
	}

	public synchronized void choose(int row, int col) {
		if (current != null) {
			if (row == Move.PASS_VALUE) {
				current.from(row, col);
				game.move(current);
				current = null;
			}
			else if (!current.hasFrom()) {
				if (current.board().occupant(row, col).same(current.player())) {
					current.from(row, col);
				}
			}
			else {
				current.to(row, col);
				game.move(current);
				current = null;
			}
		}
	}

	public synchronized boolean canMoveTo(int row, int col) {
		return placing() && current.possibleTo(row, col);
	}

	public synchronized boolean hasMovedFrom(int row, int col) {
		return current != null && current.isFrom(row, col);
	}

}

/*
   AutoMover implements a classic all-possible-move search
   to any number (up to MAX_LOOKAHEADS) of lookaheads.

   Even though some of the basic operations occurring at
   inner loops have been hand-tuned (in Board), it is not very fast.

   (It would probably help noticeably to replace the recursion
   with a stack, but is too painful to do.)

   It would also help a lot to build in some sure-win and
   sure-loss condition detection, but I don't know of any
   for this game.

   startTurn creates a thread, with a callback to
   the game when it is done.
*/
class AutoMover extends Mover implements Runnable {

	// score constants, to control/escape out of search
	public static final int LOSE = -10000;
	public static final int NOMOVE = LOSE - 1;
	public static final int WIN = -LOSE;

	// To avoid building lots of new objects during exploration,
	// we use pure depth-first traversal, and keep one configuration
	// (Board, Move) per depth-level. The configuration associated
	// with a level is re-initialized on each call to findMove.

	public static final int MAX_LOOKAHEADS = 10;

	Board trialBoard[];
	Move trialMove[];
	Move trialBest[];

	// initial findMove parameters initialized in startTurn
	Board  initialBoard;
	Player initialPlayer;

	int   lookAheads;  // settable lookahead level
	int   runLevel;    // level used for current findMove()

	Thread findThread;  // At most one thread live at a time
	private boolean suspended;

	public AutoMover(Microscope ap) {
		super(ap);
		suspended = false;
		initialBoard = null;
		initialPlayer = Player.Illegal;
		findThread = null;
		lookAheads = 1;
		runLevel = 1;

		trialBoard = new Board[MAX_LOOKAHEADS +1];
		trialMove  = new Move[MAX_LOOKAHEADS +1];
		trialBest  = new Move[MAX_LOOKAHEADS +1];
		for (int i = 0; i < MAX_LOOKAHEADS + 1; ++i) {
			trialBoard[i] = new Board();
			trialMove[i] = new Move();
			trialBest[i] = new Move();
		}

	}

	public synchronized boolean placing() { return findThread != null; }
	private synchronized void endTurn() { findThread = null; }

	// ugly hack to get netscape-2 to at least do a screen update
	public synchronized void go() {
		if (placing() && suspended) {
			suspended = false;
			findThread.resume();
		}
	}

	// StartTurn implemented as an early-reply thread;
	// The thread executes the `run' method
	public void startTurn(Board b, Player p) {
		if (!placing()) {
			initialBoard = b;
			initialPlayer = p;
			runLevel = lookAheads;
			findThread = new Thread(this);
			findThread.setPriority(Thread.MIN_PRIORITY);
			findThread.start();
			suspended = true;
			findThread.suspend();
		}
	}

	// cancel current partial move by killing thread
	public void cancel() {
		if (placing())  { 
			findThread.stop(); 
			findThread = null; 
		}
	}

	public void changeLevel(int incr) {
		lookAheads += incr;
		if (lookAheads <= 0) lookAheads = 1;
		else if (lookAheads >= MAX_LOOKAHEADS) lookAheads = MAX_LOOKAHEADS - 1;
	}

	public int level () { return lookAheads; }


	// find a move, and call back game to make it.
	public  void run() {
		int s = findMove(initialBoard, initialPlayer, runLevel);
		Move result = new Move(trialBest[runLevel - 1]); 
		if (s == NOMOVE) result.from(Move.PASS_VALUE, Move.PASS_VALUE);
		game.move(result);
		endTurn();
	}

	// Main search routine.
	// Find a move from source by turn, looking ahead levels. 
	// Return score. 
	// The actual move is held in trialBest[level - 1];

	int findMove(Board source, Player turn, int level) {

		if (level <= 0 || level > MAX_LOOKAHEADS) // ?? can't happen!
			return LOSE; 

		// set up the configuration to be reused on this call
		Move bestMove = trialBest[level - 1];
		bestMove.player(turn);
		bestMove.board(source);

		Board newBoard = trialBoard[level - 1];

		Move trial = trialMove[level - 1];
		trial.player(turn);
		trial.board(newBoard);

		// Use the Board marks to record already-checked one-from moves.
		// Since duplicating from any surrounding tile leads
		// to the same configuration, we don't need to look at more than one.

		source.clearMarks(); 

		int bestScore = NOMOVE;
		Player other = turn.opponent();
		int score = 0;

		/* For each of our tiles ... */
		for (int i = 0; i < Board.RANKS; ++i) {
			for (int j = 0; j < Board.RANKS; ++j) {
				if (source.occupant(i,j).same(turn)) {

					trial.from(i, j);

					/* ... find each of its possible moves ... */
					for (int r = i - 2; r <= i + 2; ++r) {
						for (int c = j - 2; c <= j + 2; ++c) {
							if (source.occupant(r, c).isEmpty()) {

								/* ... generate it ... */

								trial.to(r, c);

								// Is this a duplicate(one-from) vs jump(two-from) move?
								boolean jumping = trial.isJump();

								// Don't generate one-from moves to already-checked places
								if (jumping || !source.marked(r, c)) {

									if (!jumping) source.mark(r, c); // mark for next time

									newBoard.copyState(source);
									trial.commit();

									/* ... evaluate it .. */

									if (level == 1) { 
										// bottomed out; directly evaluate
										score = newBoard.score(turn);
									}
									else { 
										// Allow scheduler to run screen updates.
										Thread.currentThread().yield();

										// Recurse to check counter-moves.
										// Reverse sense of score for opponent
										score = -(findMove(newBoard, other, level - 1));
									}

									/* ... record it if best so far. */

									if (score > bestScore) {
										bestMove.fromTo(trial);
										bestScore = score;
										// return immediately if sure win
										if (score >= WIN) return score;
									}

								}
							}
						}
					}
				}
			}
		}
		return bestScore;
	}

}