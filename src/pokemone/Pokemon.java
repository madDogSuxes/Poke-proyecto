package pokemone;

public class Pokemon {
	private int nivel;
	private String nombre;
	private String mote;
	private int vitalidad;
	private int ataque;
	private int defensa;
	private int atEsp;
	private int defEsp;
	private int velocidad;
	private char sexo;
	private int estamina;
	
	public Pokemon(int nivel, String nombre, String mote, int vitalidad, int ataque, int defensa, int atEsp, int defEsp,
			int velocidad, char sexo, int estamina) {
		super();
		this.nivel = nivel;
		this.nombre = nombre;
		this.mote = mote;
		this.vitalidad = vitalidad;
		this.ataque = ataque;
		this.defensa = defensa;
		this.atEsp = atEsp;
		this.defEsp = defEsp;
		this.velocidad = velocidad;
		this.sexo = sexo;
		this.estamina = estamina;
	}
	
	public Pokemon() {
		super();
		this.nivel = 1;
		this.nombre = "";
		this.mote = "";
		this.vitalidad = 15;
		this.ataque = 0;
		this.defensa = 0;
		this.atEsp = 0;
		this.defEsp = 0;
		this.velocidad = 0;
		this.sexo='M';
		this.estamina=0;
	}
	
	public Pokemon(Pokemon c) {
		this.nivel = c.nivel;
		this.nombre = c.nombre;
		this.mote = c.mote;
		this.vitalidad = c.vitalidad;
		this.ataque = c.ataque;
		this.defensa = c.defensa;
		this.atEsp = c.atEsp;
		this.defEsp = c.defEsp;
		this.velocidad = c.velocidad;
		this.sexo=c.sexo;
		this.estamina=c.estamina;
	}
	
	
	

}
