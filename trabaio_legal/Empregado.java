package trabaio_legal;

public class Empregado {

	//variaveis de instancia
	private int numEmpregado;
	private String nome;
	
	//construtor
	
	public Empregado(int num, String n) {
		this.numEmpregado = num;
		this.nome = n;
	}
	
	//seletores e modificadores

	public int getNumEmpregado() {
		return numEmpregado;
	}

	public void setNumEmpregado(int num) {
		this.numEmpregado = num;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String n) {
		this.nome = n;
	}
	public String toString() {
		return "\nnumero do empregado: : " + this.numEmpregado + 
				"\nNome: " + this.nome;
	}


	

	
	
	
}
