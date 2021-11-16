package Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("C:\\Users\\ganes\\Desktop\\html\\Upload.html");
        
        WebElement element = driver.findElement(By.id("uploadfile1"));
        element.sendKeys("C:\\Selenium files\\Scrrenshot\\instagram.jpg");
	}

}