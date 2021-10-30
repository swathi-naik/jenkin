
package Casespage;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Pageobjects.Stockcreation;

public class Stockcreationcase extends Loginpagecase{
	@Test(priority=1)
	public void stockpage() throws Exception {
		Stockcreation lp =new Stockcreation(driver);
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		    lp.clickonstock();
		    lp.clickonstock1();
	        lp.clickonstockenquiry();
	        lp.addnewstock();
	        lp.stockname();
	        lp.enterdescription();
	        lp.stockunitmenu();
	        lp.selectstockunitoption();
	        lp.generatecustomreference();
	        lp.enterstockvariance();
	        lp.clickondeafultbin();
	        lp.selectdeafultbinlocation();
	        lp.clickonsupplier();
	        lp.searchsupplier();
	        lp.enterkey();
	        lp.selectsuppnumber();
	        lp.savestock();
	        lp.hoveronsetting();
	        lp.clickonsettings();
	        lp.logout();
	        System.out.println("Stock created");
	        
	        
	        
	        
	}}	
