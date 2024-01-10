package exobjeto;

public class principal {

	public static void main(String[]args) {
		
	//cria uma nova instancia do classe triangulo
		Triangulo t1 = new Triangulo(8,6);
		
		
		t1.setBase(15);
		t1.setBase(12);
		System.out.println(t1.toString());
		System.out.println("Area:"+t1.calcularArea());
		
	}
}
