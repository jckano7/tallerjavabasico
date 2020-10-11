package mx.com.miniempresa.service;

import mx.com.miniempresa.model.Empleado;
import mx.com.miniempresa.model.Proveedores;
import mx.com.miniempresa.model.Proyectos;
import mx.com.miniempresa.model.Ventas;
import mx.com.miniempresa.persistence.GestionDepartamentalDAO;

public class GestionDepartamentalBO {

	private static GestionDepartamentalBO gestionDepartamentalBO;
	
	private GestionDepartamentalBO () {
		
	}
	
	public static GestionDepartamentalBO generarInstancia() {
		if(gestionDepartamentalBO == null) {
			gestionDepartamentalBO = new GestionDepartamentalBO();
		} 
		return gestionDepartamentalBO;
	}
	
	
	private GestionDepartamentalDAO gestionDepartamentalDAO = GestionDepartamentalDAO.generarInstancia();
	
	public int agregarEmpleadoBO(Empleado empleado) {
		int ret = 1;		
		try {
			//Si se llama Juan Perez no permitir agregar
			System.out.println("En la capa de Servicios ");
			if(empleado.getNombre().equals("Juan Perez")) {
				ret = 1;
			}
			//TODO aqui se evaluan las reglas de negocio para agregar un empleado
			gestionDepartamentalDAO.agregarEmpleadoDAO(empleado);
			ret = 0;
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println("Excepcion aritmetica controlada: " + e);
			ret = 2;
		} catch (Exception e) {
			System.out.println("Excepcion controlada: " + e);
			ret = 2;
		}
		return ret;
	}
	
	public void agregarProyectosBO(Proyectos proyecto) {
		System.out.println("En la capa de Servicios");
		System.out.println("Reglas de proyecto");
		gestionDepartamentalDAO.agregarPreoyectoDAO(proyecto);
	}
	public void agregarProveedoresBO(Proveedores proveedor) {
		System.out.println("En la capa de Servicios");
		System.out.println("Reglas para seleccion de proovedores");
		gestionDepartamentalDAO.agregarProveedorDAO(proveedor);		
	}
}
