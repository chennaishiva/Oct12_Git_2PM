package org.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample extends BaseClass {
	
	
	@BeforeClass
	private void test01() {
		browserLaunch("https://adactinhotelapp.com/");
		browserMax();
	}
	
	@Test(retryAnalyzer = RerunAutomation.class)
	private void test02() {
		
		System.out.println("Start");
		
		String title = driver.getTitle();
		System.out.println(title);
		
//		Hard assert
		Assert.assertEquals(title, "adactin.com - Hotel Reservation System");
		
//		SoftAssert assert1 = new SoftAssert();
//		assert1.assertEquals(title, "adactin.com - Hotel Reservation System");
		
		System.out.println("end");

	}
	
	@AfterClass
	private void test03() {
		driver.close();
	}
}
