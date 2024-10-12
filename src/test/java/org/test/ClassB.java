package org.test;

import org.testng.annotations.Parameters;

public class ClassB extends BaseClass {
	
	@Parameters({"x", "y", "z"})
	@org.testng.annotations.Test
	private void test(String url, String userName, String password) {
		
		browserLaunch(url);
		browserMax();
		
		LoginPage l = new LoginPage();
		l.login(userName, password);
		

	}
}
