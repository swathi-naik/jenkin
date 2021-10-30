package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Findfriendspage {
	WebDriver driver;
	public Findfriendspage(Commomsteps1 commonsteps) {
		this.driver = commonsteps.getdriver();
	}
	
	@Given("I am on facebook home page")
	public void i_am_on_facebook_home_page() throws Exception {
		String exptitle = "Facebook";
		driver.getTitle().equals(exptitle);
		System.out.print("I am in home page to find friends");
	}

	@When("I Click on Findfriends button")
	public void i_click_on_findfriends_button() throws Exception{
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//img[@class='s45kfl79 emlxlaya bkmhp75w spb7xbtv']")).click();
	}

	@Then("I Navigate to Findfriends page")
	public void i_navigate_to_findfriends_page() {
		System.out.println("Navigated to friendship request page");
	    
	}



}
