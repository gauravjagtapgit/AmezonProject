package com.qa.util;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestUtil {
	
	public static long PAGE_LOAD_TIMEOUT=20;
	public static long IMPLICIT_WAIT=10;
	 WebDriver driver;
	  
		
	 public static WebElement WaitForVisiblityofElement(WebDriver driver, WebElement element) {
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    return wait.until(ExpectedConditions.visibilityOf(element));
		}
	
	
	public static  WebElement WaitForpresenceOfElementLocated(WebDriver driver,By locator) {
		WebDriverWait	wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 return  wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}


}
