package mx.com.objetos;

public class MainObjetos {

	public static void main(String[] args) {
		Alumno alumno1 = new Alumno();//Se esta creando un objeto de la clase Alumno
		alumno1.nombre = "Juan";
		alumno1.apellidoPaterno = "Perez";
		alumno1.apellidoMaterno = "Ceraz";
		alumno1.edad = 16;
		
		alumno1.asistirAClase();
		alumno1.presentarse();
		alumno1.cumplirAnios();
		alumno1.presentarse();
		
		
		Alumno alumno2 = new Alumno();
		alumno2.nombre = "Pedro";
		
		alumno2.hacerTarea();
		
	}

}
