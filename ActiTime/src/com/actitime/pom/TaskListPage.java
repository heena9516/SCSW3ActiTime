package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement AddNewCustomer;
	
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement NewCustomer ;
	
	@FindBy(xpath="(//input[@placeholder=\"Enter Customer Name\"])[2]")
	private WebElement CustomerName;
	
	@FindBy(xpath="//textarea[@placeholder=\"Enter Customer Description\"]")
	private WebElement CustomerDescription;
	
	@FindBy(xpath="(//div[.=\"- Select Customer -\"])[1]")
	private WebElement SelectCustomer;
	
	@FindBy(xpath = "//div[@class='itemRow cpItemRow ' and text()='Our company']")
	private  WebElement ourCompanyMenu;
	
	@FindBy(xpath="//div[ text()='Create Customer']")
	private  WebElement CreateCustomerBtn;
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewCustomer() {
		return AddNewCustomer;
	}

	public WebElement getNewCustomer() {
		return NewCustomer;
	}

	public WebElement getCustomerName() {
		return CustomerName;
	}

	public WebElement getCustomerDescription() {
		return CustomerDescription;
	}

	public WebElement getSelectCustomer() {
		return SelectCustomer;
	}

	public WebElement getOurCompanyMenu() {
		return ourCompanyMenu;
	}

	public WebElement getCreateCustomerBtn() {
		return CreateCustomerBtn;
	}
	
	
	

}
