package javaAssignments;

public class paliGrand {
	public static void main(String[] args) {
		
	
	for(int num=1000; num<=9999; num++) {
	String s=num+"";
	
	if(new StringBuffer(s).reverse().toString().equals(s)) {
		System.out.println(s + " ");
	}

}
	}
}
