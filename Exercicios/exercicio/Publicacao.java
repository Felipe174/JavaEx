package exercicio;

public class Publicacao {

	//Variaveis de instancia
	private String titulo;
	private String data_publicacao;
	private float preco;
	
	//Metodo construtor
	public Publicacao(String t,String d,float p) {
		titulo=t;
		data_publicacao=d;
		preco=p;
	}
	//metodo seletor
	public String getTitulo() {
		return this.titulo;
	}
	public String getData_publicacao() {
		return this.data_publicacao;
	}
	public float getPreco() {
		return this.preco;
	}
	 
	//metodo modificador
	public void setTitulo(String t) {
		this.titulo=t;
	}
	public void setData_publicacao(String t) {
		this.titulo=t;
	}
	public void setPreco(int p) {
		this.preco=p;
	}
	
	
	
	
}
