package Ejercicio12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import Ejercicio10.Libro;
import Ejercicio10.ListaLibros;
import Ejercicio10.MiObjectOutputStream;

public class Principal {
	
	
public static void main(String[] args) {
	
	//crearFicheroLibro();
	crearJSON();
	
}


private static void crearJSON() {

	ArrayList<Libro> libros = getLibros();
	
	Gson prettyGson =  new GsonBuilder().setPrettyPrinting().create();
	
	for (Libro libro : libros) {
		
		System.out.println(prettyGson.toJson(libro));
	}
}


private static ArrayList<Libro> getLibros() {
	ArrayList<Libro> listaLibros = new ArrayList<Libro>();
	File ficheroLibros = new File("src\\libros.dat");
	Libro libro=null;
	FileInputStream fis = null;
	ObjectInputStream ois = null;
	try {
		fis = new  FileInputStream(ficheroLibros);
		ois = new ObjectInputStream(fis);
		
		libro = (Libro)ois.readObject();
		
	while(libro != null) {
		
		listaLibros.add(libro);
		libro = (Libro)ois.readObject();
		
	}
	
	
	
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
	}
	
	try {
		ois.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	return listaLibros;

}




private static void crearFicheroLibro() {
	
		ArrayList<Libro> libros = new ArrayList<Libro>();
		File fichero = new File("src\\libros.dat");
		
		boolean opcion = true;
		Libro libroAux;
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			if (fichero.exists()) {
				fos = new FileOutputStream(fichero, true);
				oos = new MiObjectOutputStream(fos);
			} else {
				fos = new FileOutputStream(fichero);
				oos = new ObjectOutputStream(fos);
			}
			do {
				System.out.println("Vamos a crear un nuevo libro");

				libroAux = new Libro(pedir("Isbn"), pedir("Titulo"), pedir("Autor"), pedir("Editorial"));
				libros.add(libroAux);
				opcion = añadirLibro();

			} while (opcion);

			for (int i = 0; i < libros.size(); i++) {
				oos.writeObject(libros.get(i));

			}

		} catch (IOException e) {

		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Bloque catch generado automáticamente
				e.printStackTrace();
			}
		}
	}
	
private static String pedir(String string) {
	Scanner entrada = new Scanner (System.in);
	System.out.println(string + ":");
	
	return entrada.nextLine();
}



private static boolean añadirLibro() {
	Scanner entrada = new Scanner(System.in);
	String cadena = "si";
	System.out.println("¿Añadir libro nuevo?");
	if (cadena.toLowerCase().equals(entrada.nextLine().toLowerCase())) {
		return true;
	}
	return false;
}
}
