package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseclass {
	public WebDriver driver;
	public void initializedriver() throws IOException {
		FileInputStream fis=new FileInputStream("./src/resources/java/Resources/data.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String browsername=prop.getProperty("browser");
		if(browsername.trim().equalsIgnoreCase("chrome")){
			driver=new ChromeDriver();
		}
		else if(browsername.trim().equalsIgnoreCase("edge")){
			driver=new EdgeDriver();
		}
		else if(browsername.trim().equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
		}else {
			System.out.println("enter corect browser");
		}
		String urlname=prop.getProperty("url");
		driver.get(urlname);
		driver.manage().window().maximize();
	}

}
