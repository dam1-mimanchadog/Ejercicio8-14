package Ejercicio11;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.ListIterator;

import com.thoughtworks.xstream.XStream;

public class Principal {

	public static void main(String[] args) {

		leerXML();

	}

	private static void leerXML() {

		XStream xstream = new XStream();
		xstream.alias("blog", Blog.class);
		xstream.alias("entrada", Entrada.class);
		xstream.addImplicitCollection(Blog.class, "entradas");

		try {
			Blog blog;

			blog = (Blog) xstream.fromXML(new FileInputStream("src\\Ejercicio11\\blog.xml"));

			System.out.println("Numero de entradas " + blog.entradas.size());

			ArrayList<Entrada> listaEntradas = blog.getEntradas();

			ListIterator<Entrada> iterador = listaEntradas.listIterator();

			System.out.println("Autor: " + blog.getAutor());
			while (iterador.hasNext()) {

				Entrada entradaAux = (Entrada) iterador.next();
				System.out.println(entradaAux);
			}
			System.out.println("Fin del listado");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
