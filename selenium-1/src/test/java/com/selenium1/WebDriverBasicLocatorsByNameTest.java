package com.selenium1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebDriverBasicLocatorsByNameTest {

	private WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bretb\\Desktop\\chrome-driver-selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

	@Test
	public void testTitle() {
		driver.get("http://localhost:8080/pages/login.html");
		assertEquals("SB Admin 2 - Bootstrap Admin Theme", driver.getTitle());
	}
	
	@Test 
	public void testGetInfoAboutEmail() {
		driver.get("http://localhost:8080/pages/login.html");
		WebElement nameElement = driver.findElement(By.name("email"));
		System.out.println(nameElement.getTagName());
	}

}
