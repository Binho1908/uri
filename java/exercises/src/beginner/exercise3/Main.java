package beginner.exercise3;
import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
        double N = 3.14159;
        double R = sc.nextDouble();
        double A = N * (R * R);
        System.out.printf("A=%.4f\n",A);
	}

}
