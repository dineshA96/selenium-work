package org.Sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotEx1 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaa\\workspace\\Selenium\\div1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement num = driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
		num.sendKeys("9994569477");
		
		Actions aa=new Actions(driver);
		aa.doubleClick(num).perform();
		aa.contextClick(num).perform();      //right click operation
		
		Robot rr=new Robot();
		rr.keyPress(KeyEvent.VK_DOWN);       //
		rr.keyRelease(KeyEvent.VK_DOWN);     //move downwards two times
		rr.keyPress(KeyEvent.VK_DOWN);       //
		rr.keyRelease(KeyEvent.VK_DOWN);     //
		
		rr.keyPress(KeyEvent.VK_ENTER);      //enter copy option
		rr.keyRelease(KeyEvent.VK_ENTER);
		
	//	WebElement pass = driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']"));
	//	pass.click();
		
	//we can use above are below way...both are same operation	
		rr.keyPress(KeyEvent.VK_TAB);        //move another text field
		rr.keyRelease(KeyEvent.VK_TAB);
		
		rr.keyPress(KeyEvent.VK_CONTROL);    //paste opertion
		rr.keyPress(KeyEvent.VK_V);
		rr.keyRelease(KeyEvent.VK_CONTROL);
		rr.keyPress(KeyEvent.VK_V);
		
		rr.keyPress(KeyEvent.VK_TAB);
		rr.keyRelease(KeyEvent.VK_TAB);
		
		rr.keyPress(KeyEvent.VK_ENTER);
		rr.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}

}
