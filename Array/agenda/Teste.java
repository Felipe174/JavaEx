package agenda;

import java.util.Scanner ;

public class Teste {

	public static void main(String[] args) {
		
		Scanner texto = new Scanner(System.in);
		Scanner numeros = new Scanner(System.in);
		int opcao = 0 ;
		String n, tlm, tlf, m, e ;
		Contacto[] agenda = new Contacto[100] ;
		// agenda é um array que pode ter até 100 contactos
		int numContactos = 0 ;
		// indica quantos contactos a agenda tem
		
		while (opcao != 9) {
			System.out.println("Gestão de contactos") ;
			System.out.println("1 - Novo contacto") ;
			System.out.println("2 - Novo contacto sem tlf e morada") ;
			System.out.println("3 - Novo contacto só com tlm") ;
			System.out.println("4 - Mostrar contactos") ;
			System.out.println("5 - Pesquisar contacto") ;
			System.out.println("9 - Sair") ;
			System.out.print("Opção: ") ;
			opcao = numeros.nextInt() ;
			
			if (opcao == 1) {
				System.out.println("Nome: ") ;
				n = texto.nextLine();
				System.out.println("Telemóvel: ") ;
				tlm = texto.nextLine();
				System.out.println("Telefone: ") ;
				tlf = texto.nextLine();
				System.out.println("Morada: ") ;
				m = texto.nextLine();
				System.out.println("E-mail: ") ;
				e = texto.nextLine();
				agenda[numContactos] = new Contacto(n, tlm, tlf, m, e) ;
				numContactos++ ;
			}
			
			if (opcao == 2) {
				System.out.println("Nome: ") ;
				n = texto.nextLine();
				System.out.println("Telemóvel: ") ;
				tlm = texto.nextLine();
				System.out.println("E-mail: ") ;
				e = texto.nextLine();
				agenda[numContactos] = new Contacto(n, tlm, e) ;
				numContactos++ ;
			}
			
			if (opcao == 3) {
				System.out.println("Nome: ") ;
				n = texto.nextLine();
				System.out.println("Telemóvel: ") ;
				tlm = texto.nextLine();
				agenda[numContactos] = new Contacto(n, tlm) ;
				numContactos++ ;
			}	
			
			if (opcao == 4) {
				int i ;
				for (i = 0; i < numContactos; i++)
					System.out.println(agenda[i].toString()) ;
			}
			
			if (opcao == 5) {
				int i ;
				System.out.print("Nome do contacto: ");
				n = texto.nextLine();
				for (i = 0; i < numContactos; i++) {
					if (n.equals(agenda[i].getNome()))
						System.out.println(agenda[i].toString()) ;
				}
			}

		}
	}

}
