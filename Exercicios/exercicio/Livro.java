package exercicio;

public class Livro extends Publicacao{

	//Variaveis de instancia
		private String autor;
		private String editora;
		
		//Metodo construtor
		public Livro(String t,String d,float p,String a,String e) {
			super(t,d,p);
			autor=a;
			editora=e;
		}
		public Livro(String t, String d, float p, String e) {
			super(t,d,p);
			autor="------";
			editora=e;
		}
		//metodo seletor
		public String getAutor() {
			return this.autor;
		}
		public String getEditora() {
			return this.editora;
		}
	
		//metodo modificador
		public void setAutor(String a) {
			this.autor=a;
		}
		public void setEditora(String e) {
			this.editora=e;
		}
	
		
	
}
