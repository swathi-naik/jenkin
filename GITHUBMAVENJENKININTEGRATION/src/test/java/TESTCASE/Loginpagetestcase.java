package TESTCASE;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import CONSTANTS.Basekey;
import PAGEOBJECTS.Loginpagepom;
import UTILITIES.Exceldata;




public class Loginpagetestcase extends Basekey {
	 @Test(dataProvider="keydata")  

		public void loginpage(String username,String password) throws Exception {
			
		   
			
			Loginpagepom lp= new Loginpagepom(driver);
			driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
			lp.setusername(username);
			lp.setpassword(password);
			lp.clicksubmit();
			driver.manage().window().maximize();
			
			if(driver.getCurrentUrl().equals("https://windsor.keyazure.co.uk/Home/Index")) {
				Thread.sleep(3000);
				Assert.assertTrue(true);
				System.out.println("logged in successfully");
				
			}
			else {
				Assert.fail("Unsucessfull");
				System.out.println("failed");
			
				
			}
			 lp.clickonstock();
			    lp.clickonstock1(); 
			    lp.hoveronsetting();
		        lp.clickonsettings();
		        lp.clickonselectbranch();
		        lp.clickonselectbranch1();
		        lp.clickonyes();
		     
		        Thread.sleep(5000);
		  
	}	
		
		@DataProvider(name="keydata")

		public Object[][] passData() throws Exception{
		Exceldata al = new Exceldata("C:\\Users\\swath\\eclipse-workspace\\GITHUBMAVENJENKININTEGRATION\\excelsheet\\frameddt.xlsx");
		int rows=al.getRowcount(0);
		Object[][]data = new Object [rows][2];
		for(int i=0;i<rows;i++){
		data[i][0]=al.getCelldata(0, 0, i);
		data[i][1]=al.getCelldata(0, 1, i);
		}
		return data;


		}


}
