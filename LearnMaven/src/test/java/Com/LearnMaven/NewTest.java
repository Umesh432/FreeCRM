package Com.LearnMaven;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Com.LearnMaven.DriverManager.DriverManager;
import Com.LearnMaven.DriverManager.DriverManagerFactory;
import Com.LearnMaven.DriverManager.DriverType;

public class NewTest {
	 WebDriver driver;
	 DriverManager driverManager;
  @Test
  public void RUN1() {
	  
	 
	  driverManager = DriverManagerFactory.getManager(DriverType.CHROMEHEADLESS);
	  driver = driverManager.getDriver();
	  driver.get("https://www.geeksforgeeks.org/");
	  driver.getTitle();
	  System.out.println(driver.getTitle());
	  System.out.println(driver.getCurrentUrl());
	
	  
	  
  }
  
}
 