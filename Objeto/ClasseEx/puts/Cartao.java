package puts;

public class Cartao {

	//variaveis de instancia
	private String codigo_cartao;
	private String nome;
	private float saldo;
	private int num_movimentos;
	
	// variáveis de classe
	private static int totalCartoes = 0 ;
	private static double saldoTotal = 0 ;
	
	//construtor
	public Cartao(String c,String n,float s,int m) {
		codigo_cartao=c;
		nome=n;
		saldo=s;
		num_movimentos=m;
		totalCartoes++ ;
		saldoTotal = saldoTotal + s ;
	}
	
	//metodos seletores
	public String getcodigo(){
		return this.codigo_cartao;
	}
	public String getnome() {
		return this.nome;
	}
	public float getsaldo() {
		return this.saldo;
	}
	public int getmov() {
		return this.num_movimentos;
	}
    public String toString() {
		return "\ncodigo do cartão: " + this.codigo_cartao +
				"\nNome: " + this.nome +
				"\nSaldo: " + this.saldo + 
				"\nNumero de movimentos na conta: " + this.num_movimentos;
	}
	
	//metodos modificadores
	public void setcodigo(String c) {
		this.codigo_cartao=c;
	}
	public void setnome(String n) {
		this.nome=n;
	}
	public void setsaldo(float s) {
		this.saldo=s;
	}
	public void setmov(int m) {
		this.num_movimentos=m;
	}
	
	// metodos extras
	public void carregaCartao(float s) {
		this.saldo=this.saldo+s;
		num_movimentos++;
		saldoTotal = saldoTotal + s ;
	}
	public boolean prePago(float s) {
		if(s<=this.saldo) {
			return true;
		}else {
			return false;
		}
		}
	public void pagamento(float p) {
		this.saldo = this.saldo-p;
		num_movimentos++;
		saldoTotal = saldoTotal - p ;
	}
	
	// métodos de classe
	public static int getTotalCartoes() {
		return totalCartoes ;
	}
	
	public static double getSaldoTotal() {
		return saldoTotal ;
	}
	
}
