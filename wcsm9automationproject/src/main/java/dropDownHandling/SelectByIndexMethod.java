package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectByIndexMethod {
	public static void main(String[] args) {
		
	
			 WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 
			 driver.get("http://demoapps.qspiders.com/");
			 
			 //identify dropDown option and click
			 driver.findElement(By.xpath("//section[text()='Dropdown']"));
			 
			 //identify the phone no dropDown
			 WebElement dropDown1=driver.findElement(By.xpath(""));
			 //select the options
			 
			 
			}
		
		

		


	}


