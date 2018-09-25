package Test_Zoom2u;

import org.testng.annotations.Test;

import CommonLibraries.DriverClass;
import Controller.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Login_test extends LaunchBrowser{
   //LaunchBrowser_inCrossBrowser obj1=new LaunchBrowser_inCrossBrowser();
   Loginscenarios obj2=new Loginscenarios();
  
   @Test (priority=2)
  public void L1() throws InterruptedException{
    
	 obj2.loginwithvalidcredentials("keenal0904@gmail.com","123456");
	// Thread.sleep(10000);
	
	}
	
	@Test (priority=3)
	public void L4() throws InterruptedException{
		obj2.loginwithinvalidcredentials("miiind@gmail.com", "1234567");
		// Thread.sleep(10000);

	}
	
	@Test (priority=4)
	public void L5() throws InterruptedException{
		obj2.loginwithoutcredentials();
		// Thread.sleep(10000);

	}
	
	@Test (priority=5)
	public void L2() throws InterruptedException{
		
		obj2.loginwithinvalidpassword("keenal0904@gmail.com", "123456789");
		// Thread.sleep(10000);

	}
	
	@Test (priority=6)
	public void L3() throws InterruptedException{
		System.out.println("...........................................................................................................");
		System.out.println("Login with invalid username and valid pwd 3rd test case starting.........");
		obj2.loginwithinvalidcredentials("milindff@gmail.com", "123456");
		System.out.println("Login with invalid username and valid pwd 3rd test case completed");
		System.out.println("...........................................................................................................");
		// Thread.sleep(10000);

	}
	/*
	@Test (priority=7)
	public void L6() throws InterruptedException{
		obj2.MaskedPwdfield();
		// Thread.sleep(10000);
	}
	
	@Test (priority=8)
    public void L7() throws InterruptedException{
		obj2.redirectTosameloginurlOnRefresh();
		 //Thread.sleep(10000);

	}
	
	@Test (priority=1)
	public void L8() throws InterruptedException 
	{
		obj2.focusonloginsection();
		// Thread.sleep(10000);

	}
	
	@Test (priority=9)
	public void L9() throws InterruptedException 
	{
		obj2.verifydisableaccounttext("testcustomer03@gmail.com", "123456");
		 //Thread.sleep(10000);
}
	*/
	
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	 //LaunchBrowser_inCrossBrowser.OpenBrowser("Chrome", "61*64", "Windows 7 64-bit", "LoginModule_Test");
	 //LaunchBrowser_inCrossBrowser.OpenBrowser("Firefox", "55*64", "Windows 7 64-bit", "LoginModule_Test");
	 //LaunchBrowser_inCrossBrowser.OpenBrowser("Internet Explorer", "11", "Windows 7 64-bit", "LoginModule_Test");
	 launchbrowser();
	 //Thread.sleep(10000);
 }
  
  @AfterTest
  public void afterTest() throws InterruptedException {
	  
	  
	driverclose();
  }


 
}
