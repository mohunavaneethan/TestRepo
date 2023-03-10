package com.aiite.cucumber.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@target/failedtestcase.txt",
                  glue="com.stepdefinition"   
		          )
public class Rerunner {

	
	
	
}
