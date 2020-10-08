package mx.com.miniempresa.persistence;

import mx.com.miniempresa.model.Ventas;

public class GestionVentasDAO {
	
	private static GestionVentasDAO gestionVentasDAO;
	
	private GestionVentasDAO() {	
	}
	
	public static GestionVentasDAO generarInstancia() {
		if(gestionVentasDAO == null) {
			gestionVentasDAO = new GestionVentasDAO();
		} 
		return gestionVentasDAO;
	}
	
	public void agregarVentaDAO(Ventas venta) {
		System.out.println("En la capa de Acceso a Datos");
		System.out.println("Persistiendo información de venta");
		System.out.println(venta.getProducto());
		System.out.println(venta.getPrecio());
		System.out.println(venta.getGanancia());
		System.out.println(venta.getCantidad());
		System.out.println(venta.getProveedor());
		System.out.println(venta.getFechaVenta());
	}

}
