package org.Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaa\\workspace\\Selenium\\div1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		/*
		 control switch to iframe by using id
		 
		driver.switchTo().frame("a077aa5e");
		Thread.sleep(3000);
		
		WebElement img = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		img.click();
		*/
		
		//control switch to iframe by using webelement
		
		WebElement fram = driver.findElement(By.xpath("//iframe[@width='750px;']"));
		driver.switchTo().frame(fram);
		
		WebElement img = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		img.click();
	}

}
