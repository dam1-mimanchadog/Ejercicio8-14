package Ejercicio13;

public class Producto {

	String referencia;
	String nombre;
	double precio;
	int existencias;
	
	public Producto() {
		// TODO Apéndice de constructor generado automáticamente
	}
	
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getExistencias() {
		return existencias;
	}
	public void setExistencias(int existencias) {
		this.existencias = existencias;
	}
	@Override
	public String toString() {
		return "Producto [referencia=" + referencia + ", nombre=" + nombre + ", precio=" + precio + ", existencias="
				+ existencias + "]";
	}
	
	
	
	
}
