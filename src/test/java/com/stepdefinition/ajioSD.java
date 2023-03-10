package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ajioSD extends baseDemo {
	@Given("enter the browser")
	public void enter_the_browser() {
	   driverinit();
	}

	@Given("enter the ajio url")
	public void enter_the_ajio_url() {
	   geturl("https://www.ajio.com/");
	}

	@When("enter the data {string}")
	public void enter_the_data(String string) {
		WebElement data = driver.findElement(By.name("searchVal"));
		inputtextbox(data, string);
	  
	}

	@Given("enter the search button")
	public void enter_the_search_button() {
		WebElement search = driver.findElement(By.xpath("//span[@class='ic-search']"));
		search.click();
	   
	}

	@Given("click on  the first Sandal")
	public void click_on_the_first_sandal() {
		WebElement puma = driver.findElement(By.xpath("//div[@class='brand']"));
		puma.click();
	    
	}

	@Given("select the size")
	public void select_the_size() {
	    WebElement size = driver.findElement(By.xpath("//div[@class='circle size-variant-item size-instock ']"));
	    size.click();
	}

	@Given("add to bag")
	public void add_to_bag() {
	    
	}


}
