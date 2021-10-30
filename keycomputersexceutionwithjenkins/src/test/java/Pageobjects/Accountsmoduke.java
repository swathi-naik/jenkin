package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Accountsmoduke {
public static WebDriver driver;
	
	public Accountsmoduke(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
		}
@FindBy(css="a#header-module-accounts")
WebElement hoveraccounts;

@FindBy(css="a#header-module-accounts")
WebElement clickaccounts;

@FindBy(xpath="//div/p[.='Purchase Invoice Reprint']")
WebElement hoverpir;

@FindBy(xpath="//div/p[.='Purchase Invoice Reprint']")
WebElement clickonPIR;

@FindBy(xpath="//a[normalize-space()='Show All']")
WebElement showall;

@FindBy(xpath="//a[normalize-space()='Accounts Home']")
WebElement Accounts;

@FindBy(xpath="(//div[@class='caption'])[2]")
WebElement producejobinvoice;

@FindBy(xpath="(//span[@class='checkmarklist'])[2]")
WebElement selectjob;

@FindBy(xpath="//a[@id='GenerateServiceInvoice']")
WebElement generateinvoice;
 
public void hoveronaccount() {
	Actions act=new Actions(driver);
	act.moveToElement(hoveraccounts).perform();
}
public void clickonaccountsmodule() {
	clickaccounts.click();
}
public void hoveronpirmodule() {
	Actions act=new Actions(driver);
	act.moveToElement(hoverpir).perform();
}

public void clickonpirmodule() {
	clickonPIR.click();
}
public void showalldata() {
	showall.click();
}
public void navigatetoaccounts() {
	Accounts.click();
}
public void clickonproducejobinvoice() {
	producejobinvoice.click();
}
public void Selectjob() {
	selectjob.click();
}
public void clickongenerateinvoice() {
	generateinvoice.click();
}
}