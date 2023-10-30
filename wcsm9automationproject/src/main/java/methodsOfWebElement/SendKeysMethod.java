package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-81k9eua/login.do");
		Thread.sleep(2000);
		
		 WebElement usernameTB = driver.findElement(By.name("username"));
		 usernameTB.sendKeys("admin");
		 Thread.sleep(2000);
		 
		 WebElement passwordTB = driver.findElement(By.name("password"));
		 passwordTB.sendKeys("manager");
		 Thread.sleep(2000);
		 
		 usernameTB.clear();
		 Thread.sleep(2000);
		 passwordTB.clear();
		 
		 //click on check box
		 //driver.findElement(By.name("remember")).click();
		 //Thread.sleep(2000);
		 //click on the login button
		 //driver.findElement(By.name("login button")).click();
		
	}

}
 