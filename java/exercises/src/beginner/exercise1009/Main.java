package beginner.exercise1009;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String sallerName = sc.nextLine();
		Double fixSalary = sc.nextDouble();
		Double sales = sc.nextDouble() * 0.15;
		Double totalSalary = fixSalary + sales;
		
		System.out.printf("TOTAL = R$ %.2f%n", totalSalary);

	}

}
