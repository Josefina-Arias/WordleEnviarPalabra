module Wordle {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	requires javafx.graphics;
	requires java.sql;
	
	opens co.edu.poli.wordle.controller to javafx.graphics, javafx.fxml, javafx.base;
	opens co.edu.poli.wordle.model to javafx.graphics, javafx.fxml, javafx.base;
	
}
