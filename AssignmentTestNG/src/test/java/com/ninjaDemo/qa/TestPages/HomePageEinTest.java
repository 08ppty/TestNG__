package com.ninjaDemo.qa.TestPages;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.app.ListenerDemo.ItestListenerClass;
import com.ninjaDemo.qa.Base.TestBase;
import com.ninjaDemo.qa.pages.HomePage;

@Listeners(ItestListenerClass.class)
public class HomePageEinTest extends TestBase {

	HomePage hp;

	@BeforeClass
	public void OpenApp() {

		openBrowser("Chrome");
		hp = new HomePage(driver);
	}

	@Test(priority = '1')
	public void EnterFromPlace() throws InterruptedException {

		 
		hp.clickOnMyFrom();
		 
		 

	}

	@Test(priority = '2')
	public void EnterToPlace() throws InterruptedException {

		 
	 
	 
		hp.clickOnTo();
	 

	}
	public void clickOnDate() throws InterruptedException {

		 hp.clickOnDate();

	}
	public void clickOnDateExact() throws InterruptedException {

		 
		hp.clickOnDateExact();
	 
		 	 

	}
	public void clickOnSearch() throws InterruptedException {

		 
	 hp.clickOnSearch();

	}

	@AfterClass
	public void CloseApp() {

		  
	}

}
