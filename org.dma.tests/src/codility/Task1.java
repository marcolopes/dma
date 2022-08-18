package codility;

public class Task1 {

	public static final char up_char = '^';
	public static final char down_char = 'v';
	public static final char left_char = '<';
	public static final char right_char = '>';

	public static int solution(String S) {

		int[] count={0, 0, 0, 0};
		//count directions
		for(int i=0; i<S.length(); i++){
			switch(S.charAt(i)){
			case up_char: count[0]++; break;
			case down_char: count[1]++; break;
			case left_char: count[2]++; break;
			case right_char: count[3]++; break;
			}
		}

		int max_index=0;
		//find max count direction
		for(int i=0; i<count.length; i++){
			if(count[i]>count[max_index]) max_index=i;
		}

		int result=0;
		//sum other directions
		for(int i=0; i<count.length; i++){
			if(max_index!=i) result+=count[i];
		}return result;
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(solution("^vv<v"));
		System.out.println(solution("v>>>vv"));
		System.out.println(solution("<<<"));
		
	}

}