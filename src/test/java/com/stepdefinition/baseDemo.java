package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseDemo {
	
	
	
public WebDriver driver;
	
	public void driverinit() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
	}
	public void geturl(String url) {
		driver.get(url);
	}
	public String getTitle() {
		return driver.getTitle();
	}
	    public void inputtextbox (WebElement element , String input) {
	    	element.sendKeys(input);
	    	
	    }
	    
	    public void inputtextbox1 (WebElement element , String input) {
	    	element.sendKeys(input);
	    
	    }
	    
	    public void inputtextbox1 (By by , long input) {
	    String valueOf = String.valueOf(input);
	    	driver.findElement(by).sendKeys (valueOf);
	    	
	    }
	    public void inputtextboxclear (WebElement element) {
	    	element.clear();
	    	
	    }
	public void input(By element, String input) {
		driver.findElement(element).sendKeys(input);
		
		
	}
	public  void clickbox(WebElement element) {
		element.click();
		
	}
	public void clickbutton(WebElement element) {
		 element.click();
		
	}
	public String getWebElementText(WebElement element) {
		return element.getText();
	}
		
	public void radiobutton(WebElement element) {	
		element.click();
		
	}
	
	}


