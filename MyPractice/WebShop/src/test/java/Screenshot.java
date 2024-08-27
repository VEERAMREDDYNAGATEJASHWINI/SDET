import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 
public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Java training\\SDET_Project\\Orange_26\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/");
		TakesScreenshot t = (TakesScreenshot)driver;
		File src=t.getScreenshotAs(OutputType.FILE);
	
		File dest = new File("C:\\Java training\\Sreenshot\\SS1.png");
		FileUtils.copyFile(src, dest);
 
						
 

	}

}
