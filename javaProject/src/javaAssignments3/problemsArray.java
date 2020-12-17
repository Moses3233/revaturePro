package javaAssignments3;

public class problemsArray {

	public static void main(String[] args) {
		
		int[] nums = {1, 8, 11, 32, 77, 69, 44, 2, 696};
		
		arrayReverse(nums);
		System.out.println("\n");
		
		isNumPalindrome(nums);
		System.out.println("\n");
		
		sortOddNEven(nums);
		System.out.println("\n");
		
		deleteSpecific(nums,3);
		
		arrMinMax(nums);
		
	}
	
	public static void arrayReverse(int array[]) {
		System.out.println("Array reversed: ");
		for(int i = array.length-1; i >= 0; i--) {
				System.out.print(array[i] + " ");
	}
	}
	
	public static void arrMinMax(int array[]) {

		int minNum = array[0], maxNum = array[0];
	
		
		for(int i = 0; i<array.length; i++) {
			if(array[i]> maxNum) {maxNum = array[i];}
			if(array[i]< minNum) {minNum = array[i];}
}
		System.out.println("Maximun number: "+ maxNum +"\nMinimum number: " + minNum);
	}
	
	public static void deleteSpecific(int array[], int del) {
		
		if(del<0 || del>array.length) {
			System.out.println("Error! Closing now...");
			System.exit(0);
		}
		
		System.out.println("Deleting position #"+ del +"... ");
		int[] newArr = new int[array.length - 1];
		
		for(int l = 0; l <del-1; l++) {
			newArr[l] = array[l];
}
		for(int k = del; k <=newArr.length; k++) {
			newArr[k-1] = array[k];
}
		
		for(int i = 0; i<newArr.length; i++) {
			System.out.print(newArr[i] + " ");
}
		
	}
	
   public static void isNumPalindrome(int array[]){
		System.out.println("The following are palindromes: ");
		
		for(int i = 0; i<array.length; i++ ) {
			
			String check = array[i]+"";
			
		for(int j=0; j< check.length()/2; j++ ) {
			boolean pali = true;
				
			if(check.charAt(j) != check.charAt(check.length()-1-j)) {	
				pali = false;
				 		break;	
			
		}	
			
			if(pali = true) { System.out.print(array[i] + " "); }
			
		}
		}
   }
	
	public static void sortOddNEven(int array[]) {
		
		int x=0, y=0, m=0, n=0, totalOdds = 0, totalEvens = 0;
			
		for(int i = 0; i<array.length; i++) {
			if(array[i]%2==1) {	
				totalOdds+=array[i];
				y++;
			}
			else {
				totalEvens+=array[i];
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
		
		int[] Odds = new int[y];
		int[] Evens = new int[x];
		
		for(int j = 0; j<array.length; j++) {
			if(array[j]%2!=1) {	
				Evens[x-(x-m)] = array[j];
				m++;
			}

			else {
				Odds[y-(y-n)] = array[j];
				n++;
				
			}
		}
	
		System.out.println("Odds: ");
		for(int k = 0; k<Odds.length; k++) {
				System.out.print(Odds[k] + " ");
	}
		System.out.println("\n");
		System.out.println("Evens: ");
		for(int l = 0; l <Evens.length; l++) {
			System.out.print(Evens[l] + " ");
}
	
	}
	
}
