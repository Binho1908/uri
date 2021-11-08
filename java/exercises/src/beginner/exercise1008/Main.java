package beginner.exercise1008;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeroFunc = sc.nextInt();
		int horasTrab = sc.nextInt();
		Double salaryPerHour = sc.nextDouble();
		
		Double salaryMouth = horasTrab * salaryPerHour;
		
		System.out.println("NUMBER = "+numeroFunc);
		System.out.printf("SALARY = U$ %.2f%n", salaryMouth);
		
	}

}
