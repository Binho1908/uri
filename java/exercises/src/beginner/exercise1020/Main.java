package beginner.exercise1020;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int dayTot = sc.nextInt();
		
		int qtdYears = dayTot / 365;
		dayTot = dayTot % 365;
		
		int qtdMouth = dayTot / 30;
		dayTot = dayTot % 30;
		
		int qtdDays = dayTot;
		
		System.out.printf("%d ano(s)%n", qtdYears);
		System.out.printf("%d mes(es)%n", qtdMouth);
		System.out.printf("%d dia(s)%n", qtdDays);
		
		
		//Esse código não funciona no URI
			//*int Time = sc.nextInt();
		
			//*int Year = Time / 365 ;
			//*int Mouth =  Time / 30 - (Year * 12);
			//*int Day = Time - ((Year * 365) + (Mouth * 30)); 
		
			//*System.out.println(Year+ " ano(s)");
			//*System.out.println(Mouth+ " mes(es)");
			//*System.out.println(Day+ " dia(s)");
	}

}
