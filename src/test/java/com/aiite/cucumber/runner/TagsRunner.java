package com.aiite.cucumber.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\user\\eclipse-workspace\\cucumberjan\\src\\test\\java\\feature\\cucumber",
                  glue = "com.stepdefinition",
                 // tags="@regression"   //single tag execution
                   //tags=("@smoke and @regression")  // execute two tags base on AND
                  //tags=("@smoke or @sanity")        //execute the tags based on OR
                  //tags="not @omit"                  //to ignore particular one
                  //tags="not @regression"           //to ignore particular tag
                  //tags=("@regression and(@sanity or @smoke)")  //based on AND, OR
                  tags="@Background"
		
		              )
public class TagsRunner {

}
