package com.selenium1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebDriverBasicLocatorsByNameTest extends AbstractChromeWebDriverTest {

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
