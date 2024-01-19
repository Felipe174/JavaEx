package trabaio_legal;

public class Hora {

	//variaveis de instancia
	private int hora;
	private int minutos;

	//construtor
	public Hora(int h, int m) {
		this.hora= h;
		this.minutos= m;
		
	}
	
	//seletores e modificadores
	public int getHora() {
		return hora;
	}

	public void setHora(int h) {
		this.hora = h;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int m) {
		this.minutos = m;
	}
	
	public String toString() {
		return "\nhoras : " + this.hora + ":" + this.minutos ;
				
	}
	
}
