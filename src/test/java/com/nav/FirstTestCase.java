package com.nav;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.resources.reporting.practicePage;
import com.resources.webdrivermethods;
import com.utils.webdrivermethods;


public class FirstTestCase {

	WebDriver driver;
	webdrivermethods wdm;
	practicePage pp;
	String flightUrl = "https://blazedemo.com/";
	String Departure = "Boston";
	String Destination = "London";
	
	public FirstTestCase() {
		// TODO Auto-generated constructor stub
		wdm = new webdrivermethods();

		driver = wdm.getwebdriver();
		wdm.NavigateToUrl(flightUrl);
		pp = new practicePage(driver);
		
		
		
	
	}

	public void landOnFlightList(String Destination, String Depature) {
		
		wdm.singleArgDropdown(Destination, pp.destinationCity);
		wdm.singleArgDropdown(Departure, pp.depatureCity);
		wdm.clickButton(pp.findFlightButton);
		
	}
	
	public void GetData() {
		int out = 0;
		float mini = Float.POSITIVE_INFINITY;
		for(int i=1;i<=5;i++) {
			String price= driver.findElement(By.xpath("//table[@class='table']/tbody/tr["+i+"]/td[6]")).getText();	
			price=price.replace("$", "");
			float value = Float.parseFloat(price);
			if(value < mini) {
				mini = value;
				out= i;
			}
		}
		driver.findElement(By.xpath("//table[@class='table']/tbody/tr["+out+"]/td/input")).click();
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ChromeDriver driver =  new ChromeDriver();
		//driver.close();
		
		//String url = "https://techbeamers.com/selenium-practice-test-page/";
		
		
		
		FirstTestCase ftc = new FirstTestCase();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ftc.landOnFlightList("London", "Boston");
		ftc.GetData();
		
		

	}

}
