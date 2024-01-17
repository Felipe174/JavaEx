package exercicio;

public class LivroTecnico extends Livro{

	//Variaveis de instancia
		private String area;
		
		//Metodo construtor
		public LivroTecnico(String t,String d,float p,String a,String e,String ar) {
			super(t,d,p,a,e);
			area=a;
		}
		//metodo seletor
		public String getArea() {
			return this.area;
		}

		//metodo modificador
		public void setArea(String a) {
			this.area=a;
		}
	
		
}
