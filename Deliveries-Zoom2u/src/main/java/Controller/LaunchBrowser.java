package Controller;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import CommonLibraries.DriverClass;
import CommonLibraries.Login;

public class LaunchBrowser extends DriverClass {
	
   static Login obj1=new Login();


	public static void launchbrowser() throws InterruptedException, MalformedURLException
	{
		
		 System.out.println("launching chrome browser");
		   System.setProperty("webdriver.chrome.driver",obj1.driverpath() + "\\chromedriver.exe");
		   driver=new ChromeDriver();
		 //DesiredCapabilities capability = DesiredCapabilities.chrome();
		//WebDriver driver = new RemoteWebDriver(new URL("http://localhost:8080:4444/wd/hub"), capability);
	     driver.get(obj1.url("https://deliveries.zoom2u.com"));
		 //String page = driver.getPageSource();
		   driver.manage().timeouts().implicitlyWait(3600, TimeUnit.SECONDS);
	        
	        
	        
			   driver.manage().window().maximize();
			   //Thread.sleep(10000);
	
	
	}
	
	 public static void driverclose(){
	    	
	    	driver.quit();
	    }
	    
}
