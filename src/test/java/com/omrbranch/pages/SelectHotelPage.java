package com.omrbranch.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectHotelPage {
	
	@FindBy(xpath = "//div[@id='hotellist']//h5")
	private List<WebElement>lstHotelName;
	
	@FindBy(xpath = "//div[@id='hotellist']//a[@class = 'btn filter_btn']")
	private List<WebElement>lstBtnContinue;

	public List<WebElement> getLstHotelName() {
		return lstHotelName;
	}

	public List<WebElement> getLstBtnContinue() {
		return lstBtnContinue;
	}
	
	
	

}
