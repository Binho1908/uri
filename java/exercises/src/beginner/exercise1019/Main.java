package beginner.exercise1019;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int Time = sc.nextInt();
		
		int Hour = Time / 3600 ;
		int Min =  Time / 60 - (Hour * 60);
		int Sec = Time - ((Hour * 3600) + (Min * 60)); 
		
		System.out.println(Hour+":"+Min+":"+Sec);
	}

}
