package org.Sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaa\\workspace\\Selenium\\div1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-table/");
		driver.manage().window().maximize();
		
		//to print the last three rows (forward)
		List<WebElement> allrows = driver.findElements(By.tagName("tr"));
		int size = allrows.size();
		
		for(int i=size-3;i<size;i++){
			WebElement row = allrows.get(i);
			String text = row.getText();
			System.out.println(text);
		}
		System.out.println("---------------------------------");
		//to print the last three rows (reverse)
		for(int j=size-1;j>=size-3;j--){
			WebElement row = allrows.get(j);
			String text = row.getText();
			System.out.println(text);
		}
	}

}
