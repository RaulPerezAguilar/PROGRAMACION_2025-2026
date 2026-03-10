package Ejercicio4;

public class ContadorObjetos {
	static int totalObjetos = 0;
	
	ContadorObjetos() {
		totalObjetos =+ 1;
	}
	
	static void mostrarTotalObjetos() {
		System.out.println(totalObjetos);
	}
}