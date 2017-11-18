package Ejercicio12;

import java.io.Serializable;
import java.util.ArrayList;

public class Libro implements Serializable {
	String isbn;
	String titulo;
	String autor;
	String editorial;

	public Libro() {
		// TODO Ap�ndice de constructor generado autom�ticamente
	}

	public Libro(String isbn, String titulo, String autor, String editorial) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
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

	public String getAutores() {
		return autor;
	}

	public void setAutores(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	@Override
		public String toString() {
			
			return "ISBN: " + isbn + "\n Titulo: " + titulo + "\n Autores: " + autor + "\n Editorial: " + editorial;
		}


	}


