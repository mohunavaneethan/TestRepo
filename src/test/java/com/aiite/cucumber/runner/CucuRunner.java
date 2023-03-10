package com.aiite.cucumber.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\user\\eclipse-workspace\\cucumberjan\\src\\test\\java\\feature\\cucumber\\loginpage.feature",
               glue="com.stepdefinition",
              // dryRun=true
               monochrome=true,
               plugin= {"html:reports/login.html","json:reports/loginjson.json"}

		         )
 


public class CucuRunner {

}
