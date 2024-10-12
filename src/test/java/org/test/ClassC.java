package org.test;

import org.testng.annotations.DataProvider;

public class ClassC extends BaseClass {

	@DataProvider(name = "res")
	private Object[][] data() {
		//                          r  c
		Object[][] data = new Object[3][2];
		
		data[0][0] = "salnevil";
		data[0][1] = "Viji@316";
		
		data[1][0] = "ram";
		data[1][1] = "Viji@316";
		
		data[2][0] = "salnevil";
		data[2][1] = "Admin@316";
		
		return data;
	}
	
	@org.testng.annotations.Test(dataProvider = "res")
	private void test01(String username, String password) {
		browserLaunch("https://adactinhotelapp.com/");
		browserMax();
		
		LoginPage l = new LoginPage();
		l.login(username, password);
		
	}
}
