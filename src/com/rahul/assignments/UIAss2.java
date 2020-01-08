package com.rahul.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UIAss2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ']")).click();
		Select s=new Select(driver.findElement(By.id("Adults")));
		s.selectByValue("3");
		Select s2=new Select(driver.findElement(By.id("Childrens")));
		s2.selectByVisibleText("2");
		driver.findElement(By.id("MoreOptionsLink")).click();
		driver.findElement(By.cssSelector("#AirlineAutocomplete")).sendKeys("indigo");
		driver.findElement(By.id("SearchBtn")).click();
		String errormessage=driver.findElement(By.id("homeErrorMessage")).getText();
		System.out.println(errormessage);
	}

}
