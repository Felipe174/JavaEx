package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;


public class Teste {

	public static void main(String[] args) {
		int g,d,j,i;
		String n,c;
		
		//declaração do ArrayList
		ArrayList <Jogador> jog = new ArrayList <Jogador>() ;
		
		GuardaRedes g1 = new GuardaRedes("denis","aviao",12,55,1);
		jog.add(g1);
		System.out.println("indique o nome: ");
		System.out.println("indique o clube: ");
		System.out.println("indique o numero de jogos: ");
		System.out.println("indique o numero de gols sofridos: ");
		System.out.println("indique o numero de defesas: ");
		
		GuardaRedes g2=new GuardaRedes("rodrigo","mercedes",13,3214,213);
		jog.add(g2);
		System.out.println("indique o nome: ");
		System.out.println("indique o clube: ");
		System.out.println("indique o numero de jogos: ");
		System.out.println("indique o numero de gols sofridos: ");
		System.out.println("indique o numero de defesas: ");
		
		Defesa d1=new Defesa(n,c,j,i);
		jog.add(d1);
		System.out.println("indique o nome: ");
		System.out.println("indique o clube: ");
		System.out.println("indique o numero de jogos: ");
		System.out.println("indique o numero de intercepções: ");
		
		Defesa d2=new Defesa(n,c,j,i);
		jog.add(d2);
		System.out.println("indique o nome: ");
		System.out.println("indique o clube: ");
		System.out.println("indique o numero de jogos: ");
		System.out.println("indique o numero de intercepções: ");
		
		
	}
}
