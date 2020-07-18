package org.Sel;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaa\\workspace\\Selenium\\div1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		
		List<WebElement> allipho = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		allipho.get(0).click();
		allipho.get(1).click();
		allipho.get(2).click();
		
		/*  another way to click 
		for(int i=0;i<allipho.size();i++){
			if(i==3){
				break;
			}
			allipho.get(i).click();
		}
		*/
		Set<String> allwin = driver.getWindowHandles();
		List<String>li=new ArrayList<String>();
		li.addAll(allwin);
		
		String win1 = li.get(1);
		driver.switchTo().window(win1);
		driver.findElement(By.id("wishListMainButton")).click();
		
		driver.quit();
	}

}
