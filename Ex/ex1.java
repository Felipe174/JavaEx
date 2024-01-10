package tra;

import java.util.Scanner;

public class ex1 {

	public static void main(String[]args) {
		int contarmais10,contarnaochoveu,maximo,i,precipitacao;
		Scanner input=new Scanner(System.in);
		
		contarmais10= 0;
		contarnaochoveu= 0;
		maximo=0;
		for(i=0;i<31;i++) {
			System.out.print("indique a precipitação diaria:");
			precipitacao=input.nextInt();
			if(precipitacao>10) {
				contarmais10++;
			}
			if(precipitacao==0) {
				contarnaochoveu++;
			}
			if(maximo>precipitacao) {
				maximo=precipitacao;
			}
		}
		System.out.print("os dias que a precipitação foi maior q 10 foi:"+contarmais10);
		System.out.print("o numero de dias que não choveu foi:"+contarnaochoveu);
		System.out.print("maxima de precipitação:"+maximo);
		
		
	}
}
