package com.aiite.cucumber.runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\user\\eclipse-workspace\\cucumberjan\\src\\test\\java\\feature\\cucumber\\BackroundSample.feature",
                   glue="com.stepdefinition")
public class BackroundRunner {

}
