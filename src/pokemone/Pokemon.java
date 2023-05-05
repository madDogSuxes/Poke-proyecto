package pokemone;

public class Pokemon {
	protected int nivel;
	protected int idEntrenador;
	protected int idPokemon;
	protected int numPokedex;
	protected String nombre;
	protected String mote;
	protected int vitalidad;
	protected int ataque;
	protected int defensa;
	protected int atEsp;
	protected int defEsp;
	protected int velocidad;
	protected char sexo;
	protected int estamina;
	protected int fertilidad;
	protected Tipo tipo1;
	protected Tipo tipo2;
	protected int experiencia;
	protected static Estado estado;

	public Pokemon(int nivel, int idEntrenador, int idPokemon, int numPokedex, String nombre, String mote, int vitalidad, int ataque, int defensa, int atEsp, int defEsp,
			int velocidad, char sexo, int estamina, int fertilidad, Tipo tipo1, Tipo tipo2, int experiencia,
			Estado estado) {
		super();
		this.idEntrenador = idEntrenador;
		this.idPokemon = idPokemon;
		this.numPokedex = numPokedex;
		this.nivel = nivel;
		this.nombre = nombre;
		this.mote = mote;
		this.vitalidad = vitalidad;
		this.ataque = ataque;
		this.defensa = ataque;
		this.atEsp = atEsp;
		this.defEsp = defEsp;
		this.velocidad = velocidad;
		this.sexo = sexo;
		this.estamina = estamina;
		this.fertilidad = fertilidad;
		this.tipo1 = tipo1;
		this.tipo2 = tipo2;
		this.experiencia = experiencia;
		this.estado = estado;
	}

	public static Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Pokemon() {
		super();
		this.idEntrenador = 0;
		this.idPokemon = 0;
		this.nivel = 1;
		this.numPokedex = 0;
		this.nombre = "";
		this.mote = "";
		this.vitalidad = 15;
		this.ataque = 0;
		this.defensa = 0;
		this.atEsp = 0;
		this.defEsp = 0;
		this.velocidad = 0;
		this.sexo = 'M';
		this.estamina = 100;
		this.fertilidad = 1;
		this.tipo1 = Tipo.NORMAL;
		this.tipo2 = null;
		this.experiencia = 0;
		this.estado = null;
	}

	public Pokemon(Pokemon c) {
		this.idEntrenador = c.idEntrenador;
		this.idPokemon = c.idPokemon;
		this.nivel = c.nivel;
		this.numPokedex = c.numPokedex;
		this.nombre = c.nombre;
		this.mote = c.mote;
		this.vitalidad = c.vitalidad;
		this.ataque = c.ataque;
		this.defensa = c.defensa;
		this.atEsp = c.atEsp;
		this.defEsp = c.defEsp;
		this.velocidad = c.velocidad;
		this.sexo = c.sexo;
		this.estamina = c.estamina;
		this.fertilidad = c.fertilidad;
		this.tipo1 = c.tipo1;
		this.tipo2 = c.tipo2;
		this.experiencia = c.experiencia;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getIdEntrenador(int idEntrenador) {
		return idEntrenador;
	}
	
	public void setIdEntrenador() {
		this.idEntrenador = idEntrenador;
	}
	
	public int getIdPokemon(int idPokemon) {
		return idPokemon;
	}
	
	public int setIdPokemon() {
		return idPokemon = idPokemon;
	}
	
	public int numPokedex() {
		return numPokedex;
	}
	
	public void setNumPokedex(int numPokedex) {
		this.numPokedex = numPokedex;
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
		return (int) defensa;
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
		if (10 * nivel == experiencia) {
			nivel++;
			int mejora = (int) Math.random() * 5 + 1;
			int vitalMejor = vitalidad + mejora;
			int ataqueM = ataque + mejora;
			int defensaM = ataque + mejora;
			int atEspM = atEsp + mejora;
			int defEspM = defEsp + mejora;
			int velocidadM = velocidad + mejora;
		}

	}

	public static int aumentarEstadisticas1(int aumentoDeEstadisticas1) {
		return aumentoDeEstadisticas1;
	}

	public static int aumentarEstadisticas2(int aumentoDeEstadisticas2) {
		return aumentoDeEstadisticas2;
	}

	public static int aumentarEstadisticas3(int aumentoDeEstadisticas3) {
		return aumentoDeEstadisticas3;
	}

	public static int aumentarEstadisticas4(int aumentoDeEstadisticas4) {
		return aumentoDeEstadisticas4;
	}

	public int ventaja(Tipo tipo1, Tipo tipo2, Ataque ataque) {

		Tipo tipoRival = null;
		int potencia = ataque.getPotencia();
		
		int ventaja=potencia*2;

		if (tipo1 == Tipo.ACERO && tipoRival == Tipo.HADA) {
			
			return ventaja;

		} else if (tipo1 == Tipo.ACERO && tipoRival == Tipo.HIELO) {

			return ventaja;


		} else if (tipo1 == Tipo.ACERO && tipoRival == Tipo.ROCA) {

			return ventaja;

		}

		if (tipo1 == Tipo.AGUA && tipoRival == Tipo.FUEGO) {

			return ventaja;

		} else if (tipo1 == Tipo.AGUA && tipoRival == Tipo.ROCA) {

			return ventaja;

		} else if (tipo1 == Tipo.AGUA && tipoRival == Tipo.TIERRA) {

			return ventaja;

		}

		if (tipo1 == Tipo.BICHO && tipoRival == Tipo.PLANTA) {

			return ventaja;

		}else if (tipo1 == Tipo.BICHO && tipoRival == Tipo.PSIQUICO) {

			return ventaja;

		}else if (tipo1 == Tipo.BICHO && tipoRival == Tipo.SINIESTRO) {

			return ventaja;

		}
		
		if (tipo1 == Tipo.DRAGON && tipoRival == Tipo.DRAGON) {

			return ventaja;

		}
		
		if (tipo1 == Tipo.ELECTRICO && tipoRival == Tipo.AGUA) {

			return ventaja;

		}else if (tipo1 == Tipo.ELECTRICO && tipoRival == Tipo.VOLADOR) {

			return ventaja;

		}
		
		if (tipo1 == Tipo.FANTASMA && tipoRival == Tipo.FANTASMA) {

			return ventaja;

		}else if (tipo1 == Tipo.FANTASMA && tipoRival == Tipo.PSIQUICO) {

			return ventaja;

		}
		
		if (tipo1 == Tipo.FUEGO && tipoRival == Tipo.ACERO) {

			return ventaja;

		}else if (tipo1 == Tipo.FUEGO && tipoRival == Tipo.PLANTA) {

			return ventaja;

		}else if (tipo1 == Tipo.FUEGO && tipoRival == Tipo.BICHO) {

			return ventaja;

		}else if (tipo1 == Tipo.FUEGO && tipoRival == Tipo.HIELO) {

			return ventaja;

		}
		
		if (tipo1 == Tipo.HADA && tipoRival == Tipo.DRAGON) {

			return ventaja;

		}else if (tipo1 == Tipo.HADA && tipoRival == Tipo.LUCHA) {

			return ventaja;

		}else if (tipo1 == Tipo.HADA && tipoRival == Tipo.SINIESTRO) {

			return ventaja;

		}
		
		if (tipo1 == Tipo.HIELO && tipoRival == Tipo.DRAGON) {

			return ventaja;

		}else if (tipo1 == Tipo.HIELO && tipoRival == Tipo.PLANTA) {

			return ventaja;

		}else if (tipo1 == Tipo.HIELO && tipoRival == Tipo.TIERRA) {

			return ventaja;

		}else if (tipo1 == Tipo.HIELO && tipoRival == Tipo.VOLADOR) {

			return ventaja;

		}
		
		if (tipo1 == Tipo.LUCHA && tipoRival == Tipo.ROCA) {

			return ventaja;

		}else if (tipo1 == Tipo.LUCHA && tipoRival == Tipo.HIELO) {

			return ventaja;

		}else if (tipo1 == Tipo.LUCHA && tipoRival == Tipo.NORMAL) {

			return ventaja;

		}else if (tipo1 == Tipo.LUCHA && tipoRival == Tipo.ROCA) {

			return ventaja;

		}else if (tipo1 == Tipo.LUCHA && tipoRival == Tipo.SINIESTRO) {

			return ventaja;

		}
		
		if (tipo1 == Tipo.PLANTA && tipoRival == Tipo.AGUA) {

			return ventaja;

		}else if (tipo1 == Tipo.PLANTA && tipoRival == Tipo.ROCA) {

			return ventaja;

		}else if (tipo1 == Tipo.PLANTA && tipoRival == Tipo.TIERRA) {

			return ventaja;

		}
		
		if (tipo1 == Tipo.PSIQUICO && tipoRival == Tipo.LUCHA) {

			return ventaja;

		}else if (tipo1 == Tipo.PSIQUICO && tipoRival == Tipo.VENENO) {

			return ventaja;

		}
		
		if (tipo1 == Tipo.ROCA && tipoRival == Tipo.BICHO) {

			return ventaja;

		}else if (tipo1 == Tipo.ROCA && tipoRival == Tipo.FUEGO) {

			return ventaja;

		}else if (tipo1 == Tipo.ROCA && tipoRival == Tipo.HIELO) {

			return ventaja;

		}else if (tipo1 == Tipo.ROCA && tipoRival == Tipo.VOLADOR) {

			return ventaja;

		}
		
		if (tipo1 == Tipo.SINIESTRO && tipoRival == Tipo.FANTASMA) {

			return ventaja;

		}else if (tipo1 == Tipo.SINIESTRO && tipoRival == Tipo.PSIQUICO) {

			return ventaja;

		}
		
		if (tipo1 == Tipo.TIERRA && tipoRival == Tipo.ACERO) {

			return ventaja;

		}else if (tipo1 == Tipo.TIERRA && tipoRival == Tipo.ELECTRICO) {

			return ventaja;

		}else if (tipo1 == Tipo.TIERRA && tipoRival == Tipo.FUEGO) {

			return ventaja;

		}else if (tipo1 == Tipo.TIERRA && tipoRival == Tipo.ROCA) {

			return ventaja;

		}else if (tipo1 == Tipo.TIERRA && tipoRival == Tipo.VENENO) {

			return ventaja;

		}
		
		if (tipo1 == Tipo.VENENO && tipoRival == Tipo.HADA) {

			return ventaja;

		}else if (tipo1 == Tipo.TIERRA && tipoRival == Tipo.PLANTA) {

			return ventaja;

		}
		
		if (tipo1 == Tipo.VOLADOR && tipoRival == Tipo.BICHO) {

			return ventaja;

		}else if (tipo1 == Tipo.VOLADOR && tipoRival == Tipo.LUCHA) {

			return ventaja;

		}else if (tipo1 == Tipo.VOLADOR && tipoRival == Tipo.PLANTA) {

			return ventaja;

		}
		return ventaja;
		

	}
	
	
	
	

}
