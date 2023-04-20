package combateTurno;

import java.util.LinkedList;

public class Combate {
	
	LinkedList<String> turnos = new LinkedList<String>();
	protected int idCombate;
	protected String ganador;
	protected String jugador;
	protected String rival;
	protected int numeroPokemonKORival;
	protected int numeroPokemonKOCoach;
	
	public Combate(){
		this.idCombate = 0;
		this.ganador = "";
		this.jugador = "";
		this.rival = "";
		this.numeroPokemonKOCoach = 0;
		this.numeroPokemonKORival = 0;
	}
	
	public Combate(int idCombate, String ganador, String jugador,
					String rival, int numeroPokemonKORival,
					int numeroPokemonKOCoach) {
		this.idCombate = 0;
		this.ganador = "";
		this.jugador = "";
		this.rival = "";
		this.numeroPokemonKOCoach = 0;
		this.numeroPokemonKORival = 0;
	}
	
	public Combate(Combate c) {
		this.idCombate = c.idCombate;
		this.ganador = c.ganador;
		this.jugador = c.jugador;
		this.rival = c.rival;
		this.numeroPokemonKOCoach = c.numeroPokemonKOCoach;
		this.numeroPokemonKORival = c.numeroPokemonKORival;
	}
	
	public void Combatir() {
		String jugador1;
		String jugador2;
		int vidaRecibida = 0;
		int vidaDada = 0;
		if (vidaRecibida > 0) {
			System.out.println("Error en el programa.");
		}
	}
	
	public void Recompensa() {
		System.out.println("Enhorabuena, has ganado, toma +10 monedas");
		System.out.println("¡Vaya! Has perdido, -10 monedas.");
	}
}
