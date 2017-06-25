package utility;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextField;
import javafx.scene.effect.InnerShadow;
import javafx.scene.paint.Color;

public class ValidatorText {

	// Add numeric validation into a textField. Use red highlight if the entered value is wrong.
	public static void addNumericValidation(TextField textField, int maxValue) {
		textField.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if (isOk(newValue, maxValue)) {
					textField.setStyle(null); // reset
					textField.setEffect(null); // reset
				} else {
					textField.setStyle("-fx-focus-color: #f25f29; -fx-faint-focus-color: #f25f2933;"); // Red focus
					textField.setEffect(new InnerShadow(3, new Color(1, 0, 0, 1))); // Red highlight
				}
			}
		});
	}

	public static void addNumericValidation(TextField textField) {
		addNumericValidation(textField, Integer.MAX_VALUE);
	}

	// Subroutine: validate the text.
	// Empty string is ok. An integer in range 0..Integer.MAX_VALUE is ok.
	// maxValue constraint is considered only if maxValue is bigger than 0.
	private static boolean isOk(String text, int maxValue) {
		try {
			if (text == null || text.trim().isEmpty()) return true;
			int value = Integer.parseInt(text);
			if (maxValue > 0 && value > maxValue) return false;
			if (value < 0) return false;
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
