package pt.at.factemipf.gui;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

/**
 * Handler responsavel por colocar o log da invocacao na text area da GUI
 *
 * @author ricardo
 */
public final class JTextAreaLoggerHandler extends Handler {

	private final JTextArea textArea;

	public JTextAreaLoggerHandler(JTextArea textArea){
		this.textArea = textArea;
	}

	@Override
	public void publish(final LogRecord record) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run() {
				if(record.getMessage().contains(">>>SENT<<<")){
					textArea.setText(record.getMessage());
				}else if(record.getMessage().contains(">>>RECEIVED<<<")){
					textArea.setText(textArea.getText() + "\n" + record.getMessage());
				}else if(textArea.getText().contains(">>>RECEIVED<<<") && record.getMessage().contains("Exception")){
					textArea.setText(textArea.getText() + "\n" + record.getMessage());
				}else{
					textArea.setText(textArea.getText() + "\n" + record.getMessage());
				}
			}
		});
	}

	@Override
	public void flush() {}

	@Override
	public void close() {}
}
