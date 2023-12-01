package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Resources.constant;

public class signuppageobject {
	public WebDriver driver;

	private By firstname=By.xpath("//input[@name='UserFirstName']");
	private By lastname=By.xpath("//input[@name='UserLastName']");
	private By jobtitle=By.xpath("//input[@name='UserTitle']");
	private By email=By.xpath("//input[@name='UserEmail']");
	private By employees=By.xpath("//select[@name='CompanyEmployees']");
	
	public signuppageobject(WebDriver driver2) {
		this.driver=driver2;
	}

	public void signup() {
		loginpageobject lpo=new loginpageobject(driver);
		lpo.tryforFree();
		 
		
		
		WebElement a=driver.findElement(firstname);
		a.sendKeys(constant.FN);
		WebElement b=driver.findElement(lastname);
		b.sendKeys(constant.LN);
		WebElement c=driver.findElement(jobtitle);
		b.sendKeys(constant.JT);
		WebElement d=driver.findElement(email);
		b.sendKeys(constant.MAIL);
	}

}
