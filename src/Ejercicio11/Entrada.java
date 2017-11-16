package Ejercicio11;

import java.io.Serializable;

public class Entrada implements Serializable{

	String titulo;
	String descripcion;
	
	
	
	
	public String getTitulo() {
		return titulo;
	}




	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}




	public String getDescripcion() {
		return descripcion;
	}




	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}




	@Override
	public String toString() {
		return "Entrada [titulo=" + titulo + ", descripcion=" + descripcion + "]";
	}
	
}
