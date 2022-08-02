package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class LoginPage extends TestBase {
@FindBy(xpath="//input[@name='email']")
private WebElement email;
@FindBy(xpath="//input[@name='password']")
private WebElement password;
@FindBy (xpath="//button[contains(text(),'Log In')]") 
private WebElement login;

public LoginPage() {
	PageFactory.initElements(driver, this);
}
public void setEmail() {
	email.sendKeys("pawasepravin55@gmail.com");
}
public void setPassword() {
	password.sendKeys("7020569920");
}
public void clickOnLogin() {
	login.click();
}
}
