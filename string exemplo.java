package caba;

import java.util.Scanner;

public class f {


    public static void main(String[]args) {
    	Scanner texto=new Scanner(System.in);
        Scanner numeros=new Scanner(System.in);
    	String login,password;
        
        System.out.print("login: ");
        login=texto.nextLine();
        System.out.print("password: ");
        password=texto.nextLine();
        
        if(login.equals("samiranda") && password.equals("12345")){
        	System.out.println("acesso concedido");
        }
        	else {
        		System.out.println("acesso negado");
        }
    }
}