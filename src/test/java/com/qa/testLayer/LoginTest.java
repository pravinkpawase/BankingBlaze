package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.pageLayer.LoginPage;

public class LoginTest extends LoginPage {
@Test
public void verifyLogin() {
	lo.setEmail();
	lo.setPassword();
	lo.clickOnLogin();
}
}
