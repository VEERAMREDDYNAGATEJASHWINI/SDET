import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Java training\\SDET_Project\\Orange_26\\src\\test\\resources\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("vntsr26@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("123456");
		driver.findElement(By.xpath("//label[text()='Remember me?']")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'COMPUTERS')])[1]")).click();
	}

}
