package mx.com.miniempresa.model;

import java.util.List;

public class Departamento {

	private Empleado jefeDepartamento;
	private List<Empleado> equipo;
	
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
	
	
	
}
