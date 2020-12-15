package javaAssignments;

import java.util.Scanner;

public class Fibonacci {
	
private static Scanner myScanner;

public static void main(String[] args) {

	myScanner = new Scanner(System.in);
	System.out.println("We are going to what Fib. number?: ");
	int x = myScanner.nextInt();
	
	numFibonacci(x);
}

public static void numFibonacci(int number) {
	
	int a = 1;
	int b = 1;
	System.out.print("0 ");
	System.out.print(a + " ");
	System.out.print(b + " ");
	
	for(int i = 0; i < number; i++){
		int c = a+b;
		a = b;
		b = c;
		System.out.print(c+ " ");
		
	}
	
	
}
}
