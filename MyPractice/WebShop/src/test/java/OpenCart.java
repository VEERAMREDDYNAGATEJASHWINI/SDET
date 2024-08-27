//------------https://www.opencart.com/------------

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenCart {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Java training\\SDET_Project\\Orange_26\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/");
		driver.findElement(By.xpath("//a[text()='Features']")).click();
		driver.findElement(By.xpath("//a[text()='Demo']")).click();
		driver.findElement(By.xpath("//a[text()='Marketplace']")).click();
		driver.findElement(By.xpath("//a[text()='Blog']")).click();
		driver.findElement(By.xpath("//a[text()='Download']")).click();
		driver.findElement(By.xpath("//a[text()='Resources']")).click();
		
		driver.findElement(By.xpath("(//a[contains(text(),'Demo')])[1]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Features')])[1]")).click();
	    driver.findElement(By.xpath("(//a[contains(text(),'Marketplace')])[1]")).click();
	    driver.findElement(By.xpath("(//a[contains(text(),'Blog')])[1]")).click();
	    driver.findElement(By.xpath("(//a[contains(text(),'Download')])[1]")).click();
	    driver.findElement(By.xpath("(//a[contains(text(),'Resources')])[1]")).click();
	    
	    
		driver.manage().window().maximize();
		
		
		driver.navigate().back();
		driver.findElement(By.xpath("//a[text()='Demo']")).click();
		driver.navigate().refresh();
		
		driver.close();

	}

}
