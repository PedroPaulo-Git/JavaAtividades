package exs;

import java.util.Scanner;

public class ex1 {
		    public static void main(String[] args) {
		    int anoNascimento;
	        
	        System.out.println("Digite seu ano de nascimento:");
	        Scanner scanner = new Scanner(System.in);
	        anoNascimento = scanner.nextInt();
	        
	        int anoAtual = 2023;
	        int idade = anoAtual - anoNascimento;
	      
	        System.out.println("sua idade é : "+ idade);
	        
	        System.out.println("Quantos anos você contribuiu trabalhando?");
	        int qtTrabalho;
	        qtTrabalho = scanner.nextInt();
	        if (idade >= 65 && qtTrabalho >= 30) {
				System.out.println("é possivel se aposentar !");
			}else if (idade >= 60 && qtTrabalho >= 25) {
				System.out.println("Você contribuiu "+qtTrabalho+"anos de trabalho já pode se aposentar !");
			}else {
				System.out.println("Você não tem a idade minima!");
			}
	        
	        
	        
	        
	        
	        scanner.close();
	        
	    }
	
}
