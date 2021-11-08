package beginner.exercise1006;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Double A = input.nextDouble();
		Double B = input.nextDouble();
		Double C = input.nextDouble();
		Double MEDIA = ((A * 2 ) + (B * 3) + (C * 5)) / 10;
		System.out.printf("MEDIA = %.1f%n", MEDIA);
		
		input.close();
	}

}
