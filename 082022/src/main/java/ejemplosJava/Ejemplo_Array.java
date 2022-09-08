package ejemplosJava;

public class Ejemplo_Array {

	public static void main(String[] args) {
		// Arreglos enteros
		int intArr[];
		int[] intArr2;

		// asignar memoria para 5 enteros
		String[] arr;
		arr = new String[5];

		// inicializar primer elemento de Array
		arr[0] = "cero";
		arr[1] = "uno";
		arr[2] = "dos";
		arr[3] = "tres";
		arr[4] = "cuatro";
		System.out.println(arr[4]);
		
		for (int i = 0; i < arr.length; i++){
			System.out.println("el elemento en la posicion " + i + ":" + arr[i]);
		}
	}
}


