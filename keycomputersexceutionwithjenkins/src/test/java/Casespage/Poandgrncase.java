package Casespage;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Pageobjects.Popagegrnpage;

public class Poandgrncase extends Loginpagecase {
	@Test(priority=2)
	public void Popage() throws Exception {
		Popagegrnpage po =new Popagegrnpage(driver);
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		
		po.clickonstock();
		po.clickonstock1();
		po.clickonpo();
		po.addbuttonclick();
		po.cliksuppliermenu();
		po.searchsupplier();
        po.enterkey();
        po.searchenter();
        po.selectsuppnumber();
		//po.selectsuppnumber();
       // po.visbleelement();
		po.hoverclickonaddline();
		po.clickonaddnewline();
		po.clickonskuellipse();
		po.enterskuhere("Machine");
		po.searchsku();
		po.selectstock();
		po.enterqty();
		po.entercp();
		po.entersp();
		po.savepo();
		po.raisepo();
		po.confirmationpo();
		po.okclick();
		 po.hoveronsetting();
	     po.clickonsettings();
	     po.logout();
}
}