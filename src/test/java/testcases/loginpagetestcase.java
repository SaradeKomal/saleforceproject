package testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Resources.baseclass;
import Resources.constant;
import pageobjectmodel.loginpageobject;

public class loginpagetestcase extends baseclass {
	@Test
	public void loginpage() throws IOException {
		initializedriver();
		loginpageobject lpo=new loginpageobject(driver);
		lpo.verifylogin();
		
		System.out.println(lpo.errorText());
		SoftAssert assertion=new SoftAssert();
		assertion.assertEquals(lpo.errorText(), constant.ET);
	}
 
}
