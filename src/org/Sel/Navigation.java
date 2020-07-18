package org.Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;

public class Navigation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaa\\workspace\\Selenium\\div1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("9994569477");
		driver.findElement(By.id("pass")).sendKeys("adkakm");
		
		WebElement btn = driver.findElement(By.id("loginbutton"));
		
		btn.click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		/*driver.navigate().forward();*/

		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement scdo = driver.findElement(By.id("u_0_13"));
		js.executeScript("arguments[0].scrollIntoView('true')",scdo);
		
		Thread.sleep(3000);
		WebElement radio = driver.findElement(By.xpath("(//input[@class='_8esa'])[1]"));
		radio.click();
		
		boolean sel = radio.isSelected();
		System.out.println(sel);
		
		boolean dis = radio.isDisplayed();
		System.out.println(dis);
		
		Thread.sleep(2000);
		
		WebElement btn1 = driver.findElement(By.id("loginbutton"));
		js.executeScript("arguments[0].scrollIntoView('false')",btn1);
		boolean enabled = btn1.isEnabled();
		System.out.println(enabled);
		
		
	
	}

}

