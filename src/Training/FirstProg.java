package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirstProg {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		
/*		System.setProperty("webdriver.gecko.driver", "D:\\Soft_Dumps\\Selenium\\support\\Nov21\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();*/
        
    //    System.setProperty("webdriver.ie.driver", "D:\\Soft_Dumps\\Selenium\\support\\Nov21\\IEDriverServer.exe");
    //    System.setProperty("webdriver.ie.driver", "D:\\Soft_Dumps\\Selenium\\support\\32bit\\IEDriverServer.exe");
    //    WebDriver driver = new InternetExplorerDriver();
		
		
	/*	System.setProperty("webdriver.edge.driver", "D:\\Soft_Dumps\\Selenium\\support\\Nov21\\msedgedriver.exe");
		
	//	WebDriver driver = new EdgeDriver();*/
      //  driver.get("https://petstore.octoperf.com/");
        
  //      driver.findElement(By.linkText("Enter the Store")).click();
 //       driver.findElement(By.partialLinkText("Enter")).click();
        Thread.sleep(4000);
		
/*		driver.get("https://petstore.octoperf.com/actions/Account.action?signonForm=");
		Thread.sleep(3000);
	//	driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("j2ee");
		
		//driver.findElement(By.id("stripes--902352439")).sendKeys("j2ee");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).clear();
		Thread.sleep(3000);
	    driver.findElement(By.name("password")).sendKeys("j2ee");
	    Thread.sleep(3000);
	    driver.findElement(By.name("signon")).click();
	    Thread.sleep(3000);   */
	    
	 /*   System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.getPageSource());
     
	    driver.navigate().to("https://petstore.octoperf.com/actions/Account.action?signonForm=");
	    driver.navigate().refresh();
	    driver.navigate().back();
	    driver.navigate().forward();*/
	    
        driver.get("https://blazedemo.com/");
        Thread.sleep(15000);
        driver.findElement(By.cssSelector(".btn-primary")).click();
       // driver.quit();
        
       
        //driver.close();
	}

}
