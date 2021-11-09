package beginner.exercise1015;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double x1 = sc.nextDouble();
		Double y1 = sc.nextDouble();
		Double x2 = sc.nextDouble();
		Double y2 = sc.nextDouble();
		
		//step by step;
		Double calcBaseX = x2 - x1;
		Double calcBaseY = y2 - y1;
		Double calcPotBaseY = calcBaseY * calcBaseY;
		Double calcPotBaseX = calcBaseX * calcBaseX;
		
		Double calc = Math.sqrt(calcPotBaseX + calcPotBaseY);
		
		//normal
			// Double calc = Math.sqrt(Math.pow(x2 -x1, 2) + Math.pow(y2 -y1, 2));;
		
		System.out.printf("%.4f%n",calc);
	}

}
