package Movimiento;

public class Ataque extends Movimiento{

	protected int idAtaque;
	protected int potencia;
	
	public Ataque() {
		this.idAtaque = 0;
		this.potencia = 0;
	}
	
	public Ataque(int idAtaque, int potencia) {
		this.idAtaque = 0;
		this.potencia = 0;
	}
	
	public Ataque (Ataque c) {
		this.idAtaque = c.idAtaque;
		this.potencia = c.potencia;
	}

	public int getIdAtaque() {
		return idAtaque;
	}

	public void setIdAtaque(int idAtaque) {
		this.idAtaque = idAtaque;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Ataque [idAtaque=" + idAtaque + ", potencia=" + potencia + "]";
	}
	
}
