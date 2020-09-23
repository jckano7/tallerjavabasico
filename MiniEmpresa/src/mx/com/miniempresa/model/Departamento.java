package mx.com.miniempresa.model;

import java.util.List;

public class Departamento {

	private Empleado jefeDepartamento;
	private List<Empleado> equipo;
	
	private Ventas gerenteVentas;
	private List<Ventas> vendedor;
	
	public Empleado getJefeDepartamento() {
		return jefeDepartamento;
	}
	public void setJefeDepartamento(Empleado jefeDepartamento) {
		this.jefeDepartamento = jefeDepartamento;
	}
	public List<Empleado> getEquipo() {
		return equipo;
	}
	public void setEquipo(List<Empleado> equipo) {
		this.equipo = equipo;
	}
	public Ventas getGerenteVentas() {
		return gerenteVentas;
	}
	public void setGerenteVentas(Ventas gerenteVentas) {
		this.gerenteVentas = gerenteVentas;
	}
	public List<Ventas> getVendedor() {
		return vendedor;
	}
	public void setVendedor(List<Ventas> vendedor) {
		this.vendedor = vendedor;
	}
		
	
}
