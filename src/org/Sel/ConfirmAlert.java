package org.Sel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaa\\workspace\\Selenium\\div1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.manage().window().maximize();
		WebElement al = driver.findElement(By.xpath("//button[text()='Generate Confirm Box']"));
		al.click();
		Thread.sleep(2000);
		
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		
		Alert a=driver.switchTo().alert();            // or driver.switchTo().alert().accept();
		a.accept();
		
	}
	

}
