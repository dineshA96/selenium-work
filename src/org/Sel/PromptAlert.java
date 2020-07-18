package org.Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaa\\workspace\\Selenium\\div1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		WebElement btn = driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[2]"));
		btn.click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("dinesh");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	
	
	
	
	
	}

}
