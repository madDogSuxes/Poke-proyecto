package pokemone;

import java.util.LinkedList;

public class Combate extends Pokemon {

	LinkedList<Turnos> turnos = new LinkedList<Turnos>();
	protected int idCombate;
	protected String ganador;
	protected String jugador;
	protected String rival;
	protected int numeroPokemonKORival;
	protected int numeroPokemonKOCoach;
	protected boolean retirarse = false;

	public Combate() {
		this.idCombate = 0;
		this.ganador = "";
		this.jugador = "";
		this.rival = "";
		this.numeroPokemonKOCoach = 0;
		this.numeroPokemonKORival = 0;
		this.retirarse = false;
	}

	public Combate(int idCombate, String ganador, String jugador, String rival, int numeroPokemonKORival,
			int numeroPokemonKOCoach, boolean retirarse) {
		this.idCombate = 0;
		this.ganador = "";
		this.jugador = "";
		this.rival = "";
		this.numeroPokemonKOCoach = 0;
		this.numeroPokemonKORival = 0;
		this.retirarse = false;
	}

	public Combate(Pokemon c) {
		super(c);
	}

	public Combate(Combate c) {
		this.idCombate = c.idCombate;
		this.ganador = c.ganador;
		this.jugador = c.jugador;
		this.rival = c.rival;
		this.numeroPokemonKOCoach = c.numeroPokemonKOCoach;
		this.numeroPokemonKORival = c.numeroPokemonKORival;
		this.retirarse = c.retirarse;
	}

	public Combate(int nivel, String nombre, String mote, int vitalidad, int ataque, int defensa, int atEsp, int defEsp,
			int velocidad, String sexo, int estamina, int fertilidad, String tipo1, String tipo2, int experiencia,
			LinkedList<Turnos> turnos, int idCombate, String ganador, String jugador, String rival,
			int numeroPokemonKORival, int numeroPokemonKOCoach, boolean retirarse) {
		super(nivel, numeroPokemonKOCoach, numeroPokemonKOCoach, numeroPokemonKOCoach, nombre, mote, vitalidad, ataque,
				defensa, atEsp, defEsp, velocidad, sexo, estamina, fertilidad, tipo1, tipo2, experiencia, getEstado(), rival, rival, numeroPokemonKOCoach);
		this.turnos = turnos;
		this.idCombate = idCombate;
		this.ganador = ganador;
		this.jugador = jugador;
		this.rival = rival;
		this.numeroPokemonKORival = numeroPokemonKORival;
		this.numeroPokemonKOCoach = numeroPokemonKOCoach;
		this.retirarse = retirarse;
	}

	public void Combatir() {
		String jugador1 = "";
		String jugador2 = "";
		int vidaRecibida = 0;
		int vidaQuitada = 0;
		if (vidaRecibida < 0) {
			System.out.println("Error en el programa.");
		}else if (vidaQuitada < 0) {
			System.out.println("Error en el programa.");
		}

		if (numeroPokemonKOCoach == 6) {
			System.out.println(jugador1 + " se ha quedado fuera de combate");
			System.out.println(jugador2 + "ha ganado el combate");
			
			// x/3*1

			// pokeDollarsPerdido=
		} else if (numeroPokemonKORival == 6) {
			System.out.println("Enhorabuena, has ganado el combate!");
			int nivel_pokemon = getNivel();
			int nivelpokemonrival = getNivel();

			int experienciaCombate = (nivel_pokemon + nivelpokemonrival) * 10 / 4;
			
		}
	}

	public void Recompensa() {
		System.out.println("Enhorabuena, has ganado, toma +10 monedas");
		System.out.println("¡Vaya! Has perdido, -10 monedas.");
	}

}
