package com.stepdefinition;

import io.cucumber.java.en.Given;

public class BackroundSD {

	@Given("Sample Method One")
	public void sample_method_one() {
	   System.out.println("valid user name and valid password");
	}

	@Given("sample method two")
	public void sample_method_two() {
		System.out.println("valid user name and invalid password");
	}

	@Given("sample method three")
	public void sample_method_three() {
		System.out.println("invalid user name and valid password");
	}
	@Given("open browser and launch the amazon URL")
	public void open_browser_and_launch_the_amazon_url() {
	System.out.println("amazon url launched");
	}
	
}
