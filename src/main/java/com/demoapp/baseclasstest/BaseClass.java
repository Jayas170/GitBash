package com.demoapp.baseclasstest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	public static WebDriver driver;
	@BeforeSuite
	public void configBS() {
		System.out.println("=====Connect to DB=====");
	}
	
	@BeforeClass
	public void configBC() {
		System.out.println("===Launch Browser===");
		String Browser="Chrome";
		if(Browser.equals("Chrome")) {
			driver=new ChromeDriver();	
		}else if(Browser.equals("Edge")) {
			driver=new EdgeDriver();
		}else if (Browser.equals("Firefox")) {
			driver=new FirefoxDriver();
		}else {
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void configBM() {
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("=====Navigate to App=====");
	}
	
	@AfterMethod
	public void configAM() {
		System.out.println("===Close App===");
	}
	@AfterClass
	public void configAC() {
		driver.close();
		System.out.println("===Close Browser====");
	}
	
	@AfterSuite
	public void configAS() {
		System.out.println("=====Disconnect to DB====");
	}
}
