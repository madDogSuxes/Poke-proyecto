package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

import javafx.event.ActionEvent;

public class MenuDeInicioController {
	@FXML
	private Button btnCombate;
	@FXML
	private Button btnSalir;
	@FXML 
	private Button btnCaptura;
	@FXML
	private Button btnEquipo;
	@FXML
	private Button btnCaja;
	@FXML
	private Button btnCriar; 
	@FXML
	private Button btnTienda;
	@FXML
	private Button btnEntrenar;
	@FXML
	private Button btnPokedex;
	
	private Stage stage;
	private Parent root;
	private Scene scene;
	
	public void combatir(ActionEvent event) {
		try {
			root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/vistas/Combate.fxml")));
			System.out.println("Bienvenido a combate.");
	        scene = new Scene(root, 600, 331);
	        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	        stage.setTitle("MenuDeInicio");
	        stage.setScene(scene);
	        stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void capturar(ActionEvent event) throws IOException{
		try {
			root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/vistas/Captura.fxml")));
			System.out.println("Bienvenido a capturar Pokemon.");
	        scene = new Scene(root, 600, 331);
	        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	        stage.setTitle("Captura");
	        stage.setScene(scene);
	        stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void cajear(ActionEvent event) throws IOException{
		try {
			root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/vistas/Caja.fxml")));
			System.out.println("Bienvenido a tu caja Pokemon.");
	        scene = new Scene(root, 600, 331);
	        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	        stage.setTitle("Captura");
	        stage.setScene(scene);
	        stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	} 

	@FXML
	public void volverAlLogin(ActionEvent event) throws IOException{
		try {
			root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/vistas/Inicio.fxml")));
			System.out.println("Retrocediendo al Log-in.");
	        scene = new Scene(root, 600, 331);
	        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	        stage.setTitle("Pokemon.exe");
	        stage.setScene(scene);
	        stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
