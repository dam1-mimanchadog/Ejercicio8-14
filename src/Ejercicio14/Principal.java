package Ejercicio14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class Principal {

	public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
		
		leerXML();
		
	}

	private static void leerXML() throws FileNotFoundException, XMLStreamException {
		
		List<Libro> listLibros = new ArrayList<>();
		ArrayList<String> autores = new ArrayList<>();;
		Libro lib = null;
		XMLInputFactory factory = XMLInputFactory.newInstance();
		XMLStreamReader reader = factory.createXMLStreamReader(new FileReader("src\\libros-14.xml"));

		while (reader.hasNext()) {
			int event = reader.next();
			if (event == XMLStreamConstants.START_ELEMENT) {
				String nodo = reader.getLocalName();
				switch (nodo) {
				case "libro": {
					lib = new Libro();
					autores = new ArrayList<>();
					break;
				}
				case "ISBN":{
					lib.setIsbn(reader.getElementText());
					break;
				}
				case "titulo": {
					lib.setTitulo(reader.getElementText());
					break;
				}
				case "autor": {
					
					 autores.add(reader.getElementText());
					 lib.setAutores(autores);
					 
					break;
				}
				case "editorial": {
					lib.setEditorial(reader.getElementText());
					break;
				}
				}
				
				
			}
			if ((event == XMLStreamConstants.END_ELEMENT) && (reader.getLocalName() == "libro")) {
				
				listLibros.add(lib);
				autores = new ArrayList<>();
			}
			
			
			
		}
		
		for (Libro libro : listLibros) {
				System.out.println(libro);
		}
		escribirJSON(listLibros);
	}

	private static void escribirJSON(List<Libro> listLibros) {
		
		List<Libro> libros = listLibros;
		
		Gson prettyGson =  new GsonBuilder().setPrettyPrinting().create();
		
		for (Libro libro : libros) {
			
			System.out.println(prettyGson.toJson(libro));
		}
	}
		
	}
	

