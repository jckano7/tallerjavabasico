package mx.com.miniempresa.app;

import mx.com.miniempresa.model.Empleado;
import mx.com.miniempresa.service.GestionDepartamentalBO;

public class GestionDepartamentalApp {

	private GestionDepartamentalBO gestionDepartamentalBO = GestionDepartamentalBO.generarInstancia();
	
	public void agregarEmpleadoApp(Empleado empleado) {
		//TODO aqui se interactua con el usuario
		System.out.println("En la capa de Aplicacion ");
		gestionDepartamentalBO.agregarEmpleadoBO(empleado);
	}
	
	
}
