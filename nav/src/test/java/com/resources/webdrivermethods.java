package com.resources;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class webdrivermethods {
	
	private WebDriver driver;

	public webdrivermethods() {
		// TODO Auto-generated constructor stub
		if(driver == null) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
			}
	
	public WebDriver getwebdriver() {
		if(driver == null) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			return driver;
		}
		return driver ;
	}
	
	public void NavigateToUrl(String url) {
		driver.get(url);
		
	}
	
	public void clickButton(WebElement element) {
		element.click();
		
	}
	
	public void singleArgDropdown(String s, WebElement element) {
		
		Select dropdownItems = new Select(element);
		dropdownItems.selectByContainsVisibleText(s);
		
	}

}
