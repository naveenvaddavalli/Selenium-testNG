package com.nav;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertions1 {

	
	@Test
	void testTittle() {
		
		String exp_title="Opencart";
		String act_title="Opencart";
		
		Assert.assertEquals(exp_title,act_title);
		
	}
	@Test
	void testTittlecond() {
		
		String exp_title="Opencart";
		String act_title="Opencart";
		if (exp_title==act_title) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		
		
		
	}
	
	
	@Test
	void testTittlecond1() {
		
		String exp_title="Opencart";
		String act_title="Opencart";
		if (exp_title==act_title) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		
		
		
	}
	
	
	
}
