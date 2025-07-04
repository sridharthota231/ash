import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class pcori {
	///commtne
	@Test
	public static void main() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://pcori--pqt.sandbox.my.salesforce.com/");
		driver.manage().window().maximize();
		WebElement uname=driver.findElement(By.xpath("//input[@id='username']"));
		
		uname.sendKeys("sthota.ct@pcori.org");
		WebElement pwd = driver.findElement(By.xpath("//input[@name='pw']"));
		pwd.sendKeys("Prolifics@2025S");
		driver.findElement(By.xpath("//input[@name='pw']")).click();
		String title =driver.getTitle();
		System.out.println("page title is " +title); /// test 
		
		driver.quit();
		
		
	}

}
