package exs;

import java.util.Scanner;

public class ex8 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quanto você tem de saldo?");
		double saldoAtual = scanner.nextDouble();
		System.out.println("Quanto você deve de debito?");
		double debito = scanner.nextDouble();
		System.out.println("Quanto você tem de credito?");
		double credito = scanner.nextDouble();
		double sub = saldoAtual - debito + credito;
		if(sub <= 0) {
			System.out.println("Saldo negativo ");
			System.out.println("você deve :"+sub);
		}else {
			System.out.println(sub);
		}
		
	scanner.close();
	
	}
}
