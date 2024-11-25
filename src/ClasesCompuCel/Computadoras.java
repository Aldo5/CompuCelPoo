package ClasesCompuCel;

public class Computadoras {
	
	//Atributos
	private String clave;
	private String marca;
	private String modelo;
	private int existencia;
	private float precio;
	
	//Constructor sin parametros
	public Computadoras() {
	}

    //Constructor con parametros
	public Computadoras(String clave, String marca, String modelo, int existencia, float precio) {
		this.clave = clave;
		this.marca = marca;
		this.modelo = modelo;
		this.existencia = existencia;
		this.precio = precio;
	}


	//Encapsulamiento
	public String getClave() {
		return clave;
	}


	public void setClave(String clave) {
		this.clave = clave;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getExistencia() {
		return existencia;
	}


	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}

	//Metodo toString
	@Override
	public String toString() {
		return "Computadoras [clave=" + clave + ", marca=" + marca + ", modelo=" + modelo + ", existencia=" + existencia
				+ ", precio=" + precio + "]\n";
	}
	
	
	
	
}
