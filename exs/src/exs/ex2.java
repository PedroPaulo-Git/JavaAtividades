package exs;
import java.util.Scanner;

public class ex2 {
			    public static void main(String[] args) {
			    	float n1,n2,n3,media;
			    	
			    	 System.out.println("primeira nota:");
				        Scanner scanner = new Scanner(System.in);
				        n1 = scanner.nextFloat();
				     System.out.println("Segunda nota:");  
				     	n2 = scanner.nextFloat();	
				     System.out.println("terceira nota:");
				     	n3 = scanner.nextFloat();
				   media = n1 + n2 + n3 ;
				   float mediafinal = media /3;
				   if (mediafinal >= 9) {
			            System.out.printf("A sua média é: %.2f. Você ficou com nota A%n", mediafinal);
			        } else if (mediafinal >= 7.5 && mediafinal < 9) {
			            System.out.printf("A sua média é: %.2f. Você ficou com nota B%n", mediafinal);
			        } else if (mediafinal >= 6 && mediafinal < 7.5) {
			            System.out.printf("A sua média é: %.2f. Você ficou com nota C%n", mediafinal);
			        } else if (mediafinal < 6) {
			            System.out.printf("A sua média é: %.2f. Você ficou com nota D%n", mediafinal);
			        }
				   
			        
			        scanner.close();
				   
				 //  System.out.println("a sua media é : " + mediafinal);
				   
			    }}
