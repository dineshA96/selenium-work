package org.Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExe {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaa\\workspace\\Selenium\\div1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//typecasting
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//scroll down 
		WebElement scdown = driver.findElement(By.xpath("(//a[@class='_sv4'])[1]"));
		js.executeScript("arguments[0].scrollIntoView(true)",scdown);
		Thread.sleep(2000);
		
		//scrollup
		WebElement scup = driver.findElement(By.id("loginbutton"));
		js.executeScript("arguments[0].scrollIntoView(false)",scup);
		Thread.sleep(2000);
		
		//insert values(email)
		WebElement em = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','adkakm@gmail.com')",em);
		
		//insert values(password)
		WebElement pass = driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].setAttribute('value','aaaa')",pass);
		
		//getAttribute value
		Object o = js.executeScript("return arguments[0].getAttribute('value')",em);
		//typecasting
		String s=(String)o;
		System.out.println(s);                                                       
		
		//click
		WebElement btn = driver.findElement(By.id("loginbutton"));
		js.executeScript("arguments[0].click()",btn);
		Thread.sleep(3000);
		
		//getTitle
		String title=(String)js.executeScript("return document.title");
		System.out.println(title);
		

		
		
	}

}
