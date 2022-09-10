package ejemplosJava;

public class Ejemplo_Herencia_Triangulo extends Ejemplo_Herencia_DosDimenciones {
	String estilo;
	
	double area() {
		return base*altura/2;
	}

	void mostrarEstilo() {
		System.out.println("El triangulo es"+ estilo);
		
	}
}
