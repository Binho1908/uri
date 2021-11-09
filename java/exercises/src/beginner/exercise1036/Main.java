package beginner.exercise1036;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double delta = Math.pow(B, 2) - 4*A*C; //200
		if((A <= 0 || B <= 0 || C <= 0) || delta <= 0) {
			System.out.println("Impossivel calcular");
		}else {
			
			double raizOne =  (- B + (Math.sqrt(delta))) / (2*A);
			double raizTwo =  (- B - (Math.sqrt(delta))) / (2*A);
			System.out.printf("R1 = %.5f%n",raizOne);
			System.out.printf("R2 = %.5f%n",raizTwo);
		}
		
			
			
			
			
		
		
	}

}
