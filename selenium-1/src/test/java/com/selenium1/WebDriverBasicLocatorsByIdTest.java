package com.selenium1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebDriverBasicLocatorsByIdTest extends AbstractChromeWebDriverTest {

	@Test
	public void testTitle() {
		driver.get("http://localhost:8080/login");
		assertEquals("First Web Application", driver.getTitle());
	}
	
	@Test 
	public void testGetInfoAboutName() {
		driver.get("http://localhost:8080/login");
		WebElement nameElement = driver.findElement(By.id("name"));
		System.out.println(nameElement.getTagName());
	}

}
