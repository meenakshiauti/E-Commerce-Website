package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

public class registerPage extends BaseClass {

	
	
	@FindBy(xpath = "//a[@class='ico-register']")
	WebElement registerButton;
	
	@FindBy(xpath = "//input[@id='gender-female']")
	WebElement genderrdobtn;
	
	@FindBy(xpath = "//input[@id='FirstName']")
	WebElement fNameTxt;
	
	@FindBy(xpath = "//input[@id='LastName']")
	WebElement lNameTxt;
	
	@FindBy(xpath = "//input[@id='Email']")
	WebElement emailTxt;
	
	@FindBy(xpath = "//input[@id='Password']")
	WebElement passwdTxt;
	
	@FindBy(xpath = "//input[@id='ConfirmPassword']")
	WebElement cnfmPasswdTxt;
	
	@FindBy(xpath = "//input[@id='register-button']")
	WebElement rgstrBtn;
	
	public registerPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void registerFunctionality() {

		registerButton.click();
		genderrdobtn.click();
		fNameTxt.sendKeys("pavi");
		lNameTxt.sendKeys("nal123");
		emailTxt.sendKeys("pavi@gmail.com");
		passwdTxt.sendKeys("Pavi@12345");
		cnfmPasswdTxt.sendKeys("Pavi@12345");
		rgstrBtn.click();

	}
}
