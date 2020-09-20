package mx.com.tienda.model;

public class Producto {
	
	public Producto() {
		precioPublico = 1;
		costoMayoreo = 1;
		nombreProducto = "N/A";
		id = 100;
		marca = "Propia";
	}
	
	private long precioPublico;//precio a la venta
	
	private long costoMayoreo;//costo que pagamos por el
	
	private String nombreProducto;
	
	private int id;
	
	private String marca;
	
	private boolean existencia;

	public void imprimirDatosProducto() {
		System.out.println("Nombre :" + nombreProducto);
		System.out.println("Costo :" + costoMayoreo);
		System.out.println("Precio :" + precioPublico);
	}
	
	public void imprimirNombreyPrecio() {
		System.out.println("Solo como Producto");
		System.out.println("Nombre :" + nombreProducto);
		System.out.println("Precio :" + precioPublico);
		System.out.println("Existencia :" + existencia);
	} 
	
	/*** SOBRECARGA DE METODOS
	public void imprimirDatosProducto(int valor) {
	 
		
	}
	
	public void imprimirDatosProducto(int valor, String texto) {
		
	}
	
	public void imprimirDatosProducto(String texto) {
		
	}****/

	public long getPrecioPublico() {
		return precioPublico;
	}

	public void setPrecioPublico(long precio) {
		this.precioPublico = precio;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public long getCostoMayoreo() {
		return costoMayoreo;
	}

	public void setCostoMayoreo(long costoMayoreo) {
		this.costoMayoreo = costoMayoreo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isExistencia() {
		return existencia;
	}

	public void setExistencia(boolean existencia) {
		this.existencia = existencia;
	}
	
	
	
}
