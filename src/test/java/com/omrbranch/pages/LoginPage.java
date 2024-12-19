package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(id = "email")
	private WebElement txtEmailId;
	
	@FindBy(id = "pass")
	private WebElement txtPassWord;
	
	@FindBy(xpath = "//button[@value = 'login']")
	private WebElement btnLogin;

	public WebElement getUserEmail() {
		return txtEmailId;
	}

	public WebElement getUserPass() {
		return txtPassWord;
	}

	public WebElement getLoginBtn() {
		return btnLogin;
	}

}
