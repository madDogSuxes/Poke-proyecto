package controller;

import javafx.fxml.FXML;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Objects;

import crud.PokedexCrud;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import pokemone.Pokemon;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.image.ImageView;
import javafx.scene.control.TableColumn;

/**
 * Clase Controller que nos ayuda a observar nuestra Pokedex
 * @author Miguel y Jesús
 *
 */

public class PokedexController {
	@FXML
	private ImageView imagenEscenario;
	@FXML
	private Button btnVolver;
	@FXML
	private TableView tablaPokedex;
	@FXML
	private TableColumn numeroPokedex;
	@FXML
	private TableColumn nombrePokedex;
	@FXML
	private TableColumn tipo1Pokedex;
	@FXML
	private TableColumn tipo2Pokedex;

	private Stage stage;
	private Scene scene;
	private Parent root;

	static LinkedList<Pokemon> coleccionPokedex;
	
	/**
	 * Método que inicializa la tabla
	 */
	
	public void initialize() {
		coleccionPokedex = PokedexCrud.mostrarPokedex();
		tablaPokedex.setItems(metodoPokedex());
		numeroPokedex.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("numPokedex"));
		nombrePokedex.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("nombre"));
		tipo1Pokedex.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("tipo1"));
		tipo2Pokedex.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("tipo2"));

	}
	
	/**
	 * Método que nos muestra la lista en la coleccion pokedex
	 * @return
	 */
	
	public ObservableList<Pokemon> metodoPokedex() {

		ObservableList<Pokemon> lista = FXCollections.observableArrayList();

		for (int i = 0; i < coleccionPokedex.size(); i++) {

			Pokemon p = coleccionPokedex.get(i);

			lista.add(p);
		}
		return lista;
	}

	/**
	 * Método volver a menú
	 * @param event
	 */

	@FXML
	public void volverAMenu(ActionEvent event) {
		try {
			root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/vistas/MenuDeInicio.fxml")));
			scene = new Scene(root, 600, 331);
			stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setTitle("Pokemon");
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
