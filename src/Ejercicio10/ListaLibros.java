package Ejercicio10;

import java.util.ArrayList;
import java.util.List;

public class ListaLibros {

	ArrayList<Libro> lista = new ArrayList<>();
	
	public ListaLibros(ArrayList<Libro> arrayList) {
		this.lista = arrayList;
	}

	public ArrayList<Libro> getLista() {
		return lista;
	}

	public void add(Libro libro) {
		lista.add(libro);
	}
	
	
}
