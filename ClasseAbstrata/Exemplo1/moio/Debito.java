package moio;

public class Debito extends Cartao{

	private String numero;
	private double saldo;
	
	//construtor
	public Debito(String num,String t, Data d, String tipo, String numero, double saldo) {
		super(num,t, d, tipo);
		this.numero = numero;
		this.saldo = saldo;
	}
	
	//seletores e modificadores
	public String getNumero() {
		return numero;
	}
	public void setNumero(String num) {
		this.numero = num;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double s) {
		this.saldo = s;
	}
	
	public String toString() {
		return "\nnumero:" + this.numero + 
				"\nsaldo: " + this.saldo;
	}
	
	//metodos extras
	public double verLimite() {
		if(this.getTipo().equals("estudante")) {
			return 200;
		}
		if(this.getTipo().equals("trabalhador")) {
			return 500;
		}
		return 0;
		}
	
	public void atualizarValorCartao(double s) {
		this.setSaldo(s);
	}
	}
	

