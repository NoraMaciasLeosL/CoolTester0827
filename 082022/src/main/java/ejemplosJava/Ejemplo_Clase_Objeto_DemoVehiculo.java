package ejemplosJava;

public class Ejemplo_Clase_Objeto_DemoVehiculo {

	public static void main(String[] args) {
		Ejemplo_Clase_objeto_Vehiculo minivan= new Ejemplo_Clase_objeto_Vehiculo();
		minivan.pasajeros=9;
		minivan.capacidad=15;
		minivan.kmh=20;
		int rango;
		
		
		// CAlcular el rango asumiendo  tanque lleno
		rango=minivan.capacidad * minivan.kmh;
		
		System.out.println("la  minivan puede llevar" +" "+   minivan.pasajeros +" "+ "pasajeros con un rango de"+" "+ rango +" "+ "kilometros" );
		
		Ejemplo_Clase_objeto_Vehiculo carro= new Ejemplo_Clase_objeto_Vehiculo();
		carro.pasajeros=9;
		System.out.println("el numero de pasajeros en carro es" +" "+ carro.pasajeros);
		
	}

}
