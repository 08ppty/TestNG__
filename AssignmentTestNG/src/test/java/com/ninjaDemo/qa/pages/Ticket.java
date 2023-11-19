package com.ninjaDemo.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ticket {

	
	

	@FindBy(id = "input-From")
	WebElement From;

	@FindBy(id = "input-To")
	WebElement lastname;

	@FindBy(id = "input-email")
	WebElement emailid;

	@FindBy(id = "input-telephone")
	WebElement phone;

	@FindBy(id = "input-password")
	WebElement password;

	@FindBy(id = "input-confirm")
	WebElement confirmpassword;

	@FindBy(xpath = "//input[@name='agree']")
	WebElement agreecheckbox;

	@FindBy(xpath = "//input[@value='Continue']")
	WebElement continuebutton;

	public Ticket(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	// Actions

	public void RegisterUser(String From1, String lastname1, String emailid1, String phone1, String password1,
			String confirmpassword1) {

		From.clear();
		From.sendKeys(From1);

		lastname.clear();
		lastname.sendKeys(lastname1);

		emailid.clear();
		emailid.sendKeys(emailid1);

		phone.clear();
		phone.sendKeys(phone1);

		password.clear();
		password.sendKeys(password1);

		confirmpassword.clear();
		confirmpassword.sendKeys(confirmpassword1);

		//agreecheckbox.clear();
		agreecheckbox.click();
		continuebutton.click();

	}

	
	
	
	
}
