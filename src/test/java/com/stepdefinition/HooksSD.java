package com.stepdefinition;

import io.cucumber.java.en.Given;

public class HooksSD {

	@Given("method one")
	public void method_one() {
	   System.out.println("hooks method one");
	}

	@Given("method two")
	public void method_two() {
		System.out.println("hooks method two");
	}

	@Given("method three")
	public void method_three() {
		System.out.println("hooks method three");
	}

}
