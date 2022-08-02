package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class HomePage extends TestBase{
	@FindBy(xpath="//body/div[@id='root']/div[@id='layout-wrapper']/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[2]/a[1]")
	private WebElement exchanges;
	
	public HomePage() {
		PageFactory.initElements(driver,this);
	}
	public void clickOnExchanges() {
		exchanges.click();
	}
}
