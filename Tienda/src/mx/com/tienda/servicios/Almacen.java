package mx.com.tienda.servicios;

import java.util.ArrayList;
import java.util.List;

import mx.com.tienda.model.Producto;

public class Almacen {
	
	private List<Producto> listaProductos;
	
	public Almacen() {
		listaProductos = new ArrayList<Producto>();
	}
	
	public int agregarProducto(Producto producto) {
		listaProductos.add(producto);
		return listaProductos.size();
	}
	
	public int eliminarProducto() {
		//TODO agregar funcionalidad para eliminar
		return listaProductos.size();
	}
	
	public void imprimirAlmacen() {
		//Es equivalente al for each
		//for (int i = 0; i< listaProductos.size(); i++) {
		//
		//}
		for (Producto producto : listaProductos) {
			producto.imprimirDatosProducto();
			System.out.println("\n");
		}
		for (Producto producto : listaProductos) {
			producto.imprimirNombreyPrecio();
			System.out.println("\n");
		}
	}
}
