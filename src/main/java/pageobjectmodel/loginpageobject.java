package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;

import Resources.constant;

public class loginpageobject {
	private WebDriver driver;
	private By username=By.xpath("//input[@id='username']");
	private By password= By.xpath("//input[@id='password']");
	private By login= By.xpath("//input[@id='Login']");
	private By tryforfree=By.xpath("//a[@id='signup_link']");
	private By errortext=By.xpath("//div[@id='error']");
	
	
	
	public loginpageobject(WebDriver driver2) {
this.driver=driver2;	}
	
/*
 * @DataProvider() public Object[][] userdata() { return new Object[][] { {
 * "test", "1234" },{ "test234", "4567" } }; }
 * 
 * 
 * 
 * @DataProvider (dataProvider="userdata")
 */
	public void verifylogin() {
		WebElement a= driver.findElement(username);
		a.sendKeys(constant.USERNAME);
		WebElement b=driver.findElement(password);
		
		b.sendKeys(constant.PASSWORD);
		WebElement c=driver.findElement(login);
		c.click();
		
	}
	
	
	
	
	
	
	
	
	
	public WebElement Enterusername() {
		WebElement a= driver.findElement(username);
		a.sendKeys("test");
		return a ;
	}
	
	
	
	
	public WebElement clicklogin() {
		return driver.findElement(login);
	}
	public void tryforFree() {
		WebElement e=driver.findElement(tryforfree);
		e.click();
		
	}
	public String errorText() {
		String at=driver.findElement(errortext).getText();
		return at;
		
	}


}
