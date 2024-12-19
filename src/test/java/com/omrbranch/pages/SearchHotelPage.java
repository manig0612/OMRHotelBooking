package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchHotelPage {
	
	@FindBy(xpath = "//img[@alt = 'hotel booking']")
	private WebElement selectHotelPage;
	
	@FindBy(id = "state")
	private WebElement ddnSelectState;
	
	@FindBy(id = "city")
	private WebElement ddnSelecCity;
	
	@FindBy(id = "room_type")
	private WebElement ddnSelectRoomType;
	
	@FindBy(name = "check_in")
	private WebElement txtCheckIn;
	
	@FindBy(name = "check_out")
	private WebElement txtCheckOut;
	
	@FindBy(id = "no_rooms")
	private WebElement ddnSelectNoOfRooms;
	
	@FindBy(id = "no_adults")
	private WebElement ddnSelectNoOfAdults;
	
	@FindBy(id = "no_child")
	private WebElement txtNoOfChild;
	
	@FindBy(id = "hotelsearch_iframe")
	private WebElement frmOfSearchBtn;
	
	@FindBy(id = "searchBtn")
	private WebElement btnSearch;
	

	public WebElement getFrmOfSearchBtn() {
		return frmOfSearchBtn;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getSelectHotelPage() {
		return selectHotelPage;
	}

	public WebElement getDdnSelectState() {
		return ddnSelectState;
	}

	public WebElement getDdnSelecCity() {
		return ddnSelecCity;
	}

	public WebElement getDdnSelectRoomType() {
		return ddnSelectRoomType;
	}

	public WebElement getTxtCheckIn() {
		return txtCheckIn;
	}

	public WebElement getTxtCheckOut() {
		return txtCheckOut;
	}

	public WebElement getDdnSelectNoOfRooms() {
		return ddnSelectNoOfRooms;
	}

	public WebElement getDdnSelectNoOfAdults() {
		return ddnSelectNoOfAdults;
	}

	public WebElement getTxtNoOfChild() {
		return txtNoOfChild;
	}

	
	
	

}
