package mx.com.miniempresa.persistence;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import mx.com.miniempresa.model.Clientes;
import mx.com.miniempresa.model.Ventas;

public class GestionClienteDAO {

	private static GestionClienteDAO gestionClienteDAO;
	
	private GestionClienteDAO () {
		
	}
	
	
	public static GestionClienteDAO generarInstancia() {
		if(gestionClienteDAO == null) {
			gestionClienteDAO = new GestionClienteDAO();
		} 
		return gestionClienteDAO;
	}
	
	public void agregarClienteDAO(Clientes cliente) throws IOException {
		
		FileWriter archivoEscribir = new FileWriter("/Users/Dell/Documents/Workspace/Tallerjavabasico/guardarcliente.txt", true);
		
		PrintWriter impresor = new PrintWriter(archivoEscribir);
		impresor.println("Nombre del cliente : " + cliente.getNombres());
		impresor.println("Apellidos del cliente : " + cliente.getApellidos());
		impresor.println("Compañia del cliente : " + cliente.getCompania());
		impresor.println("Edad del cliente : " + cliente.getEdad());
		impresor.println("Ingresos del cliente : " + cliente.getIngresosMensuales());
		System.out.println();
		impresor.println("------------------------------");
		System.out.println();
		archivoEscribir.close();
		
		System.out.println("En la capa de Acceso a Datos");
		System.out.println("Persistiendo información de Cliente");

	}

}
