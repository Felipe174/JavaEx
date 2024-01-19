package classesCompostas;

public class Aluno {

	//variaveis de instancia
	private String numProcesso;
	private String nome;
	private Morada morada;
	private String telemovel;
	private Data dataNascimento;
	
	//construtor
	public Aluno(String np, String n, Morada m, String tlm, Data dn) {
	
		numProcesso = np;
		nome = n;
		morada = m;
		telemovel = tlm;
		dataNascimento = dn;
	}

	public String getNumProcesso() {
		return numProcesso;
	}

	public void setNumProcesso(String np) {
		this.numProcesso = np;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String n) {
		this.nome = n;
	}

	public Morada getMorada() {
		return morada;
	}

	public void setMorada(Morada m) {
		this.morada = m;
	}

	public String getTelemovel() {
		return telemovel;
	}

	public void setTelemovel(String tlm) {
		this.telemovel = tlm;
	}

	public Data getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Data dn) {
		this.dataNascimento = dn;
	}
	
	public String toString() {
		return "\nDados do aluno\n" +
	           "\nNumero de processo: " + this.numProcesso +
	           "\nNome: " + this.nome + 
	           "\nMorada: " + this.morada +
	           "\nTelemovel: " + this.telemovel +
	           "\nData de nascimento" + this.dataNascimento;
	}
	
	
}
