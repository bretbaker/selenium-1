package com.selenium1.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.selenium1.AbstractChromeWebDriverTest;

public class FirstWebAppLoginTest extends AbstractChromeWebDriverTest {
	@Test
	public void login() {
		driver.get("http://localhost:8080/login");
		WebElement nameElement = driver.findElement(By.name("name"));
		nameElement.sendKeys("in28minutes");
		WebElement passwordElement = driver.findElement(By.id("password"));
		passwordElement.sendKeys("dummy");
		WebElement submitElement = driver.findElement(By.id("submit"));
		sleep(2);
		submitElement.click();
		sleep(2);
		WebElement welcomeMsgElement = driver.findElement(By.id("welcome-message"));
		System.out.println(welcomeMsgElement.getText());
	}
}
