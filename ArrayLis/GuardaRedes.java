package ArrayList;

public class GuardaRedes extends Jogador{

	//variaveis de instancia 
		private int num_golsSofridos;
		private int num_def;
		
		//metodo construtor
		public GuardaRedes(String n,String c,int j, int g,int d){
			super(n,c,j);
			num_golsSofridos=g;
			num_def=d;
		}
		public String toString() {
			return super.toString() +
					"\nNumero de gols sofridos: " + this.num_golsSofridos +
				    "\nNumero de defesas: " + this.num_def; 
		}
}
