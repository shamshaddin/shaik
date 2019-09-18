package maventest;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class NewTest3 {
 
	
	
	//public String baseUrl = "http://demo.guru99.com/test/newtours/";
	
    String driverPath = "C:\\Users\\hp\\Desktop\\chromedriver_win32\\chromedriver.exe";
    
    public WebDriver driver ; 
	
	    @Test
	    @Parameters({"author","searchKey"})
	    
	    public void testParameterWithXML( @Optional("Test") String author,String searchKey) throws InterruptedException{

             System.out.println("launching chrome browser");
	    	
	    	System.setProperty("webdriver.chrome.driver",driverPath);
	    	
	    	driver= new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("https://google.com");

	        WebElement searchText = driver.findElement(By.name("q"));
	        //Searching text in google text box
	        searchText.sendKeys(searchKey);

	        System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);
	        System.out.println("Thread will sleep now");
	        Thread.sleep(3000);
	        System.out.println("Value in Google Search Box = "+searchText.getAttribute("value") +" ::: Value given by input = "+searchKey);
	        //verifying the value in google search box
	        AssertJUnit.assertTrue(searchText.getAttribute("value").equalsIgnoreCase(searchKey));

	  
	driver.quit();  
	  
	  
	  
	  
  }
}
