package testing;

import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.InstantiateDriver;
import pages.LoginPage;
import pages.LoginPage2;
import utility.Screenshot;

public class TC_001_Login_validation_Positive_data extends InstantiateDriver {
	
	@Test
	public void  tc001() throws IOException
	{
		List<WebElement> allE  = driver.findElementsByClassName("inputtext");
		for(WebElement e : allE)
		{
			e.sendKeys("Hello");
		}
	
	}
	
	
	
	
	
	
	
	
}
