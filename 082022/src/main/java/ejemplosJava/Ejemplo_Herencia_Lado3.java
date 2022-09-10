package ejemplosJava;

public class Ejemplo_Herencia_Lado3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejemplo_Herencia_Triangulo t1= new Ejemplo_Herencia_Triangulo();
		Ejemplo_Herencia_Triangulo t2= new Ejemplo_Herencia_Triangulo();

		t1.base=4.9;
		t1.altura=5.5;
		t1.estilo="Estilo triangulo equilatero";
		t2.base=43.9;
		t2.altura=45.5;
		t2.estilo="Estilo triangulo equilatero";
		
		System.out.println("con informacion para t1");
		t1.mostrarDimension();
		t1.mostrarEstilo();
		System.out.println("su area es"+ " "+ t2.area());
		
		System.out.println("con informacion para t1");
		t1.mostrarDimension();
		t1.mostrarEstilo();
		System.out.println("su area es"+ " "+ t2.area());
	}

}
