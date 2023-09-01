package exs;

import java.util.Scanner;

public class ex5{
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in) ;

    System.out.print("Digite a idade do primeiro homem: ");
    int homem1 = scanner.nextInt();

    System.out.print("Digite a idade do segundo homem: ");
    int homem2 = scanner.nextInt();

    System.out.print("Digite a idade da primeira mulher: ");
    int mulher1 = scanner.nextInt();

    System.out.print("Digite a idade da segunda mulher: ");
    int mulher2 = scanner.nextInt();
    
    int homemmenor = Math.min(homem1, homem2);

    int mulhermenor = Math.min(mulher1, mulher2);
    
    int somahomememulher = homemmenor + mulhermenor;
    System.out.print("a idade menor de cada é : "+ somahomememulher);
    	
    scanner.close();
    
    }
    
    }
