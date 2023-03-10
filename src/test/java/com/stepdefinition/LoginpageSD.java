 package com.stepdefinition;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginpageSD extends baseDemo {
	
	
	@Given("open browser")
	public void open_browser() {
	 driverinit();
	}

	@And("launch adactin url")
	public void launch_adactin_url() {
	geturl("https://adactinhotelapp.com/");
	}
	

	@When("enter the username {string}")
	public void enter_the_username(String string) {
	   WebElement user= driver.findElement(By.id("username"));
	  inputtextbox(user,string);
	 
	}

	@And("enter the password {string}")
	public void enter_the_password(String string) {
WebElement pw = driver.findElement(By.id("password"));
inputtextbox1(pw,string);

	}

	@And("click on login button")
	public void click_on_login_button() {
	 WebElement lgbutton = driver.findElement(By.xpath("//input[@name='login']"));
	 lgbutton.click();
	 
	}

	@When("enter the username as {string}")
	public void enter_the_username_as(String string) {
		  WebElement user= driver.findElement(By.id("username"));
		  inputtextbox(user,string);
		
		
		
		
		
	}
	@And("enter the password as {string}")
	public void enter_the_password_as(String string) {
		WebElement pw = driver.findElement(By.id("password"));
		inputtextbox1(pw,string);
	}




}