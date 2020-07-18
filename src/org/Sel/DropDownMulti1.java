package org.Sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMulti1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaa\\workspace\\Selenium\\div1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		WebElement dd = driver.findElement(By.id("continentsmultiple"));
		
		Select s=new Select(dd);
		List<WebElement> allopt = s.getOptions();
		
		//to select alloption by value
		for(int i=0;i<allopt.size();i++){
			String att = allopt.get(i).getAttribute("value");
			s.selectByValue(att);
	}
		
		//to deselect the option
		s.deselectByVisibleText("Australia");
		
		//to print first selected option
		System.out.println(s.getFirstSelectedOption().getText());
		
		//to print all selected option
		List<WebElement> allsop = s.getAllSelectedOptions();
		for(int i=0;i<allsop.size();i++){
			System.out.println(allsop.get(i).getText());
		}
		
		
	}

}
