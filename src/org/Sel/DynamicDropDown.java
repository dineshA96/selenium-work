package org.Sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaa\\workspace\\Selenium\\div1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
		WebElement dd = driver.findElement(By.id("continentsmultiple"));
		
		// assume dynamic drop down and print last option of dynamic dd
		Select s=new Select(dd);
		List<WebElement> allopt = s.getOptions();
		
		int size = allopt.size();
		
		WebElement lastopt = allopt.get(size-1);
		String txt = lastopt.getText();
		System.out.println(txt);
		
		//to print particular option if it's a dynamic dd
		for(WebElement x:allopt){
			String txt1 = x.getText();
			if(txt1.equals("Asia")){
				System.out.println(txt1);
			}	
		}
		
		
			
	}

}
