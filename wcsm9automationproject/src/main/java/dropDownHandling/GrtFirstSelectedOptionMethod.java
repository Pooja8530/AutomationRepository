package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GrtFirstSelectedOptionMethod {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/DELL/Desktop/wcsm9/Dropdown.html");
		
		//single select Dropdown
		
		WebElement dropDown1 = driver.findElement(By.id("idddd"));
		
		//handle the Dropdown
		Select sel = new Select(dropDown1);
		//select the option from dropdown
		sel.selectByValue("v7");
	    Thread.sleep(2000);
		
		//get the option which is selected first
		WebElement firstOpt = sel.getFirstSelectedOption();
		//get the text of firstOpt
		
		System.out.println(firstOpt);
		//multi slect dropdown
		
		for(int i=5;i<8;i++)
		{
			Thread.sleep(2000);
			sel2.selectByIndex(i);
		}
		 
		//get option which is selected first
		
		Thread.sleep(2000);
		System.out.println(sel2.getFirstSelectedOption().getText());
		
		
		
		
	}

}
