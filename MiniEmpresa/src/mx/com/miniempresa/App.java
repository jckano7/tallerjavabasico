package mx.com.miniempresa;

import java.util.Date;

import mx.com.miniempresa.app.GestionDepartamentalApp;
import mx.com.miniempresa.model.Empleado;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado juanitoPerez = new Empleado();
		juanitoPerez.setNombre("Juan");
		juanitoPerez.setApellidoPaterno("Perez");
		juanitoPerez.setApellidoMaterno("Valdez");
		juanitoPerez.setEdad(25);
		juanitoPerez.setFechaIngreso(new Date());
		
		GestionDepartamentalApp gestionDepartamentalApp1 = GestionDepartamentalApp.generarInstancia();
		gestionDepartamentalApp1.agregarEmpleadoApp(juanitoPerez);
		
		
		
	}

}
