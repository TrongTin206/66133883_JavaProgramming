module Hello_World_web {
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
}
