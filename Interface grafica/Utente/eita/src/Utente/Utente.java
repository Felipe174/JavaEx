package Utente;

public class Utente {

	// variáveis de instância
		private String cartao_cidadao ;
		private String nome ;
		private String data_nascimento ;
		private double rendimento ;
	
	//construtor
		public Utente(String c,String n,String d,double r) {
			cartao_cidadao=c;
			nome=n;
			data_nascimento=d;
			rendimento=r;
		}
	// métodos seletores
		public String getCartao() {
			return this.cartao_cidadao ;
		}
		public String getData() {
			return this.data_nascimento ;
		}
		public String getNome() {
			return this.nome ;
		}
		public double getRendimento() {
			return this.rendimento ;
		}
		
	// métodos modificadores
		public void setCartao(String c) {
			this.cartao_cidadao = c ;
		}

		public void setNome(String n) {
			this.nome = n ;
		}
		
		public void setData(String d) {
			this.data_nascimento = d ;
		}

		public void setRendimento(double r) {
			this.rendimento = r ;
		}
		
		public String toString() {
			return "\nUtente" +
					"\nCartão cidadao: " + this.cartao_cidadao +
					"\nNome: " + this.nome +
					"\nData de nascimento: " + this.data_nascimento +
					"\nRendimento: " + this.rendimento ;
		
		
		
}
}
