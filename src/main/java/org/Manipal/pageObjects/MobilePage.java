package org.Manipal.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MobilePage {
	
    WebDriver driver;
	
	public MobilePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);//Initialize the elements
	}
	
	@FindBy(xpath="//*[text()='Mobiles & Accessories'][1]")
	public WebElement mobileAccesory;
		
	public void verifyMobileHeader() {
		System.out.println(mobileAccesory.isDisplayed());
		Assert.assertEquals(mobileAccesory.isDisplayed(), true);
	}
}
