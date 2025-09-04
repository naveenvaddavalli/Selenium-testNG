package com.nav;

import org.testng.annotations.Test;

public class firstTestNg {

	
	@Test(priority=4)
	void logout() {
		
		System.out.println("Logout 4");
	}
	
	
	@Test(priority=0)
	void launch() {
		
		System.out.println("launch 1");
	}
	
	@Test(priority=-11)
	void login() {
		
		System.out.println("login 2");
	}
	
	@Test(priority=3)
	void action() {
		
		System.out.println("Action 3");
	}
}
