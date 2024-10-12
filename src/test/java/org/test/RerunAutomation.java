package org.test;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RerunAutomation implements IRetryAnalyzer {

	private int retryCount = 0;
	private static final int maxcount = 5;
	
	
	public boolean retry(ITestResult result) {
		
		if(retryCount < maxcount) {
			retryCount++;
			return true;
		}
		
		return false;
	}

}
