package com.aiite.cucumber.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\user\\eclipse-workspace\\cucumberjan\\src\\test\\java\\feature\\cucumber\\Rerunner.feature",
                   glue = "com.stepdefinition",
                   plugin = {"rerun:target/failedtestcase.txt"}
		              )


public class FailedtestRunner {

	
	
}
