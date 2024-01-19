package classesCompostas;

import java.util.Scanner ;

public class Teste {

	public static void main(String[] args) {
		Scanner texto = new Scanner(System.in) ;
		Scanner numeros = new Scanner(System.in) ;
	
		System.out.print("Número de processo: ") ;
		String np = texto.nextLine();
		System.out.print("Nome: ") ;
		String n = texto.nextLine();
		System.out.println("Morada ") ;
		System.out.print("Rua: ") ;
		String rua = texto.nextLine();
		System.out.print("Número de porta: ") ;
		String numero = texto.nextLine();
		System.out.print("Freguesia: ") ;
		String fr = texto.nextLine();
		System.out.print("Concelho: ") ;
		String co = texto.nextLine();
		System.out.print("Código Postal: ") ;
		String cp = texto.nextLine();
		Morada m = new Morada(rua, numero, fr, co, cp) ;
		System.out.print("Telefone: ") ;
		String tl = texto.nextLine();
		System.out.println("Data de nascimento") ;
		System.out.print("Dia: ") ;
		int dia = numeros.nextInt();
		System.out.print("Mês: ") ;
		int mes = numeros.nextInt();
		System.out.print("Ano: ") ;
		int ano = numeros.nextInt();
		Data d = new Data(dia, mes, ano) ;
		
		Aluno a = new Aluno(np, n, m, tl, d) ;
		
		System.out.println(a.toString()) ;
	
	}
	
}
