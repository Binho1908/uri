package beginner.exercise1016;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int distance = sc.nextInt();
		int qtdMinutes = (60 * distance) /30;
		
		System.out.println(qtdMinutes + " minutos");
	}

}
