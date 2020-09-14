package com.actitime.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

public class CreateCustomer extends BaseClass {
	
	@Test
	public void testCreatecustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		String cutomerName = f.Excelvalue("CreateCustomer", 1, 0);
		String cusDescription = f.Excelvalue("CreateCustomer", 1, 1);
	    HomePage h = new HomePage(driver);
	    h.ClickTask();
	    TaskListPage t = new TaskListPage(driver);
	    t.getAddNewCustomer().click();
	    t.getNewCustomer().click();
	    t.getCustomerName().sendKeys(cutomerName);
	    t.getCustomerDescription().sendKeys(cusDescription);
	    t.getSelectCustomer().click();
	    t.getOurCompanyMenu().click();
	    t.getCreateCustomerBtn().click();
	    Thread.sleep(7000);
	    
	    
	    
	}
		
	

}
