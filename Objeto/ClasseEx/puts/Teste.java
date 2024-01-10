package puts;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner texto= new Scanner(System.in);
		Scanner numeros= new Scanner(System.in);
		
	//declaraçoes
		int opcao= 0,m,i;
		String c,n;
		float s;
		
	Cartao[] car= new Cartao[100];
		
		while(opcao !=9) {
			System.out.println("---Cartoes---");
			System.out.println("1 - Inserir cartão");
			System.out.println("2 - Listar cartões");
			System.out.println("3 - Consultar cartão");
			System.out.println("4 - Carregar cartão");
			System.out.println("5 - Efetuar pagamento");
			System.out.println("6 - Ver totais");
			System.out.println("9 - Sair");
			System.out.print("Opção: ");
			opcao = numeros.nextInt();
			if(opcao==1) {
				System.out.println("indique o codigo do cartão:");
				c=texto.nextLine();
				System.out.println("seu nome:");
				n=texto.nextLine();
				System.out.println("o saldo:");
				s=numeros.nextFloat();
				System.out.println("o numero de movimentos atuais no cartão:");
				m=numeros.nextInt();
				car[Cartao.getTotalCartoes()]= new Cartao(c,n,s,m);
			}
			if(opcao==2) {
				for(i=0; i <Cartao.getTotalCartoes(); i++) {
				System.out.println(car[i].toString());
			}
			}
			if(opcao==3) {
				System.out.print("indique o codigo do cartão");
				c=texto.nextLine();
				for(i=0; i<Cartao.getTotalCartoes();i++) {
					if(c.equals(car[i].getcodigo())) {
						System.out.println(car[i].toString());
					}
					
				}
			}
			if(opcao==4) {
				System.out.print("indique o codigo do cartão");
				c=texto.nextLine();
				for(i=0; i<Cartao.getTotalCartoes();i++) {
					if(c.equals(car[i].getcodigo())) {
				System.out.println("indique o montante");
				s=numeros.nextFloat();
				car[i].carregaCartao(s);
					}
				}
			}
			if(opcao==5) {
				float p;
				System.out.print("indique o codigo do cartão");
				c=texto.nextLine();
				for(i=0; i<Cartao.getTotalCartoes();i++) {
					if(c.equals(car[i].getcodigo())) {
						System.out.println("indique a quantidade a pagar");
						p=numeros.nextFloat();
						if (car[i].prePago(p) == true)
							car[i].pagamento(p);
						else 
							System.out.println("Não tem saldo suficiente!") ;
			}
		}
			
	}
			if(opcao==6) {
				System.out.print(Cartao.getSaldoTotal());
			}
	
	
}
	}
}
