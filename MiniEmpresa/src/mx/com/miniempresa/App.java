package mx.com.miniempresa;

import java.util.Date;

import mx.com.miniempresa.app.GestionDepartamentalApp;
import mx.com.miniempresa.app.GestionVentasApp;
import mx.com.miniempresa.app.VentanaGestionDepartamento;
import mx.com.miniempresa.app.VentanaGestionClientes;
import mx.com.miniempresa.model.Clientes;
import mx.com.miniempresa.model.Empleado;
import mx.com.miniempresa.model.Proveedores;
import mx.com.miniempresa.model.Proyectos;
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
		
		GestionVentasApp gestionVentasApp1 = GestionVentasApp.generarInstancia();
		gestionVentasApp1.agregarVentaApp(primerVenta);
		
		Proyectos nombreDelProyecto = new Proyectos();
		nombreDelProyecto.setNombre("Distribuci�n");
		nombreDelProyecto.setFechaInicio(new Date());
		nombreDelProyecto.setFechaRevision(new Date());
		nombreDelProyecto.setFechaCierre(new Date());
		
		GestionDepartamentalApp gestionDepartametalApp3 = GestionDepartamentalApp.generarInstancia();
		gestionDepartametalApp3.agregarProyectoApp(nombreDelProyecto);
		
		Proveedores optenermercancia =  new Proveedores();
		optenermercancia.setNombreDeProvedor("El cholo de chalco");
		optenermercancia.setNombreDelProducto("Cocaina");
		optenermercancia.setCostoAPagar(1000);
		optenermercancia.setFechaAPedir(new Date());
	
		Clientes nuevoCliente = new Clientes();
		nuevoCliente.setNombres("Jesus Adrian");
		nuevoCliente.setApellidos("Trejo Perez");
		nuevoCliente.setCompania("SoyBeep");
		nuevoCliente.setEdad(23);
		nuevoCliente.setIngresosMensuales(2000);
		
	    VentanaGestionDepartamento ventana = new VentanaGestionDepartamento();
		ventana.show();
		
		
		VentanaGestionClientes ventanaClientes = new VentanaGestionClientes();
		ventanaClientes.show();
		
	    System.out.println("Rodrigo Misael");

		
	}

}
