package org.Sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaa\\workspace\\Selenium\\div1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-table/");
		driver.manage().window().maximize();
		
		//to print last row only
		List<WebElement> allrows = driver.findElements(By.tagName("tr"));
		int size = allrows.size();
		
		WebElement lastrow = allrows.get(size-1);
		String text = lastrow.getText();
		System.out.println(text);
	}

}
