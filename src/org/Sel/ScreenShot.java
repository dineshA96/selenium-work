package org.Sel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaa\\workspace\\Selenium\\div1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//type casting 
		TakesScreenshot tk=(TakesScreenshot)driver;
		File sc = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(sc);
		
		//path of destination
		File f=new File("D:\\screenshot\\fblogin.png");
		
		FileUtils.copyFile(sc, f);
		

	}

}
