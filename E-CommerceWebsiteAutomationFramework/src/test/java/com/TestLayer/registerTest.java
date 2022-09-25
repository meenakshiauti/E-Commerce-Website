package com.TestLayer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.LoginPage;
import com.PageLayer.registerPage;

public class registerTest extends BaseClass {
	
	@BeforeClass
	public void setUp() {
		BaseClass.inilitization();
	}
@Test
	public void validateLoginFunctionality() {
		// TODO Auto-generated method stub
		registerPage regpage = new registerPage();
		regpage.registerFunctionality();
		
	}

@AfterClass
public void tearDown() {
	driver.quit();
}


}
