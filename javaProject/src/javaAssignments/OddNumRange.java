package javaAssignments;

import java.util.Scanner;

public class OddNumRange {
	
private static Scanner myScanner;

public static void main(String[] args) {
	

	myScanner = new Scanner(System.in);
	System.out.println("Enter the first number: ");
	int x = myScanner.nextInt();
	
	System.out.println("Enter the second number: ");
	int y = myScanner.nextInt();

	System.out.println("The odd numbers in this range are:\n");
	OddNumbers(x,y);
}

public static void OddNumbers(int x, int y) {
	
	for(int i = x; i<=y; i++) {
		if(i%2==1) { 
			System.out.print(i + " ");
			}
	}
	
}
}
