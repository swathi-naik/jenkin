package Pageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utilitieskey.keywait;

public class Popagegrnpage extends keywait{
public static WebDriver driver;
	
	public Popagegrnpage(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
		}
	@FindBy(css="a#header-module-stock")
	WebElement stock;
  
	@FindBy(css="a#header-module-stock")
	WebElement stock1;
    @FindBy(xpath="//p[normalize-space()='Purchase Enquiry & Stock Purchasing']")
    WebElement pomodule;
    @FindBy(xpath="//span[normalize-space()='Add']")
    WebElement Add;
    @FindBy(xpath="//div[@class='input-group-btn'and@id='SupplierAccountRecordNo-buttons']")
    WebElement Supplier;
    @FindBy(xpath="//select[@class='form-control active']")
    WebElement searchsupplier;
    
    @FindBy(xpath="//input[@placeholder='Enter Keyword']")
    WebElement enterkeytosearch;
    @FindBy(css="span.input-group-btn")
    WebElement search;
    
    @FindBy(xpath="//td[@title='AF']")
    WebElement selectsupplier;
    
    
    @FindBy(xpath="//i[@title='Add New Line'or@class='fa fa-plus-circle fa-lg']")
    WebElement addnewline;
    @FindBy(xpath="//i[@title='Add New Line'or@class='fa fa-plus-circle fa-lg']")
    WebElement addnewlineclick;
    @FindBy(xpath="//div[@class='input-group-btn'and@id='StockItemRecordNo-buttons']")
    WebElement skuelllipse;
    @FindBy(xpath="//input[@placeholder='Enter Keyword']")
    WebElement entersku;
    @FindBy(xpath="//span/a/i[@class='fa fa-search']")
    WebElement searchsku;
    @FindBy(xpath="//span[normalize-space()='machine - Test - jbq651']")
    WebElement selectsku;
    @FindBy(xpath="//input[@id='OrderQuantity']")
    WebElement qty;
    @FindBy(xpath="//input[@id='CostPriceCurrency']")
    WebElement currency;
    @FindBy(xpath="//input[@id='SellingPriceCurrency']")
    WebElement spcurrency;
    @FindBy(name="Save")
    WebElement saveit;
    @FindBy(xpath="//i[@class='fa fa-list-alt'])[1]])")
    WebElement raisepo;
    @FindBy(xpath="//a[normalize-space()='Confirm Purchase Order']")
    WebElement confirmpo;
    @FindBy(xpath="//button[.='OK']")
    WebElement ok;
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

    public void clickonpo() {
    	pomodule.click();
    }

    public void addbuttonclick() {
    	Add.click();
    }
    public void cliksuppliermenu() {
    	Supplier.click();
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
	public void searchenter() throws AWTException {
		Actions act=new Actions(driver);
		act.moveToElement(search).perform();
	search.click();
	
}
	 public void selectsuppnumber() throws Exception {
	    	selectsupplier.click();
	    	Robot robot=new Robot();
	    	robot.keyPress(KeyEvent.VK_PAGE_DOWN);
	    	robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	    }
   // public void selectsuppnumber() throws Exception {
    	//selectsupnumber.click();
    	//Robot robot=new Robot();
    	//robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		//robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
    //}
	 
 //public void visbleelement() throws Exception {
       // keywait key=new keywait();
       // key.waitforelementvisible(addnewline1, 3000, driver);
		
  // }
 public void hoverclickonaddline() throws Exception {
	 Robot robot=new Robot();
	    robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(3000);
	 Actions act=new Actions(driver);
		act.moveToElement(addnewline).perform();
}
 
	public void clickonaddnewline() throws AWTException{
		Robot robot=new Robot();
 	    robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		addnewlineclick.click();
	
    }
    public void clickonskuellipse() {
    	skuelllipse.click();
    	 }
    public void enterskuhere(String stockname) {
    	entersku.sendKeys(stockname);
    	 }
    public void searchsku() {
    	searchsku.click();
    	 }
    public void selectstock() {
    	selectsku.click();
    	 }
    public void enterqty() {
    	qty.sendKeys("2");
    	 }
    public void entercp() {
    	currency.sendKeys("100");
    }
    public void entersp() {
    	spcurrency.sendKeys("200");
    }
    public void savepo() throws AWTException {
    	saveit.click();
    	Robot robot=new Robot();
    	robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
    }
    public void raisepo() throws Exception {
    	Robot robot=new Robot();
    	robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
    	//JavascriptExecutor js =(JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,350)","");
		//js.executeScript("arguments[0].scrollIntoView();",raisepo);
		raisepo.click();
    }
    public void confirmationpo() {
    	confirmpo.click();
    }
    public void okclick() {
    	ok.click();
    }

    public void hoveronsetting() {
		Actions act=new Actions(driver);
		act.moveToElement(setting).perform();
	}
public void clickonsettings() {
	settings.click();
}

public void logout() {
	Logout.click();
}




















}