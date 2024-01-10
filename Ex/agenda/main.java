package agenda;

import java.util.Scanner;

public class main {


	public static void main(String[] args) {
		
		Scanner texto=new Scanner(System.in);
		Scanner numeros=new Scanner(System.in);
		
		int opcao=0;
		String n,tlm,tlf,m,e;
		contacto cont=null;
		
		
		while(opcao !=9) {
			System.out.println("gestão de contactos");
			System.out.println("1-novo contacto");
			System.out.println("2-novo contacto sem tlf e morada");
			System.out.println("3-novo contacto só com tlm");
			System.out.println("4-mostrar contacto");
			System.out.println("9-sair");
			System.out.println("opção: ");
			opcao=numeros.nextInt();
			
			if(opcao==1) {
				System.out.println("nome: ");
				n=texto.nextLine();
				System.out.println("telemovel: ");
				tlm=texto.nextLine();
				System.out.println("telefone: ");
				tlf=texto.nextLine();
				System.out.println("morada: ");
				m=texto.nextLine();
				System.out.println("e-mail: ");
				e=texto.nextLine();
				cont=new contacto(n,tlm,tlf,m,e);
				
			}
			if(opcao==2) {
				System.out.println("nome: ");
				n=texto.nextLine();
				System.out.println("telefone: ");
				tlf=texto.nextLine();
				System.out.println("morada: ");
				m=texto.nextLine();
				cont=new contacto(n,tlf,m);
		}
			if(opcao==3) {
				System.out.println("nome: ");
				n=texto.nextLine();
				System.out.println("telemovel: ");
				tlm=texto.nextLine();
				cont=new contacto(n,tlm);
	}
			if (opcao==4) {
				System.out.println(cont.toString());
			}
			
			}


		
	}

}

