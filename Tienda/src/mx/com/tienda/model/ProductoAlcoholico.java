package mx.com.tienda.model;

public class ProductoAlcoholico extends Producto{
	private int gradoDeAlcohol;

	
	public void imprimirDatosProducto() {
		System.out.println("Como producto alcoholico");
		super.imprimirDatosProducto();
		System.out.println("gradoDeAlcohol :" + gradoDeAlcohol);
	}
	
	public int getGradoDeAlcohol() {
		return gradoDeAlcohol;
	}

	public void setGradoDeAlcohol(int gradoDeAlcohol) {
		this.gradoDeAlcohol = gradoDeAlcohol;
	}

	
}
