package com.TestLayer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.AddProductToCartPage;
import com.PageLayer.CheckoutPage;
import com.PageLayer.LoginPage;
import com.PageLayer.registerPage;

public class CheckoutTest extends BaseClass{
	
	private LoginPage loginPage;
	private CheckoutPage checkoutPage;
	private AddProductToCartPage addProductToCartPage;
	private registerPage registerPage;
	
	
	@BeforeClass
	public void setUp() {
		BaseClass.inilitization();

		//loginPage=new LoginPage();
		registerPage=new registerPage();
		addProductToCartPage=new AddProductToCartPage();
		checkoutPage= new CheckoutPage();
		
	}
	
	
	@Test(priority = 1)
	public void register() {
		
	   registerPage.registerFunctionality(); 
	}
	
//	@Test(priority = 1)
//	public void login() {
//		
//	   loginPage.loginFunctionality(); 
//	}
	
	@Test(priority = 2)
	public void addToCart1() {
		
		addProductToCartPage.AddProduct();   
	}
	
	@Test(priority = 3)
	public void checkout1() {

	      checkoutPage.checkOut();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
