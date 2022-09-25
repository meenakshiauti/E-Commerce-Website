package com.PageLayer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

public class AddProductToCartPage extends BaseClass {

	
	@FindBy(xpath = "//a[contains(text(),'Electronics')]")
	WebElement electronicsLink;
	
	@FindBy(xpath = "//h2[@class='title']//a[contains(text(),'Cell phones')]")
	WebElement cellPhoneLink;

	@FindBy(xpath = "//a[contains(text(),'Apparel')]")
	WebElement apparelLink;
	
	@FindBy(xpath = "//h2[@class='title']//a[contains(text(),'Clothing')]")
	WebElement clothingLink;
	
	//h2[@class='title']//a[contains(text(),'Clothing')]
	@FindBy(xpath = "//a[contains(text(),'Jewelry')]")
	WebElement jewelryLink;
	
	@FindBy(xpath = "//button[contains(text(),'Rent')]")
	WebElement Rent;
	
	@FindBy(id = "rental_start_date_40")
	WebElement RentStartDay;
	
	@FindBy(xpath = "//a[contains(text(),'10')]")
	WebElement RentStartDayCal;
	
	@FindBy(id = "rental_end_date_40")
	WebElement RentEndDay;
	
	@FindBy(xpath = "//a[contains(text(),'15')]")
	WebElement RentEndDayCal;
	
	@FindBy(id = "add-to-cart-button-40")
	WebElement AddtoCartBtn;
	
	@FindBy(xpath = "//li[@id='topcartlink']//a[@class='ico-cart']//span[@class='cart-label']")
	WebElement GoToShoppingCart;
	
	@FindBy(id = "termsofservice")
	WebElement TermsChkBox;
	
	@FindBy(id = "checkout")
	WebElement CheckoutBtn;
	
	@FindBy(xpath = "//button[contains(text(),'Checkout as Guest')]")
	WebElement chckoutAsGuestBtn;
	
	public AddProductToCartPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void AddProduct()
	{
		electronicsLink.click();
		
		cellPhoneLink.click();
		
		List<WebElement> electronicsProducts=driver.findElements(By.xpath("//div[@class='details']"));
		{
		for(int i=0;i<electronicsProducts.size();i++)
		{
			String name=electronicsProducts.get(i).getText();
			
			if(name.contains("Nokia Lumia 1020"))
			{
				driver.findElements(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']")).get(i).click();
				System.out.println("mobile is added");
				break;
			}
		}
		}
		
		apparelLink.click();
		clothingLink.click();
		
		List<WebElement> apparelProducts=driver.findElements(By.xpath("//div[@class='details']"));
		{
		for(int i=0;i<apparelProducts.size();i++)
		{
			String name=apparelProducts.get(i).getText();
			
			if(name.contains("Oversized Women T-Shirt"))
			{
				driver.findElements(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']")).get(i).click();
				System.out.println("Apparel is added");
			     break;
			}
		}
		}
		
		jewelryLink.click();
		
		
		List<WebElement> jewelleryProducts=driver.findElements(By.xpath("//div[@class='details']"));
		{
		for(int i=0;i<jewelleryProducts.size();i++)
		{
			String name=jewelleryProducts.get(i).getText();
			
			if(name.contains("Flower Girl Bracelet"))
			{
				driver.findElements(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']")).get(i).click();
				System.out.println("Jewellery is added");
				break;
			}
		}
		}
		
//		Rent.click();
//		RentStartDay.click();
//		
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//	      jse.executeScript("arguments[0].click();", RentStartDayCal);
//		RentStartDayCal.click();
//		
//		RentEndDay.click();
//		RentEndDayCal.click();
//		AddtoCartBtn.click();
		GoToShoppingCart.click();
		TermsChkBox.click();
		CheckoutBtn.click();
		//chckoutAsGuestBtn.click();
	}
	
	
	
	
	
	
}
