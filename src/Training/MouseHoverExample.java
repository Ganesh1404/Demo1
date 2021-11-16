package Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium files\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        
        Thread.sleep(5000);
        Actions action=new Actions(driver);
        WebElement element = driver.findElement(By.linkText("Electronics"));
        action.moveToElement(element).build().perform();
        
        Thread.sleep(5000);
        WebElement element2 = driver.findElement(By.linkText("Apple"));
        action.moveToElement(element2).click().build().perform();
        Thread.sleep(3000);
        System.out.println("OK");
        driver.close();        

	}

}