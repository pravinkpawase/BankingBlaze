package com.qa.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class Utility extends TestBase{
@FindBy(xpath="//a[contains(text(),'Buy')]")
private WebElement buy;
@FindBy(xpath="//a[contains(text(),'Sell')]")
private WebElement sell;

public Utility() {
	PageFactory.initElements(driver, this);
}

public void clickOnBuy() {
	buy.click();
}

public void clickOnSell() {
	sell.click();
}
}
