package Training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllLinks {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://www.calculator.net/");
        
        driver.manage().window().maximize();
        
       List<WebElement> links=driver.findElements(By.tagName("a"));
       System.out.println("Number of links: "+links.size());

       for(int i=1;i<links.size();i++)
       {
    	   System.out.println("Name of the Link is: "+links.get(i).getText());
       }
       driver.close();
	}

}