package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SenkeysMethod1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-81k9eua/login.do");
		WebElement usnTB = driver.findElement(By.name("username"));
		Thread.sleep(2000);
		usnTB.sendKeys("admin");
		
		WebElement passTB = driver.findElement(By.name("pwd"));
		passTB.sendKeys("manager");
		Thread.sleep(2000);
		usnTB.clear();
		Thread.sleep(2000);
		passTB.clear();
		driver.findElement(By.name("remember")).click();
		
	}
}
