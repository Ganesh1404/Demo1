package Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScroll {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        
        driver.get("https://en.wikipedia.org/wiki/Wikipedia");
        Thread.sleep(5000);
        
        //scroll till a particular element
       WebElement element = driver.findElement(By.id("Rules_and_laws_governing_content"));
      // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        
		//scroll to bottom
    //   ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
       
       //scroll based on some cordinates
     //  ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,600)");
       
       
       driver.navigate().to("https://www.google.com/.");
       WebElement element2 = driver.findElement(By.name("q"));
       ((JavascriptExecutor) driver).executeScript("arguments[0].value='L&T';",element2);
       Thread.sleep(3000);
       ((JavascriptExecutor) driver).executeScript("alert('Welcome to L&T');");
	}

}