package classesCompostas;

public class Morada {

	//variaveis de instancia
	private String rua;
	private String numPorta;
	private String freguesia;
	private String conselho;
	private String codPostal;
	
	
	//construtor
	public Morada(String r, String n, String f, String c, String cod) {
	    rua = r;
		numPorta = n;
		freguesia = f;
		conselho = c;
		codPostal = cod;
	}


	public String getRua() {
		return rua;
	}


	public void setRua(String r) {
		this.rua = r;
	}


	public String getNumPorta() {
		return numPorta;
	}


	public void setNumPorta(String n) {
		this.numPorta = n;
	}


	public String getFreguesia() {
		return freguesia;
	}


	public void setFreguesia(String f) {
		this.freguesia = f;
	}


	public String getConselho() {
		return conselho;
	}


	public void setConselho(String c) {
		this.conselho = c;
	}


	public String getCodPostal() {
		return codPostal;
	}


	public void setCodPostal(String cod) {
		this.codPostal = cod;
	}
	public String toString() {
		return this.rua + "," + this.numPorta + "\n" +
	           this.freguesia + "\n" +
				this.codPostal + " " + this.conselho;
	}
	
	
}
