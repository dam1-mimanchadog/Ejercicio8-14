package Ejercicio8;
import java.io.Serializable;
import java.util.ArrayList;

public class Libro implements Serializable {
/**
	 * 
	 */
	
String isbn;
String titulo;
ArrayList<String> autores;
String editorial;

public Libro() {
	// TODO Apéndice de constructor generado automáticamente
}

public Libro(String isbn, String titulo, ArrayList<String> autor, String editorial) {
	this.isbn = isbn;
	this.titulo = titulo;
	this.autores = autor;
	this.editorial = editorial;
}



public String getIsbn() {
	return isbn;
}

public void setIsbn(String isbn) {
	this.isbn = isbn;
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public ArrayList<String> getAutores() {
	return autores;
}

public void setAutores(ArrayList<String> autor) {
	this.autores = autor;
}

public String getEditorial() {
	return editorial;
}

public void setEditorial(String editorial) {
	this.editorial = editorial;
}

@Override
	public String toString() {
		
		return "ISBN: " + isbn + "\n Titulo: " + titulo + "\n Autores: " + autores.toString() + "\n Editorial: " + editorial;
	}


}
