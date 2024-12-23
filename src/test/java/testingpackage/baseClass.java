package testingpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass {
	static WebDriver driver;
	public static void urlOpen(String url)
	{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get(url);
	String currentUrl=driver.getCurrentUrl();
	System.out.println(currentUrl);
	
	}
}
