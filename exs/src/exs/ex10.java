package exs;

import java.util.Scanner;

public class ex10 {
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double valcool = 2.90;
		double vgasolina = 3.30;
		int alcool,gasolina;
		
		System.out.println("Quantos litros de alcool você quer?");
		alcool = scanner.nextInt();
		System.out.println("Quantos litros de gasolina você quer?");
		gasolina = scanner.nextInt();
		
		double totalalcool = valcool * alcool; 
		double totalgasolina = vgasolina * gasolina ; 
		double totalalcoolcomdesconto = totalalcool * 0.03;
		double totalgasolinacomdesconto = totalgasolina * 0.03;	
		double totaldescontoa = totalalcoolcomdesconto + totalalcool;
		double totaldescontog = totalgasolinacomdesconto + totalgasolina;
		
		
		System.out.println("seu valor de alcool foi " + totaldescontoa);
		System.out.println("seu valor de gasolina foi "+totaldescontog);
		scanner.close();
}
		
		
	}

