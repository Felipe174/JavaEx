package ArrayList;

public class Jogador {
	

	//variaveis de instancia
	private String nome;
	private String clube;
	private int jogos_realizados;
	
	//metodo construtor
	public Jogador(String n,String c,int j) {
		nome=n;
		clube=c;
		jogos_realizados=j;
	}
	
	//metodos seletores
	public String getNome() {
		return this.nome;
	}
	public String getClube() {
		return this.clube;
	}
	public int getJogos_realizados() {
		return this.jogos_realizados;
	}
	
	
	//metodos modificadores
	public void setNome(String n) {
		this.nome=n;
	}
	public void setClube(String c) {
		this.clube=c;
	}
	public void setJogos_realizados(int j) {
		this.jogos_realizados=j;
	}
	
	public String toString() {
		return "\nNome: " + this.nome +
			    "\nClube: " + this.clube +
			    "\nJogos realizados: " + this.jogos_realizados;
	}
}
