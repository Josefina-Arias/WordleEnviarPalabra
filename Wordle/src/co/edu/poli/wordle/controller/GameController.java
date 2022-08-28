package co.edu.poli.wordle.controller;

import java.lang.ModuleLayer.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class GameController {
	
	private Stage stage;
	private PrincipalController principalController;
    @FXML
    private Button botonEnviar;

    @FXML
    private TextField textfield00;

    @FXML
    private TextField textfield01;

    @FXML
    private TextField textfield02;

    @FXML
    private TextField textfield03;

    @FXML
    private TextField textfield04;

    @FXML
    private TextField textfield10;

    @FXML
    private TextField textfield11;

    @FXML
    private TextField textfield12;

    @FXML
    private TextField textfield13;

    @FXML
    private TextField textfield14;

    @FXML
    private TextField textfield20;

    @FXML
    private TextField textfield21;

    @FXML
    private TextField textfield22;

    @FXML
    private TextField textfield23;

    @FXML
    private TextField textfield24;

    @FXML
    private TextField textfield30;

    @FXML
    private TextField textfield31;

    @FXML
    private TextField textfield32;

    @FXML
    private TextField textfield33;

    @FXML
    private TextField textfield34;

    @FXML
    private TextField textfield40;

    @FXML
    private TextField textfield41;

    @FXML
    private TextField textfield42;

    @FXML
    private TextField textfield43;

    @FXML
    private TextField textfield44;

    @FXML
    private TextField textfield50;

    @FXML
    private TextField textfield51;

    @FXML
    private TextField textfield52;

    @FXML
    private TextField textfield53;

    @FXML
    private TextField textfield54;
    private String palabra= "libro";
    
    @FXML
    private TextField ingresarPalabra;
    @FXML
    void agregarLetra(ActionEvent event) {

    }

    @FXML
    void enviarPalabra(ActionEvent event) {
    	TextField[] lista= {textfield00, textfield01, textfield02, textfield03, textfield04,
    			textfield10, textfield11, textfield12, textfield13, textfield14,
    			textfield20, textfield21, textfield22, textfield23, textfield24,
    			textfield30, textfield31, textfield32, textfield33, textfield34,
    			textfield40, textfield41, textfield42, textfield43, textfield44, 
    			textfield50, textfield51, textfield52, textfield53, textfield54
    	};
    	String adivinar = ingresarPalabra.getText();
    	for(int i=0; i<adivinar.length(); i++) {
    		String letra = adivinar.substring(i, i+1);
    		lista[i].setText(letra);
    		if(letra.equals(palabra.substring(i, i+1))) {
    			lista[i].setStyle("-fx-background-color: #8eeda1;");
    		} else if (palabra.indexOf(letra)> - 1) {
    			lista[i].setStyle("-fx-background-color: #fcef38;");
    		}
    	}
    }

    @FXML
    void showPrincipal(ActionEvent event) {
    	
    	principalController.showGame();
    	stage.close();

    }

	public void init(Stage stage, PrincipalController principalController) {
		
		this.principalController = principalController;
		this.stage = stage;
		
	
	}

}