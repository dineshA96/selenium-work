package org.Sel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetTextAttribute {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaa\\workspace\\Selenium\\div1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		//xpath with text (attribute name is not there)
		WebElement txt = driver.findElement(By.xpath("//span[text()='Get access to your Orders, Wishlist and Recommendations']"));
		String s=txt.getText();
		System.out.println(s);
		
		//xpath with contains ,partial text(text is too long)
		WebElement tx = driver.findElement(By.xpath("//span[contains(text(),'Get access')]"));
		String s1=tx.getText();
		System.out.println(s);
		
		//get arrtibute
		WebElement mob = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		mob.sendKeys("9994569477");
		String mo = mob.getAttribute("value");
		System.out.println(mo);
		
		//get attribute
		WebElement pass = driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']"));
		pass.sendKeys("adkakkkkm");
		String pa = pass.getAttribute("value");
		System.out.println(pa);
		
		//click
		WebElement butt = driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']"));
		butt.click();
		

		
		
		




	
		
	}

}
