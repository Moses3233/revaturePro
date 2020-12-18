package javaAssignments42;

public class Validation {

	public boolean isValidDL(String DL) throws InvalidAgeException {

		if(!DL.matches("[A-Z]{1}[0-9]{3}[-][0-9]{3}[-][0-9]{2}[-][0-9]{3}[-][0-9]{1}")) {
			throw new InvalidAgeException("Not a valid DL");
		}

		return true;
	}


	public boolean isValidPassportNumber(String Passport) throws BusinessException {

		if(!Passport.matches("[0-9]{10}")) {
			throw new BusinessException("Entered Passport "+Passport+" is INVALID");
		}

		return true;
	}
}
