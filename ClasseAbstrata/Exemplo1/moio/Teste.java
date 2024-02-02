package moio;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
	int opcao=0,i;
	int d,m,a,s;
	
	double div,p;
	
	String num,numC,n,t,tipo;
	
	Scanner texto=new Scanner(System.in);
    Scanner numeros=new Scanner(System.in);
    
    //arraylist
		ArrayList<Cartao> car = new ArrayList<Cartao>(); 
		
		while(opcao != 0) {
			System.out.println("1 - Criar um cartão de débito");
			System.out.println("2 – Criar um cartão de crédito");
			System.out.println("4 – Alterar o tipo de cartão");
			System.out.println("5 - Mostrar todos os cartões e os limites");
			System.out.println("0 - Sair");
			System.out.print("opção: ");
			
		if(opcao==1) {
			
			System.out.println("indique o numero: ");
			num = texto.nextLine();
			System.out.println("indique o nome do titular: ");
			t = texto.nextLine();
			System.out.println("indique o dia da validade: ");
			d = numeros.nextInt();
			System.out.println("indique o mes da validade: ");
			m = numeros.nextInt();
			System.out.println("indique o ano da validade: ");
			a = numeros.nextInt();
			Data dt = new Data(d,m,a);
			System.out.println("indique o tipo do cartao: ");
			tipo = texto.nextLine();
			System.out.println("indique o numero da conta: ");
			numC = texto.nextLine();
			System.out.println("indique o saldo da conta: ");
			s = numeros.nextInt();
			
			car.add(new Debito(num,t,dt,numC,tipo,s));
		}
if(opcao==2) {
			
			System.out.println("indique o numero: ");
			num = texto.nextLine();
			System.out.println("indique o nome do titular: ");
			t = texto.nextLine();
			System.out.println("indique o dia da validade: ");
			d = numeros.nextInt();
			System.out.println("indique o mes da validade: ");
			m = numeros.nextInt();
			System.out.println("indique o ano da validade: ");
			a = numeros.nextInt();
			Data dt = new Data(d,m,a);
			System.out.println("indique o tipo do cartao: ");
			tipo = texto.nextLine();
			System.out.println("indique a quantidade da divida: ");
			div= numeros.nextDouble();
			
			
			car.add(new Credito(num,t,dt,tipo,div));
		}
			

if(opcao==4) {
	
	System.out.println("indique o numero de cartão: ");
	num = texto.nextLine();
	for(i=0;i<car.size();i++) {
		if(num.equals(car.get(i).getNumero())) {
	System.out.println("indique o novo tipo: ");
	tipo = texto.nextLine();
	car.get(i).setTipo(tipo);
		}
	}
}	
if(opcao==5) {
	
	  for(i=0;i<car.size();i++) 
		  
	System.out.println(car.toString());
	System.out.println("limite: " + car.get(i).verLimite());  
}	
		}

	}

}
