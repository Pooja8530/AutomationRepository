package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayNMethod {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-81k9eua/login.do");
		//identify username text box and pass admin
		
		driver.findElement(By.name("username")).sendKeys("admin");
		//identify password text box and pass manager
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//identify login button and click
		driver.findElement(By.id("loginButton")).click();
		
		//identify logout link for verify
		WebElement logoutLinkElement = driver.findElement(By.partialLinkText("Logout"));
		
		//check logoutLinkElement is display or not
		boolean status = logoutLinkElement.isDisplayed();
	    System.out.println(status);
	}

}
