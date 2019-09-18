package maventest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.Assert;

public class NewTest {
	
	 public String baseUrl = "http://demo.guru99.com/test/newtours/";
	    String driverPath = "C:\\Users\\hp\\Desktop\\chromedriver_win32\\chromedriver.exe";
	    public WebDriver driver ; 
	
  @Test
  public void f() {
	  
	  driver.get("http://demo.guru99.com/test/guru99home/");  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Demo Guru99 Page")); 	
	  
	  
  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  

		

	
	System.out.println("launching chrome browser");
	
	System.setProperty("webdriver.chrome.driver",driverPath);
	
	driver= new ChromeDriver();
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
	  driver.quit();	
  }

}
