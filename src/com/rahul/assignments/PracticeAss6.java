package com.rahul.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeAss6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#top");
		
		WebElement option=driver.findElement(By.id("checkBoxOption2"));
		
		option.click();
		
		String selectedoption=option.getAttribute("value");
		
		System.out.println("Selected option is- "+selectedoption);
		
		Select s=new Select(driver.findElement(By.id("dropdown-class-example")));
		
		s.selectByValue(selectedoption);
		
		driver.findElement(By.id("name")).sendKeys(selectedoption);
		
		driver.findElement(By.id("alertbtn")).click();
		
		String alerttext=driver.switchTo().alert().getText();
		
		System.out.println("Alert text is- "+alerttext);
		
		if(alerttext.contains(selectedoption))
		{
			System.out.println("Alert box contain the text from the selected option");
		}
		else
		{
			System.out.println("Alert box not containing the selected option text");
		}

	}

}
