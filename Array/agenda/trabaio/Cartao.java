package trabaio;

public class Cartao {

	//variaveis de instancia
	private int codigo_cartão;
	private String nome_aluno;
	private float saldo;
	private int num_movimentos;
	
	//construtor
	public Cartao(int cod, String n, float s, int mov) {
		this.codigo_cartão = cod;
		this.nome_aluno = n;
		this.saldo = s;
		this.num_movimentos = mov;
	}
		public void num_mov() {
			this.num_movimentos++;
		}
	//seletor e modificador
	

	public int getCodigo_cartão() {
		return codigo_cartão;
	}

	public void setCodigo_cartão(int cod) {
		this.codigo_cartão = cod;
	}

	public String getNome_aluno() {
		return nome_aluno;
	}

	public void setNome_aluno(String n) {
		this.nome_aluno = n;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float s) {
		this.saldo = s;
	}

	public int getNum_movimentos() {
		return num_movimentos;
	}

	public void setNum_movimentos(int mov) {
		this.num_movimentos = mov;
	}
	 public String toString() {
		 return "\nCodigo do cartão: " + this.codigo_cartão +
				 "\nNome do aluno: " + this.nome_aluno + 
				 "\nSaldo: " + this.saldo + 
				 "\nNumero de movimentos: "  + this.num_movimentos;
	}
	 //metodos extras
	 public void carregaCartao() {
		 setSaldo(this.saldo);
		 num_mov();
	 }
	 
	 public boolean prePago(float p) {
		 if(saldo<p) {
			 return false;
		 }else {
			 if(saldo>p || saldo==p) {
				 return true ;
			 }
		 }
		return false;
	 }
	 
	 public void pagamentos(boolean prePago) {
		 if(prePago==true) {
		 System.out.println("o pagamento foi efetuado");
		 num_mov();
	 }
		 if(prePago==false) {
			 System.out.println("o pagamento não foi realizado por saldo insuficiente");
		 }
	 }
	
	
	
	
}
