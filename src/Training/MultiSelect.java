package Training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect 
{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://demoqa.com/select-menu");
        
        //selecting multi-select element by locating using id
        Select select= new Select(driver.findElement(By.id("cars")));
		
        //Get the list of all the options
        System.out.println("List of all the options are: ");
        List<WebElement> options=select.getOptions();
        for(WebElement option:options)
        	System.out.println(option.getText());
        
        //isMultiple() to verify the element is multiselect
        if(select.isMultiple()) {
        	//select by index
        	System.out.println("Selecting by Index: ");
        	select.selectByIndex(2);
        	System.out.println("Selecting by Value: ");
        	select.selectByValue("saab");
        	System.out.println("Selecting by VisbileText: ");
        	select.selectByVisibleText("Audi");
        	
        	//get list of selected options
        	   List<WebElement> SelectedOptions=select.getAllSelectedOptions();
               for(WebElement SelectedOption:SelectedOptions)
               	System.out.println(SelectedOption.getText());
               
            //Deselecting based on Index
               System.out.println("Deselect Audi");
               select.deselectByIndex(3);
               //deselect by visible text
               select.deselectByVisibleText("Opel");
               
               //validate both values are deselected
               
              System.out.println("After deseleting values are: ");
              List<WebElement> selectedOptionsAfterDeselect=select.getAllSelectedOptions();
              for(WebElement selectedOptionAfterDeselect:selectedOptionsAfterDeselect)
            	  System.out.println(selectedOptionAfterDeselect.getText());
              
              //Deselect All
              
              select.deselectAll();     
              
        }
        
	}

}
