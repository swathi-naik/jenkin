package PAGEOBJECTS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpagepom {
WebDriver driver;
	
	public Loginpagepom(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
		}
	
	@FindBy(id="username")
	WebElement txtusername;
	
	
	@FindBy(id="password")
	WebElement txtpassword;
	
	@FindBy(xpath=".//*[@type='submit']")
	WebElement btnLogin;
	
	@FindBy(css="a#header-module-stock")
	WebElement stock;
  
	@FindBy(css="a#header-module-stock")
	WebElement stock1;
	
	@FindBy(css="li.dropdown.hoverBlock")
	WebElement setting;
	
	@FindBy(css="li.dropdown.hoverBlock")
	WebElement settings;
	
	@FindBy(xpath=".//*[@title='Select Branch']")
	WebElement selectbranch;
	
	@FindBy(xpath=".//*[.='333 - Sprint testing']")
	WebElement selectbranch1;
	
	@FindBy(xpath="//button[.='Yes']")
	WebElement yes;
    
    
    
    
    
  
    
public void setusername(String username) {
	txtusername.sendKeys(username);
	}
public void setpassword(String password) {
	txtpassword.sendKeys(password);
}
public void clicksubmit() {
	btnLogin.click();
}

public void clickonstock() {
	Actions act=new Actions(driver);
	act.moveToElement(stock).perform();
}
public void clickonstock1() {
	stock1.click();
}
public void hoveronsetting() {
		Actions act=new Actions(driver);
		act.moveToElement(setting).perform();
	}
public void clickonsettings() {
	settings.click();
}
public void clickonselectbranch() {
	selectbranch.click();
}
public void clickonselectbranch1() {
	selectbranch1.click();
}
public void clickonyes() {
	yes.click();
}

}





