package org.Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameNested {
	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaa\\workspace\\Selenium\\div1\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://chercher.tech/practice/frames");
			driver.manage().window().maximize();
			
			//frame 1&2 present in the same page
			//frame 3 is present inside the frame 1
			driver.switchTo().frame("frame1");
			WebElement txt = driver.findElement(By.xpath("//input[@type='text']"));
			txt.sendKeys("dinesh");
			
			Thread.sleep(2000);
			
			driver.switchTo().frame("frame3");
			WebElement ch = driver.findElement(By.id("a"));
			ch.click();
			
			//frame 1&2 present in the same page (default)
			driver.switchTo().defaultContent();
			driver.switchTo().frame("frame2");
			WebElement tx = driver.findElement(By.xpath("//b[text()='Animals : ']"));
			String t = tx.getText();
			System.out.println(t);   
			
			//under the code is example for parentFrame()
			
			/*driver.switchTo().frame("frame1");
			driver.switchTo().frame("frame3");
			WebElement ch = driver.findElement(By.id("a"));
			ch.click();
			
			Thread.sleep(2000);
			
			driver.switchTo().parentFrame();
			WebElement txt = driver.findElement(By.xpath("//input[@type='text']"));
			txt.sendKeys("dinesh");  */
			
	}

}
