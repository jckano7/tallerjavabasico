package mx.com.miniempresa.persistence;

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
	
	public void agregarClienteDAO(Clientes cliente) {
		System.out.println("En la capa de Acceso a Datos");
		System.out.println("Persistiendo información de Cliente");
		System.out.println(cliente.getNombres());
		System.out.println(cliente.getApellidos());
		System.out.println(cliente.getCompania());
		System.out.println(cliente.getEdad());
		System.out.println(cliente.getIngresosMensuales());
		
	}

}
