package pokemone;

public class ObjetoParaComprarlo extends Tienda{
	protected int idObjeto;
	protected String nomObjeto;
	protected double precio;
	protected String tipo1 = "ataque";
	protected String tipo2 = "defensa";
	
	public ObjetoParaComprarlo() {
		this.idObjeto = 0;
		this.nomObjeto = "";
		this.precio = 0.0;
		this.tipo1 = "ataque";
		this.tipo2 = "defensa";
	}
	
	public ObjetoParaComprarlo(int idObjeto, String nomObjeto, double precio,
								String tipo1, String tipo2) {
		this.idObjeto = 0000;
		this.nomObjeto = "";
		this.precio = 0.0;
		this.tipo1 = "ataque";
		this.tipo2 = "defensa";
	}
	
	public ObjetoParaComprarlo(ObjetoParaComprarlo c) {
		this.idObjeto = c.idObjeto;
		this.nomObjeto = c.nomObjeto;
		this.precio = c.precio;
		this.tipo1 = c.tipo1;
		this.tipo2 = c.tipo2;
	}

	public int getIdObjeto() {
		return idObjeto;
	}

	public void setIdObjeto(int idObjeto) {
		this.idObjeto = idObjeto;
	}

	public String getNomObjeto() {
		return nomObjeto;
	}

	public void setNomObjeto(String nomObjeto) {
		this.nomObjeto = nomObjeto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getTipo1() {
		return tipo1;
	}

	public void setTipo1(String tipo1) {
		this.tipo1 = tipo1;
	}

	public String getTipo2() {
		return tipo2;
	}

	public void setTipo2(String tipo2) {
		this.tipo2 = tipo2;
	}

	@Override
	public String toString() {
		return "ObjetoParaComprarlo [idObjeto=" + idObjeto + ", nomObjeto=" 
				+ nomObjeto + ", precio=" + precio+ ", tipo1=" 
				+ tipo1 + ", tipo2=" + tipo2 + "]";
	}
	
	
}

