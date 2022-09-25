package com.PageLayer;

import static org.testng.Assert.assertEquals;

import java.sql.Time;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BaseLayer.BaseClass;
import com.UtilsLayer.JsMethods;

public class CheckoutPage extends BaseClass{
	
	@FindBy(id = "BillingNewAddress_FirstName")
	WebElement firstName;
	
	@FindBy(id = "BillingNewAddress_LastName")
	WebElement lasttName;
	
	@FindBy(id = "BillingNewAddress_Email")
	WebElement email;
	
	@FindBy(id = "BillingNewAddress_CountryId")
	WebElement countryDropDown;
	
	@FindBy(id = "BillingNewAddress_StateProvinceId")
	WebElement stateDropDown;
	
	@FindBy(id = "BillingNewAddress_City")
	WebElement city;
	
	@FindBy(id = "BillingNewAddress_Address1")
	WebElement address;
	
	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	WebElement zipCode;
	
	@FindBy(id = "BillingNewAddress_PhoneNumber")
	WebElement phnNo;
	
	
	@FindBy(xpath = "//div[@id='billing-buttons-container']//input[@type='button']")
	WebElement continuBtn;
	
	@FindBy(xpath = "//div[@id='shipping-method-buttons-container']//input[@type='button']")
	WebElement shpngMethodBtn;
	
	@FindBy(xpath = "//div[@id='payment-method-buttons-container']//input[@type='button']")
	WebElement paymentMethodBtn;
	
	@FindBy(xpath = "//div[@id='payment-info-buttons-container']//input[@type='button']")
	WebElement paymentInfoBtn;
	
	
	@FindBy(xpath = "//div[@id='confirm-order-buttons-container']//input[@type='button']")
	WebElement confirmBtn;
	
	@FindBy(xpath = "//a[@class='ico-logout']")
	WebElement logoutLink;
	
	@FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
	WebElement orderSuccessMessage;

	
	
	
	
	public CheckoutPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void checkOut()

	{
		
		Select sel=new Select(countryDropDown);
		sel.selectByVisibleText("India");
		
		Select sel1=new Select(stateDropDown);
		sel1.selectByVisibleText("Other");
		
		
		city.sendKeys("Pune");
		address.sendKeys("123Pune$56");
		
		
		
		zipCode.sendKeys("2345678");
		
		phnNo.sendKeys("2314567890");
		
		continuBtn.click();

		shpngMethodBtn.click();
		
		paymentMethodBtn.click();
		
		paymentInfoBtn.click();
		
		confirmBtn.click();
		
		//orderCompltdBtn.click();
		
		String msg=orderSuccessMessage.getText();
		
		assertEquals(msg, "Your order has been successfully processed!");
		
		logoutLink.click();
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
