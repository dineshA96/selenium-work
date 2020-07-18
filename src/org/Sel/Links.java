package org.Sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaa\\workspace\\Selenium\\div1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//to print all links
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		for(int i=0;i<allLinks.size();i++){
			WebElement link = allLinks.get(i);
			String li = link.getAttribute("href");
			System.out.println(li);
		}
	}

}
