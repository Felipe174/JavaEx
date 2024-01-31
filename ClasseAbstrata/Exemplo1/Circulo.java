package ex;

public class Circulo extends Figura{

	//instancia
	private double raio;

	//construtor
	public Circulo(double r) {
		super();
		this.raio = r;
	}

	//seletores e modificadores
	public double getRaio() {
		return raio;
	}

	public void setRaio(double r) {
		this.raio = r;
	}

	@Override
	public String toString() {
		return "Circulo [raio=" + this.raio + "]";
	}
	
	public double calcularArea() {
		return this.raio * raio *3.14; 
	}
	
	public double calcularPerimetro() {
		return 2 * 3.14 * this.raio;
	}
	
}
