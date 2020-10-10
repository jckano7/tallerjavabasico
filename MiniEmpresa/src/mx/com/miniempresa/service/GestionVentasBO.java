package mx.com.miniempresa.service;

import mx.com.miniempresa.model.Ventas;
import mx.com.miniempresa.persistence.GestionDepartamentalDAO;
import mx.com.miniempresa.persistence.GestionVentasDAO;

public class GestionVentasBO {
	
private static GestionVentasBO gestionVentasBO;
	
	private GestionVentasBO () {
		
	}
	
	public static GestionVentasBO generarInstancia() {
		if(gestionVentasBO == null) {
			gestionVentasBO = new GestionVentasBO();
		} 
		return gestionVentasBO;
	}
	
	
	private GestionVentasDAO gestionVentasDAO = GestionVentasDAO.generarInstancia();
	
	public int agregarVentasBO(Ventas venta) {
		System.out.println("En la capa de Servicios");
		System.out.println("Reglas de venta");
		gestionVentasDAO.agregarVentaDAO(venta);
		return 0;
	}

}
