import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.bridgelabz.UserRegistrationJunit.CustomException;
import com.bridgelabz.UserRegistrationJunit.UserRegistration;

import junit.framework.Assert;

public class UserRegistrationTest {
	UserRegistration userRegis = new UserRegistration();

	@SuppressWarnings("deprecation")
	@Test
	public void firstName() throws CustomException {
		String expected = userRegis.firstName("Shubham");
		String actualResult = "ddfghh";
		Assert.assertEquals(expected, actualResult);
	}

	@Test
	public void lastName() throws CustomException {
		String expected = userRegis.lastName("Saini");
		String actualResult = "Saini";
		Assert.assertEquals(expected, actualResult);
	}

	@Test
	public void mobileNumber() throws CustomException {
		String expected = userRegis.mobileNumber("81 7574838445");
		String actualResult = "91 6287348589";
		Assert.assertEquals(expected, actualResult);
	}

	@Test
	public void email() throws CustomException {
		String expected = userRegis.email("abc@gmail.co.in");
		String actualResult = "abc@gmail.co.in";
		Assert.assertEquals(expected, actualResult);
	}

	@Test
	public void password() throws CustomException {
		String expected = userRegis.password("#$%^$@SDffdd!");
		String actualResult = "#$%^$@SDffdd!";
		Assert.assertEquals(expected, actualResult);
	}

}
