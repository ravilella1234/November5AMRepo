package com.project.November5AMMavenProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;

public class TC_003 extends BaseTest
{
    
  @BeforeMethod
  public void beforeMethod()
  {
	  launch("chrome");
	  navigateUrl("https://www.amazon.in");
  }
  
  @Test
  public void amazon() throws InterruptedException 
  {
	  driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Potter");
	  driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
	  
	  Thread.sleep(5000);
  }

  @AfterMethod
  public void afterMethod() 
  {
	  driver.quit();
  }

}
