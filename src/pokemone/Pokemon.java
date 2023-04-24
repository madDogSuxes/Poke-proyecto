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
	private int fertilidad;
	private Tipo tipo1;
	private Tipo tipo2;
	private int experiencia;
	
	public Pokemon(int nivel, String nombre, String mote, int vitalidad, int ataque, int defensa, int atEsp, int defEsp,
			int velocidad, char sexo, int estamina, int fertilidad, Tipo tipo1, Tipo tipo2, int experiencia) {
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
		this.fertilidad=fertilidad;
		this.tipo1=tipo1;
		this.tipo2=tipo2;
		this.experiencia=experiencia;
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
		this.estamina=100;
		this.fertilidad=1;
		this.tipo1.name();
		this.tipo2.name();
		this.experiencia=0;
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
		this.fertilidad=c.fertilidad;
		this.tipo1=c.tipo1;
		this.tipo2=c.tipo2;
		this.experiencia=c.experiencia;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMote() {
		return mote;
	}

	public void setMote(String mote) {
		this.mote = mote;
	}

	public int getVitalidad() {
		return vitalidad;
	}

	public void setVitalidad(int vitalidad) {
		this.vitalidad = vitalidad;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public int getAtEsp() {
		return atEsp;
	}

	public void setAtEsp(int atEsp) {
		this.atEsp = atEsp;
	}

	public int getDefEsp() {
		return defEsp;
	}

	public void setDefEsp(int defEsp) {
		this.defEsp = defEsp;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getEstamina() {
		return estamina;
	}

	public void setEstamina(int estamina) {
		this.estamina = estamina;
	}

	public int getFertilidad() {
		return fertilidad;
	}

	public void setFertilidad(int fertilidad) {
		this.fertilidad = fertilidad;
	}

	public Tipo getTipo1() {
		return tipo1;
	}

	public void setTipo1(Tipo tipo1) {
		this.tipo1 = tipo1;
	}

	public Tipo getTipo2() {
		return tipo2;
	}

	public void setTipo2(Tipo tipo2) {
		this.tipo2 = tipo2;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	
	public void subirNivel() {
		if(10*nivel==experiencia){
			nivel++;
			int mejora=(int)Math.random()*5+1;
			
			int vitalMejor=vitalidad+mejora;
			int ataqueM=ataque+mejora;
			int defensaM=defensa+mejora;
			int atEspM=atEsp+mejora;
			int defEspM=defEsp+mejora;
			int velocidadM=velocidad+mejora;
			
				
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
