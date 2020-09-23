package mx.com.miniempresa;

import java.util.Date;

import mx.com.miniempresa.app.GestionDepartamentalApp;
import mx.com.miniempresa.model.Empleado;
import mx.com.miniempresa.model.Ventas;

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
		
		Ventas primerVenta = new Ventas();
		primerVenta.setProducto("Perico");
		primerVenta.setPrecio(500);
		primerVenta.setGanancia(350);
		primerVenta.setCantidad(50);
		primerVenta.setProveedor("Juanito");
		primerVenta.setFechaVenta(new Date());
		
		GestionDepartamentalApp gestionDepartametalApp2 = GestionDepartamentalApp.generarInstancia();
		gestionDepartametalApp2.agregarVentaApp(primerVenta);
		
	}

}
