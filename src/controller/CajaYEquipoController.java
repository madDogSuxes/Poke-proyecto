package controller;

import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.*;
import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.Objects;
import java.util.ResourceBundle;

import crud.PokemonCrud;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import pokemone.Pokemon;

public class CajaYEquipoController {

	@FXML
	private Button btnVolver;
	@FXML
	private TableView<Pokemon> tableview1;
	@FXML
	private TableView<Pokemon> tableview2;
	@FXML
	private TableColumn nombreCaja;
	@FXML 
	private TableColumn nivelCaja;
	@FXML 
	private TableColumn tipo1Caja;
	@FXML 
	private TableColumn tipo2Caja;
	@FXML 
	private TableColumn sexoCaja;
	@FXML 
	private TableColumn vidaCaja;
	@FXML 
	private TableColumn ataCaja;
	@FXML 
	private TableColumn defCaja;
	@FXML 
	private TableColumn ataEspeCaja;
	@FXML 
	private TableColumn defEspeCaja;
	@FXML 
	private TableColumn veloCja;
	@FXML 
	private TableColumn estamCaja;
	@FXML 
	private TableColumn fertCaja;
	@FXML
	private TableColumn nombreEquipo;
	@FXML 
	private TableColumn nivelEquipo;
	@FXML 
	private TableColumn tipo1Equipo;
	@FXML 
	private TableColumn tipo2Equipo;
	@FXML 
	private TableColumn sexoEquipo;
	@FXML 
	private TableColumn vidaEquipo;
	@FXML 
	private TableColumn ataEquipo;
	@FXML 
	private TableColumn defEquipo;
	@FXML 
	private TableColumn ataEspeEquipo;
	@FXML 
	private TableColumn defEspeEquipo;
	@FXML 
	private TableColumn veloEquipo;
	@FXML 
	private TableColumn estaEquipo;
	@FXML 
	private TableColumn fertEquipo;

	private Parent root;
	private Stage stage;
	private Scene scene;

	static LinkedList<Pokemon> coleccion;

	public ObservableList<Pokemon> metodo() {
		
		ObservableList<Pokemon> lista = FXCollections.observableArrayList();
		
		for(int i = 0; i < coleccion.size(); i++) {
			
			Pokemon p = coleccion.get(i);
			
			lista.add(p);
		}
		return lista;
	}

	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		coleccion = PokemonCrud.getTodoPokemon();

		tableview1.setItems(metodo());

		nombreCaja.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("nombre"));
		nivelCaja.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("nivel"));
		tipo1Caja.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("tipo1"));
		tipo2Caja.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("tipo2"));
		sexoCaja.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("sexo"));
		vidaCaja.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("vitalidad"));
		ataCaja.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("ataque"));
		defCaja.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("defensa"));
		ataEspeCaja.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("atEsp"));
		defEspeCaja.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("defEsp"));
		fertCaja.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("fertilidad"));
		estamCaja.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("estamina"));
		veloCja.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("velocidad"));
		
		coleccion=PokemonCrud.getTodoPokemonEquipo();
		tableview2.setItems(metodo());
		nombreEquipo.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("nombre"));
		nivelEquipo.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("nivel"));
		tipo1Equipo.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("tipo1"));
		tipo2Equipo.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("tipo2"));
		sexoEquipo.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("sexo"));
		vidaEquipo.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("vitalidad"));
		ataEquipo.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("ataque"));
		defEquipo.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("defensa"));
		ataEspeEquipo.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("atEsp"));
		defEspeEquipo.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("defEsp"));
		fertEquipo.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("fertilidad"));
		estaEquipo.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("estamina"));
		veloEquipo.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("velocidad"));
	
	}
	
	@FXML
	public void volverAMenu(ActionEvent event) throws IOException {
		try {
			root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/vistas/MenuDeInicio.fxml")));
			System.out.println("Retrocediendo al Log-in.");
			scene = new Scene(root, 600, 331);
			stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setTitle("Menu de inicio");
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
