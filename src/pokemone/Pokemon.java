package pokemone;

import java.util.LinkedList;

/**
 * Clase Pokemon con sus constructores y sus getter and setter
 * @author Miguel y Jesús
 *
 */

public class Pokemon {
	protected int nivel;
	protected int idEntrenador;
	protected int idPokemon;
	protected int numPokedex;
	protected String imgDeFrente;
	protected String imgDeEspaldas;
	protected String nombre;
	protected String mote;
	protected int vitalidad;
	protected int ataque;
	protected int defensa;
	protected int atEsp;
	protected int defEsp;
	protected int velocidad;
	protected String sexo;
	protected int estamina;
	protected int fertilidad;
	protected String tipo1;
	protected String tipo2;
	protected int experiencia;
	protected static Estado estado;
	protected int equipo;
	protected LinkedList<Movimiento> listaMov;

	public Pokemon(int nivel, int idEntrenador, int idPokemon, int numPokedex, String nombre, String mote, int vitalidad, int ataque, int defensa, int atEsp, int defEsp,
			int velocidad, String sexo2, int estamina, int fertilidad, String tipo12, String tipo22, int experiencia,
			Estado estado, String imgDeFrente, String imgDeEspaldas, int equipo) {
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
		this.sexo = sexo2;
		this.estamina = estamina;
		this.fertilidad = fertilidad;
		this.tipo1 = tipo12;
		this.tipo2 = tipo22;
		this.experiencia = experiencia;
		this.estado = estado;
		this.imgDeEspaldas = imgDeEspaldas;
		this.imgDeFrente = imgDeFrente;
		this.equipo = equipo;
	}
	
	public int getNumPokedex() {
		return numPokedex;
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
		this.sexo = "";
		this.estamina = 100;
		this.fertilidad = 1;
		this.tipo1 = null;
		this.tipo2 = null;
		this.experiencia = 0;
		this.estado = null;
		this.imgDeEspaldas = "";
		this.imgDeFrente = "";
		this.equipo = 0;
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
		this.imgDeEspaldas = c.imgDeEspaldas;
		this.imgDeFrente = c.imgDeFrente;
		this.equipo = c.equipo;
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
	
	public int setIdPokemon(int idPokemon) {
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

	public static String setMote(String mote) {
		return mote;
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

	public String getSexo() {
		return "";
	}

	public void setSexo(String sexo) {
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

	public String getTipo1() {
		return tipo1;
	}

	public void setTipo1(String string) {
		this.tipo1 = string;
	}

	public String getTipo2() {
		return tipo2;
	}

	public void setTipo2(String string) {
		this.tipo2 = string;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public String getImgDeFrente() {
		return imgDeFrente;
	}

	public void setImgDeFrente(String imgDeFrente) {
		this.imgDeFrente = imgDeFrente;
	}

	public String getImgDeEspaldas() {
		return imgDeEspaldas;
	}

	public void setImgDeEspaldas(String imgDeEspaldas) {
		this.imgDeEspaldas = imgDeEspaldas;
	}

	public int getEquipo() {
		return equipo;
	}

	public void setEquipo(int equipo) {
		this.equipo = equipo;
	}

	/**
	 * Método para que el pokemon suba de nivel cada vez que cumpla X requisitos
	 * Método de subir nivel
	 */
	
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
	
	/**
	 * Método poner mote
	 */
	
	public static void ponerMote() {
		String mote;
	}
	
	/**
	 * Método no poner mote
	 * @param nombre
	 */
	
	public static void noP0nerMote(String nombre) {
		setMote(nombre);
	}
	
	/**
	 * Método para el aumento de estadísticas
	 * @param aumentoDeEstadisticas1
	 * @param aumentoDeEstadisticas2
	 * @param aumentoDeEstadisticas3
	 * @param aumentoDeEstadisticas4
	 * @return
	 */
	
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

	/**
	 * Método ventaja
	 * @param tipo1
	 * @param tipo2
	 * @param ataque
	 * @return
	 */
	
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
	
	/**
	 * Método poner a criar
	 */
	
	public void ponerAcriar() {
		
		String moteMadre=getMote();
		
		String motePadre=getMote();
		
		int mitadMadre=moteMadre.length()/2;
	}
	
	
	
	

}
