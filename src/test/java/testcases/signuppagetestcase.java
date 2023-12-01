package testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.baseclass;
import pageobjectmodel.signuppageobject;

public class signuppagetestcase extends baseclass {
	

	@Test
	public void signuppage() throws IOException {
		initializedriver();

		signuppageobject spo = new signuppageobject(driver);
		spo.signup();
		System.out.println("done");
	}

}
