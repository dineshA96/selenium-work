package org.Sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMulti {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaa\\workspace\\Selenium\\div1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
		WebElement dd = driver.findElement(By.id("continentsmultiple"));
		
		Select s=new Select(dd);
		
		//to find multiple or not
		boolean multi = s.isMultiple();
		System.out.println(multi);
		
		List<WebElement>allopt = s.getOptions();
	
		//select all options by index
		/*
		for(int i=0;i<allopt.size();i++){
			s.selectByIndex(i);		
		}
		*/
		
		//select all options by value
		/*
		for(int i=0;i<allopt.size();i++){
				WebElement opt = allopt.get(i);
				String att = opt.getAttribute("value");
				s.selectByValue(att);
		}
		*/
		//select all options by visible text (enhanced for loop)
		for(WebElement x:allopt){
			String txt = x.getText();
			s.selectByVisibleText(txt);
		}
		
			
	}

}
