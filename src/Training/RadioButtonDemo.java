package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonDemo 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.navigate().to("https://www.calculator.net/mortgage-payoff-calculator.html");
        driver.manage().window().maximize();
        
        System.out.println("IsSelected Output Before Click: "+driver.findElement(By.id("cpayoff3")).isSelected());
        driver.findElement(By.id("cpayoff3")).click();
        System.out.println("IsSelected Output After Click: "+driver.findElement(By.id("cpayoff3")).isSelected());
        System.out.println("IsEnabled Output: "+driver.findElement(By.id("cpayoff3")).isEnabled());
        
	}

}