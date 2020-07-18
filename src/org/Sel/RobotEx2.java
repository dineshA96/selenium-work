package org.Sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotEx2 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaa\\workspace\\Selenium\\div1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement num = driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
		num.sendKeys("9994569477");
		
		Actions aa=new Actions(driver);
		aa.doubleClick(num).perform();
		aa.contextClick(num).perform();      //right click operation
		
		Thread.sleep(3000);
		
		Robot rr=new Robot();
		for(int i=1;i<3;i++){                //use for loop for avoid multiple time writing key press and release
			rr.keyPress(KeyEvent.VK_DOWN);   //moves to copy option 
			rr.keyRelease(KeyEvent.VK_DOWN);
		}
		Thread.sleep(3000);
		
		rr.keyPress(KeyEvent.VK_ENTER);      //enter copy option
		rr.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement pass = driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']"));
		pass.click();
		
		rr.keyPress(KeyEvent.VK_CONTROL);    //paste opertion
		rr.keyPress(KeyEvent.VK_V);
		rr.keyRelease(KeyEvent.VK_CONTROL);
		rr.keyPress(KeyEvent.VK_V);
		
		
	}

}
