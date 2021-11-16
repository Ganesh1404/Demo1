package Training;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class ScreenshotDemo {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://www.google.com/");
		try {
        driver.findElement(By.name("tfytrtyrytrq")).sendKeys("Tests");

	}
		catch(Exception e) {
			System.out.println("There is an exception");
			
			File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//	FileUtils.copyFile(scrFile, new File("D:\\Training\\L&T\\Screenshot1.png"));
			FileHandler.copy(scrFile, new File("D:\\Training\\L&T\\Screenshot2.png"));
		}

}
}