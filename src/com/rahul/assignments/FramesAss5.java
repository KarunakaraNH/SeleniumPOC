package com.rahul.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAss5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.linkText("Nested Frames")).click();
		driver.switchTo().frame("frame-top");//this is the parent frame which contain all 3 below frames
		//So we have to move to parent frame and then child frames
	    driver.switchTo().frame("frame-middle");
	    String middle=driver.findElement(By.id("content")).getText();
	    System.out.println(middle);
		
		
		//To get the bottom frame
		/*driver.switchTo().frame("frame-bottom");
		String bottm=driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText();
		System.out.println(bottm);*/
		
	}

}
