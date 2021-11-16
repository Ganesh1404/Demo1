package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.navigate().to("https://www.calculator.net/mortgage-calculator.html");
        driver.manage().window().maximize();
        
        System.out.println(driver.findElement(By.id("caddoptional")).isSelected());
        
        driver.findElement(By.id("caddoptional")).click();
        Thread.sleep(5000);
        System.out.println(driver.findElement(By.id("caddoptional")).isSelected());

        System.out.println(driver.findElement(By.id("caddoptional")).isEnabled());
        driver.quit();
	}

}