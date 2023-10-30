package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation_GetSize_GetRect_Methods {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://demoapps.qspiders.com/");
		
		//identify email text box
		WebElement emailTextBox = driver.findElement(By.cssSelector("Input Email"));
		
		//get the location email text box
		Point loc = emailTextBox.getLocation();
		
		int xaxix = loc.getX();
		int yaxis = loc.getY();
		System.out.println("location of email text box :"+xaxix+" :+yaxix");
		
		//get the size of email text box
		Dimension size = emailTextBox.getSize();
		
		int hight=size.getHeight();
		int Width=size.getWidth();
		
		System.out.println(emailTextBox.getCssValue.("hight"))+" "+emailTextBox.getCssValue.("width");
		
		
		
		
		
		
	}

}
