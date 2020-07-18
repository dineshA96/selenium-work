package org.Sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaa\\workspace\\Selenium\\div1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-table/");
		driver.manage().window().maximize();
		//to print only the even rows
		
		List<WebElement> allrows = driver.findElements(By.tagName("tr"));
		
		for(int i=0;i<allrows.size();i++){

			if(i%2==1){
				
				WebElement row = allrows.get(i);
				
				List<WebElement> alldata = row.findElements(By.tagName("td"));				
				for(int j=0;j<alldata.size();j++){
					WebElement data = alldata.get(j);
					System.out.println(data.getText());
				}
				
			}
			
			
			
		}
	}

}
