package pokemone;

public class Movimiento {

	protected int idMovimiento;
	protected String nomMovimiento;
	protected String nomMovimiento2;
	protected String nomMovmiento3;
	protected String tipoMovimiento;
	protected int consumoEstamina;
	
	public Movimiento() {
		this.idMovimiento = 0;
		this.nomMovimiento = "";
		this.tipoMovimiento = "";
		this.consumoEstamina = 0;
	}
	
	public Movimiento(int idMovimiento, String nomMovimiento, String tipoMovimiento, int consumoEstamina) {
		this.idMovimiento = 0001;
		this.nomMovimiento = "Ataque";
		this.nomMovimiento2 = "Estado";
		this.nomMovmiento3 = "Mejora";
		this.tipoMovimiento = "Tipo";
		this.consumoEstamina = -10;
	}
	
	public Movimiento (Movimiento c) {
		this.idMovimiento = c.idMovimiento;
		this.nomMovimiento = c.nomMovimiento;
		this.nomMovimiento2 = c.nomMovimiento2;
		this.nomMovmiento3 = c.nomMovmiento3;
		this.tipoMovimiento = c.tipoMovimiento;
		this.consumoEstamina = c.consumoEstamina;
	}

	public int getIdMovimiento() {
		return idMovimiento;
	}

	public void setIdMovimiento(int idMovimiento) {
		this.idMovimiento = idMovimiento;
	}

	public String getNomMovimiento() {
		return nomMovimiento;
	}

	public void setNomMovimiento(String nomMovimiento) {
		this.nomMovimiento = nomMovimiento;
	}

	public String getNomMovimiento2() {
		return nomMovimiento2;
	}

	public void setNomMovimiento2(String nomMovimiento2) {
		this.nomMovimiento2 = nomMovimiento2;
	}

	public String getNomMovmiento3() {
		return nomMovmiento3;
	}

	public void setNomMovmiento3(String nomMovmiento3) {
		this.nomMovmiento3 = nomMovmiento3;
	}

	public String getTipoMovimiento() {
		return tipoMovimiento;
	}

	public void setTipoMovimiento(String tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}

	public int getConsumoEstamina() {
		return consumoEstamina;
	}

	public void setConsumoEstamina(int consumoEstamina) {
		this.consumoEstamina = consumoEstamina;
	}

	@Override
	public String toString() {
		return "Movimiento [idMovimiento=" + idMovimiento + ", nomMovimiento=" 
				+ nomMovimiento + ", nomMovimiento2="
				+ nomMovimiento2 + ", nomMovmiento3=" + nomMovmiento3 
				+ ", tipoMovimiento=" + tipoMovimiento
				+ ", consumoEstamina=" + consumoEstamina + "]";
	}
	
	
}
