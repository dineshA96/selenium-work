
package org.Sel;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DebugEx {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaa\\workspace\\Selenium\\div1\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();

	WebElement em = driver.findElement(By.id("email"));
	em.sendKeys("adk96akm2@gmail.com");
	WebElement pa = driver.findElement(By.id("pass"));
	pa.sendKeys("123456");
	WebElement btn = driver.findElement(By.id("loginbutton"));
	btn.click();
	Thread.sleep(3000);
	String tit = driver.getTitle();
	System.out.println(tit);
	}

}
