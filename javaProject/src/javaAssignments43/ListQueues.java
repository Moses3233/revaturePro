package javaAssignments43;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListQueues {

public static void main(String[] args) {
		
		List<Integer> numList= new LinkedList<Integer>();
		numList.add(99);
		numList.add(5);
		numList.add(969);
		numList.add(200);
		numList.add(48);
		numList.add(77);
		numList.add(11);

		
		listReverse(numList);
		System.out.println("\n");
		
		isNumPalindrome(numList);
		System.out.println("\n");
		
		sortOddNEven(numList);
		System.out.println("\n");
		
		deleteSpecific(numList,3);
		
		arrMinMax(numList);
		
	}
	
	public static void listReverse(List<Integer> list) {
		System.out.println("Array reversed: ");
		Collections.reverse(list);
		System.out.println(list);
	}
	
	public static void arrMinMax(List<Integer> list) {

		int minNum = 0, maxNum = 0;

		Collections.sort(list);
		
		minNum = list.get(0);
		maxNum = list.get(list.size()-1);
		
		System.out.println("Maximun number: "+ maxNum +"\nMinimum number: " + minNum);
	}
	
	public static void deleteSpecific(List<Integer> list, int del) {
		
		if(del<0 || del>list.size()) {
			System.out.println("Error! Closing now...");
			System.exit(0);
		}
		
		System.out.println("Deleting position #"+ del +"... ");

		list.remove(del);
	}
	
   public static void isNumPalindrome(List<Integer> list){
		System.out.println("The following are palindromes: ");
		
		for(int i = 0; i<list.size(); i++ ) {
			
			String check = list.get(i)+"";
			
		for(int j=0; j< check.length()/2; j++ ) {
			boolean pali = true;
				
			if(check.charAt(j) != check.charAt(check.length()-1-j)) {	
				pali = false;
				 		break;	
			
		}	
			
			if(pali = true) { System.out.print(list.get(i) + " "); }
			
		}
		}
   }
	
	public static void sortOddNEven(List<Integer> list) {
		
		int x=0, y=0, totalOdds = 0, totalEvens = 0;
			
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i)%2==1) {	
				totalOdds+=list.get(i);
				y++;
			}
			else {
				totalEvens+=list.get(i);
				x++;
			}
		
		}
		
		System.out.println("Total Odds: " + totalOdds);
		System.out.println("Total Evens: " + totalEvens);
		System.out.println("\n");
		
		if(totalOdds > totalEvens) {System.out.println("The total odds is greater than the evens");}
		else if(totalOdds < totalEvens) {System.out.println("The total evens is greater than the odds");}
		else {System.out.println("They are equal.");}
		
		System.out.println("\n");
		
		List<Integer> Odds = new LinkedList<Integer>();
		List<Integer> Evens = new LinkedList<Integer>();
		
		for(int j = 0; j<list.size(); j++) {
			if(list.get(j)%2!=1) {	
				Evens.add(list.get(j));
			}

			else {
				Odds.add(list.get(j));
				
			}
		}
	
		System.out.println("Odds: ");
		for(int k = 0; k<Odds.size(); k++) {
				System.out.print(Odds.get(k) + " ");
	}
		System.out.println("\n");
		System.out.println("Evens: ");
		for(int l = 0; l <Evens.size(); l++) {
			System.out.print(Evens.get(l) + " ");
}
	
	}
	
	
}
