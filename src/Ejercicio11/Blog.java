package Ejercicio11;

import java.io.Serializable;
import java.util.ArrayList;

public class Blog implements Serializable {

	String autor;
	ArrayList<Entrada> entradas;
	
	
	
	
	
	
	public String getAutor() {
		return autor;
	}






	public void setAutor(String autor) {
		this.autor = autor;
	}






	public ArrayList<Entrada> getEntradas() {
		return entradas;
	}






	public void setEntradas(ArrayList<Entrada> entradas) {
		this.entradas = entradas;
	}






	@Override
	public String toString() {
		return "Blog [autor=" + autor + ", entradas=" + entradas + "]";
	}
	
}
