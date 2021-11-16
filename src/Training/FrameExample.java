package Training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class FrameExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.get("C:\\Users\\ganes\\Desktop\\html\\IFrame.html");
        
        //Getting all frames by executing JavaScript
        JavascriptExecutor exe = (JavascriptExecutor) driver;
        Integer numberOfFrames=Integer.parseInt(exe.executeScript("return window.length").toString());
        System.out.println("The total no of Frames are: "+numberOfFrames);
		
        //By finding all the web elements using iframe tag
        List<WebElement> iFrameElements=driver.findElements(By.tagName("iframe"));
        System.out.println("Number of iFrame Elements are : "+iFrameElements.size());
        
        //Switch By Index
        driver.switchTo().frame(0);
        //print the frame source code
        System.out.println("Frame Source: "+driver.getPageSource());
        
        driver.switchTo().defaultContent();
        System.out.println("Main Page Source: "+driver.getPageSource());
        
        //Switch By Name
        driver.switchTo().frame("iframe2");
        System.out.println("Frame2 Source: "+driver.getPageSource());
        
        driver.switchTo().defaultContent();
        
        //Switch by Id
        driver.switchTo().frame("IF1");
        System.out.println("Frame Source using ID: "+driver.getPageSource());
        
        driver.switchTo().defaultContent();
        driver.close();
	}

}