package ArrayList;

public class Media extends Jogador{

	//variavies de instancia
	private int num_assistencias;
	private int num_golsMarcados;
	
	//metodo construtor
		public Media(String n,String c,int j,int a,int m) {
			super(n,c,j);
			num_assistencias=m;
			num_golsMarcados=a;
		}
		
		public String toString() {
			return super.toString() + "\nNumero de assistencias: " + this.num_assistencias +
				    "\nNumero de gols marcados: " + this.num_golsMarcados ;
		}
}
