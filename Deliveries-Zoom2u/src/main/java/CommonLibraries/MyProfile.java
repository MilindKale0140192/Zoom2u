package CommonLibraries;

public class MyProfile {

	
	public String FNamefieldLocator(){
		
		String FName="//div/div[1]/input[contains(@name,'firstName')]";
		return FName;
	}
	
	public String LNamefieldLocator(){
		
		String LName="//div/div[1]/input[contains(@name,'lastName')]";
		return LName;
	}
	
	public String PhonenumfieldLocator(){
		
		String Phonenum="//div/div[2]/input[contains(@name,'phone')]";
		return Phonenum;
		
	}
	
	public String CompanyNamefieldLocator(){
		
		String CompanyName="//div/div[2]/input[contains(@placeholder,'Company')]";
		return CompanyName;
	}
	
	public String AddressfieldLocator(){
		String AddressField="//div/div[2]/input[contains(@name,'address')]";
		return AddressField;
	}
	
	public String AccountEmailfieldLocator(){
		
		String AccountEmail="//div[@class='page-profile']/div[5]/div[1]/div[2]/input";
		return AccountEmail;
	}
	
	public String InvoiceEmailfieldLocator(){
		String InvoiceEmail="//div[@class='page-profile']/div[5]/div[2]/div[2]/input";
		return InvoiceEmail;
	}
	
	public String ChangePwdbtnLocator(){
		String ChangePwdbtnLocator="//div[@class='page-profile']/div[6]/div[1]/button";
		return ChangePwdbtnLocator;
	}
	
}
