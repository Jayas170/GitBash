package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwitchTowindow {
	
	@Test
	public void switchToWindow() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser/newTab?sublist=1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.xpath("//button[text()='Click to open multiple popup windows']")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}
	

}
