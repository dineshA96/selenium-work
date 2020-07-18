package org.Sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaa\\workspace\\Selenium\\div1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement ddmon = driver.findElement(By.id("month"));
		
		Select s=new Select(ddmon);
		/*
		s.selectByIndex(7);
		s.selectByVisibleText("Jan");
		s.selectByValue("2"); 
		*/
		
		//to print all options from dd
		/*
		List<WebElement> allopt = s.getOptions();
		
		for(int i=0;i<allopt.size();i++){
		WebElement opt = allopt.get(i);	
		String txt = opt.getText();
		System.out.println(txt);
		}
		*/
		
		//to print all values from dd
		List<WebElement> allopt = s.getOptions();
		for(int i=0;i<allopt.size();i++){
			WebElement opt = allopt.get(i);
			String val = opt.getAttribute("value");
			System.out.println(val);
		}
			
	}

}
