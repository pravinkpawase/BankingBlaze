package com.qa.testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.pageLayer.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public static LoginPage lo;
	
	
	@BeforeMethod
	public void browser(){
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://apps.dalalstreet.ai/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	lo=new LoginPage();
	

	}
	@AfterMethod
	public void turnOff() {
	driver.quit();	
	}
}
