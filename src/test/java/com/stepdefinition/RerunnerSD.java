package com.stepdefinition;

import org.junit.Assert;

import io.cucumber.java.en.Given;

public class RerunnerSD {

	@Given("test method one")
	public void test_method_one() {
	    System.out.println("test method one");
	}

	@Given("test method two")
	public void test_method_two() {
		System.out.println("test method two");
		Assert.fail();
	}

	@Given("test method three")
	public void test_method_three() {
		System.out.println("test method three");
		Assert.fail();
	}

	
	
	
}
