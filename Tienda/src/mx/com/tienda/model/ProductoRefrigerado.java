package mx.com.tienda.model;

import java.util.Date;

public class ProductoRefrigerado extends ProductoPerecedero{
	
	private int temperaturaAlmacenamiento;

	public ProductoRefrigerado() {
		super.fechaCaducidad = new Date();
		temperaturaAlmacenamiento = 10;
	}
	
	public void imprimirDatosProducto() {
		System.out.println("Como producto refrigerado");
		super.imprimirDatosProducto();
		System.out.println("temperaturaAlmacenamiento :" + temperaturaAlmacenamiento);
	}
	
	public int getTemperaturaAlmacenamiento() {
		return temperaturaAlmacenamiento;
	}

	public void setTemperaturaAlmacenamiento(int temperaturaAlmacenamiento) {
		this.temperaturaAlmacenamiento = temperaturaAlmacenamiento;
	}
	
}
