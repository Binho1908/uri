package beginner.exercise1014;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int Distance = sc.nextInt();
		Double Gas = sc.nextDouble();
		
		Double KmPerLitre = Distance / Gas;
		
		System.out.printf("%.3f km/l%n", KmPerLitre);
	}

}
