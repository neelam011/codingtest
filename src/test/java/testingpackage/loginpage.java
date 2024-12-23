package testingpackage;
import org.openqa.selenium.WebDriver;

//import org.openqa.selenium.WebDriver;
import testing.Loginpages;

public class loginpage extends Loginpages
{
	public static WebDriver driver;
	public static void loginDetail(String email,String password) 
	{
		email().sendKeys(email);
		Loginpages.password().sendKeys(password);
		Loginpages.signIn().click();
		
		
	}
}
