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
	
	public int agregarclienteBO(Clientes cliente) {
		
		int opcion = 1;
		
		try {
			System.out.println("En la capa de Servicios");
			
			
			if (cliente.getEdad() < 15 || cliente.getEdad() > 100) {
				
				opcion=1;
				
			}else if(cliente.getNombres().equals("") || cliente.getApellidos().equals("") || cliente.getCompania().equals("")) {
				
				opcion = 3;
				
			}
			else {
				
				gestionClienteDAO.agregarClienteDAO(cliente);
				opcion = 0;
				
			}
			

			
		}catch (ArithmeticException | NullPointerException e) {
			System.out.println("Excepcion aritmetica controlada: " + e);
			opcion =  2;
		}catch (Exception e) {
			System.out.println("Excepcion controlada: " + e);
			opcion = 2;
		}
		
		return opcion;
		
	
	}
	
	
}
