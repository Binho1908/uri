package beginner.exercise1018;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Notas = sc.nextInt();
		
		int restNotaDe100 = Notas % 100;
		int NotasDe100 = Notas / 100;
		
		int restNotaDe50 = restNotaDe100 % 50;
		int NotasDe50 = restNotaDe100 / 50;
		
		int restNotaDe20 = restNotaDe50 % 20;
		int NotasDe20 = restNotaDe50 / 20;
		
		int restNotaDe10 = restNotaDe20 % 10;
		int NotasDe10 = restNotaDe20 / 10;
		
		int restNotaDe5 = restNotaDe10 % 5;
		int NotasDe5 = restNotaDe10 / 5;
		
		int restNotaDe2 = restNotaDe5 % 2;
		int NotasDe2 = restNotaDe5 / 2;
		
		int restNotaDe1 = restNotaDe2 % 1;
		int NotasDe1 = restNotaDe2 / 1;
		
		System.out.println(Notas);
		System.out.println(NotasDe100 + " nota(s) de R$ 100,00");
		System.out.println(NotasDe50 + " nota(s) de R$ 50,00");
		System.out.println(NotasDe20 + " nota(s) de R$ 20,00");
		System.out.println(NotasDe10 + " nota(s) de R$ 10,00");
		System.out.println(NotasDe5 + " nota(s) de R$ 5,00");
		System.out.println(NotasDe2 + " nota(s) de R$ 2,00");
		System.out.println(NotasDe1 + " nota(s) de R$ 1,00");
	}

}
