package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Commomsteps1 {
private WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swath\\eclipse-workspace\\cucumberlearning\\chromedriver\\chromedriver90version\\chromedriver.exe");
		driver=new ChromeDriver();
	}
    @After
	public void teardown() throws Exception {
		driver.quit();
	Thread.sleep(1000);
}
    public WebDriver getdriver() {
    	return driver;
    	
    	
    }
	
	
	

}
