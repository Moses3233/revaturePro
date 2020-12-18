package javaAssignments42;


public class CustomMain {

	public static void main(String[] args) {

		Validation v=new Validation();
		try {
			if(v.isValidDL("")) {
				System.out.println("Age Validated");
			}
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}

		try {
		if(v.isValidPassportNumber("9123456780")) {
			System.out.println("Passprt Number Validated");
		}
		}catch(BusinessException e) {
			System.out.println(e.getMessage());
		}

	}

}