package exs;

import java.util.Random;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Random codigo = new Random();
        StringBuilder codigoaleatorio = new StringBuilder();
        Scanner scanner = new Scanner (System.in);
        int usercode;

      
        
        
        for (int i = 0; i < 5; i++) {
            int numerorandom = codigo.nextInt(10);
            codigoaleatorio.append(numerorandom);
        }
        
        System.out.println("Seu código aleatório é: " + codigoaleatorio.toString());
       
        System.out.println("Digite seu codigo:");
        usercode = scanner.nextInt();
        if(usercode ==  Integer.parseInt(codigoaleatorio.toString())) {
        	 System.out.println("Codigo correto ! agora crie sua senha:");
        	 int senha = scanner.nextInt();
        	 System.out.println("digite sua senha:");
        	 int senhaOn = scanner.nextInt();
        	 if(senha == senhaOn) {
        		 System.out.println("Acesso permitido !");
        	 }
        }else {
        	 System.out.println("Codigo incorreto !");
        }
       
        scanner.close();
    }
}
