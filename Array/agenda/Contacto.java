package agenda;

public class Contacto {
	
	// variáveis de instância
	private String nome ;
	private String telemovel ;
	private String telefone ;
	private String morada ;
	private String email ;
	
	// construtor
	public Contacto(String n, String tlm, String tel, String m, String e) {
		nome = n ;
		telemovel = tlm ;
		telefone = tel ;
		morada = m ;
		email = e ;
	}
	
	public Contacto(String n, String tlm, String e) {
		nome = n ;
		telemovel = tlm ;
		telefone = "---" ; // não tem telefone
		morada = "---" ; // não tem morada
		email = e ;
	}
	
	public Contacto(String n, String tlm) {
		nome = n ;
		telemovel = tlm ;
		telefone = "---" ;
		morada = "---" ;
		email = "---" ;
	}
	
	// métodos de instância
	
	// métodos seletores
	public String getNome() {
		return this.nome ;
	}
	public String getTelemovel() {
		return this.telemovel ;
	}
	public String getTelefone() {
		return this.telefone ;
	}
	public String getMorada() {
		return this.morada ;
	}
	public String getEmail() {
		return this.email ;
	}
	
	// métodos modificadores
	public void setNome(String n) {
		this.nome = n ;
	}

	public void setTelefone(String t) {
		this.telefone = t ;
	}

	public void setTelemovel(String t) {
		this.telemovel = t ;
	}

	public void setMorada(String m) {
		this.morada = m ;
	}
	
	public void setEmail(String e) {
		this.email = e ;
	}

	public String toString() {
		return "\nContacto" +
				"\nNome: " + this.nome +
				"\nTelemóvel: " + this.telemovel +
				"\nTelefone: " + this.telefone +
				"\nMorada: " + this.morada +
				"\nE-mail: " + this.email ;
	}
}
