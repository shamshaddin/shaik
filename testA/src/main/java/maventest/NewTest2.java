package maventest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest2 {
  @Test
  public void f() throws InterruptedException {
	  
	  
	  
	  String driverPath = "C:\\Users\\hp\\Desktop\\chromedriver_win32\\chromedriver.exe";
	  
	  System.setProperty("webdriver.chrome.driver",driverPath);
		
      WebDriver driver = new ChromeDriver();
	
      String baseUrl = "http://demo.guru99.com/test/yahoo.html";


driver.get(baseUrl);
WebElement downloadButton = driver.findElement(By.id("messenger-download"));
String sourceLocation = downloadButton.getAttribute("href");
String wget_command = "cmd /c C:\\Wget\\wget.exe -P D: --no-check-certificate " + sourceLocation;

try {
    Process exec = Runtime.getRuntime().exec(wget_command);
    int exitVal = exec.waitFor();
    System.out.println("Exit value: " + exitVal);
    } catch (InterruptedException | IOException ex) {
    System.out.println(ex.toString());
    }
    driver.close();
    }
	  
	  
	  

}
