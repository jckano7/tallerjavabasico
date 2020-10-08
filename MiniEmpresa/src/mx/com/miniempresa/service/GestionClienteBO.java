package mx.com.miniempresa.service;

import mx.com.miniempresa.model.Clientes;
import mx.com.miniempresa.model.Ventas;
import mx.com.miniempresa.persistence.GestionClienteDAO;
import mx.com.miniempresa.persistence.GestionDepartamentalDAO;

public class GestionClienteBO {

	private static GestionClienteBO gestionClienteBO;
	
	private GestionClienteBO () {
		
	}
	
	public static GestionClienteBO generarInstancia() {
		if(gestionClienteBO == null) {
			gestionClienteBO = new GestionClienteBO();
		} 
		return gestionClienteBO;
	}
	
	
	private GestionClienteDAO gestionClienteDAO = GestionClienteDAO.generarInstancia();
	
	public void agregarclienteBO(Clientes cliente) {
		System.out.println("En la capa de Servicios");
		System.out.println("Reglas de Cliente");
		gestionClienteDAO.agregarClienteDAO(cliente);
	}
	
	
}
