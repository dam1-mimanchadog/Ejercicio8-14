package Ejercicio13;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class Principal {

	public static void main(String[] args) {
		
		leerJSON();
		
	}

	private static void leerJSON() {
		InputStream fis;
		Gson gson = new Gson();
		
		
		try {
			
			fis = new FileInputStream("src\\productos.json");
			JsonReader reader = new JsonReader(new InputStreamReader(fis, "UTF-8"));
		
		reader.beginArray();
		
		while(reader.hasNext()) {
			
			Producto pro = gson.fromJson(reader, Producto.class);
			System.out.println(pro);
		}
		
		reader.close();
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}
