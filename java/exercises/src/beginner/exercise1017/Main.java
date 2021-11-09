package beginner.exercise1017;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int time = sc.nextInt();
		int avgVel = sc.nextInt();
		
		double spentGas = (time * avgVel) / 12.0;
		
		System.out.printf("%.3f%n",spentGas);
		
		
	}

}
