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
	  
	  String path = System.getProperty("user.dir");
	  System.out.println(path);
	  driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
	  driver = driverManager.getDriver();
	  driver.get("https://www.geeksforgeeks.org/");
	  driver.getTitle();
	  
  }
  @Test
  public void RUN12() {
	  
	  System.out.println("using testng test 2 class name NewTest");
  }
  @Test
  public void RUN3() {
	  
	  System.out.println("using testng test 3 class name NewTest");
  }
  @Test
  public void RUN4() {
	  
	  System.out.println("using testng test 4 class name NewTest");
  }
  @Test
public void RUN5() {
	  
	  System.out.println("using testng test 5 class name NewTest");
  }
}
 