package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		
        driver.navigate().to("https://www.calculator.net/interest-calculator.html");
        driver.manage().window().maximize();
        
        Select dropdown=new Select(driver.findElement(By.id("ccompound")));
        
        //Select by Visible Text
    //    dropdown.selectByVisibleText("continuously");
        
        //Select By Value
      //  dropdown.selectByValue("daily");
        
        
        //Select By Index
        dropdown.selectByIndex(2);

	}

}