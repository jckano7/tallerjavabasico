package mx.com.miniempresa.persistence;

import mx.com.miniempresa.model.Empleado;
import mx.com.miniempresa.model.Ventas;

public class GestionDepartamentalDAO {

	private static GestionDepartamentalDAO gestionDepartamentalDAO;
	
	private GestionDepartamentalDAO () {
		
	}
	
	public static GestionDepartamentalDAO generarInstancia() {
		if(gestionDepartamentalDAO == null) {
			gestionDepartamentalDAO = new GestionDepartamentalDAO();
		} 
		return gestionDepartamentalDAO;
	}
	
	public void agregarEmpleadoDAO(Empleado empleado) {
		System.out.println("En la capa de Acceso a Datos ");
		//TODO aqui se persistira la informacion del empleado
		System.out.println("Persistiendo informacion de empleado: ");
		System.out.println(empleado.getApellidoPaterno());
		System.out.println(empleado.getApellidoMaterno());
		System.out.println(empleado.getNombre());
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
