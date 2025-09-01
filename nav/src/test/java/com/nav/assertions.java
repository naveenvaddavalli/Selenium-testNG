package com.nav;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertions {

	
	@Test
	void testTittle() {
		
		String exp_title="Opencart";
		String act_title="Oncart";
		
		Assert.assertEquals(exp_title,act_title);
		
	}
	@Test
	void testTittlecond() {
		
		String exp_title="Opencart";
		String act_title="Oncart";
		if (exp_title==act_title) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		
		
		
	}
	
	
	
}
