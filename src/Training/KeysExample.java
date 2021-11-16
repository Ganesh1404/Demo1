package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysExample
{

	public static void main(String[] args)
	{


		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.google.com/");
        WebElement element= driver.findElement(By.name("q"));
        
        element.sendKeys("Selenium");
        element.sendKeys(Keys.RETURN);
	}
	

}