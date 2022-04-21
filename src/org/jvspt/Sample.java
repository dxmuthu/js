package org.jvspt;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DX MUTHU\\eclipse-workspace\\javascrpt\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.in/");
	WebElement txtusername = driver.findElement(By.id("twotabsearchtextbox"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('value', 'welcome')",txtusername);
	
	WebElement btnclk = driver.findElement(By.xpath("//a[text()='Mobiles']"));
	JavascriptExecutor js1=(JavascriptExecutor)driver;
	js1.executeScript("arguments[0].click()",btnclk );
	WebElement scrolldown = driver.findElement(By.xpath("//a[text()='Gift a Smile']"));
	JavascriptExecutor js2=(JavascriptExecutor)driver;
	js2.executeScript("arguments[0].ScrollIntoView(true)", scrolldown);
	Thread.sleep(3000);
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
