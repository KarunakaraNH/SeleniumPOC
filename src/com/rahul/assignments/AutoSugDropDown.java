package com.rahul.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String  script="return document.getElementById(\"autocomplete\").value;";
	    String text=(String) js.executeScript(script);
	    int i=0;
	    while(!text.equalsIgnoreCase("indonesia"))
	    {
	    	i++;
	    	driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
	    	text=(String) js.executeScript(script);
	    	System.out.println(text);
	    	if(i>10)
	    	{
	    		break;
	    	}
	    }
	    if(i>10)
	    {
	    	System.out.println("result not found");
	    }
	    else
	    {
	     System.out.println("find with success");	
	    }
	}

}
