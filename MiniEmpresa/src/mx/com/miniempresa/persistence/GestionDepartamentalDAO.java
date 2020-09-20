package mx.com.miniempresa.persistence;

import mx.com.miniempresa.model.Empleado;

public class GestionDepartamentalDAO {

	public void agregarEmpleadoDAO(Empleado empleado) {
		System.out.println("En la capa de Acceso a Datos ");
		//TODO aqui se persistira la informacion del empleado
		System.out.println("Persistiendo informacion de empleado: ");
		System.out.println(empleado.getApellidoPaterno());
		System.out.println(empleado.getApellidoMaterno());
		System.out.println(empleado.getNombre());
	}
}
