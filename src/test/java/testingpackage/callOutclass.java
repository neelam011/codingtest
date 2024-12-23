package testingpackage;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class callOutclass extends baseClass{
	
	public void firstDemo() throws InterruptedException
	{
		baseClass.urlOpen("https://freelance-learn-automation.vercel.app/login");
		
		try {
		driver.findElement(By.linkText("New user? Signup")).click();
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, "https://freelance-learn-automation.vercel.app/signup");
		
		
		if(url.contains("signup"))
		{
			System.out.println("verified sign url we are on right page");
		}
		else
		{
			System.out.println("we are not on right page ");
		}
		
		WebElement signup=driver.findElement(By.xpath("//button[text()='Sign up']"));
		boolean Signupvalue=signup.isEnabled();
		
		
		
		if(Signupvalue=false)
		{
			System.out.println("sign up button is disbale");
		}
		else{
			System.out.println("sign up button not is disbale");
		}
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("neelam");
		//System.out.println(driver.findElement(By.xpath("//input[@name='name']")).getText());
		System.out.println(driver.findElement(By.xpath("//input[@name='name']")).getAttribute("value"));
		
		
		Random r=new Random();
		int i=r.nextInt();
		String s="neelam"+i+"@gmail.com";
		System.out.println(s);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(s);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
		
		
		driver.findElement(By.xpath("//label[text()='Cypress']")).click();

		driver.findElement(By.xpath("//label[text()='Selenium']")).click();
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		Select state=new Select(driver.findElement(By.xpath("//select[@id='state']")));
		state.selectByValue("Maharashtra");
		
		
		Select hobbies=new Select(driver.findElement(By.xpath("//select[@id='hobbies']")));
		hobbies.selectByValue("Swimming");
		hobbies.selectByValue("Dancing");
		
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		System.out.println(Signupvalue);
		boolean Signupvalue1=signup.isEnabled();
		
		if(Signupvalue1==true)
		{
			System.out.println(Signupvalue1);
			//signup.click();
			
			JavascriptExecutor js1=(JavascriptExecutor)driver;
			js1.executeScript("arguments[0].click()",signup);
			
			String text1=driver.getTitle();
			System.out.println("test is"+text1);
			if(text1.contains("Learn Automation"))
			{
				System.out.println("Signup successfully, Please login");
			}	
			else {
				System.out.println("no successfully login");
			}
		}
		
		} 
		finally
		{
		driver.quit();	
		}			
	}
}
