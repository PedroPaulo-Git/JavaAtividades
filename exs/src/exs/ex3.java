package exs;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		float maça = 1.8f;
		float morango = 2.5f;
		float compramaça;
		float compramorango;
		Scanner scanner = new Scanner (System.in);
		 System.out.println("quantos Kg de maça você quer?");
		compramaça = scanner.nextFloat();
		float comprafinalmaça = compramaça * maça;
		 System.out.println("sua compra de maças deu: R$ " + comprafinalmaça);
		 System.out.println("Quantos Kg de morango você quer?");
		 compramorango = scanner.nextFloat();
		float comprafinalmorango = compramorango * morango;
		 System.out.println("sua compra de morango deu: R$" + comprafinalmorango);
		 
		 float comprasemdesconto = comprafinalmaça + comprafinalmorango;
		 float comprafinalcomdesconto = comprasemdesconto * 0.9f;
		 
		 if(comprasemdesconto > 25) {
			 System.out.printf("sua compra total deu: R$%.2f com desconto de 10%%",comprafinalcomdesconto);
		 }else if(comprasemdesconto < 25) {
			 System.out.printf("sua compra total deu: R$%.2f", comprasemdesconto );
		 }
		 
		
		
		scanner.close();
		
		
		
		
		
		
	}

}
