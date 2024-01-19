package trabaio_legal;

public class Data {
	
//variaveis de instancia
	private int dia;
	private int mes;
	private int ano;
	
	//construtor
	public Data(int d,int m,int a) {
		dia=d;
		mes=m;
		ano=a;
	}
	
	//metodos de instancia
	public int getMes() {
		return mes;
	}

	public void setMes(int m) {
		this.mes = m;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int a) {
		this.ano = a;
	}

	public void setDia(int d) {
		this.dia = d;
	}

    public int getDia() {
	    return this.dia;
    }
    public String toString() {
    	return this.dia + "/" +this.mes + "/" + "/" + this.ano;
    }
}
