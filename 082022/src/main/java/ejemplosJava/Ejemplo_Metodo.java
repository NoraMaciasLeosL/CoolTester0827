package ejemplosJava;

public class Ejemplo_Metodo {

	public static void main(String[] args) {
		
		int result=suma(50,20);
		
		System.out.println(result);
		
		int result2=suma(1,1,3);
		System.out.println(result2);

		String marca= carro(2);
		System.out.println(marca);
		System.out.println(carro(0));


	}
	
	// metodo Suma
	public static int suma(int a, int b) {
		
		int c=a+b;
		
		return c;
	}
	
	public static int suma(int a, int b, int c) {
		int d=a+b+c;
		return d;
	}
	
	
	// Metodo Carro 
	public static String carro (int a) {
		
		String[] cars= {"volvo", "MB", "Ford", "MAzda"};
		return cars[a];
		
		
	}

}
