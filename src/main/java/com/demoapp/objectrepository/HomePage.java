package com.demoapp.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	@FindBy(xpath = "//section[text()='Popups']")
	private WebElement popupsDd;
	
	@FindBy(xpath = "//section[text()='Javascript']")
	private WebElement javascriptLink;
	
	@FindBy(xpath = "//section[text()='Browser Windows']")
	private WebElement browseriwndowsLink;
	
	@FindBy(xpath = "//section[text()='Authentication']")
	private WebElement authenticationLink;
	
	@FindBy(xpath = "//section[text()='File Uploads']")
	private WebElement fileuloadsLink;
	
	@FindBy(xpath = "//section[text()='Modal']")
	private WebElement modalLink;

	public WebElement getPopupsDd() {
		return popupsDd;
	}

	public WebElement getJavascriptLink() {
		return javascriptLink;
	}

	public WebElement getBrowseriwndowsLink() {
		return browseriwndowsLink;
	}

	public WebElement getAuthenticationLink() {
		return authenticationLink;
	}

	public WebElement getFileuloadsLink() {
		return fileuloadsLink;
	}

	public WebElement getModalLink() {
		return modalLink;
	}
	
	
	
}
