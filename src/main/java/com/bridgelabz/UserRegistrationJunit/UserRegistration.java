package com.bridgelabz.UserRegistrationJunit;

import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;

/*
 * Check user first name with regex
 */
public class UserRegistration {
	// method for check first Name pattern
	public String firstName(String fname) throws CustomException.InvalidFirstName {
		String regexCheck = "^[A-Z]{1}[a-z]{2,}$";
		Pattern p = Pattern.compile(regexCheck);
		Matcher m = p.matcher(fname);
		if (m.matches()) {
			return fname;
		}
		throw new CustomException.InvalidFirstName("Error");
	}

	// method for check last Name pattern
	public String lastName(String lname) throws CustomException.InvalidLastName {
		String regexCheck = "^[A-Z][a-z]{2,}$";
		Pattern p = Pattern.compile(regexCheck);
		Matcher m = p.matcher(lname);
		if (m.matches()) {
			return lname;
		}
		throw new CustomException.InvalidFirstName("Error");
	}

	// method for checking password
	public String password(String password) throws CustomException.InvalidLastName {
		String regexCheck = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!#@%^&*(){}])[a-zA-Z0-9+-_!@#$%^&*(){}'.,]{8,}$";
		Pattern p = Pattern.compile(regexCheck);
		Matcher m = p.matcher(password);
		if (m.matches()) {
			return password;
		}
		throw new CustomException.InvalidFirstName("Error");
	}

	// method for checking email pattern
	public String email(String email) throws CustomException.InvalidLastName {
		String regexCheck = "^[a-z.+_-]+[.a-z0-9]*+@[a-z0-9]+[.a-z]+[.a-z0-9]*$";
		Pattern p = Pattern.compile(regexCheck);
		Matcher m = p.matcher(email);
		if (m.matches()) {
			return email;
		}
		throw new CustomException.InvalidFirstName("Error");
	}

	// method for checking mobile number
	public String mobileNumber(String mobileNumber) throws CustomException.InvalidLastName {
		String regexCheck = "^[0-9]{2}+[ ][0-9]{10}$";
		Pattern p = Pattern.compile(regexCheck);
		Matcher m = p.matcher(mobileNumber);
		if (m.matches()) {
			return mobileNumber;
		}
		throw new CustomException.InvalidFirstName("Error");
	}

}
