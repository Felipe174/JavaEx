package moio;

public abstract class Cartao {

	public String numero;
	public String titular;
	public Data validade;
	public String tipo;
	
	//variaveis abstratas
	public abstract double verLimite();
	public abstract void atualizarValorCartao(double s);
	
	//construtor
	public Cartao(String num, String t, Data d, String tipo) {
		super();
		this.numero = num;
		this.titular = t;
		this.validade = d;
		this.tipo = tipo;
	}

	//seletores e modificadores
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Data getValidade() {
		return validade;
	}

	public void setValidade(Data d) {
		this.validade = d;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
