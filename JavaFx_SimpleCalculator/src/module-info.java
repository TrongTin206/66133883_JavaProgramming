module JavaFx_SimpleCalculator {
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
}
