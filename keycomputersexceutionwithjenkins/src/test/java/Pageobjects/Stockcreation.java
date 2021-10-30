package Pageobjects;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utilitieskey.keywait;

public class Stockcreation extends keywait {
public static WebDriver driver;
	
	public Stockcreation(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
		}
	@FindBy(css="a#header-module-stock")
	WebElement stock;
  
	@FindBy(css="a#header-module-stock")
	WebElement stock1;
	
    @FindBy(css=".grid-stack-item.home-tile-sec.grey-bg.othermodules.ui-draggable.ui-resizable.ui-resizable-autohide[data-gs-x='0'][data-gs-y='0']")
	WebElement stockenquiry;
    
    @FindBy(css="span.key-header-buttons-text")
    WebElement addstock;
    
    @FindBy(xpath="//input[@autocomplete='off']")
    WebElement name;
    
    
    @FindBy(xpath="//input[@name='Description']")
    WebElement description;
    
    @FindBy(xpath="/html[1]/body[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]/i[1]")
    WebElement stockunit;
    
    @FindBy(xpath="//td[@class='custom-StockingUnitId customwidth key-grid-column']")
    WebElement selctstockunit;
    
    @FindBy(xpath="//i[@class='fa fa-fw fa-refresh']")
    WebElement customerref;
    
    @FindBy(name="StockTakeVariance")
    WebElement stockvariance;
    
    @FindBy(xpath="/html[1]/body[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[6]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]/i[1]")
    WebElement defaultbin;
    
    @FindBy(xpath="//span[normalize-space()='100']")
    WebElement selectbinlocation;
    
    @FindBy(xpath="/html[1]/body[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]/i[1]")
    WebElement primarysupplier;
    
    @FindBy(xpath="//select[@class='form-control active']")
    WebElement searchsupplier;
    
    @FindBy(xpath="//input[@placeholder='Enter Keyword']")
    WebElement enterkeytosearch;
    
    @FindBy(css="td.custom-SupplierName.customwidth.key-grid-column")
    WebElement selectsupplier;
    
    @FindBy(xpath="(//span[normalize-space()='Save'])[1]")
    WebElement save;
    
    @FindBy(css="li.dropdown.hoverBlock")
   	WebElement setting;
   	
   	@FindBy(css="li.dropdown.hoverBlock")
   	WebElement settings;
   	
   	@FindBy(xpath="//a[@title='Logout']")
	WebElement Logout;
      
    public void clickonstock() {
		Actions act=new Actions(driver);
		act.moveToElement(stock).perform();
	}
	public void clickonstock1() {
		stock1.click();
	}
   
	public void clickonstockenquiry() {
		stockenquiry.click();
	}
	public void addnewstock() {
		addstock.click();
	}
	public String generateletter(int length){
	    return RandomStringUtils.randomAlphabetic(length);
	    }
	public void stockname(){
     name.sendKeys("crain" +" - "+"dfghj" + " - " + RandomStringUtils.randomAlphabetic(3) + RandomStringUtils.randomNumeric(3));
     String st=name.getAttribute("value");
     System.out.println("Stockname is"+  st);
	}
	public void enterdescription() {
		description.sendKeys("description for stock");
	}
	public void stockunitmenu() {
		stockunit.click();
	}
	public void selectstockunitoption() {
		selctstockunit.click();
	}
	public void generatecustomreference(){
		customerref.click();
	}
	public void enterstockvariance() throws Exception{
		stockvariance.sendKeys("2");
	}
	public void clickondeafultbin() {
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)","");
		//js.executeScript("arguments[0].scrollIntoView();", defaultbin);
		defaultbin.click();
	}
	public void selectdeafultbinlocation() throws Exception {
		selectbinlocation.click();
		
	}
	public void clickonsupplier() {
		primarysupplier.click();
	}

	public void searchsupplier() {
		searchsupplier.click();
		Select s =new Select(searchsupplier);
	    s.selectByVisibleText("Supplier Name");
		}
	public void enterkey() throws Exception {
		enterkeytosearch.sendKeys("AF");
		Robot robot=new Robot();
    	robot.keyPress(KeyEvent.VK_ENTER);
	}
	 public void selectsuppnumber() throws Exception {
	    	selectsupplier.click();
	    	Robot robot=new Robot();
	    	robot.keyPress(KeyEvent.VK_PAGE_UP);
	    	robot.keyRelease(KeyEvent.VK_PAGE_UP);
	    }

	public void savestock() throws InterruptedException {
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-350)","");
		js.executeScript("arguments[0].scrollIntoView();",save);
		Thread.sleep(3000);
		save.click();
	}
	
public void hoveronsetting() {
	Actions act=new Actions(driver);
	act.moveToElement(setting).perform();
}
public void clickonsettings() throws Exception {
settings.click();
Thread.sleep(3000);
}
public void logout() {
	Logout.click();
}
}


