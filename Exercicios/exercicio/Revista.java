package exercicio;

public class Revista extends Publicacao{

	//Variaveis de instancia
		private String publico;
		
		//Metodo construtor
		public Revista(String t,String d,float p,String pu) {
		super(t,d,p);
		publico=pu;
		}
		//metodo seletor
		public String getPublico() {
			return this.publico;
		}
	
		//metodo modificador
		public void setPublico(String pu) {
			this.publico=pu;
		}
	
	
	
}
