package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.demoapp.baseclasstest.BaseClass;
//import com.demoapp.objectrepository.HomePage;
import com.demoapp.objectrepository.JavaScriptPage;

public class JavaScriptTest extends BaseClass{
	
	@Test
	public void DefaultAlert() throws InterruptedException {
		Thread.sleep(5000);
//		HomePage hp=new HomePage(driver);
//		hp.getJavascriptLink().click();
		
		JavaScriptPage jp=new JavaScriptPage(driver);
		jp.getDefaultalertLink().click();
		jp.getAlertboxBtn().click();
		driver.switchTo().alert().accept();
		
		}
	
	@Test
	public void Confirm() {
//		HomePage hp=new HomePage(driver);
//		hp.getPopupsDd().click();
		
		JavaScriptPage jp=new JavaScriptPage(driver);
		jp.getConfirmLink().click();
		jp.getConfirmboxBtn().click();
		driver.switchTo().alert().dismiss();
	}
	
	@Test
	public void Prompt() throws InterruptedException {
//		HomePage hp=new HomePage(driver);
//		hp.getPopupsDd().click();
		Thread.sleep(5000);
		JavaScriptPage jp=new JavaScriptPage(driver);
		driver.findElement(By.linkText("Prompt")).click();
		Thread.sleep(5000);
		Alert alter = driver.switchTo().alert();
		WebElement prompt = driver.findElement(By.id("buttonAlert1"));
		prompt.click();
		Thread.sleep(5000);
		prompt.sendKeys("yes");
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
	}

}
