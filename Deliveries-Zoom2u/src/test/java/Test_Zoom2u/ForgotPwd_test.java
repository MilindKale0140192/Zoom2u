package Test_Zoom2u;

import org.testng.annotations.Test;

import Controller.ForgotPwd_Scenarios;
import Controller.LaunchBrowser_inCrossBrowser;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class ForgotPwd_test extends ForgotPwd_Scenarios {
	
  @Test (priority=18)
  public void FP1() {
	  
	  RedirecttoForgotPwdURL();
  }
  
  @Test (priority=19)
  public void FP2() throws InterruptedException{
	  VerifyResetPwdMessagewith_RegisteredEmail("testcustomerstaging@gmail.com");
  }
  
  @Test (priority=20)
  public void FP3() throws InterruptedException{
	  
	  Loginherebtn_ForgotPwd();
  }
  
  @Test (priority=21)
  public void FP4() throws InterruptedException{
	  
	  InvalidEmail_VerifyMessage("dfddd@gmaf.com");
  }
  
  @Test (priority=22)
  public void FP5(){
	  
	  Cancelbtnworking_ForgotPwd();
  }
  
  @Test (priority=23)
  public void FP6() throws InterruptedException{
	  WithoutEmailVerifyMessage_ForgotPwd("sfsfdsf");
  }
  
  @Test (priority=24)
  public void FP7(){
	  
	  ForgotYourPasswordlinkTextVerify();
  }
  
  @Test (priority=25)
  public void FP8() throws InterruptedException{
	  
	  AvailableTextOn_ForgotPwd();
  }
  
  @Test (priority=26)
  public void FP9() throws InterruptedException{
	  
	  VerifyZoom2uImageandredirection_ForgotPwd();
  }
  
  
  @BeforeTest
  public void beforeTest() throws Exception {
	  launchbrowser();
	  //LaunchBrowser_inCrossBrowser.OpenBrowser("Chrome", "61*64", "Windows 7 64-bit","ForgotPassword_Test");
		 //LaunchBrowser_inCrossBrowser.OpenBrowser("Firefox", "56*64", "Windows 8.1","ForgotPassword_Test");
		 //LaunchBrowser_inCro ssBrowser.OpenBrowser("Internet Explorer", "11", "Windows 7 64-bit","ForgotPassword_Test");
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  
	  driverclose();
	 // LaunchBrowser_inCrossBrowser.driverclose();

  }

}
