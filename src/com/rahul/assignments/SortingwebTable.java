package com.rahul.assignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SortingwebTable {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		
		List<WebElement> firstcolumnlist=driver.findElements(By.cssSelector("tr td:nth-child(2)"));
	

		ArrayList<String> originallist=new ArrayList();
		for(int i=0; i<firstcolumnlist.size(); i++)
		{
			originallist.add(firstcolumnlist.get(i).getText());
		}
		ArrayList<String> copylist=new ArrayList();
		for(int i=0;i<originallist.size();i++)
		{
		 copylist.add(originallist.get(i));
		}
		System.out.println("*****************************");
		Collections.sort(copylist);
		for(String s:copylist)
		{
			System.out.println(s);
		}
		System.out.println("**************************************");
		for(String s:originallist)
		{
			System.out.println(s);
		}
		
	    originallist.equals(copylist);
		
		
	}

}
