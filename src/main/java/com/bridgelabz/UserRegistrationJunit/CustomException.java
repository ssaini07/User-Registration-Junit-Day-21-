package com.bridgelabz.UserRegistrationJunit;

public class CustomException extends Exception{
    String message;

    public static class InvalidFirstName extends RuntimeException{
		public InvalidFirstName(String message) {
			super(message);
		}
	}
    public static class InvalidemailAddress extends RuntimeException{
		public InvalidemailAddress(String email) {
			super(email);
		}
	}
    public static class InvalidLastName extends RuntimeException{
		public InvalidLastName(String message) {
			super(message);
		}
	}
    
    public static class InvalidPassword extends RuntimeException{
		public InvalidPassword(String password) {
			super(password);
		}
	}
    public static class InvalidMobileNumber extends RuntimeException{
		public InvalidMobileNumber(String mobileNumber) {
			super(mobileNumber);
		}
	}
}
