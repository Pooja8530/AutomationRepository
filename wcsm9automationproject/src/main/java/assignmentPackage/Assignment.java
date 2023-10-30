package assignmentPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ebay.com/");
		driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("Apple Watches");
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		
		
	}

}
