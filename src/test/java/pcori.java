import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pcori {

    public static void main(String[] args) {
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    	
        WebDriver driver = new ChromeDriver();

        driver.get("https://pcori--pqt.sandbox.my.salesforce.com/");
        driver.manage().window().maximize();

        WebElement uname = driver.findElement(By.xpath("//input[@id='username']"));
        uname.sendKeys("sthota.ct@pcori.org");

        WebElement pwd = driver.findElement(By.xpath("//input[@name='pw']"));
        pwd.sendKeys("Prolifics@2025S");
        driver.findElement(By.xpath("//input[@name='pw']")).click();

        String title = driver.getTitle();
        System.out.println("page title is " + title);

        driver.quit();
    }
}
