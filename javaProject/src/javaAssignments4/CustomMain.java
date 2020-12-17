package javaAssignments4;


public class CustomMain {

	public static void main(String[] args) {

		Validation v=new Validation();
		try {
			if(v.isValidAge(41)) {
				System.out.println("Age Validated");
			}
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}

		try {
		if(v.isValidMobileNumber("+1-9123456780")) {
			System.out.println("Mobile Number Validated");
		}
		}catch(BusinessException e) {
			System.out.println(e.getMessage());
		}

	}

}