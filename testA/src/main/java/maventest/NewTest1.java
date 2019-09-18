package maventest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest1 {
	
	  String driverPath = "C:\\Users\\hp\\Desktop\\chromedriver_win32\\chromedriver.exe";
	
  @Test
  public void f() {
	  
	  
	  
	  String baseUrl = "http://demo.guru99.com/test/upload/";
	  
		System.setProperty("webdriver.chrome.driver",driverPath);
		
      WebDriver driver = new ChromeDriver();

      driver.get(baseUrl);
      
      driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\hp\\Desktop\\selenium_test.txt");
      
     // WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

      // enter the file path onto the file-selection input field
     // uploadElement.sendKeys("C:\\Users\\hp\\Desktop\\selenium_test.txt");

      // check the "I accept the terms of service" check box
      driver.findElement(By.id("terms")).click();

      // click the "UploadFile" button
      driver.findElement(By.name("send")).click();
	  
      driver.quit();
	  
	  
  }
}
