package moio;

public class Credito extends Cartao{

	private double divida;

	//construtores
	public Credito(String num, String t, Data d, String tipo, double div) {
		super(num, t, d, tipo);
		this.divida = div;
	}
	
    //seletores e modificadores
	public double getDivida() {
		return divida;
	}
	public void setDivida(double divida) {
		this.divida = divida;
	}

	public String toString() {
		return "divida: " + this.divida;
	}
	
	 //metodos extras
	public double verLimite() {
		if(this.getTipo().equals("executivo")) {
			return 3000;
		}
		if(this.getTipo().equals("business")) {
			return 2000;
		}
		if(this.getTipo().equals("normal")) {
			return 1200;    
		}
		return 0 ;
	}
	public void atualizarValorCartao(double d) {
		this.setDivida(d);
	}
	}
	

