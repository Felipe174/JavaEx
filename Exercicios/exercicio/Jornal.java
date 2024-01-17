package exercicio;

public class Jornal extends Publicacao {

	//Variaveis de instancia
		private String periodicidade;
		
		//Metodo construtor
		public Jornal(String t,String d,float p,String pe) {
			super(t,d,p);
			periodicidade=pe;
		}
		//metodo seletor
		public String getPeriodicidade() {
			return this.periodicidade;
		}

		//metodo modificador
		public void setPeriodicidade(String p) {
			this.periodicidade=p;
		}
		
}
