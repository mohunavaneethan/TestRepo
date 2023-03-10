package com.stepdefinition;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DatatableSD {
	@Given("open browser and pass adactin url")
	public void open_browser_and_pass_adactin_url() {
	   System.out.println("open browser with adactin url");
	}

	@When("enter the user name as list")
	public void enter_the_user_name_as_list(DataTable dataTable) {
	    List<String> data=  dataTable.asList();
	    System.out.println(data.get(0));
	}

	@When("enter the password as list")
	public void enter_the_password_as_list(DataTable dataTable) {
		List<String> data=  dataTable.asList();
	    System.out.println(data.get(0));
	}

	@When("click login button")
	public void click_login_button() {
	   System.out.println("login button click");
	}

	@Then("user logged in adactin")
	public void user_logged_in_adactin() {
		System.out.println(" user login successfully");
	}
	
	
	//aslists
	
	@When("enter the user name as lists")
	public void enter_the_user_name_as_lists(DataTable dataTable) {
	    List<List<String>>   data=    dataTable.asLists();
	  System.out.println(data.get(0).get(1));
	}

	@When("enter the password as lists")
	public void enter_the_password_as_lists(DataTable dataTable) {
		 List<List<String>>   data=    dataTable.asLists();
		  System.out.println(data.get(0).get(1));
		
	}

	
	@When("enter the user name as Map")
	public void enter_the_user_name_as_map(DataTable dataTable) {
	  Map<String, String> data = dataTable.asMap();
	  System.out.println(data.get("username"));
	}

	@When("enter the password as Map")
	public void enter_the_password_as_map(DataTable dataTable) {
		Map<String, String> data = dataTable.asMap();
		  System.out.println(data.get("password"));
	}
	
	@When("enter the user details as Maps")
	public void enter_the_user_details_as_maps(DataTable dataTable) {
	   List<Map<String, String>> data = dataTable.asMaps();
	   System.out.println(data.get(1).get("mail"));
	   
	}

	
	
}
