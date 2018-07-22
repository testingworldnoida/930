package pages;

import java.util.ResourceBundle;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	ChromeDriver driver;
	ResourceBundle rb ;
	public LoginPage(ChromeDriver driver)
	{
		this.driver=driver;
		rb  =ResourceBundle.getBundle("Element");
	}
	
	public void enterUsername(String uname)
	{
	
		driver.findElementById(rb.getString("login_username_id")).sendKeys(uname);
	}
	
	public void enterPassword(String pass)
	{
		driver.findElementById(rb.getString("login_password_id")).sendKeys(pass);
	}
	
	public void clickSigni()
	{
		String v  = rb.getString("login_signin.xpath").replace("RRRRR", "fdF");
		driver.findElementByXPath("//input[@type='submit']").click();
	}

}
