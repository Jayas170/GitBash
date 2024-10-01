package com.demoapp.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavaScriptPage {
	WebDriver driver;
	public JavaScriptPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	@FindBy(linkText = "Default Alert")
	private WebElement defaultalertLink;
	
	@FindBy(linkText = "Confirm")
	private WebElement confirmLink;
	
	@FindBy(linkText = "Prompt")
	private WebElement promptLink;
	
	
	public WebElement getDefaultalertLink() {
		return defaultalertLink;
	}

	public WebElement getConfirmLink() {
		return confirmLink;
	}

	public WebElement getPromptLink() {
		return promptLink;
	}
	
	//default alert page element
	@FindBy(xpath = "//button[text()='Alert Box']")
	private WebElement alertboxBtn;
	
	
	
	@FindBy(xpath = "//button[text()='Confirm Box']")
	private WebElement confirmboxBtn;
	
	
	@FindBy(xpath = "//button[text()='Prompt Alert Box']")
	private WebElement promptalertboxBtn;
	public WebElement getAlertboxBtn() {
		return alertboxBtn;
	}

	public WebElement getConfirmboxBtn() {
		return confirmboxBtn;
	}

	public WebElement getPromptalertboxBtn() {
		return promptalertboxBtn;
	}
	
	
	
	
	

}
