package Training;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChildWindow {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        
        driver.get("https://demoqa.com/browser-windows");
       
        //open child windows
   
        driver.findElement(By.id("windowButton")).click();
        driver.findElement(By.id("messageWindowButton")).click();
        driver.findElement(By.id("tabButton")).click();
        
       String mainWindowHandle= driver.getWindowHandle();
       
       System.out.println("Main Window Handle: "+mainWindowHandle);
       
       Set<String> allWindowHandles = driver.getWindowHandles();
       
       System.out.println("Child Window Handles are: "+allWindowHandles);
       
       Iterator<String> iterator=allWindowHandles.iterator();
       while(iterator.hasNext()) {
    	   String ChildWindow=iterator.next();
    	   if(!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
    		   driver.switchTo().window(ChildWindow);
    		   driver.close();
    		   System.out.println("Child Window is closed");
    		   
    	   }
       }
       
	}

}