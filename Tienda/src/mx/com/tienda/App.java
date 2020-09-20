package mx.com.tienda;

import java.util.Date;

import mx.com.tienda.model.ProductoAlcoholico;
import mx.com.tienda.model.ProductoRefrigerado;
import mx.com.tienda.servicios.Almacen;

public class App {

	public static void main(String[] args) {
		
		//Producto chilesCostenia = new Producto();
		//chilesCostenia.setNombreProducto("Chiles la costeña");

		ProductoRefrigerado lecheLala = new ProductoRefrigerado();
		lecheLala.setNombreProducto("Leche Lala");
		lecheLala.setCostoMayoreo(15);
		lecheLala.setPrecioPublico(20);
		lecheLala.setFechaCaducidad(new Date());
		lecheLala.setTemperaturaAlmacenamiento(-10);
		
		//lecheLala.imprimirDatosProducto();
		//lecheLala.imprimirNombreyPrecio();
		
		ProductoAlcoholico tequilaHerradura = new ProductoAlcoholico();
		tequilaHerradura.setNombreProducto("Tequila Herradura");
		tequilaHerradura.setCostoMayoreo(200);
		tequilaHerradura.setPrecioPublico(215);
		tequilaHerradura.setGradoDeAlcohol(30);
		
		//tequilaHerradura.imprimirDatosProducto();
		//lecheLala.imprimirNombreyPrecio();
		
		
		
		Almacen almacen = new Almacen();
		almacen.agregarProducto(lecheLala);
		almacen.agregarProducto(tequilaHerradura);
		almacen.imprimirAlmacen();
	}

}
