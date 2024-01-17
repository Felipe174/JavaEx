package exercicio;

public class ManualEscolar extends Livro{

	//Variaveis de instancia
		private int ano;
		private String disciplina;
		
		//Metodo construtor
		public ManualEscolar(String t,String d,float p,String a,String e,int an,String di) {
			super(t,d,p,a,e);
			ano=an;
			disciplina=di;
		}
		//metodo seletor
		public int getAno() {
			return this.ano;
		}
		public String getDisciplina() {
			return this.disciplina;
		}
	
		 
		//metodo modificador
		public void setAno(int an) {
			this.ano=an;
		}
		public void setDisciplina(String di) {
			this.disciplina=di;
		}
		
}
