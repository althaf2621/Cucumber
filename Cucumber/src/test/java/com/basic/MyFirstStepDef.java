package com.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class MyFirstStepDef {
	
	
	WebDriver driver;
	
	@Given("^User need to be on FB login page$")
	public void methodName()
	{
		System.setProperty("wedriver.chrome.driver", "F:\\FIX Practice\\Softwares\\chromedriver_win32\\chrome.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	
	@When("^Enter following datae$")
	public void methodName1(DataTable table) {
	List<List<String>>data=table.raw();
	String value1=data.get(0).get(0);
	
	
		driver.findElement(By.name("email")).sendKeys("");
	
	System.out.println("hello");
	
	
	}
	
	@Then("^User checks first name is present$")
	public void methodName2()
	{
		String usrName=driver.findElement(By.name("email")).getAttribute("value");
		Assert.assertEquals("althaf2621@gmail.com",usrName );
	}

}
