package mx.com.miniempresa.model;

import java.util.Date;

public class Clientes {

	
	private String Nombres;
	private String Apellidos;
	private String Compania;
	private int Edad;
	private int IngresosMensuales;
	
	
	
	public String getNombres() {
		return Nombres;
	}
	public void setNombres(String nombres) {
		Nombres = nombres;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getCompania() {
		return Compania;
	}
	public void setCompania(String compania) {
		Compania = compania;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public int getIngresosMensuales() {
		return IngresosMensuales;
	}
	public void setIngresosMensuales(int ingresosMensuales) {
		IngresosMensuales = ingresosMensuales;
	}

	
	
	
}
