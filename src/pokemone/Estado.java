package pokemone;

public class Estado extends Movimiento {
	//3 tipos de estado, problemas de estado, estados temporales y otros estados
	protected boolean problemasDeEstado;
	protected boolean estadosTemporales;
	protected boolean otrosEstados;
	protected boolean miTurno;
	public Estado() {
		this.problemasDeEstado = false;
		this.estadosTemporales = false;
		this.otrosEstados = false;
		this.miTurno = false;
	}
	
	public Estado(boolean problemasDeEstado, boolean estadosTemporales,
							boolean otrosEstados) {
		this.problemasDeEstado = false;
		this.estadosTemporales = false;
		this.otrosEstados = false;
		this.miTurno = false;
	}	
	
	public Estado(Estado c) {
		this.problemasDeEstado = c.problemasDeEstado;
		this.estadosTemporales = c.estadosTemporales;
		this.otrosEstados = c.otrosEstados;
		this.miTurno = false;
	}

	public boolean isProblemasDeEstado() {
		return problemasDeEstado;
	}

	public void setProblemasDeEstado(boolean problemasDeEstado) {
		this.problemasDeEstado = problemasDeEstado;
	}

	public boolean isEstadosTemporales() {
		return estadosTemporales;
	}

	public void setEstadosTemporales(boolean estadosTemporales) {
		this.estadosTemporales = estadosTemporales;
	}

	public boolean isOtrosEstados() {
		return otrosEstados;
	}

	public void setOtrosEstados(boolean otrosEstados) {
		this.otrosEstados = otrosEstados;
	}

	@Override
	public String toString() {
		return "Estado [problemasDeEstado=" + problemasDeEstado + ", estadosTemporales=" + estadosTemporales
				+ ", otrosEstados=" + otrosEstados + "]";
	}
	
	public void paralizado() {
		int probabilidad = (int)Math.floor(Math.random()*4+1);
		problemasDeEstado = true;
		estadosTemporales = false;
		otrosEstados = false;
		int velocidadNueva = velocidad/2;
		setVelocidad(velocidadNueva);
		if(probabilidad == 1) {
			int ataque = 0;
			setAtaque(ataque);
		}else {
			getAtaque();
		}
	}
	public void quemado() {
		problemasDeEstado = true;
		estadosTemporales = false;
		otrosEstados = false;
		int vitalidadNueva = (int) (vitalidad*0.0625);
		setVitalidad(vitalidadNueva);
		int ataqueMitad = ataque/2;
		setAtaque(ataqueMitad);
	}
	public void envenenado() {
		problemasDeEstado = true;
		estadosTemporales = false;
		otrosEstados = false;
		miTurno = true;
		if (miTurno == true) {
			int vitalidadNueva = (int) (vitalidad*0.125);
			setVitalidad(vitalidadNueva);
		}else {
			getVitalidad();
		}
	}
	public void envenenadoGravemente() {
		problemasDeEstado = true;
		estadosTemporales = false;
		otrosEstados = false;
		miTurno = true;
		while(vitalidad > 0) {
		if (miTurno == true) {
			int vitalidadNueva = (int) (vitalidad*0.125);
			setVitalidad(vitalidadNueva);
			vitalidadNueva = (int) (vitalidadNueva*0.0625);
			}else {
				getVitalidad();
			}
		}
	}
	public void dormido() {
		problemasDeEstado = true;
		estadosTemporales = false;
		otrosEstados = false;
		if(miTurno == true) {
		int despertarse = (int)Math.floor(Math.random()*3+1);
			if(despertarse == 1) {
				//El pokemon se despierta tras un minuto
			}else if(despertarse == 2) {
				//El pokemon se despierta tras dos minutos
			}else {
				//El pokemon se despierta tras tres minutos
			}
		}
	}
	public void somnoliento() {
		problemasDeEstado = true;
		estadosTemporales = false;
		otrosEstados = false;
		int probabilidad = (int)Math.floor(Math.random()*2+1);
		if(probabilidad == 1) {
			ataque = 0;
			setAtaque(ataque);
		}else {
			getAtaque();
		}
	}
	public void congelado() {
		problemasDeEstado = true;
		estadosTemporales = false;
		otrosEstados = false;
		miTurno = true;
		int congelado = (int)Math.floor(Math.random()*5+1);
		while(congelado != 1) {
			ataque = 0;
			setAtaque(ataque);
		}
	}
	public void helado() {
		problemasDeEstado = true;
		estadosTemporales = false;
		otrosEstados = false;
		miTurno = true;
		while(miTurno == true) {
			int vitalidadNueva = (int) (vitalidad*0.0625);
			setVitalidad(vitalidadNueva);
			int ataqueEspecialReducido = atEsp/2;
			setAtEsp(ataqueEspecialReducido);
		}
	}
	public void confuso() {
		problemasDeEstado = false;
		estadosTemporales = true;
		otrosEstados = false;
		//Nuestro pokemon es tonto y se ataca a si mismo
		int vitalidadQuitadaPorNosotros = ataque;
		setVitalidad(vitalidadQuitadaPorNosotros);
	}
	public void maldito() {
		problemasDeEstado = false;
		estadosTemporales = true;
		otrosEstados = false;
		miTurno = true;
		while(miTurno == true) {
			int vitalidadNueva = (int) (vitalidad*0.25);
			setVitalidad(vitalidadNueva);
		}
	}
	public void enamorado() {
		problemasDeEstado = false;
		estadosTemporales = true;
		otrosEstados = false;
		miTurno = true;
		int probabilidad = (int)Math.floor(Math.random()*4+1);
		if(probabilidad != 1) {
			getAtaque();
		}else {
			int ataqueNuevo = 0;
			setAtaque(ataqueNuevo);
		}
	}
	public void fatiga() {
		problemasDeEstado = false;
		estadosTemporales = true;
		otrosEstados = false;
		boolean pokemonQuieto = true;
	}
	public void debilitado() {
		problemasDeEstado = false;
		estadosTemporales = false;
		otrosEstados = true;
		int ceroDeVida = 0;
		setVitalidad(ceroDeVida);
	}
}



