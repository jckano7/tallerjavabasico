package mx.com.miniempresa.persistence;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import mx.com.miniempresa.model.Empleado;
import mx.com.miniempresa.model.Proveedores;
import mx.com.miniempresa.model.Proyectos;
import mx.com.miniempresa.model.Ventas;

public class GestionDepartamentalDAO {

	private static GestionDepartamentalDAO gestionDepartamentalDAO;
	
	private GestionDepartamentalDAO () {
		
	}
	
	public static GestionDepartamentalDAO generarInstancia() {
		if(gestionDepartamentalDAO == null) {
			gestionDepartamentalDAO = new GestionDepartamentalDAO();
		} 
		return gestionDepartamentalDAO;
	}
	
	public void agregarEmpleadoDAO(Empleado empleado) throws IOException {
		
		///Users/Dell/Documents/Workspace/Tallerjavabasico/
		///Users/jckano/workspace/tallerjava/tallerjavabasico/clientes.txt
		
		FileWriter archivoEscribir = new FileWriter("/Users/Dell/Documents/Workspace/Tallerjavabasico/empleado.txt", true);
		
		PrintWriter impresor = new PrintWriter(archivoEscribir);
		impresor.println("Nombre Empleado: " + empleado.getNombre());
		archivoEscribir.close();
		
		
		/*FileReader archivoLeer = new FileReader(archivo);
		BufferedReader buffer = new BufferedReader(archivoLeer);
		String linea;
		do {
			linea = buffer.readLine();
			System.out.println(linea);
		}while(linea != null);
		archivoLeer.close();*/
		
		
	}
	
	public void agregarPreoyectoDAO(Proyectos proyecto) {
		System.out.println("En la capa de Acceso a Datos");
		System.out.println("Persistiendo informaci�n de proyecto");
		System.out.println(proyecto.getFechaInicio());
		System.out.println(proyecto.getFechaRevision());
		System.out.println(proyecto.getFechaCierre());
	
	}
	public void agregarProveedorDAO(Proveedores proveedor) {
		System.out.println("En la capa de Acceso a Datos");
		System.out.println("Persistiendo informaci�n de provedor");	
		System.out.println(proveedor.getNombreDeProvedor());
		System.out.println(proveedor.getNombreDelProducto());
		System.out.println(proveedor.getCostoAPagar());
		System.out.println(proveedor.getFechaAPedir());

		

	    
		
	}
	}
