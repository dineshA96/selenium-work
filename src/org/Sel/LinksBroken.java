package org.Sel;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksBroken {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaa\\workspace\\Selenium\\div1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int count=0;
		
		for(int i=0;i<allLinks.size();i++){
			WebElement link = allLinks.get(i);
			String li = link.getAttribute("href");
			
			URL u=new URL(li);
			URLConnection open = u.openConnection();
			
			HttpsURLConnection h=(HttpsURLConnection)open;
			int rc = h.getResponseCode();
			if(rc!=200){
				System.out.println(li);
				count++;
			}
		}
		System.out.println(count);
	
	}

}
