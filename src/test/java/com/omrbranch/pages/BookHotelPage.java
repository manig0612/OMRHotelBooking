package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookHotelPage {
	
	@FindBy(id = "own")
	private WebElement rdnBookingFor;
	
	@FindBy(id = "user_title")
    private WebElement ddnSelectSalutation;
	
	@FindBy(id = "first_name")
	private WebElement txtFirstName;
	
	@FindBy(id = "last_name")
	private WebElement txtLastName;
	
	@FindBy(id = "user_phone")
	private WebElement txtMobileNumber;
	
	@FindBy(id = "user_email")
	private WebElement txtEmail;
	
	@FindBy(id = "gst")
	private WebElement chkGstDetails;
	
	@FindBy(id = "gst_registration")
	private WebElement txtGstRegistrationNo;
	
	@FindBy(id = "company_name")
	private WebElement txtCompanyName;
	
	@FindBy(id = "company_address")
	private WebElement txtCompanyAddress;
	
	@FindBy(id = "step1next")
	private WebElement btnNext;
	
	@FindBy(id = "bed")
	private WebElement chkLargeBed;
	
	@FindBy(id = "step2next")
	private WebElement btnnext2;

	

	public WebElement getRdnBookingFor() {
		return rdnBookingFor;
	}

	public WebElement getDdnSelectSalutation() {
		return ddnSelectSalutation;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtMobileNumber() {
		return txtMobileNumber;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getChkGstDetails() {
		return chkGstDetails;
	}

	public WebElement getTxtGstRegistrationNo() {
		return txtGstRegistrationNo;
	}

	public WebElement getTxtCompanyName() {
		return txtCompanyName;
	}

	public WebElement getTxtCompanyAddress() {
		return txtCompanyAddress;
	}

	public WebElement getBtnNext() {
		return btnNext;
	}
	
	public WebElement getChkLargeBed() {
		return chkLargeBed;
	}

	public WebElement getBtnnext2() {
		return btnnext2;
	}
	
	
	
}
