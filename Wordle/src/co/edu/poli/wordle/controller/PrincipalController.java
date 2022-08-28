package co.edu.poli.wordle.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PrincipalController {

	private Stage stage;

	@FXML
	void showGame(ActionEvent event) {
		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/poli/wordle/view/Game.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("/co/edu/poli/wordle/view/Wordle.css").toExternalForm());
			GameController controller = loader.getController();
			Stage stage = new Stage();
			stage.setScene(scene);
			controller.init(stage, this);
			stage.show();
			this.stage.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void setStage(Stage primaryStage) {
		stage = primaryStage;
	}
	
	public void showGame() {
		stage.show();
	}

}
