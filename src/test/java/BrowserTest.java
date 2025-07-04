import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//commited 
public class BrowserTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 WebElement email = driver.findElement(By.xpath("//input[contains(@placeholder, 'Email')]"));
		 email.sendKeys("sridhrao1@gmail.com");
		 WebElement pwd = driver.findElement(By.xpath("//input[@id='pass']"));
		 pwd.sendKeys("test");
		 WebElement login = driver.findElement(By.xpath("//button[contains(text(),'Log In')]"));
		 login.click();
		 driver.get("https://www.facebook.com/");
		 WebElement fpwd= driver.findElement(By.xpath("//a[contains(text(),'Forgot password?')]"));
		 fpwd.click();
		 WebElement email1= driver.findElement(By.xpath("//label//input[contains(@placeholder, 'Email')]"));
		 email1.sendKeys("email@email.com");
		 WebElement pwd2 = driver.findElement(By.xpath("//input[@name='pass']"));
		 
		 pwd2.sendKeys("test");
		 //WebElement login1= driver.findElement(By.xpath("//span[contains(text(),'Log In')]]"));
		 //login1.click();
		 WebElement cancel = driver.findElement(By.xpath("//a[contains(text(),'Cancel')]"));
		 cancel.click();
		 driver.close();
		
		 
		 }
}
