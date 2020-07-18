package org.Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class LaunchMozilla {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\aaa\\workspace\\Selenium\\div1\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		WebElement from = driver.findElement(By.id("src"));
		from.sendKeys("chennai");
		WebElement to = driver.findElement(By.id("dest"));
		to.sendKeys("vedaranyam");
		WebElement date = driver.findElement(By.xpath("//label[@class='db text-trans-uc']"));
		date.sendKeys("21-Apr-2020");  //why shows exception?
		
	
		
		
	}

}
