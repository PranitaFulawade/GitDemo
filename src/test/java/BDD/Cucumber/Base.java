package BDD.Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {
	WebDriver driver;
	
	public void beforeClass()
	{
		System.setProperty("webdriver.edge.drive","E:\\CucumberTutorial\\ProjectX\\GitDemo\\src\\test\\java\\resources\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get("https://www.google.com/");
	}
	
	public void afterClass()
	{
		driver.quit();
	}

}
