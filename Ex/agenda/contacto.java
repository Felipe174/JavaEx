package agenda;

public class contacto {

		//variáveis
		private String nome ;
		private String telemovel ;
		private String telefone ;
		private String morada ;
		private String email ;
		
		// construtor
		public contacto(String n, String tlm, String tel, String m, String e) {
			nome = n ;
			telemovel = tlm ;
			telefone = tel ;
			morada = m ;
			email = e ;
		}
		public contacto(String n, String tlm, String e) {
			nome = n ;
			telemovel = tlm ;
			telefone = "---" ;
			morada = "---" ;
			email = e ;
		}
		public contacto(String n, String tlm) {
			nome = n ;
			telemovel = tlm ;
			telefone = "---" ;
			morada = "---" ;
			email = "---" ;
		}
		public String toString() {
			return "\nContacto" + "\nNome :" + this.nome + "\nTelemóvel :" + this.telemovel + "\nTelefone :" + this.telefone + 
			"\nMorada :" + this.morada + "\nE-mail :" + this.email ;
		}
	}

