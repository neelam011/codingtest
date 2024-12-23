package testingpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testing.Loginpages;

public class ProjectTwo extends baseClass{

	
	public void projectTwoMethod() throws InterruptedException {
	baseClass.urlOpen("https://freelance-learn-automation.vercel.app/login");
	driver.findElement(By.xpath("//input[@name='email1']")).sendKeys("admin@email.com");
	driver.findElement(By.xpath("//input[@name='password1']")).sendKeys("admin@123");
	driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	
	
	Actions action=new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//span[text()='Manage']"))).click().build().perform();
	action.moveToElement(driver.findElement(By.xpath("//img [@src='/static/media/manageCourse.3bf05cd7c6dfce38e821191d49edb094.svg']"))).click().build().perform();
	driver.findElement(By.xpath("//button[text()='Add New Course ']")).click();
	driver.findElement(By.xpath("//input[@name='thumbnail']")).sendKeys("/Users/rahulkadam/Desktop/Screenshot 2024-11-19 at 5.21.16 PM.png");
	driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Selenium With Python");
	driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium With Python");
	driver.findElement(By.xpath("//input[@id='instructorNameId']")).sendKeys("Mukesh Otwani");
	driver.findElement(By.xpath("//input[@id='price']")).sendKeys("12000");
	driver.findElement(By.xpath("//input[@name='startDate']")).click();
	driver.findElement(By.xpath("//div[text()='21']")).click();
	
	driver.findElement(By.xpath("//input[@name='endDate']")).click();
	driver.findElement(By.xpath("//div[text()='16']")).click();
	
	
	driver.findElement(By.xpath("//div[text()='Select Category']")).click();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,980)");
	
	WebElement save=driver.findElement(By.xpath("//button[text()='Save']"));
	js.executeScript("arguments[0].scrollIntoView(true)",save);
	Thread.sleep(1000);
	List<WebElement> l1=driver.findElements(By.xpath("//div[@class='menu-items']"));
	for(WebElement l2:l1)
	{
		System.out.println(l2.getText());
		
		if(l2.getText().contains("Playwright caute"))
		{
			l2.click();
			break;
		}
	}
	save.click();
	
	
}}
