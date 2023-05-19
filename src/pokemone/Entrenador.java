package pokemone;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Clase entrenador con sus constructores que nos ayuda a entender la lógica del
 * programa antes de sus interfaces
 * 
 * @author Miguel y Jesús
 *
 */

public class Entrenador extends Pokemon {
	Scanner sc = new Scanner(System.in);
	protected int idEntrenador;
	protected String nombre;
	protected int pokeDollars;
	protected int pokeBalls;
	LinkedList<String> listaObjetos = new LinkedList<String>();
	LinkedList<String> listaEquipo = new LinkedList<String>();
	LinkedList<String> listaEquipo2 = new LinkedList<String>();
	LinkedList<String> listaCaja = new LinkedList<String>();

	public Entrenador() {
		this.idEntrenador = 0;
		this.nombre = "";
		this.pokeDollars = 0;
		this.pokeBalls = 0;
		this.listaObjetos = new LinkedList<String>();
		this.listaEquipo = new LinkedList<String>();
		this.listaEquipo2 = new LinkedList<String>();
		this.listaCaja = new LinkedList<String>();
	}

	public Entrenador(int idEntrenador, String nombre, int pokeDollars, LinkedList<String> listaObjetos,
			LinkedList<String> listaEquipo, LinkedList<String> listaEquipo2, LinkedList<String> listaCaja) {
		this.idEntrenador = 0001;
		this.nombre = "";
		this.pokeDollars = 0;
		this.pokeBalls = 10;
		this.listaObjetos = new LinkedList<String>();
		this.listaEquipo = new LinkedList<String>();
		this.listaEquipo2 = new LinkedList<String>();
		this.listaCaja = new LinkedList<String>();
	}

	public Entrenador(Entrenador c) {
		this.idEntrenador = c.idEntrenador;
		this.nombre = c.nombre;
		this.pokeDollars = c.pokeDollars;
		this.listaObjetos = c.listaObjetos;
		this.listaEquipo = c.listaEquipo;
		this.listaEquipo2 = c.listaEquipo2;
		this.listaObjetos = c.listaObjetos;
	}

	public int getIdEntrenador() {
		return idEntrenador;
	}

	public void setIdEntrenador(int idEntrenador) {
		this.idEntrenador = idEntrenador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPokeDollars() {
		return pokeDollars;
	}

	public void setPokeDollars(int pokeDollars) {
		this.pokeDollars = pokeDollars;
	}

	public int getPokeBalls() {
		return pokeBalls;
	}

	public void setPokeBalls(int pokeBalls) {
		this.pokeBalls = pokeBalls;
	}

	public LinkedList<String> getListaObjetos() {
		return listaObjetos;
	}

	public void setListaObjetos(LinkedList<String> listaObjetos) {
		this.listaObjetos = listaObjetos;
	}

	public LinkedList<String> getListaEquipo() {
		return listaEquipo;
	}

	public void setListaEquipo(LinkedList<String> listaEquipo) {
		this.listaEquipo = listaEquipo;
	}

	public LinkedList<String> getListaEquipo2() {
		return listaEquipo2;
	}

	public void setListaEquipo2(LinkedList<String> listaEquipo2) {
		this.listaEquipo2 = listaEquipo2;
	}

	public LinkedList<String> getListaCaja() {
		return listaCaja;
	}

	public void setListaCaja(LinkedList<String> listaCaja) {
		this.listaCaja = listaCaja;
	}

	@Override
	public String toString() {
		return "Entrenador [idEntrenador=" + idEntrenador + ", nombre=" + nombre + ", pokeDollars=" + pokeDollars
				+ ", listaObjetos=" + listaObjetos + ", listaEquipo=" + listaEquipo + ", listaEquipo2=" + listaEquipo2
				+ ", listaCaja=" + listaCaja + ", pokeBalls= " + pokeBalls + "]";
	}

	/**
	 * Método que ayuda a mver a la caja un pokemon que tenemos seleccionado. Método
	 * moverACaja
	 */

	public void moverACaja() {
		boolean seleccionarPokemon = false;
		boolean moverACaja = false;
		int pokemonEnPrincipal = 0;
		int pokemonEnCaja = 0;
		String respuesta;
		if (seleccionarPokemon == true) {
			System.out.println("¿Quieres mover este pokemon a la caja?");
			respuesta = sc.next();
			respuesta.toUpperCase();
			if (respuesta == "SI") {
				moverACaja = true;
				pokemonEnCaja = +1;
				pokemonEnPrincipal -= 1;
			} else if (respuesta == "NO") {
				moverACaja = false;
				seleccionarPokemon = false;
			}
		}
	}

	/**
	 * Método que nos ayuda mover a principal algun pokemon que haya en la caja
	 * Método mover a principal
	 */

	public void moverAPrincipal() {
		boolean seleccionarPokemon = false;
		boolean moverAPrincipal = false;
		int pokemonEnCaja = 0;
		int pokemonEnPrincipal = 0;
		String respuesta;
		if (seleccionarPokemon == true) {
			System.out.println("¿Quieres mover este pokemon a principal?");
			respuesta = sc.next();
			respuesta.toUpperCase();
			if (respuesta == "SI") {
				moverAPrincipal = true;
				pokemonEnPrincipal += 1;
				pokemonEnCaja -= 1;
			} else if (respuesta == "NO") {
				moverAPrincipal = false;
				seleccionarPokemon = false;
			}
		}
	}

	/**
	 * Método que nos ayuda a entrenar los Pokemon Método entrenar
	 */

	public void entrenar() {
		boolean entrenar = true;
		byte opcion;
		int pokeDollars = (int) Math.floor(Math.random() * 1000 + 800);
		int pokeDollarsG;
		System.out.println("¿Que tipo de entrenamiento quieres hacer?");
		System.out.println("1. Entrenamiento pesado");
		System.out.println("2. Entrenamiento furioso");
		System.out.println("3. Entrenamiento funcional");
		System.out.println("4. Entrenamiento onirico");
		opcion = sc.nextByte();
		if (opcion == 1) {
			pokeDollarsG = 20 * getNivel();
			pokeDollars = pokeDollars - pokeDollarsG;
			System.out.println("Te quedan: " + pokeDollars + " pokeDollars.");
			Pokemon.aumentarEstadisticas1(aumentarEstadisticas1(0));
		} else if (opcion == 2) {
			pokeDollarsG = 30 * getNivel();
			pokeDollars = pokeDollars - pokeDollarsG;
			System.out.println("Te quedan: " + pokeDollars + " pokeDollars.");
			Pokemon.aumentarEstadisticas2(aumentarEstadisticas2(0));
		} else if (opcion == 3) {
			pokeDollarsG = 40 * getNivel();
			pokeDollars = pokeDollars - pokeDollarsG;
			System.out.println("Te quedan: " + pokeDollars + " pokeDollars.");
			Pokemon.aumentarEstadisticas3(aumentarEstadisticas3(0));
		} else if (opcion == 4) {
			pokeDollarsG = 40 * getNivel();
			pokeDollars = pokeDollars - pokeDollarsG;
			System.out.println("Te quedan: " + pokeDollars + " pokeDollars.");
			Pokemon.aumentarEstadisticas4(aumentarEstadisticas4(0));
		} else {
			System.out.println("Le has dado al 5 tio.");
		}
	}

	/**
	 * Método para combatir, lógica del programa Método en la clase combate
	 */

	public void combatir() {
		// Está en la clase combate
	}

	/**
	 * Gracias a este método entendemos la lógica del programa. Método para capturar
	 * pokemons
	 */

	public void capturar() {
		int probabilidadCaptura = (int) Math.floor(Math.random() * 3 + 1);
		boolean captura = false;
		String moteNuevo;
		boolean respuesta = false;
		while (captura == false) {
			if ((probabilidadCaptura == 1) || (probabilidadCaptura == 2)) {
				captura = true;
				System.out.println("Has capturado un pokemon, ¿quieres ponerle un mote?");
				if (respuesta == true) {
					moteNuevo = sc.nextLine();
					setMote(moteNuevo);
					setNivel(nivel);
				}
			} else {
				captura = false;
				System.out.println("No has capturado ningun pokemon, pierdes una pokeball");
				pokeBalls -= 1;
			}
		}
	}

	/**
	 * Método para entender la lógica del programa
	 * Método poner a Criar
	 */
	
	public void ponerACriar() {
		boolean pokemon1Seleccionado = true;
		boolean pokemon2Seleccionado = true;
		boolean crianzaExitosa = true;
		String sexo = "macho";
		String sexo2 = "hembra";

		if ((pokemon1Seleccionado && sexo.equals("macho")) && (pokemon2Seleccionado && sexo2.equals("hembra"))) {
			crianzaExitosa = true;
		}else if ((pokemon1Seleccionado && sexo.equals("hembra") && pokemon2Seleccionado && sexo2.equals("macho"))) {
			crianzaExitosa = true;
		}else {
			crianzaExitosa = false;
		}
	}
}
