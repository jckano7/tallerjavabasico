package mx.com.miniempresa.app;

import mx.com.miniempresa.model.Empleado;
import mx.com.miniempresa.model.Proveedores;
import mx.com.miniempresa.model.Proyectos;
import mx.com.miniempresa.model.Ventas;
import mx.com.miniempresa.service.GestionDepartamentalBO;

public class GestionDepartamentalApp {

private static GestionDepartamentalApp gestionDepartamentalApp;
	
	private GestionDepartamentalApp () {
		
	}
	
	public static GestionDepartamentalApp generarInstancia() {
		if(gestionDepartamentalApp == null) {
			gestionDepartamentalApp = new GestionDepartamentalApp();
		} 
		return gestionDepartamentalApp;
	}
	
	private GestionDepartamentalBO gestionDepartamentalBO = GestionDepartamentalBO.generarInstancia();
	
	public void agregarEmpleadoApp(Empleado empleado) {
		//TODO aqui se interactua con el usuario
		System.out.println("En la capa de Aplicacion ");
		gestionDepartamentalBO.agregarEmpleadoBO(empleado);
	}
	
	public void agregarVentaApp(Ventas venta) {
		System.out.println("Ingresar venta");
		gestionDepartamentalBO.agregarVentasBO(venta);
	}
	
	public void agregarProyectoApp(Proyectos proyecto) {
		System.out.println("Ingresar Proyecto");
		gestionDepartamentalBO.agregarProyectosBO(proyecto);
	}
	public void agregarProveedorApp(Proveedores proveedor) {
		System.out.println("Ingresar Proveedor");
		gestionDepartamentalBO.agregarProveedoresBO(proveedor);
		
	}

	
}
