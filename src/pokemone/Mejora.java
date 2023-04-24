package pokemone;

public class Mejora extends Movimiento {

	protected int turnos;
	protected String mejora;
	protected int cantidadMejora;
	
	public Mejora() {
		this.turnos = 0;
		this.mejora = "";
		this.cantidadMejora = 0;
	}
	
	public Mejora(int turnos, String mejora, int cantidadMejora) {
		this.turnos = 0;
		this.mejora = "";
		this.cantidadMejora = 0;
	}
	
	public Mejora(Mejora c) {
		
	}

	public int getTurnos() {
		return turnos;
	}

	public void setTurnos(int turnos) {
		this.turnos = turnos;
	}

	public String getMejora() {
		return mejora;
	}

	public void setMejora(String mejora) {
		this.mejora = mejora;
	}

	public int getCantidadMejora() {
		return cantidadMejora;
	}

	public void setCantidadMejora(int cantidadMejora) {
		this.cantidadMejora = cantidadMejora;
	}

	@Override
	public String toString() {
		return "Mejora [turnos=" + turnos + ", mejora=" + mejora 
				+ ", cantidadMejora=" + cantidadMejora + "]";
	}
	
}
