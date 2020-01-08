package com.rahul.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxAss1 {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	//To Check and Unchecked the Check box
	WebElement Option1=driver.findElement(By.id("checkBoxOption1"));
	Option1.click();
	if(Option1.isSelected())
	{
		System.out.println("First Check Box is selected");
	}
	else
	{
		System.out.println("First check is not selected");
	}
	Option1.click();
	if(Option1.isSelected())
	{
		System.out.println("First Check Box still selected");
	}
	else
	{
		System.out.println("First check is  deselected");
	}
	//To count the number of check boxes present in the page 
	List<WebElement> boxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
	
	System.out.println(boxes.size());

}
}
