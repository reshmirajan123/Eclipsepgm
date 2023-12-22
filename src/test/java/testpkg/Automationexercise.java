package testpkg;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Automationsignuppage;

public class Automationexercise {
	ChromeDriver driver;
	String baseurl="https://automationexercise.com/";
	//Automationsignuppage ob;
	@BeforeTest
	public void setUp() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		Thread.sleep(3000);
	}
@Test
public void signuppage()
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	Automationsignuppage ob=new Automationsignuppage(driver);
	ob.signupClick();
	ob.signupWindow("APPU", "app@89gmail.com");
	ob.signUppage("Appu@123","AKHIL","SIDHARTHAN","HOLIDAYS INN","BUR DUBAI","UAE","KERALA","THRISSUR","680103","9785756740");
	
	
	
}

}
