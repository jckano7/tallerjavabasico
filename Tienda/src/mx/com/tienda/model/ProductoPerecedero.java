package mx.com.tienda.model;

import java.util.Date;

public class ProductoPerecedero extends Producto{

	protected Date fechaCaducidad;

	public void imprimirDatosProducto() {
		super.imprimirDatosProducto();
		System.out.println("fechaCaducidad :" + fechaCaducidad);
	}
	
	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

}
