package org;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Adoptdemoapptest {
	private WebDriver driver;
	  private Map<String, Object> vars;
	  JavascriptExecutor js;
	  
	  @Before
	  public void setUp() throws MalformedURLException {
	    driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub/"), new ChromeOptions());
	    js = (JavascriptExecutor) driver;
	    vars = new HashMap<String, Object>();
	  }
	  
	  @After
	  public void tearDown() {
	    driver.quit();
	  }
	  
	  @Test
	  public void adoptdemoapptest() {
		  driver.get("http://localhost:9005/");
		  driver.manage().window().setSize(new Dimension(1798, 1023));
		  driver.findElement(By.cssSelector("button:nth-child(2)")).click();
		  driver.findElement(By.cssSelector("button:nth-child(3)")).click();
		  driver.findElement(By.cssSelector("button:nth-child(3)")).click();
	  }
}
