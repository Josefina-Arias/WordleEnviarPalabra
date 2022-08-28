module Wordle {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	
	opens poli.edu.co.model to javafx.graphics, javafx.fxml;
}
