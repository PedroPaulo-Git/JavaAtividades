package exs;
import java.util.Scanner;

public class ex9 {
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		
		int time1,time2;
		System.out.println("Gols do time 1 :");
		time1 = scanner.nextInt();
		System.out.println("Gols do time 2 :");
		time2 = scanner.nextInt();
		
		if(time1 > time2) {
			System.out.println("time 1 fez: "+time1+" Gols e foi o vencedor");
		}else if (time1 == time2) {
			System.out.println("Empate");
			
		}else{
			System.out.println("time 2 fez: "+time2+" Gols e foi o vencedor");
		}
		scanner.close();
		}
	}
