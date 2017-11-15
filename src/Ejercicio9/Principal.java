package Ejercicio9;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class Principal {

	final static int SALARIO = 30000;
	
	public static void main(String[] args) throws XMLStreamException, FileNotFoundException {
		List<Empleado> ListEmpleados = new ArrayList<>();
		Empleado emp = null;
		Direccion dir = null;
		XMLInputFactory factory = XMLInputFactory.newInstance();
		XMLStreamReader reader = factory.createXMLStreamReader(new FileReader("empleados-9.xml"));

		while (reader.hasNext()) {
			int event = reader.next();

			if (event == XMLStreamConstants.START_ELEMENT) {
				String nodo = reader.getLocalName();
				switch (nodo) {
				case "empleado": {
					emp = new Empleado();
					emp.setId(reader.getAttributeValue(0));
					break;
				}

				case "nombre": {
					emp.setNombre(reader.getElementText());
					break;
				}
				case "apellido": {
					emp.setApellido(reader.getElementText());
					break;
				}
				case "salario": {
					emp.setSalario((Double.parseDouble(reader.getElementText())));
					break;
				}
				case "cargo": {
					emp.setCargo(reader.getElementText());
					break;
				}
				case "ciudad": {
					dir = new Direccion();
					dir.setCiudad(reader.getElementText());
					break;
				}
				case "provincia": {
					dir.setProvincia(reader.getElementText());
					break;
				}
				case "cp": {
					dir.setCp(reader.getElementText());
					break;
				}
				case "calle": {
					dir.setCalle(reader.getElementText());
					emp.setDireccion(dir);
					break;
				}
				}

			}
			if((event == XMLStreamConstants.END_ELEMENT)&&(reader.getLocalName() == "empleado")) {
				ListEmpleados.add(emp);
			}

		}
		for(Empleado empleado:ListEmpleados) {
			if(empleado.getSalario() >= SALARIO ) {
				System.out.println(empleado);
			}
	}

	}
}
