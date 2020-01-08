package com.rahul.assignments;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsAss3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		WebDriverWait wait=new WebDriverWait(driver,30);
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("demo")));
		boolean status=element.isDisplayed();
		if(status)
		{
			System.out.println("Element is present");
			System.out.println(element.getText());
		}
		else
		{
			System.out.println("Element is not present");
		}
	
		
	}

}
