package beginner.exercise1021;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double Notas = sc.nextDouble();
		int  valor = 0;
		
		System.out.println("NOTAS:");
		valor = (int) Notas / 100;
		System.out.printf("%d nota(s) de R$ 100.00%n", valor);
		Notas = Notas % 100.0;
		
		valor = (int) Notas / 50;
		System.out.printf("%d nota(s) de R$ 50.00%n", valor);
		Notas = Notas % 50.0;
		
		valor = (int) Notas / 20;
		System.out.printf("%d nota(s) de R$ 20.00%n", valor);
		Notas = Notas % 20.0;
		
		valor = (int) Notas / 10;
		System.out.printf("%d nota(s) de R$ 10.00%n", valor);
		Notas = Notas % 10.0;
		
		valor = (int) Notas / 5;
		System.out.printf("%d nota(s) de R$ 5.00%n", valor);
		Notas = Notas % 5.0;
		
		valor = (int) Notas / 2;
		System.out.printf("%d nota(s) de R$ 2.00%n", valor);
		Notas = Notas % 2.0;
		
		Notas = Notas * 100.00;
		
		System.out.println("MOEDAS:");
		valor = (int) Notas / 100;
		System.out.printf("%d moeda(s) de R$ 1.00%n", valor);
		Notas = Notas % 100.0;
		
		valor = (int) (Notas / 50);
		System.out.printf("%d moeda(s) de R$ 0.50%n", valor);
		Notas = Notas % 50.0;
		
		valor = (int) (Notas / 25);
		System.out.printf("%d moeda(s) de R$ 0.25%n", valor);
		Notas = Notas % 25.0;
		
		valor = (int) (Notas / 10);
		System.out.printf("%d moeda(s) de R$ 0.10%n", valor);
		Notas = Notas % 10.0;
		
		valor = (int) (Notas / 5);
		System.out.printf("%d moeda(s) de R$ 0.05%n", valor);
		Notas = Notas % 5.0;
		
		valor = (int) (Notas / 1);
		System.out.printf("%d moeda(s) de R$ 0.01%n", valor);
		Notas = Notas % 1.0;
		
		
		/* LOGICA ESTÁ CERTA MAIS DA ERRO NO URI
		double Notas = sc.nextDouble();
		
		System.out.println("NOTAS:");
		
		int Not100 = (int) (Notas / 100);
		System.out.printf("%d nota(s) de R$ 100.00%n",Not100);
		
		Notas = Notas % 100;
		
		int Not50 = (int) (Notas / 50);
		System.out.printf("%d nota(s) de R$ 50.00%n",Not50);
		
		Notas = Notas % 50;
		
		int Not20 = (int) (Notas / 20);
		System.out.printf("%d nota(s) de R$ 20.00%n",Not20);
		
		Notas = Notas % 20;
		
		int Not10 = (int) (Notas / 10);
		System.out.printf("%d nota(s) de R$ 10.00%n",Not10);
		
		Notas = Notas % 10;
		
		int Not5 = (int) (Notas / 5);
		System.out.printf("%d nota(s) de R$ 5.00%n",Not5);
		
		Notas = Notas % 5;
		
		int Not2 = (int) (Notas / 2);
		System.out.printf("%d nota(s) de R$ 2.00%n",Not2);
		
		System.out.println("MOEDAS:");
		
		Notas = Notas % 2;
		
		int Not1 = (int) (Notas / 1);
		System.out.printf("%d moeda(s) de R$ 1.00%n",Not1);
		
		Notas = Notas % 1;
		
		int Not0_5 = (int) (Notas / 0.5);
		System.out.printf("%d moeda(s) de R$ 0.50%n",Not0_5);
		
		Notas = Notas % 0.5;
		
		int Not0_25 = (int) (Notas / 0.25);
		System.out.printf("%d moeda(s) de R$ 0.25%n",Not0_25);
		
		Notas = Notas % 0.25;
		
		int Not0_10 = (int) (Notas / 0.10);
		System.out.printf("%d moeda(s) de R$ 0.10%n",Not0_10);
		
		Notas = Notas % 0.10;
		
		int Not0_05 = (int) (Notas / 0.05);
		System.out.printf("%d moeda(s) de R$ 0.05%n",Not0_05);
		
		Notas = Notas % 0.05;
		
		int Not0_01 = (int) (Notas / 0.01);
		System.out.printf("%d moeda(s) de R$ 0.01%n",Not0_01);*/
	}

}
