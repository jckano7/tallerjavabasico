package mx.com.miniempresa.model;

import java.util.Date;

public class Proveedores {
	private String nombreDeProvedor;
	private int costoAPagar;
	private Date fechaAPedir;
	private String nombreDelProducto;
	
	
	public String getNombreDeProvedor() {
		return nombreDeProvedor;
	}
	public void setNombreDeProvedor(String nombreDeProvedor) {
		this.nombreDeProvedor = nombreDeProvedor;
	}
	public int getCostoAPagar() {
		return costoAPagar;
	}
	public void setCostoAPagar(int costoAPagar) {
		this.costoAPagar = costoAPagar;
	}
	public Date getFechaAPedir() {
		return fechaAPedir;
	}
	public void setFechaAPedir(Date fechaAPedir) {
		this.fechaAPedir = fechaAPedir;
	}
	public String getNombreDelProducto() {
		return nombreDelProducto;
	}
	public void setNombreDelProducto(String nombreDelProducto) {
		this.nombreDelProducto = nombreDelProducto;
	}
	
	

}
