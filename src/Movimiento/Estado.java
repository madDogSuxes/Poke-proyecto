package Movimiento;

public class Estado extends Movimiento {

	protected int turnos;
	protected String estado;
	
	public Estado() {
		this.turnos = 0;
		this.estado = "";
	}
	
	public Estado(int turnos, String estado) {
		this.turnos = 0;
		this.estado = "";
	}
	
	public Estado(Estado c) {
		this.turnos = c.turnos;
		this.estado = c.estado;
	}

	public int getTurnos() {
		return turnos;
	}

	public void setTurnos(int turnos) {
		this.turnos = turnos;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Estado [turnos=" + turnos + ", estado=" + estado + "]";
	}
	
}
