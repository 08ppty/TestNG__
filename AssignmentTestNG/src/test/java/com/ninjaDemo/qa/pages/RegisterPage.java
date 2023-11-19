package com.ninjaDemo.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	
	
	 

	public RegisterPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//div[@class='sc-ifAKCX gLwVlD'][normalize-space()='From']")
    WebElement From;
	
	@FindBy (xpath ="//i[@class='sc-bwzfXH dNCrpK icon icon-dest']")
	WebElement To;

	 
	
	
	
	@FindBy (xpath  ="//span[@class='dateText'][normalize-space()='Date']")
	WebElement Date;
	
	@FindBy( xpath ="//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 dkWAbH'][normalize-space()='30']")
	WebElement DateExact;
	

	@FindBy (xpath  ="//button[@id='search_button'][@class='sc-dxgOiQ iztAdt'][normalize-space()='SEARCH BUSES']")
	WebElement Search;

//	@FindBy (xpath  ="")
//	WebElement ;
//
//	@FindBy (xpath  ="")
//	WebElement ;
	
	
	
	

	// Actions

	 

		public void EnterFromPlace(String aaa) {
			From.click();
					From.sendKeys(aaa);}
			public void   EnterToPlace(String arg1) {
				 
				To.sendKeys(arg1);} 


				
				
			  	
				public void HomePageNavgation(String Pune) {
					From.sendKeys(Pune);
		
		
		
		

	}

	
	
	
	
}
