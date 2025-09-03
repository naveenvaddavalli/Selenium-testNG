package com.nav.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class practiseFormPage {

	public practiseFormPage(WebDriver driver) 
		// TODO Auto-generated constructor stub
			 {
		        PageFactory.initElements(driver, this);
		    }

		    @FindBy(xpath = "//input[@id='firstName']")
		    public WebElement firstname;
		    
		    @FindBy(xpath = "//input[@id='lastName']")
		    public WebElement lastname;

		    @FindBy(xpath = "//input[@id='userEmail']")
		    public WebElement email;
		    
		    
		    
		    @FindBy(xpath = "//input[@id='gender-radio-1']")
		    public WebElement maleRadioButton;
		    
		    @FindBy(xpath = "//input[@id='gender-radio-2']")
		    public WebElement femaleRadioButton;
		    
		    @FindBy(xpath = "//input[@id='gender-radio-3']")
		    public WebElement othergenderRadioButton;

		    @FindBy(xpath = "//input[@id='userNumber']")
		    public WebElement mobileNumberInput;
		   

		    @FindBy(xpath = "//input[@id='subjectsInput']")
		    public WebElement subjectsInput;
		
		    @FindBy(xpath = "//input[@id='hobbies-checkbox-1']")
		    public WebElement sportsRadioButton;
		    
		    @FindBy(xpath = "//input[@id='hobbies-checkbox-2']")
		    public WebElement readingRadioButton;
		    
		    @FindBy(xpath = "//input[@id='hobbies-checkbox-3']")
		    public WebElement otherhobbiesRadioButton;
		    
		  //input[@id='uploadPicture']
		    @FindBy(xpath = "//input[@id='uploadPicture']")
		    public WebElement chooseFileButton;

		    @FindBy(xpath = "//textarea[@id='currentAddress']")
		    public WebElement addressInput;
		    
		    @FindBy(xpath = "//*[local-name()='svg' and @class='css-19bqh2r']")
		    public List<WebElement> svg_elements;

		    @FindBy(xpath = "//button[@id='submit']")
		    public WebElement submitButton;
		    
		    @FindBy(xpath = "//select[@class='react-datepicker__month-select']")
		    public WebElement monthDropdown;
		    
		    @FindBy(xpath = "//select[@class='react-datepicker__year-select']")
		    public WebElement yearDropdown;
		    
		   
		    public WebElement getDateElement(WebDriver driver, String day) {
		        String xpath = "//*[@class='react-datepicker__week']//div[text()='" + day + "']";
		        return driver.findElement(By.xpath(xpath));
		    }
		    
		    public void insertdata(String name, WebElement webel) {
		    	//driver.webel.sendKeys(String);
		    	
		    }
		    
		    
	}


