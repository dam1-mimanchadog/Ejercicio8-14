package Ejercicio9;

public class Empleado {

String id;
String nombre;
String apellido;
double salario;
String cargo;
Direccion direccion;

public Empleado() {
	
}
public Empleado(String id, String nombre, String apellido, double salario, String cargo, Direccion direccion) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.apellido = apellido;
	this.salario = salario;
	this.cargo = cargo;
	this.direccion = direccion;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public double getSalario() {
	return salario;
}
public void setSalario(double salario) {
	this.salario = salario;
}
public String getCargo() {
	return cargo;
}
public void setCargo(String cargo) {
	this.cargo = cargo;
}
public Direccion getDireccion() {
	return direccion;
}
public void setDireccion(Direccion direccion) {
	this.direccion = direccion;
}
@Override
public String toString() {
	return "Empleado [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario + ", cargo="
			+ cargo + ", direccion=" + direccion + "]";
}
	
	
}
