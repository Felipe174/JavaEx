package trabaio_legal;

public class cartaoPonto {

	//instancia
	private Empregado empregado;
	private Data data;
	private Hora hora;
	
	//construtor
	public cartaoPonto(Empregado e, Data d, Hora h) {
		this.empregado = e;
		this.data = d;
		this.hora = h;
	}
	
	 //seletores e modificadores
	public Empregado getEmpregado() {
		return empregado;
	}

	public void setEmpregado(Empregado e) {
		this.empregado = e;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data d) {
		this.data = d;
	}

	public Hora getHora() {
		return hora;
	}

	public void setHora(Hora h) {
		this.hora = h;
	}
	
	public String toString() {
		return "\nEmpregado: " + this.empregado +
				"\nData: " + this.data + 
				"\nHora" + this.hora;
	}
	public int calcularDiferencaHoras() {
		return (this.horaSaida.getHora() – this.horaEntrada.getHora()) * 60
		+(this.horaSaida.getMinuto() – this.horaEntrada.getMinuto());

		}
	
}
