package facebook;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class Facebookhomepage {
	WebDriver driver;
	public Facebookhomepage(Commomsteps1 commonsteps) {
		this.driver = commonsteps.getdriver();
	}

	@Given("I am on facebook page")
	public void i_am_on_facebook_page() {
		driver.get("https://www.facebook.com/");
	    
	}

	@When("I Click on Login button after entering a credential")
	public void i_click_on_login_button_after_entering_a_credential() throws Exception {
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("swathinaik02@gmail.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("Swathi@88");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    Thread.sleep(5000);
	    
	}

	@Then("I Navigate to facebook home  page")
	public void i_navigate_to_facebook_home_page() {
		driver.findElement(By.xpath(".//*[@name='login']")).click();
	    System.out.println("page title verified-user able to login successfully");
	    
	    
	}
}
