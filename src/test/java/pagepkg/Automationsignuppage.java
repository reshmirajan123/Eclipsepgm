package pagepkg;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Automationsignuppage {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
	WebElement signupbutton;
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")
	WebElement signupname;
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")
	WebElement signupemail;
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[3]/div/form/button")
	WebElement signbutton;
	@FindBy(xpath="//*[@id=\"id_gender1\"]")
	WebElement radiobutton;
	@FindBy(id="password")
	WebElement password;
	@FindBy(xpath="//*[@id=\"days\"]")
	WebElement dayelement;
	@FindBy(xpath="//*[@id=\"months\"]")
	WebElement monthelement;
	@FindBy(xpath="//*[@id=\"years\"]")
	WebElement yearelement;
	@FindBy(id="first_name")
	WebElement fname;
	@FindBy(id="last_name")
	WebElement lname;
	@FindBy(name="company")
	WebElement companyname;
	@FindBy(id="address1")
	WebElement adrs1;
	@FindBy(id="address2")
	WebElement adrs2;
	@FindBy(id="country")
	WebElement countryelement;
	@FindBy(id="state")
	WebElement state;
	@FindBy(id="city")
	WebElement city;
	@FindBy(id="zipcode")
	WebElement zip;
	@FindBy(id="mobile_number")
	WebElement mobile;
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div/div[1]/form/button")
	WebElement createaccount;
	
	
	
	// create constructor
	
	
	public Automationsignuppage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void signupClick()
	{
		signupbutton.click();
	}
	public void signupWindow(String name,String email)
	{
		signupname.sendKeys(name);
		signupemail.sendKeys(email);
		signbutton.click();
		
	
	}
	public void signUppage(String pswd,String firstn,String lastn,String comp,String address1,String address2,String st,String ct,String code,String mob)
	{
		radiobutton.click();
		password.sendKeys(pswd);
		Select day=new Select(dayelement);
		List<WebElement> dayscount=day.getOptions();
		day.selectByValue("19");
		Select month=new Select(monthelement);
		List<WebElement> monthsname=month.getOptions();
		month.selectByVisibleText("August");
		Select year=new Select(yearelement);
		List<WebElement> yearsvalue=year.getOptions();
		year.selectByValue("1998");
		fname.sendKeys(firstn);
		lname.sendKeys(lastn);
		companyname.sendKeys(comp);
		adrs1.sendKeys(address1);
		adrs2.sendKeys(address2);
		Select country=new Select(countryelement);
		List<WebElement> countryname=country.getOptions();
		country.selectByVisibleText("India");
		state.sendKeys(st);
		city.sendKeys(ct);
		zip.sendKeys(code);
		mobile.sendKeys(mob);
		createaccount.click();
	}

}
