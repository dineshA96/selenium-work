package org.Sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DdOddEven {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaa\\workspace\\Selenium\\div1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
		WebElement dd = driver.findElement(By.id("continentsmultiple"));
		Select s=new Select(dd);
		List<WebElement> allopt = s.getOptions();
		
		int size = allopt.size();
		
		//print odd position options
		for(int i=0;i<size;i=i+2){
			WebElement opt = allopt.get(i);
			System.out.println(opt.getText());
		}
		System.out.println("---------------------------------");
		
		//print even position options
		for(int i=1;i<size;i=i+2){
			WebElement opt = allopt.get(i);
			System.out.println(opt.getText());
		}
	}

}
