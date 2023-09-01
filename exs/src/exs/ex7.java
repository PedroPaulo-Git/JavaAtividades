package exs;

import java.util.Scanner;

public class ex7 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual seu salario?");
		int salariofixo = scanner.nextInt();
		System.out.println("Quanto você vendeu?");
		int comissão = scanner.nextInt();	
		double comissão5 = comissão * 0.05;
		double comissão3 = comissão * 0.03;
		double totalcomcomissao5 = salariofixo + comissão5;
		double totalsemcomissao3 = salariofixo + comissão3;
		
		System.out.println(comissão5);
		System.out.println(comissão3);
		
		if(comissão > 1500 ) {
			System.out.println("comissão é de 5%, você vai receber R$:"+ totalcomcomissao5);
			
		}else {
			System.out.println("comissão é de 3%, você vai receber R$:"+ totalsemcomissao3);
		}
		scanner.close();
		
		
	}
}
