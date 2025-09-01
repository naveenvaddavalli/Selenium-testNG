package com.nav;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class restassured {
	
	final static  String url = "https://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1";
	@Test	
	public static void getResponseStatus(){
		   int statusCode= given().queryParam("CUSTOMER_ID","68195")
		           .queryParam("PASSWORD","1234!")
		           .queryParam("Account_No","1") .when().get("https://demo.guru99.com/V4/sinkministatement.php").getStatusCode();
		   System.out.println("The response status is "+statusCode);
	
		   given().when().get("https://demo.guru99.com/V4/sinkministatement.php").then().assertThat().statusCode(200);
		}
	
	@Test	
	public static void getHeaders(){
		System.out.println("second one ");
		System.out.println("Content Type :  "+given().queryParam("CUSTOMER_ID","68195")
		           .queryParam("PASSWORD","1234!")
		           .queryParam("Account_No","1") .when().get("https://demo.guru99.com/V4/sinkministatement.php")
		           .then().extract().contentType());
	
		
		System.out.println("time taken for response in millisecond :   "+given().when().get(url).timeIn(TimeUnit.MILLISECONDS));
		   //given().when().get("https://demo.guru99.com/V4/sinkministatement.php").then().assertThat().statusCode(200);
		}
	
	@Test
	public static void gettotalamount() {
		ArrayList<String> amounts = when().get(url).then().extract().path("result.statements.AMOUNT");
		
		int sumall = 0;
		
		for(String a:amounts) {
			sumall += Integer.valueOf(a);
			
			
		}
		
		System.out.println(sumall);
	}
	
	


}

