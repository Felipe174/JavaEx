package ex;

import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		
		ArrayList<Figura> ListaFig = new ArrayList<Figura>(); 
		
		Retangulo f1 = new Retangulo(8,6);
		ListaFig.add(f1) ;
		
		Triangulo f2 = new Triangulo(8,6,5,7);
		ListaFig.add(f2);
		
		Circulo f3 = new Circulo(5);
		ListaFig.add(f3);


		System.out.println("Area do Retangulo: " + ListaFig.get(0).calcularArea());
		System.out.println("Perimetro do Retangulo: " + ListaFig.get(0).calcularPerimetro());
		System.out.println("Area do Triangulo: " + ListaFig.get(1).calcularArea());
		System.out.println("Perimetro do Triangulo: " + ListaFig.get(1).calcularPerimetro());
		System.out.println("Area do Circulo: " + ListaFig.get(2).calcularArea());
		System.out.println("Perimetro do Circulo: " + ListaFig.get(2).calcularPerimetro());
	}

}
