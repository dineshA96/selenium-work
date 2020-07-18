package org.Sel;
import java.awt.Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	public static void main(String[] args) {
		                     //key for the browser          //path of driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaa\\workspace\\Selenium\\div1\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("adk96akm2@gmail.com");
		WebElement pass = driver.findElement(By.xpath("(//input[@class='inputtext login_form_input_box'])[2]"));
		pass.sendKeys("12345");
		WebElement lgnbtn = driver.findElement(By.xpath("//input[@type='submit']"));
		lgnbtn.click();
		
		
		
		
	}

}
