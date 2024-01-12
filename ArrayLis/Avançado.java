package ArrayList;

public class Avançado extends Jogador {

	//variaveis de instancia 
	private int num_gols;
	
	//metodo construtor
		public Avançado(String n,String c,int j,int g){
			super(n,c,j);
			num_gols=g;
		}
		public String toString(){
			return super.toString() +
		   "\nNumero de gols: " + this.num_gols ;
		}
		public float calcularPontuação() {
			return this.num_gols*5/super.getJogos_realizados();	
		}
}
