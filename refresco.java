public class Refrescos {

	String marca;
	String tamaño;
	double precio;
	boolean descuento;

	public Refrescos(String marca, String tamaño, double precio, boolean descuento) {
		this.marca = marca;
		this.tamaño = tamaño;
		this.precio = precio;
		this.descuento = descuento;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String gettamaño() {
		return tamaño;
	}

	public void settamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isDescuento() {
		return descuento;
	}

	public void setDescuento(boolean descuento) {
		this.descuento = descuento;
	}

}
