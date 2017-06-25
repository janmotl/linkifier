package utility;

import javafx.scene.control.TextArea;

import java.util.logging.LogRecord;
import java.util.logging.StreamHandler;

/**
 * Print logs into a TextArea.
 * For details see:
 *  https://stackoverflow.com/questions/10785560/write-logger-message-to-file-and-textarea-while-maintaining-default-behaviour-in
 *  https://stackoverflow.com/questions/30863862/javafx-append-text-to-textarea-throws-exception
 */
public class TextAreaAppender extends StreamHandler {
	private final TextArea textArea;

	// Constructor
	public TextAreaAppender(TextArea textArea) {
		this.textArea = textArea;
	}


	/**
	 * Format and then append the event to the stored TextArea.
	 *
	 * @param record The event to write down
	 */
	@Override
	public synchronized void publish(LogRecord record) {
		super.publish(record);
		flush();
		javafx.application.Platform.runLater( () -> textArea.appendText(getFormatter().format(record)) );
	}


}