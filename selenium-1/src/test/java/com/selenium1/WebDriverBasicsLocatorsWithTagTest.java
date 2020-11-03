package com.selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebDriverBasicsLocatorsWithTagTest extends AbstractChromeWebDriverTest {
	
  @Test
  public void getDetailsAboutLoginButton() {
	  driver.get("http://localhost:8080/pages/login.html");
	  WebElement linkElement = driver.findElement(By.tagName("a"));
	  System.out.println(linkElement.getText());
  }
  
  @Test
  public void getDetailsAboutInputTags() {
	  driver.get("http://localhost:8080/pages/login.html");
	  List<WebElement> inputElements = driver.findElements(By.tagName("input"));
	  for (WebElement element : inputElements) {
		  System.out.println(element.getAttribute("placeholder"));
		  sleep(1);
	  }
  }
}
