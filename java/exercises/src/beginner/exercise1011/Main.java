package beginner.exercise1011;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
        double PI = 3.14159;
        double R = sc.nextDouble();
        double Area = (4/3.0) * PI * (R * R * R);
        System.out.printf("VOLUME = %.3f%n",Area);
        
	}
}
