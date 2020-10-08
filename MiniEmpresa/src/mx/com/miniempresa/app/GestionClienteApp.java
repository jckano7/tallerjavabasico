package mx.com.miniempresa.app;

import mx.com.miniempresa.model.Clientes;
import mx.com.miniempresa.model.Empleado;
import mx.com.miniempresa.service.GestionClienteBO;
import mx.com.miniempresa.service.GestionDepartamentalBO;

public class GestionClienteApp {

	private static GestionClienteApp gestionClienteApp;
	
	private GestionClienteApp () {
		
	}
	
	public static GestionClienteApp generarInstancia() {
		if(gestionClienteApp == null) {
			gestionClienteApp = new GestionClienteApp();
		} 
		return gestionClienteApp;
	}
	
	
	private GestionClienteBO gestionClienteBO = GestionClienteBO.generarInstancia();
	
	public void agregarCliente(Clientes cliente) {
		//TODO aqui se interactua con el usuario
		System.out.println("En la capa de Aplicacion Cliente");
		gestionClienteBO.agregarclienteBO(cliente);
	}
}
