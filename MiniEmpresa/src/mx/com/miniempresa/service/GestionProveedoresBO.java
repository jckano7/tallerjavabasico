package mx.com.miniempresa.service;

import mx.com.miniempresa.model.Proveedores;
import mx.com.miniempresa.persistence.GestionProveedoresDAO;

public class GestionProveedoresBO {

private static GestionProveedoresBO gestionProveedoresBO;
	
	private GestionProveedoresBO () {
		
	}
	
	public static GestionProveedoresBO generarInstancia() {
		if(gestionProveedoresBO == null) {
			gestionProveedoresBO = new GestionProveedoresBO();
		} 
		return gestionProveedoresBO;
	}
	
	
	private GestionProveedoresDAO gestionProveedoresDAO = GestionProveedoresDAO.generarInstancia();
	
	public int agregarProveedoresBO(Proveedores proveedores) {
		System.out.println("En la capa de Servicios");
		System.out.println("Reglas de proovedores");
		gestionProveedoresDAO.agregarProveedoresDAO(proveedores);
		return 0;
	}

}
