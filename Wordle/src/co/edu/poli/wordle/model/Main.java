package co.edu.poli.wordle.model;
	
import co.edu.poli.wordle.controller.PrincipalController;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/poli/wordle/view/Principal.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("/co/edu/poli/wordle/view/Wordle.css").toExternalForm());
			primaryStage.setScene(scene);
			PrincipalController controller = loader.getController();
			controller.setStage(primaryStage);
			primaryStage.show();
			

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
//	 public void setLightMode(AnchorPane anchorPane) {
//		
//		 anchorPane.getStylesheets().remove(getClass().getResource("/co/edu/poli/wordle/view/darkMode.css").toExternalForm());
//		 System.out.println("remove darkMode");
//		 anchorPane.getStylesheets().add(getClass().getResource("/co/edu/poli/wordle/view/lightMode.css").toExternalForm());
//		 System.out.println("addLightMode");
//	 }
//	 
//	 public void setDarkMode(AnchorPane anchorPane) {
//		 anchorPane.getStylesheets().remove("/co/edu/poli/wordle/view/lightMode.css");
//		 anchorPane.getStylesheets().add("/co/edu/poli/wordle/view/darkMode.css");
//	 }

}



