package com.actitime.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.LoginPage;

public class BaseClass {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	
	public WebDriver driver;
	public FileLib f = new FileLib();
	
	@BeforeTest
	public void openBrowser() throws IOException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String URL = f.getPropertyValue("Url");
		driver.get(URL);
	}
	@AfterTest
	public void closeBrowser() {
		
	}
	 @BeforeMethod
	public void Login() throws IOException  {
		 String usernme = f.getPropertyValue("Username");
		 String passwrd = f.getPropertyValue("Password");
		LoginPage l = new LoginPage(driver);
		l.setLogin(usernme, passwrd);
		
		
	}
	

}
