package trabaio;

import java.util.Scanner ;

public class Teste {

public static void main(String[] args) {
		
		Scanner texto = new Scanner(System.in);
		Scanner numeros = new Scanner(System.in);
		
		int opcao = 0 ;
		int c,m,i;
		float s,p;
		
		String n;
		
		Cartao[] car = new Cartao[100] ;
	
		int numCartao = 0 ;
		
		while (opcao != 9) {
			System.out.println("Gestão de Cartões") ;
			System.out.println("1- Inserir cartão") ;
			System.out.println("2- Listar cartões") ;
			System.out.println("3 - Consultar cartão") ;
			System.out.println("4 - Carregar cartão") ;
			System.out.println("5 - Efetuar pagamento") ;
			System.out.println("9 - Sair") ;
			System.out.print("Opção: ") ;
			opcao = numeros.nextInt() ;
			
	if(opcao==1) {
		System.out.println("Indique o codigo do cartão: ");
		c = numeros.nextInt();
		System.out.println("Indique o nome: ");
		n = texto.nextLine();
		System.out.println("O saldo: ");
		s = numeros.nextFloat();
		System.out.println("E o numero de movimentos");
		m = numeros.nextInt();
		car[numCartao] = new Cartao(c,n,s,m);
		numCartao++;
	}
	if(opcao==2) {
		for(i=0;i<numCartao;i++)
			System.out.println(car[i].toString());
	}
	if(opcao==3) {
		System.out.println("indique o codigo do cartão: ");
		c = numeros.nextInt();
		for(i=0;i<numCartao;i++) {
			if(c == car[i].getCodigo_cartão()) {
				System.out.println(car[i].toString());
			}
				
			}
		}
	if(opcao==4) {
		System.out.println("indique o codigo do cartão: ");
		c = numeros.nextInt();
		for(i=0;i<numCartao;i++) {
			if(c == car[i].getCodigo_cartão()) {
				car[i].carregaCartao();	
			}
		}		
	}
	
	
	if(opcao==5) {
		System.out.println("indique o codigo do cartão: ");
		c = numeros.nextInt();
		for(i=0;i<numCartao;i++) {
			if(c == car[i].getCodigo_cartão()) {
				System.out.println("indique o montante do pagamento");
				p = numeros.nextFloat();
				car[i].pagamentos(true);
			}
				
			}
	}
		
	}
}
}
		
		
