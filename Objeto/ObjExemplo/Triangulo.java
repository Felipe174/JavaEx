package exobjeto;

public class Triangulo {

	//variaveis de instancia
	
	private float base;
	private float altura;
	
	//construtor 
	
	public Triangulo(float b,float a) {
		base=b;
		altura=a;
	}
	
	//metodos de instancia
	
	public float calcularArea() {
		float area;
		area=this.base*this.altura/2;
		return area;
}
	//metodos seletores e modificadores
	
	public float getBase() {
		return this.base;
	}
	public float getAltura() {
		return this.altura;
	}
	public void setBase(float b) {
		this.base=b;
	}
	
	public String toString() {
		return "\nTriangulo"+ 
	           "\nBase:"+this.base +
	           "\nAltura:" + this.altura;
	}
}
