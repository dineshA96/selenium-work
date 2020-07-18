package org.Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaa\\workspace\\Selenium\\div1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//typecasting
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement scd = driver.findElement(By.id("loginbutton"));
		js.executeScript("arguments[0].scrollIntoView(true)",scd);
		Thread.sleep(2000);
		
		scd.click();
	}

}
