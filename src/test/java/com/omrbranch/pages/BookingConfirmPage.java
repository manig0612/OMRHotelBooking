package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingConfirmPage {
	
	@FindBy(xpath = "//div[@class = 'credit-card pm']")
	private WebElement choosePaymentMethod;
	
	@FindBy(id = "payment_type")
	private WebElement ddnPaymentType;
	
	@FindBy(id = "card_type")
	private WebElement ddnSelectCardType;
	
	@FindBy(id = "card_no")
	private WebElement txtCardNo;
	
	@FindBy(id = "card_name")
	private WebElement txtCardHolderName;
	
	@FindBy(id = "card_month")
	private WebElement ddnSelectCardExpiryMonth;
	
	@FindBy(id = "card_year")
	private WebElement ddnSelectCardExpiryYear;
	
	@FindBy(id = "cvv")
	private WebElement txtccv;
	
	@FindBy(id = "submitBtn")
	private WebElement btnSubmit;
	
	@FindBy(xpath = "//h2[@name = 'booking-code']")
	private WebElement textBookingConformMessage;

	public WebElement getChoosePaymentMethod() {
		return choosePaymentMethod;
	}

	public WebElement getDdnPaymentType() {
		return ddnPaymentType;
	}

	public WebElement getDdnSelectCardType() {
		return ddnSelectCardType;
	}

	public WebElement getTxtCardNo() {
		return txtCardNo;
	}

	public WebElement getTxtCardHolderName() {
		return txtCardHolderName;
	}

	public WebElement getDdnSelectCardExpiryMonth() {
		return ddnSelectCardExpiryMonth;
	}

	public WebElement getDdnSelectCardExpiryYear() {
		return ddnSelectCardExpiryYear;
	}

	public WebElement getTxtccv() {
		return txtccv;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public WebElement getTextBookingConformMessage() {
		return textBookingConformMessage;
	}

}
