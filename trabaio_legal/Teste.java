package trabaio_legal;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		int opcao=-1,i;
		int num,p,h,m,d,a;

		
		String h,n;
		
		Scanner texto=new Scanner(System.in);
	    Scanner numeros=new Scanner(System.in);
	    
		//declaração do ArrayList
		ArrayList <cartaoPonto> car = new ArrayList <cartaoPonto>() ;
	
		while(opcao != 0) {
		
		System.out.println("1 – Inserir um cartão de ponto");
		System.out.println("2 – Mostrar todos os cartões de ponto");
		System.out.println("3 – Mostrar os minutos registados em cada cartão de ponto");
		System.out.println("0 - Sair");
		System.out.print("opção: ");
		
		System.out.println("");
		if(opcao==1) {
			
			System.out.println("Indique o numero do empregado:");
			num = numeros.nextInt();
			System.out.println("nome:");
			n = texto.nextLine();
			Empregado e = new Empregado(num,n);
			System.out.println("Hora de entrada");
			System.out.println("Hora: ");
			int hora = numeros.nextInt();
			System.out.println("Minuto: ");
			int minuto = numeros.nextInt();
			Hora hc = new Hora(h, m);
			
			System.out.println("Hora de saída");
			System.out.println("Hora: ");
			int horas = numeros.nextInt();
			System.out.println("Minuto: ");
			int minutos = numeros.nextInt();
			Hora hs = new Hora(h, m);
			
			System.out.println("dia: ");
			d = numeros.nextInt();
			System.out.println("mes: ");
			m = numeros.nextInt();
			System.out.println("ano: ");
			a = numeros.nextInt();
			Data dt = new Data(d,m,a);
			
			car.add(new cartaoPonto(e,dt,hs,hc));
			

		}
	}
       if(opcao==2) {
			for(i=0;i<car.size();i++) 
			
			System.out.println(car.toString());
		}
	
	   if(opcao==3) {
		   for(i=0;i<car.size();i++) 
			   
			   System.out.println("Minutos em cada cartão ponto: " + car.get(i).calcularDiferencaHoras());
		
	}




	
}
