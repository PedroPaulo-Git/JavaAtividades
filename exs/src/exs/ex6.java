package exs;

import java.util.Scanner;

public class ex6 {
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("digite um número :");
		int n1 = scanner.nextInt();
		System.out.println("digite outro número :");
		int n2 = scanner.nextInt();
		int lernmrs = Math.min(n1, n2);
		
		if(lernmrs == n1 && lernmrs == n2) {
				System.out.println("numeros iguais");
			
		}else if(n1 > n2) {
			System.out.println("o menor numero é :" + lernmrs);
			System.out.println("primeiro numero é maior que o segundo");
		}else if(n2 > n1) {
			System.out.println(" o menor numero é :" + lernmrs);
			System.out.println("segundo numero é maior que o primeiro");
		}
	
		
		scanner.close();
		
	}
	
	
}
