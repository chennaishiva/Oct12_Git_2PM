package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	public LoginPage() {

		PageFactory.initElements(driver, this);

	}

	//AND
	@FindBys({@FindBy(id = "username"), @FindBy(xpath = "//input[@name='username']")})
	private WebElement username;

	//OR
	@CacheLookup
	@FindAll({@FindBy(id = "gfg"), @FindBy(xpath = "//input[@name ='password']")})
	private WebElement password;

	@FindBy(id = "login")
	private WebElement loginButton;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public void login(String username, String password) {
		enterText(getUsername(), username);
		enterText(getPassword(), password);
		clickElement(getLoginButton());
	}

}
