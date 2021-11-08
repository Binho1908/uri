package beginner.exercise1013;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int MaiorAB = (A + B + Math.abs(A-B)) /2;
		int MaiorABC = (MaiorAB + C + Math.abs(MaiorAB - C)) / 2;
		
		System.out.println(MaiorABC+ " eh o maior");
		
	
	}

}
