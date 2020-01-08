package com.rahul.assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesAss4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		String parent=driver.getWindowHandle();
		System.out.println("Parent window id is "+parent);
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> s1=driver.getWindowHandles();
		int windowcount=s1.size();
		System.out.println("Total number of windows count is "+windowcount);
        Iterator<String> itr= s1.iterator();
    
        while(itr.hasNext())
        {
            String childwindow=itr.next();
            if(!parent.equals(childwindow))
            {
            driver.switchTo().window(childwindow);
            String childwindowtext=driver.findElement(By.xpath("//h3[text()='New Window']")).getText();
            System.out.println("Child window text is- "+childwindowtext);
            
        }
       
     
	}
        driver.switchTo().window(parent);
        String parentwindowtext=driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText();
        System.out.println("parent window text is- "+parentwindowtext);  	
	}
	}
