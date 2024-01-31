package ex;

public class Retangulo extends Figura{

	//instancia
	private double comprimento;
	private double largura;
	
	//construtor
	public Retangulo(double c, double l) {
		super();
		comprimento = c;
		largura = l;
	}

	//seletores e modificadores
	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double c) {
		this.comprimento = c;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double l) {
		this.largura = l;
	}

	@Override
	public String toString() {
		return "Retangulo [comprimento=" + this.comprimento + ", largura=" + this.largura + "]";
	}
	
	public double calcularArea() {
		return this.comprimento * this.largura;
	}
	
	public double calcularPerimetro() {
		return 2* this.comprimento + 2 * this.largura;
	}
}
