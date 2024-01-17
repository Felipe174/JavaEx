package exercicio;

public class LivroInfantil extends Livro{

	
	//Variaveis de instancia
		private int idade;
		
		//Metodo construtor
		public LivroInfantil(String t,String d,float p,String a,String e,int i) {
			super(t,d,p,a,e);
			idade=i;
		}
		//metodo seletor
		public int getIdade() {
			return this.idade;
		}
		 
		//metodo modificador
		public void setIdade(int i) {
			this.idade=i;
		}
		
		
}
