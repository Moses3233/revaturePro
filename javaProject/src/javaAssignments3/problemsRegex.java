package javaAssignments3;

public class problemsRegex {
public static void main(String[] args) {
	String license = "J690-950-45-095-0";
	String socialNum = "123-45-6789";
	
	confirmDL(license);
	confirmSSN(socialNum);
	
}

public static void confirmDL(String DL) {
	
	if(DL.matches("[A-Z]{1}[0-9]{3}[-][0-9]{3}[-][0-9]{2}[-][0-9]{3}[-][0-9]{1}")){
		System.out.println("This license is Valid.");
	}
	else {System.out.println("This license isn't valid");
}
	
}

public static void confirmSSN(String social) {
	if(social.matches("[0-9]{3}[-][0-9]{2}[-][0-9]{4}")){
		System.out.println("This social is Valid.");
	}
	else {System.out.println("This social isn't valid");
}
	
}

}
