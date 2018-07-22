package utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void takeScreenshot(ChromeDriver driver, String name) throws IOException
	{
		 Date d = new Date();
		 
		 File f = driver.getScreenshotAs(OutputType.FILE);
		 File f2 = new File("./Snapshots/"+d.getDate()+"/" +  name+".png");
		 FileUtils.copyFile(f, f2);
	}
	
	
}
