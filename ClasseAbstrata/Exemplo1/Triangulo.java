package ex;

public class Triangulo extends Figura{

	//instancia
		private double base;
		private double altura;
		private double lado1;
		private double lado2;
		
		//construtor
		public Triangulo(double b, double a, double l1, double l2) {
			super();
			this.base = b;
			this.altura = a;
			this.lado1 = l1;
			this.lado2 = l2;
		}

		//modificadores e seletores
		public double getBase() {
			return base;
		}

		public void setBase(double b) {
			this.base = b;
		}

		public double getAltura() {
			return altura;
		}

		public void setAltura(double a) {
			this.altura = a;
		}

		public double getLado1() {
			return lado1;
		}

		public void setLado1(double l1) {
			this.lado1 = l1;
		}

		public double getLado2() {
			return lado2;
		}

		public void setLado2(double l2) {
			this.lado2 = l2;
		}

		@Override
		public String toString() {
			return "Triangulo [base=" + this.base + ", altura=" + this.altura + ", lado1=" + this.lado1 + ", lado2=" + this.lado2 + "]";
		}
		
		public double calcularArea() {
			return this.base * this.altura /2;
		}
		
		public double calcularPerimetro() {
			return this.base + this.lado1 + this.lado2;
		}
		
		

}
