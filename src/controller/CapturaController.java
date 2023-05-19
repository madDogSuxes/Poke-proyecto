package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import controller.CapturaController;
import crud.CapturaCrud;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.stage.Stage;
import pokemone.Logger;
import pokemone.Pokemon;

/**
 * Clase controller que ayuda a realizar la captura
 * 
 * @author Miguel y Jesús
 *
 */

public class CapturaController {
	@FXML
	private Button btnCapturar;
	@FXML
	private TextField txtMote;
	@FXML
	private TextField txtMote2;
	@FXML
	private Text txtMote3;
	@FXML
	private Button btnBuscar;
	@FXML
	private Button btnVolver;
	@FXML
	private Button btnSi;
	@FXML
	private Button btnNo;
	@FXML
	private Button btnAceptarMote;
	@FXML
	private ImageView imgPokemonEncontrado;
	@FXML
	private ImageView imgPokeball;

	private Stage stage;
	private Scene scene;
	private Parent root;

	protected boolean capturaRealizada;
	private Pokemon p;

	int pokeBall;

	/**
	 * Método para inicializar
	 */
	public void initialize() {
		Date d = new Date();
		System.out.println(d);

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMddHHmmssyyyy");
		System.out.println(simpleDateFormat.format(d) + ".log");
		Logger.write("Has entrado a captura a: " + simpleDateFormat);

		imgPokeball.setVisible(false);
		btnSi.setVisible(false);
		btnNo.setVisible(false);
		btnAceptarMote.setVisible(false);
		txtMote.setVisible(false);
		txtMote2.setVisible(false);
		txtMote3.setVisible(false);
		btnCapturar.setVisible(false);
	}

	/**
	 * Método que captura al pokemon y calcula la probabilidad de captura
	 * @param event
	 */
	
	@FXML
	public void capturarPokemon(ActionEvent event) {

		Date d = new Date();
		System.out.println(d);

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMddHHmmssyyyy");
		System.out.println(simpleDateFormat.format(d) + ".log");
		Logger.write("Has lanzado una Pokeball a las: " + simpleDateFormat);
		
		int probabilidadDeCaptura = (int) (Math.random() * 3) + 1;
		int idEntrenador = 0;
		int idPokemon;
		int numPokedex;
		String mote;
		String sexo; 
		int nivel; 
		int vitalidad;
		int ataque;
		int defensa;
		int atEsp;
		int defEsp;
		int velocidad;
		int estamina;
		int fertilidad;
		int equipo;

		if (probabilidadDeCaptura != 1) {

			System.out.println(simpleDateFormat.format(d) + ".log");
			Logger.write("Has capturado un Pokemon: " + simpleDateFormat);
			
				String sql = "SELECT num_pokedex, nombre_pokemon, img_frente FROM pokedex ORDER BY RAND() LIMIT 1;";
			
				capturaRealizada = true;
				imgPokemonEncontrado.setVisible(false);
				System.out.println("Has capturado un pokemon.");
				pokeBall--;
				imgPokeball.setVisible(true);
				btnAceptarMote.setVisible(false);
				btnSi.setVisible(true);
				btnNo.setVisible(true);
				txtMote.setVisible(true);
				txtMote2.setVisible(false);
				txtMote3.setVisible(true);
				btnCapturar.setVisible(false);

				if (btnSi != null) {
				txtMote2.setVisible(true);
				btnAceptarMote.setVisible(true);
				} else if (btnNo != null) {
			
				}
		} else {
			System.out.println("No has capturado ningún pokemon. ¡Sigue buscando!");
			btnSi.setVisible(false);
			btnNo.setVisible(false);
			txtMote.setVisible(false);
			txtMote2.setVisible(false);
			txtMote3.setVisible(false);
		}
	}

	/**
	 * Método que busca al pokemon para ser capturado
	 * @param event
	 */

	@FXML
	public void buscarPokemon(ActionEvent event) {
		
		Date d = new Date();
		System.out.println(d);

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMddHHmmssyyyy");
		System.out.println(simpleDateFormat.format(d) + ".log");
		Logger.write("Has buscado un Pokemon a: " + simpleDateFormat);
	
		boolean buscarPokemon = true;

		p = CapturaCrud.buscarPokemon();

		File file = new File(p.getImgDeFrente());

		Image image = new Image(file.toURI().toString());

		imgPokemonEncontrado.setImage(image);
		imgPokemonEncontrado.setVisible(true);
		imgPokeball.setVisible(false);
		btnSi.setVisible(false);
		btnNo.setVisible(false);
		btnAceptarMote.setVisible(false);
		txtMote.setVisible(false);
		txtMote2.setVisible(false);
		txtMote3.setVisible(false);
		btnCapturar.setVisible(true);

	}

	/**
	 * Método que usas para volver al menú
	 * 
	 * @param event
	 * @throws IOException
	 */

	public void volverAMenu(Event event) throws IOException {
		
		Date d = new Date();
		System.out.println(d);

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMddHHmmssyyyy");
		System.out.println(simpleDateFormat.format(d) + ".log");
		Logger.write("Has vuelto al menú: " + simpleDateFormat);
		
		try {
			root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/vistas/MenuDeInicio.fxml")));
			scene = new Scene(root, 600, 331);
			stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setTitle("Menu de inicio");
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void guardarMote(Event event) {
		
		Date d = new Date();
		System.out.println(d);

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMddHHmmssyyyy");
		System.out.println(simpleDateFormat.format(d) + ".log");
		Logger.write("Has guardado un mote a tu pokemon: " + simpleDateFormat);
		
		txtMote2.setVisible(false);
		btnAceptarMote.setVisible(false);
		int idEntrenador = 0;
		int idPokemon;
		int numPokedex;
		String mote;
		String sexo; 
		int nivel; 
		int vitalidad;
		int ataque;
		int defensa;
		int atEsp;
		int defEsp;
		int velocidad;
		int estamina;
		int fertilidad;
		int equipo;
		CapturaCrud.capturarPokemon(14, p.getNumPokedex(), txtMote2.getText(), "H", 1,
				vitalidad = (int) (Math.random() * ((20 - 1) + 1)),
				ataque = (int) (Math.random() * ((20 - 1) + 1)),
				defensa = (int) (Math.random() * ((20 - 1) + 1)),
				atEsp = (int) (Math.random() * ((20 - 1) + 1)),
				defEsp = (int) (Math.random() * ((20 - 1) + 1)),
				velocidad = (int) (Math.random() * ((20 - 1) + 1)),
				estamina = (int) (Math.random() * ((20 - 1) + 1)),
				fertilidad = (int) (Math.random() * ((20 - 1) + 1)), 
				equipo = 2);
	}

	public void siPonerMote(Event event) {
		txtMote2.setVisible(true);
		btnAceptarMote.setVisible(true);
	}

	public void noPonerMote(Event event) {
		txtMote2.setVisible(false);
		btnAceptarMote.setVisible(false);
		int idEntrenador = 0;
		int idPokemon;
		int numPokedex;
		String mote;
		String sexo; 
		int nivel; 
		int vitalidad;
		int ataque;
		int defensa;
		int atEsp;
		int defEsp;
		int velocidad;
		int estamina;
		int fertilidad;
		int equipo;
		CapturaCrud.capturarPokemon(14, p.getNumPokedex(), p.getMote(), "H", 1,
				vitalidad = (int) (Math.random() * ((20 - 1) + 1)),
				ataque = (int) (Math.random() * ((20 - 1) + 1)),
				defensa = (int) (Math.random() * ((20 - 1) + 1)),
				atEsp = (int) (Math.random() * ((20 - 1) + 1)),
				defEsp = (int) (Math.random() * ((20 - 1) + 1)),
				velocidad = (int) (Math.random() * ((20 - 1) + 1)),
				estamina = (int) (Math.random() * ((20 - 1) + 1)),
				fertilidad = (int) (Math.random() * ((20 - 1) + 1)), 
				equipo = 2);
	}
}
