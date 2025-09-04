package com.nav;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsMnK {

	public actionsMnK() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("  ");
	
	Actions act = new Actions(driver);
	
	WebElement Desktop = driver.findElement(By.xpath(""));
	WebElement mac = driver.findElement(By.xpath(""));
	
	act.moveToElement(Desktop).moveToElement(mac).click().build().perform();
	
	act.dragAndDrop(Desktop, mac);
	act.dragAndDropBy(mac, 100, 500);
	
	act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
	act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
	act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
	act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
	driver.switchTo().newWindow(WindowType.TAB);
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('value','123')", mac);
	js.executeScript("argument[0].click()", mac);
	}
	
}
