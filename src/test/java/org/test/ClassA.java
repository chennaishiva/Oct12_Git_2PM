package org.test;

public class ClassA {

	@org.testng.annotations.Test(groups = "smoke", enabled = true)
	private void test01() {
		System.out.println("smoke");
	}

	@org.testng.annotations.Test(groups = { "sanity", "smoke" })
	private void test02() {
		System.out.println("sanity&smoke");
	}

	@org.testng.annotations.Test(groups = "smoke")
	private void test03() {
		System.out.println("smoke");
	}

	@org.testng.annotations.Test(groups = "smoke")
	private void test04() {
//		System.out.println(6/0);
		System.out.println("4");
	}

	@org.testng.annotations.Test(groups = "smoke")
	private void test05() {
//		System.out.println(6/0);
		System.out.println("5");
	}

}
