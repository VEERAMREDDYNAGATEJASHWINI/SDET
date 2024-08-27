import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

		
public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Java training\\SDET_Project\\Orange_26\\src\\test\\resources\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");//OPENS REGISTRATION PAGE
		driver.findElement(By.name("First name")).sendKeys("tej");
		driver.findElement(By.name("Last name")).sendKeys("Nag");
		driver.findElement(By.id("Email")).sendKeys("vntsr26@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("234567");
		driver.findElement(By.name("Confirm Password")).sendKeys("234567");
		driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]")).click();

	}

}
