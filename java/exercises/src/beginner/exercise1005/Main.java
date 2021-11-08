package beginner.exercise1005;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Double A = input.nextDouble();
		Double B = input.nextDouble();
		Double MEDIA = ((A * 3.5 ) + (B * 7.5)) / 11.0;
		System.out.printf("MEDIA = %.5f%n", MEDIA);
		
		input.close();
	}

}
