package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

public class LoginPage extends BaseClass {

	@FindBy(xpath="//a[@class='ico-login']")
	WebElement loginLink;
	
	
	@FindBy(id = "Email")
	WebElement email;
	
	@FindBy(id = "Password")
	WebElement password;
	
	@FindBy(xpath = "//div[@class='buttons']//input[@type='submit']")
	WebElement loginBtn;
	
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}


	public void loginFunctionality(){
		
		loginLink.click();
		email.sendKeys("meenu@gmail.com");
		password.sendKeys("Meenu@12345");
		loginBtn.click();
	}

}
