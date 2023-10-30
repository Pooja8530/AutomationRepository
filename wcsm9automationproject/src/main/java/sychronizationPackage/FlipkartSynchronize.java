package sychronizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSynchronize {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//span[text()='x']")).click();
		driver.findElement(By.xpath("//a[@class='_krdK5' and(@title='Cart')]")).click();
        //Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'_2')]")).click();
		//driver.quit();
	}

}
