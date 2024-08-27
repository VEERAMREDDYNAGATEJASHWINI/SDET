import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Java training\\SDET_Project\\Orange_26\\src\\test\\resources\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/books");
		Select sel=new Select(driver.findElement(By.xpath("//select[@id='products-orderby']")));
		sel.selectByIndex(3);
		

		
		List<WebElement> li	=sel.getOptions();
		
		int count=li.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			System.out.println(li.get(i).getText());
		}
		
	}
}	