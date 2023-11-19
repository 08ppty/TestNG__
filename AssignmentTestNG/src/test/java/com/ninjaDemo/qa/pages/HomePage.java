package com.ninjaDemo.qa.pages;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

 
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
	
	
	
	
	
	public void clickOnMyFrom() {

		From.click();
	}

	public void clickOnTo() {

		To.click();

	}

	public void clickOnDate() {

		Date.click();
	}

	public void clickOnDateExact() {

		DateExact.click();
	}
	public void clickOnSearch() {

		Search.click();
	}
		
	public HomePage(WebDriver driver) {
         
		PageFactory.initElements(driver, this);
	}		

	public void EnterFromPlace(String aaa) {
 
		From.sendKeys(aaa);}
public void EnterToPlace(String Pune) {
	 
	To.sendKeys(Pune);}

public void DateExact(String aa){
	DateExact.sendKeys(aa);}}
