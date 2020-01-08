package com.rahul.assignments;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddtoCart {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		int j=0;//make j value is equal to number of item needed
		
		String[] itemneeded={"Brocolli","Cucumber","Beetroot"};
		
		//collecting all the produt name and add into list of array
		//itarate and add the exact string text into name array
		//then get a add to cart webelement and click
		
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<products.size();i++)
		{
			String[] name=products.get(i).getText().split("-");//split the product name into 2 parts and it will be as array
			//those split as name[0], name[1]
			
			String formattedname=name[0].trim();//trimming it to remove the white spaces in both sides
			//Converting the array into array list
			//because to save the memory we didn't declare as array list first
			List itemneededlist=Arrays.asList(itemneeded);
			
			if(itemneededlist.contains(formattedname))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==itemneeded.length)
				{
					break;
				}
			}
		}
	}

}
