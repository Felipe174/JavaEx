package tra;

import java.util.Scanner;

public class ex2 {

	public static void main(String[]args) {
	int contarmaior13=0,contarnotas=0;
	float perc,nota=0;
	Scanner input=new Scanner(System.in);
	
	while(nota>=0) {
		System.out.print("indique a nota:");
		nota=input.nextFloat();
		if(nota>13) {
			contarmaior13++;
	}
		if(nota>=0) {
			contarnotas++;
		}
	}
	perc=(float)contarmaior13/contarnotas*100;
	System.out.println("A porcentagem de notas maiores que 13 ="+perc+"%");
	}
}
	


