package mx.com.objetos;

public class Alumno {
	
	int edad;
	String nombre;
	String apellidoPaterno;
	String apellidoMaterno;
	
	public void presentarse() {
		System.out.println(nombre + " Se presento como: " +nombre + " " 
				+ apellidoPaterno + " " + apellidoMaterno + " y tiene una edad de " 
				+ edad + " años");
	}
	
	public void hacerTarea() {
		System.out.println(nombre + " esta haciendo tarea");
	}
	
	public void asistirAClase() {
		System.out.println(nombre + " esta asistiendo a clase");
	}
	
	public void cumplirAnios() {
		edad = edad +1;
		System.out.println(nombre + " ahora tiene " + edad + "años");
	}
}
