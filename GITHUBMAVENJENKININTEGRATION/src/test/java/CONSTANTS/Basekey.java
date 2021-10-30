package CONSTANTS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;



public class Basekey  {
public static WebDriver driver;
    
    
    
	@BeforeTest
	
	public void setup() throws Exception 
	{
	    
	    
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\swath\\eclipse-workspace\\GITHUBMAVENJENKININTEGRATION\\driver\\chromedriver_win32\\chromedriver.exe");
	    
	     driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://windsor.keyazure.co.uk");
	    Thread.sleep(5000);
	   
	    }
	    
	    
	   
	//@AfterTest
	//public void teardown() {
	//driver.quit();
	//}
	

}



