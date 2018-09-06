package CommonLibraries;

public class Registration {

	public String SignupTabLocator(){
		
		String SignupTabLocator="//span[@id='register-form-link']";
		return SignupTabLocator;
	}
	
	public String NamefieldLocator(){
		String NamefieldLocator="//div[@class='form-group ng-scope']/input[@placeholder='First name*']";
		return NamefieldLocator;
	}
	
	public String LastNamefieldLocator(){
		
		String LastNamefieldLocator="//div[@class='form-group ng-scope']/input[@placeholder='Last name*']";
		return LastNamefieldLocator;
	}
	
	public String CompanyNamefieldLocator(){
		
		String CompanyNamefieldLocator="//div[@class='form-group ng-scope']/input[@placeholder='Company']";
		return CompanyNamefieldLocator;
	}
	
	public String PhoneNofieldLocator(){
		
		String PhoneNofieldLocator="//div[@class='form-group ng-scope']/input[@placeholder='Phone number*']";
		return PhoneNofieldLocator;
	}
	
	public String EmailfieldLocator(){
		
		String EmailfieldLocator="//div[@class='form-group ng-scope']/input[@placeholder='Email*']";
		return EmailfieldLocator;
	}
	public String PwdfieldLocator(){
		
		String PwdfieldLocator="//div[@class='form-group ng-scope']/input[@placeholder='Password*']";
		return PwdfieldLocator;
	}
	public String ConfirmPwdfieldLocator(){
		
		String ConfirmPwdfieldLocator="//div[@class='form-group ng-scope']/input[@placeholder='Confirm password*']";
		return ConfirmPwdfieldLocator;
	}
	
	public String AccepttermsLocator(){
		
		String AccepttermsLocator="accept-terms";
		return AccepttermsLocator;
	}
	
	public String  SignupbtnLocator(){
		
		String SignupbtnLocator="//div[@class='row']/div[1]/button[contains(text(),'Sign up')]";
		return SignupbtnLocator;
		}
	
	public String herelinktoredirecttoregisterpageLocator(){
		
		
		String herelinkLocator="//a[@class='click-here']";
		return herelinkLocator;
		
	}
	
	public String FirstnamevalidLocator(){
		String FirstnamevalidLocator="//span[contains(text(),'Please enter your first name')]";
		return FirstnamevalidLocator;
	}
	
	public String LnamevalidLocator(){
		String LNamevalidLocator="//span[contains(text(),'Please enter your last name.')]";
		return LNamevalidLocator;
	}
	
	public String PhonevalidLocator(){
		String PhonevalidLocator="//span[contains(text(),'Please enter a valid phone number.')]";
		return PhonevalidLocator;
	}
	
	public String EmailvalidLocator(){
		String EmailvalidLocator="//span[contains(text(),'Please enter a valid email.')]";
		return EmailvalidLocator;
	}
	
	public String PwdvalidLocator(){
		String PwdvalidLocator="//div[@class='form-group ng-scope has-error']/span[contains(text(),'The password must be at least 6 characters long.')]";
		return PwdvalidLocator;
	}
	
	public String ConfirmPwdvalidLocator(){
		String ConfirmPwdvalidLocator="//div[@class='form-group ng-scope has-error']/span[contains(text(),'Please enter confirm password.')]";
		return ConfirmPwdvalidLocator;
	}
	
	public String TermsValidLocator(){
		String TermsValidLocator="//span[contains(text(),'Please accept the customer terms and conditions.')]";
		return TermsValidLocator;
	}
	
	public String RegisteredEmailValidLocator(){
		String RegisteredEmailValidLocator="//span[@class='has-error ng-scope']";
		return RegisteredEmailValidLocator;
	}
	
	public String TermsandConditionsLocator(){
		
		String TermsandConditions = "//a[@class='text-underline']/span[1]";
		return TermsandConditions;
	}
	
	
}
