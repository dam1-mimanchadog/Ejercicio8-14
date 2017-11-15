package Ejercicio8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.*;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class Principal {

	public static void main(String[] args) throws XMLStreamException, FileNotFoundException {
		List<Libro> ListLibros = new ArrayList<>();
		ArrayList<String> autores = new ArrayList<>();
		Libro lib = null;
		XMLInputFactory factory = XMLInputFactory.newInstance();
		XMLStreamReader reader = factory.createXMLStreamReader(new FileReader("libros.xml"));

		while (reader.hasNext()) {
			int event = reader.next();
			if (event == XMLStreamConstants.START_ELEMENT) {
				String nodo = reader.getLocalName();
				switch (nodo) {
				case "libro": {
					lib = new Libro();
					lib.setIsbn(reader.getAttributeValue(0));
					break;
				}
				case "Titulo": {
					lib.setTitulo(reader.getElementText());
					break;
				}
				case "Autor": {
					 autores.add(reader.getElementText());
					 lib.setAutores(autores);
					break;
				}
				case "Editorial": {
					lib.setEditorial(reader.getElementText());
					break;
				}
				}
				
				
			}
			if ((event == XMLStreamConstants.END_ELEMENT) && (reader.getLocalName() == "libro")) {
				ListLibros.add(lib);
			}
		} //fin while

		for(Libro libro:ListLibros) {
			System.out.println(libro); //se pinta por pantalla
		}
		
	}
}
