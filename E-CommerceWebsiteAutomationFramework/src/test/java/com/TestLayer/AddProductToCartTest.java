package com.TestLayer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.AddProductToCartPage;


public class AddProductToCartTest extends BaseClass {
	
	private LoginPageTest loginpageTest;
	private AddProductToCartPage addProductToCartPage;

	
	
	@BeforeClass
	public void setUp() {
		BaseClass.inilitization();
		//loginpageTest = new LoginPageTest();
		addProductToCartPage= new AddProductToCartPage();
		
		
	}
	
//	@Test(priority = 1)
//	public void loginFunctionality() {
//		
//		loginpageTest.validateLoginFunctionality();
//	}
	
	@Test(priority = 1)
	public void addToCart() {

		addProductToCartPage.AddProduct();
	}
	
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	

}
