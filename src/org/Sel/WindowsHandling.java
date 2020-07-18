package org.Sel;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaa\\workspace\\Selenium\\div1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		
		WebElement iphone = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]"));
		iphone.click();
		
		String parentwin = driver.getWindowHandle();
		Set<String> allwin = driver.getWindowHandles();
		for(String x:allwin){
			if(!x.equals(parentwin)){
				driver.switchTo().window(x);
			}
			
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@id='wishListMainButton']")).click();
	}

}
