import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpanElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Java training\\SDET_Project\\Orange_26\\src\\test\\resources\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("QSpiders");
//		Thread.sleep(5000);
		List<WebElement>	li=	 driver.findElements(By.xpath("//span[contains(text(),'QSpiders')]"));
		
		 
//		Thread.sleep(5000);
		 
		int count=li.size();
//		Thread.sleep(5000);
		 
		System.out.println(count);
		 
		for(int i=0;i<count;i++)
		{
//			Thread.sleep(5000);
		 
			// System.out.println(li.get(i).getText());
			WebElement element=li.get(i);
			String str=element.getText();
			if(str.equals("qspiders hyderabad"))
			{
				element.click();
				break;
			}
		}
		 
		}


	}


