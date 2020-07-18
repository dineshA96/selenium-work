package org.Sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaa\\workspace\\Selenium\\div1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-table/");
		driver.manage().window().maximize();
		
		List<WebElement> allrows = driver.findElements(By.tagName("tr"));
		for(int i=0;i<allrows.size();i++){
			WebElement row = allrows.get(i);
			
			List<WebElement> alltd = row.findElements(By.tagName("td"));
			for(int j=0;j<alltd.size();j++){
				WebElement data = alltd.get(j);
				String txt = data.getText();
				System.out.println(txt);
			}
		}
		
	}

}
