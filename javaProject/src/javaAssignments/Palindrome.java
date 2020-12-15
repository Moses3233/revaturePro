package javaAssignments;

import java.util.Scanner;


public class Palindrome {
	
private static Scanner myScanner;



public static void main(String[] args) {
	
	myScanner = new Scanner(System.in);
	System.out.println("Hello! Enter a string:");
	String phrase = myScanner.nextLine();
	
	isPalindrome(phrase.toLowerCase());
}



public static void isPalindrome(String word) {
	int x = word.length();	
	boolean answer = true;
	
	for(int i =0; i<x/2; i++) {
	
		if(word.charAt(i) != word.charAt(word.length()-1-i)) {
			 		answer = false;
			 		break;	
		}}
		
if(answer == false) {System.out.println("Not a palindrome!");}
else {System.out.println("This is a palindrome.");}

	}
	
}



