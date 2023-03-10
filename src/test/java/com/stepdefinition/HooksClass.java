package com.stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass {
	
	@Before
	public void beforeeachscenario() {
		System.out.println("execute before the scenario"); //browser open launch url
	}
    @After
    public void aftereachscenario() {
    	System.out.println("execute after the scenario"); //page open
    }
}
