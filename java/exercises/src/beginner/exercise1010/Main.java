package beginner.exercise1010;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int peca1 = sc.nextInt();
		int numberPeca1 = sc.nextInt();
		Double valuePeca1 = sc.nextDouble();
		Double totPeca1 = numberPeca1 * valuePeca1;
		
		int peca2 = sc.nextInt();
		int numberPeca2 = sc.nextInt();
		Double valuePeca2 = sc.nextDouble();
		Double totPeca2 = numberPeca2 * valuePeca2;
		
		Double totPricePeca = totPeca1 + totPeca2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n",totPricePeca);
	}

}
