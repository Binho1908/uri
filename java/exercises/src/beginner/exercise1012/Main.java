package beginner.exercise1012;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double A = sc.nextDouble();
		Double B = sc.nextDouble();
		Double C = sc.nextDouble();
		Double PI = 3.14159;
		
		
		Double Triangle = (A * C) / 2;
		Double Circle = (C * C) * PI;
		Double Trapezium = ((A + B) / 2) * C;
		Double Square = B * B;
		Double Retangle = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n",Triangle);
		System.out.printf("CIRCULO: %.3f%n",Circle);
		System.out.printf("TRAPEZIO: %.3f%n",Trapezium);
		System.out.printf("QUADRADO: %.3f%n",Square);
		System.out.printf("RETANGULO: %.3f%n",Retangle);
	}

}
