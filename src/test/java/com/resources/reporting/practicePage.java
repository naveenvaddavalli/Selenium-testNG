package com.resources.reporting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class practicePage {

	WebDriver driver;
	public practicePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		  PageFactory.initElements(driver, this);
		
	}
	

	
	@FindBy(id="username")
	public WebElement UsernameFeild;
	
	@FindBy(id="email")
	public WebElement EmailFeild;
	
	@FindBy(id="password")
	public WebElement PasswordFeild;
	
	@FindBy(xpath="//select[@name='fromPort']")
	public WebElement depatureCity;
	
	
	@FindBy(xpath="//select[@name='toPort']")
	public WebElement destinationCity;
	
	@FindBy(xpath = "//input[@value='Find Flights']")
	public WebElement findFlightButton;
	
	
	
	 


}
