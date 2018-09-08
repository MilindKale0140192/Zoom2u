package Controller;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import CommonLibraries.DriverClass;
import CommonLibraries.Login;

public class LaunchBrowser extends DriverClass {
	
   static Login obj1=new Login();


	public static void launchbrowser() throws InterruptedException
	{
		
		 System.out.println("launching chrome browser");
		   System.setProperty("webdriver.chrome.driver",obj1.driverpath() + "\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(3600, TimeUnit.SECONDS);
	        
	        
	        
	        driver.get(obj1.url("https://deliveries.zoom2u.com"));
			   driver.manage().window().maximize();
			   //Thread.sleep(10000);
	
	
	}
	
	 public static void driverclose(){
	    	
	    	driver.quit();
	    }
	    
}
