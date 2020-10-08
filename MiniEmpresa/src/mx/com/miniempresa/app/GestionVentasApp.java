package mx.com.miniempresa.app;

import mx.com.miniempresa.model.Ventas;
import mx.com.miniempresa.service.GestionDepartamentalBO;
import mx.com.miniempresa.service.GestionVentasBO;

public class GestionVentasApp {
	
private static GestionVentasApp gestionVentasApp;
	
	private GestionVentasApp () {
		
	}
	
	public static GestionVentasApp generarInstancia() {
		if(gestionVentasApp == null) {
			gestionVentasApp = new GestionVentasApp();
		} 
		return gestionVentasApp;
	}
	
	private GestionVentasBO gestionVentasBO = GestionVentasBO.generarInstancia();
	
	public void agregarVentaApp(Ventas venta) {
		System.out.println("Ingresar venta");
		gestionVentasBO.agregarVentasBO(venta);
	}

}
