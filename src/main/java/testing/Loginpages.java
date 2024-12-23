package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpages {

	public static WebDriver driver;
	
	
	public static WebElement email()
	{
		WebElement email=driver.findElement(By.xpath("//input[@name='email1']"));
		return email;
		
	}
	public static WebElement password()
	{
		WebElement password=driver.findElement(By.xpath("//input[@name='password1']"));
		return password;
		
	}
	public static WebElement signIn()
	{
		WebElement signIn=driver.findElement(By.xpath("//button[text()='Sign in']"));
		return signIn;
		
	}
	
	
}
