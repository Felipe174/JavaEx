package ArrayList;

public class Defesa extends Jogador{

	//variaveis de instancia
	private int num_intercepcoes;
	
	//metodo construtor
		public Defesa(String n,String c,int j,int i) {
			super(n,c,j);
			num_intercepcoes=i;
		}
		
		public String toString() {
			return super.toString() + "\nNumero de intercepções: " +
                                       this.num_intercepcoes;
		}
}
