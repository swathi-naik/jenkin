package TESTCASE;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import PAGEOBJECTS.Creatingstockpom;

public class Creatingstockcase extends Loginpagetestcase{
	@Test(priority=1)
	public void stockpage() throws Exception {
		Creatingstockpom lp =new Creatingstockpom(driver);
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


