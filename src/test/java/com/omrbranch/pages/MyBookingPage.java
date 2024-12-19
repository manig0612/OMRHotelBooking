package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyBookingPage {
	
	@FindBy(xpath = "//a[@data-testid = 'username'")
	private WebElement goToProfile;
	
	@FindBy(xpath = "//a[text() = 'My Account']")
	private WebElement goToMyAccount;
	
	@FindBy(xpath = "//button[@class = 'edit btn filter_btn']")
	private WebElement btnEdit;
	
	@FindBy(xpath = "//a[@class = 'cancle btn filter_btn']")
	private WebElement btnCancel;
	
	@FindBy(name = "search")
	private WebElement txtSearchField;
	
	public WebElement getGoToProfile() {
		return goToProfile;
	}

	public WebElement getGoToMyAccount() {
		return goToMyAccount;
	}

	public WebElement getBtnEdit() {
		return btnEdit;
	}

	public WebElement getBtnCancel() {
		return btnCancel;
	}

	public WebElement getTxtSearchField() {
		return txtSearchField;
	}

	

}
