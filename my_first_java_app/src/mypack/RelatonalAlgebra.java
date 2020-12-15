package mypack;

import java.util.Scanner;

public class RelatonalAlgebra {
	private static Scanner myScanner;

	public static void main(String args[]) {
	
		myScanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		String x = myScanner.nextLine();
		
		int y = Integer.parseInt(x);
		
		if(y%2==0) {
			System.out.println("Bonus!");
			y++;
					}
		
		System.out.println(y);
		
	}

}
