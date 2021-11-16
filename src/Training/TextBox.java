package Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox 
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver;
        driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");
        
  //   WebElement userid = driver.findElement(By.id("email"));
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     WebElement userid2 = driver.findElement(By.xpath("//input[@id='email']"));
        userid2.sendKeys("abc@gmail.com");
        Thread.sleep(4000);
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("abc@3456");
        Thread.sleep(4000);
        WebElement login=driver.findElement(By.name("login"));
        		login.click();
        		 Thread.sleep(4000);
        		 driver.close();
	}

}