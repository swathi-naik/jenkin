package Casespage;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import Pageobjects.Accountsmoduke;


public class Accountcaseall extends Loginpagecase{

	@Test(priority=3)
	public void accountpage() throws Exception {
		Accountsmoduke ac =new Accountsmoduke(driver);
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		
		ac.hoveronaccount();
		ac.clickonaccountsmodule();
		ac.hoveronpirmodule();
		ac.clickonpirmodule();
		ac.showalldata();
		
		
		Thread.sleep(3000);
System.out.println("Navigated to purchase Invoice reprint screen");
 TakesScreenshot ts= (TakesScreenshot)driver;
 File src=ts.getScreenshotAs(OutputType.FILE);
 File dest=new File("C:\\Users\\swath\\swathieclipseworkspace\\keycomputersexceutionwithjenkins\\screenshot.jpeg");
 FileUtils.copyFile(src, dest);
 System.out.println("Screen shot captured for Purchase Invoice Reprint page");
 ac.navigatetoaccounts();
 ac.clickonproducejobinvoice();
 ac.showalldata();
 ac.Selectjob();
 ac.clickongenerateinvoice();
}
}