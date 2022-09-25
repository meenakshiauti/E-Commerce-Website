package com.TestLayer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.LoginPage;

public class LoginPageTest extends BaseClass {
	
	@BeforeClass
	public void setUp() {
		BaseClass.inilitization();
	}
@Test
	public void validateLoginFunctionality() {
		// TODO Auto-generated method stub
		LoginPage loginpage = new LoginPage();
		loginpage.loginFunctionality();
		
	}

@AfterClass
public void tearDown() {
	driver.quit();
}

}
