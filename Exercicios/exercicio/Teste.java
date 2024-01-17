package exercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

	
	public static void main(String[] args) {
		int opcao=-1;
		int i,an;
		
		float p;
		
		String t,d,a,e,pu,pe,ar,di;
		
		Scanner texto=new Scanner(System.in);
	    Scanner numeros=new Scanner(System.in);
	    
		//declaração do ArrayList
		ArrayList <Publicacao> pub = new ArrayList <Publicacao>() ;
	
		while(opcao != 0) {
		
		System.out.println("1 – Inserir um livro");
		System.out.println("2 – Inserir uma revista");
		System.out.println("3 – Inserir um jornal");
		System.out.println("4 – Inserir um livro infantil");
		System.out.println("5 – Inserir um livro técnico");
		System.out.println("6 – Inserir um manual escolar");
		System.out.println("0 - Sair");
		System.out.print("opção: ");
		
		System.out.println("");
		if(opcao==1) {
			
			System.out.println("Indique o titulo:");
			t = texto.nextLine();
			System.out.println("diga a data de publicação:");
			d = texto.nextLine();
			System.out.println("preço:");
			p = numeros.nextInt();
			System.out.println("autor: ");
			a = texto.nextLine();
			System.out.println("editora: ");
			e = texto.nextLine();
			
			Livro li = new Livro(t,d,p,a,e);
			pub.add(li);
		}
	}
if(opcao==2) {
			
			System.out.println("Indique o titulo:");
			t = texto.nextLine();
			System.out.println("diga a data de publicação:");
			d = texto.nextLine();
			System.out.println("preço:");
			p = numeros.nextInt();
			System.out.println("publico:");
			pu = texto.nextLine();
		
			Revista re = new Revista (t,d,p,pu);
			pub.add(re);
		}
	
	if(opcao==3) {
		
		System.out.println("Indique o titulo:");
		t = texto.nextLine();
		System.out.println("diga a data de publicação:");
		d = texto.nextLine();
		System.out.println("preço:");
		p = numeros.nextInt();
		System.out.println("periodicidade: ");
		pe = texto.nextLine();
		
		Jornal jo = new Jornal(t,d,p,pe);
		pub.add(jo);
	}


if(opcao==4) {
	
	System.out.println("Indique o titulo:");
	t = texto.nextLine();
	System.out.println("diga a data de publicação:");
	d = texto.nextLine();
	System.out.println("preço:");
	p = numeros.nextInt();
	System.out.println("autor: ");
	a = texto.nextLine();
	System.out.println("editora: ");
	e = texto.nextLine();
	System.out.println("idade:");
	i = numeros.nextInt();
	
	LivroInfantil liI = new LivroInfantil(t,d,p,a,e,i);
	pub.add(liI);
}


if(opcao==5) {
	
	System.out.println("Indique o titulo:");
	t = texto.nextLine();
	System.out.println("diga a data de publicação:");
	d = texto.nextLine();
	System.out.println("preço:");
	p = numeros.nextInt();
	System.out.println("autor: ");
	a = texto.nextLine();
	System.out.println("editora: ");
	e = texto.nextLine();
	System.out.println("area:");
	ar = texto.nextLine();
	
	LivroTecnico liT = new LivroTecnico(t,d,p,a,e,ar);
	pub.add(liT);
}


if(opcao==6) {
	
	System.out.println("Indique o titulo:");
	t = texto.nextLine();
	System.out.println("diga a data de publicação:");
	d = texto.nextLine();
	System.out.println("preço:");
	p = numeros.nextInt();
	System.out.println("autor: ");
	a = texto.nextLine();
	System.out.println("editora: ");
	e = texto.nextLine();
	System.out.println("Ano:");
	an = numeros.nextInt();
	System.out.println("Disciplina: ");
	di = texto.nextLine();
	
	
	Livro li = new Livro(t,d,p,a,e);
	pub.add(li);
}
	
	
	}
}
