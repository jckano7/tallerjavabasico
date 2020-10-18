package mx.com.miniempresa.persistence;

import mx.com.miniempresa.model.Proveedores;

public class GestionProveedoresDAO {
private static GestionProveedoresDAO gestionProveedoresDAO;
	
	private GestionProveedoresDAO() {	
	}
	
	public static GestionProveedoresDAO generarInstancia() {
		if(gestionProveedoresDAO == null) {
			gestionProveedoresDAO = new GestionProveedoresDAO();
		} 
		return gestionProveedoresDAO;
	}
	
	public void agregarProveedoresDAO(Proveedores proveedores) {
		System.out.println("En la capa de Acceso a Datos");
		System.out.println("Persistiendo información de venta");
		System.out.println(proveedores.getNombreDeProvedor());
		System.out.println(proveedores.getNombreDelProducto());
		System.out.println(proveedores.getFechaAPedir());
		System.out.println(proveedores.getCostoAPagar());

	}


}
