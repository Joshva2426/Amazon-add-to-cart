package com.Amazon.org;

import java.io.File;

import java.io.IOException;
import java.util.Set;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeOptions opt = new ChromeOptions();
		opt.setBrowserVersion("116");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		 driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("Iphone 14");
		driver.findElement(By.id("nav-search-submit-text")).click();
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,400)");
		
		driver.findElement(By.linkText("Apple iPhone 14 (128 GB) - Blue")).click();
		
		Set<String> a = driver.getWindowHandles();
		ArrayList arr = new ArrayList(a);
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		
		driver.switchTo().window((String)arr.get(1));
		
		
		driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]")).click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("Image folder//Joss.png");
		FileUtils.copyFile(src, des);
		
		
		driver.quit();
		
		
		
		
		
		

		
	
	}

}
