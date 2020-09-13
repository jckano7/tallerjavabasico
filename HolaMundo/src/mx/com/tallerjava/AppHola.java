package mx.com.tallerjava;

public class AppHola {

	public static void main(String[] args) {
		String nombreCaminante = args[0];
		
		//camina 10 pasos hacia adelante por la calle Carlos Romero
		
		for(int i=1; i <=10; i++) {
			metodoLogea(nombreCaminante, " esta caminando " + i + " pasos derecho por Carlos Romero");
		}
		//si la calle esta abierta entra por el porton verde
		boolean calleAbierta = false;
		if(calleAbierta) {
			metodoLogea(nombreCaminante, " esta entrando por el porton verde");
		} else {
			//si la calle esta cerrada:
			//da vuelta y 
			metodoLogea(nombreCaminante, " da vuelta");
			//camina 5 pasos hacia atras por   la calle Carlos Romero
			for (int x = 5; x > 0; x--) {
				metodoLogea(nombreCaminante, " esta caminando " + x + " pasos hacia atras por Carlos Romero");
			}
			//camina sobre la calle paralela Adrian Trejo hasta que llegues a la otra esquina
			boolean aunNoEsOtraEsquina = true;
			while(aunNoEsOtraEsquina) {
				metodoLogea(nombreCaminante, " esta caminando sobre la calle Adrian Trejo");
				aunNoEsOtraEsquina = false;
				metodoLogea(nombreCaminante, " ya llego a la otra esquina");

			}
			//camina derecho hasta llegar a la avenida Ivonne Cano
			boolean avenida = true;
			do {
				metodoLogea(nombreCaminante, " esta caminando derecho");
				avenida = false;
				metodoLogea(nombreCaminante, " ya llego a la avenida Ivonne Cano");
			} while (avenida);
			
			//gira a la derecha y entra por la ventana
			metodoLogea(nombreCaminante," esta girando a la derecha");
			
		}
	}

	
	public static void metodoLogea(String nombreCaminante, String accion) {
		switch (nombreCaminante) {
		case "Pedro":
				System.out.println("El nombre del caminante es Pedro");
			break;
		case "Juan":
			System.out.println("El nombre del caminante es Juan");
			break;
		default:
			System.out.println("El nombre del caminante no es Pedro ni Juan");
			break;
		}
		System.out.println("El caminante: " + nombreCaminante + accion);
	}
}
