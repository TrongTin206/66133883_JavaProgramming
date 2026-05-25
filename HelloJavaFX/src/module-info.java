module HelloJavaFX {
	requires javafx.controls;
	
	opens tinvo.app to javafx.graphics, javafx.fxml;
}
