package Training;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExWait 
{

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.id("timerAlertButton")).click();
		System.out.println("Button clicked but alert not present yet, alert triggered");
        WebDriverWait wait = new WebDriverWait(driver,10);
        Alert alert=wait.until(ExpectedConditions.alertIsPresent());
        Thread.sleep(10000);
        alert.accept();
        Thread.sleep(10000);
        System.out.println("Alert is accepted");
        driver.close();
	}

}