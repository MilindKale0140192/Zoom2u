package CommonLibraries;

public class GetQuoteLocators {
	
	public String Getquotetextlocator_AvailableinHambergerMenu(){
		
		String GetQuoteText_Locator="//li/a/span[contains(text(),'Get quote')]";
		return GetQuoteText_Locator;
	}
	
	public String GetquoteHeadertextLocator(){
		
		String GetQuoteheadertextLocator = "//div[@class='page-body']/div[1]/div[contains(text(),'New quote')]";
		return GetQuoteheadertextLocator;
	}
	
	public String Defaultcounter_AboveShipmentLocator(){
		
		String Defaulttext_AboveShipmentLocator = "//div[@class='page-body']/div[1]/div[2]/div[1]/div[1]/div[1]";
		return Defaulttext_AboveShipmentLocator;
	}
	
	public String DefaultMessage_justAboveShipmentandbelowcounter(){
		
		String DefaultMessage = "//div[@class='page-body']/div[1]/div[2]/div[1]/div[1]/div[2]";
		return DefaultMessage;
	}
	
public String Defaultcounter_AbovePickupDropoffLocator(){
		
		String Defaulttext_AboveShipmentLocator = "//div[@class='page-body']/div[1]/div[2]/div[2]/div[1]/div[1]";
		return Defaulttext_AboveShipmentLocator;
	}
	
	public String DefaultMessage_justAbovePickupdropoffandbelowcounter(){
		
		String DefaultMessage = "//div[@class='page-body']/div[1]/div[2]/div[2]/div[1]/div[2]";
		return DefaultMessage;
	}
	
    public String SmallItemText_GetQuotepage(){
    	
    	String SmallItemlocator = "//div[@role='tablist']/div[1]/div[1]/h4/a/span/div[1]/div[2]/p[1]";
    	return SmallItemlocator;
    }
    
    public String SmallItemlocatorSubText_GetQuotepage(){
    	
    	String SmallItemsubtextlocator = "//div[@role='tablist']/div[1]/div[1]/h4/a/span/div[1]/div[2]/p[2]";
    	return SmallItemsubtextlocator;
    }
    
 public String LargeItemText_GetQuotepage(){
    	
    	String LargeItemlocator = "//div[@role='tablist']/div[2]/div[1]/h4/a/span/div[1]/div[2]/p[1]";
    	return LargeItemlocator;
    }
    
    public String LargeItemlocatorSubText_GetQuotepage(){
    	
    	String LargeItemsubtextlocator = "//div[@role='tablist']/div[2]/div[1]/h4/a/span/div[1]/div[2]/p[2]";
    	return LargeItemsubtextlocator;
    }
	
	public String FirstShipmentHeadingLocator(){
		
		String FirstShipmentName = "//div[@role='tablist']/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]";
		return FirstShipmentName;
	}
	
	public String SecondShipmentHeadingLocator(){
		
		String SecondShipmentName = "//div[@role='tablist']/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/span[1]";
		return SecondShipmentName;
	}
	
	public String ThirdShipmentHeadingLocator(){
		
		String ThirdShipmentName = "//div[@role='tablist']/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/span[1]";
		return ThirdShipmentName;
	}
	
	public String FourthShipmentHeadingLocator(){
		
		String FourthShipmentName = "//div[@role='tablist']/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/span[1]";
		return FourthShipmentName;
	}
	
public String FifthShipmentHeadingLocator(){
		
		String FifthShipmentName = "//div[@role='tablist']/div[1]/div[2]/div[1]/div[5]/div[1]/div[2]/span[1]";
		return FifthShipmentName;
	}
/*
public String SixthShipmentHeadingLocator(){
	
	String SixthShipmentName = ".//*[@id='quoteForm']/div[1]/div/div[2]/div/div[8]/div/h4";
	return SixthShipmentName;
}
*/

public String FirstShipmentdefaultMessageLocator(){
	
	String FirstShipmentdefaultMsgLocator = "//div[@role='tablist']/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[2]";
	return FirstShipmentdefaultMsgLocator;
}

public String SecondShipmentdefaultMessageLocator(){
	
	String SecondShipmentdefaultMsgLocator = "//div[@role='tablist']/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/span[2]";
	return SecondShipmentdefaultMsgLocator;
}

public String ThirdShipmentdefaultMessageLocator(){
	
	String ThirdShipmentdefaultMsgLocator = "//div[@role='tablist']/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/span[2]";
	return ThirdShipmentdefaultMsgLocator;
	}

public String FourthShipmentdefaultMessageLocator(){
	
	String FourthShipmentdefaultMsgLocator = "//div[@role='tablist']/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/span[2]";
	return FourthShipmentdefaultMsgLocator;
}

public String FifthShipmentdefaultMessageLocator(){
	
	String FifthShipmentdefaultMsgLocator = "//div[@role='tablist']/div[1]/div[2]/div[1]/div[5]/div[1]/div[2]/span[2]";
	return FifthShipmentdefaultMsgLocator;
}

 public String DocumentShipmentLocator(){
	
	String DocumentShipment = "//div[@role='tablist']/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]";
	return DocumentShipment;
}

public String LaptopsShipmentLocator(){
	
	String SachelsandLaptopsShipment = "//div[@role='tablist']/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]";
	return SachelsandLaptopsShipment;
}

public String SmallBoxShipmentLocator(){
	
	String SmallBoxShipment = "//div[@role='tablist']/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]";
	return SmallBoxShipment;
}

public String CakesandFlowersShipmentLocator(){
	
	String CakesandFlowersShipment = "//div[@role='tablist']/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]";
	return CakesandFlowersShipment;
}

public String LargeBoxShipmentLocator(){
	
	String LargeBoxShipment = "//div[@role='tablist']/div[1]/div[2]/div[1]/div[5]/div[1]/div[2]";
	return LargeBoxShipment;
}

/*public String LargeItemsShipmentLocator(){
	
	String LargeItemsShipment = ".//*[@id='quoteForm']/div[1]/div/div[2]/div/div[8]";
	return LargeItemsShipment;
}*/

public String GeneralVanSubshipment_LargeItemLocator(){
	
	String GeneralVanSubShipment_LargeItem = "//div[@role='tablist']/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]";
	return GeneralVanSubShipment_LargeItem;
}

public String Furniture_LargeItemLocator(){
	
	String FurnitureSubShipment_LargeItem = "//div[@role='tablist']/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]";
	return FurnitureSubShipment_LargeItem;
}

public String BuildingMaterials_LargeItemLocator(){
	
	String BuildingMaterialsSubshipment_LargeItem = "//div[@role='tablist']/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]";
	return BuildingMaterialsSubshipment_LargeItem;
}

public String GeneralTruckShipments_LargeItemLocator(){
	
	String GeneralTruckShipments_LargeItemLocator = "//div[@role='tablist']/div[2]/div[2]/div[1]/div[4]/div[1]/div[2]";
	return GeneralTruckShipments_LargeItemLocator;
}

public String Pallets_LargeItemLocator(){
	
	String Pallets_LargeItemLocator = "//div[@role='tablist']/div[2]/div[2]/div[1]/div[5]/div[1]/div[2]";
	return Pallets_LargeItemLocator;
}

public String Machinery_LargeItemLocator(){
	
	String Machinery_LargeItemLocator = "//div[@role='tablist']/div[2]/div[2]/div[1]/div[6]/div[1]/div[2]";
	return Machinery_LargeItemLocator;
}

public String Vehicles_LargeItemLocator(){
	
	String Vehicles_LargeItemLocator = "//div[@role='tablist']/div[2]/div[2]/div[1]/div[7]/div[1]/div[2]";
	return Vehicles_LargeItemLocator;
}

public String Container_LargeItemLocator(){
	
	String Container_LargeItemLocator = "//div[@role='tablist']/div[2]/div[2]/div[1]/div[8]/div[1]/div[2]";
	return Container_LargeItemLocator;
}

public String FullTruckLoad_LargeItemLocator(){
	
	String FullTruckLoad_LargeItemLocator = "//div[@role='tablist']/div[2]/div[2]/div[1]/div[9]/div[1]/div[2]";
	return FullTruckLoad_LargeItemLocator;
}
public String FirstSubshipmentHeadingtextLocator(){
	
	String FirstSubshipmentHeadingtextLocator = "//div[@role='tablist']/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]";
	return FirstSubshipmentHeadingtextLocator;
}

public String SecondSubshipmentHeadingtextLocator(){
	
	String SecondSubshipmentHeadingtextLocator = "//div[@role='tablist']/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/span[1]";
	return SecondSubshipmentHeadingtextLocator;
}

public String ThirdSubshipmentHeadingtextLocator(){
	
	String ThirdSubshipmentHeadingtextLocator = "//div[@role='tablist']/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/span[1]";
	return ThirdSubshipmentHeadingtextLocator;
}

public String FourthSubshipmentHeadingtextLocator(){
	
	String FourthSubshipmentHeadingtextLocator = "//div[@role='tablist']/div[2]/div[2]/div[1]/div[4]/div[1]/div[2]/span[1]";
	return FourthSubshipmentHeadingtextLocator;
}

public String FifthSubshipmentHeadingtextLocator(){
	
	String FifthSubshipmentHeadingtextLocator = "//div[@role='tablist']/div[2]/div[2]/div[1]/div[5]/div[1]/div[2]/span[1]";
	return FifthSubshipmentHeadingtextLocator;
}

public String SixthSubshipmentHeadingtextLocator(){
	
	String SixthSubshipmentHeadingtextLocator = "//div[@role='tablist']/div[2]/div[2]/div[1]/div[6]/div[1]/div[2]/span[1]";
	return SixthSubshipmentHeadingtextLocator;
}

public String SeventhSubshipmentHeadingtextLocator(){
	
	String SeventhSubshipmentHeadingtextLocator = "//div[@role='tablist']/div[2]/div[2]/div[1]/div[7]/div[1]/div[2]/span[1]";
	return SeventhSubshipmentHeadingtextLocator;
}

public String EightSubshipmentHeadingtextLocator(){
	
	String EightSubshipmentHeadingtextLocator = "//div[@role='tablist']/div[2]/div[2]/div[1]/div[8]/div[1]/div[2]/span[1]";
	return EightSubshipmentHeadingtextLocator;
}
public String NinethSubshipmentHeadingtextLocator(){
	
	String NinethSubshipmentHeadingtextLocator = "//div[@role='tablist']/div[2]/div[2]/div[1]/div[9]/div[1]/div[2]/span[1]";
	return NinethSubshipmentHeadingtextLocator;
}

public String FirstSubshipmentMsgVerifyLocator(){
	
	String FirstSubshipmentMsgVerifyLocator = "//div[@role='tablist']/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/span[2]";
	return FirstSubshipmentMsgVerifyLocator;
}

public String SecondSubshipmentMsgVerifyLocator(){
	
	String SecondSubshipmentMsgVerifyLocator = "//div[@role='tablist']/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/span[2]";
	return SecondSubshipmentMsgVerifyLocator;
}

public String ThirdSubshipmentMsgVerifyLocator(){
	
	String ThirdSubshipmentMsgVerifyLocator = "//div[@role='tablist']/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/span[2]";
	return ThirdSubshipmentMsgVerifyLocator;
}

public String FourthSubshipmentMsgVerifyLocator(){
	
	String FourthSubshipmentMsgVerifyLocator = "//div[@role='tablist']/div[2]/div[2]/div[1]/div[4]/div[1]/div[2]/span[2]";
	return FourthSubshipmentMsgVerifyLocator;
}

public String FifthSubshipmentMsgVerifyLocator(){
	
	String FifthSubshipmentMsgVerifyLocator = "//div[@role='tablist']/div[2]/div[2]/div[1]/div[5]/div[1]/div[2]/span[2]";
	return FifthSubshipmentMsgVerifyLocator;
}

public String SixthSubshipmentMsgVerifyLocator(){
	
	String SixthSubshipmentMsgVerifyLocator = "//div[@role='tablist']/div[2]/div[2]/div[1]/div[6]/div[1]/div[2]/span[2]";
	return SixthSubshipmentMsgVerifyLocator;
}

public String SeventhSubshipmentMsgVerifyLocator(){
	
	String SeventhSubshipmentMsgVerifyLocator = "//div[@role='tablist']/div[2]/div[2]/div[1]/div[7]/div[1]/div[2]/span[2]";
	return SeventhSubshipmentMsgVerifyLocator;
}

public String EightSubshipmentMsgVerifyLocator(){
	
	String EightSubshipmentMsgVerifyLocator = "//div[@role='tablist']/div[2]/div[2]/div[1]/div[8]/div[1]/div[2]/span[2]";
	return EightSubshipmentMsgVerifyLocator;
}

public String NinethSubshipmentMsgVerifyLocator(){
	
	String NinethSubshipmentMsgVerifyLocator = "//div[@role='tablist']/div[2]/div[2]/div[1]/div[9]/div[1]/div[2]/span[2]";
	return NinethSubshipmentMsgVerifyLocator;
}

public String DocumentQuantitytextfieldLocator(){

	String DocumentQuantitytextfieldLocator = "//div[@role='tablist']/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/input";
	return DocumentQuantitytextfieldLocator;
}

public String LaptopsQuantitytextfieldLocator(){
	
	String LaptopsQuantitytextfieldLocator = "//div[@role='tablist']/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/input";
	return LaptopsQuantitytextfieldLocator;
}

public String SmallBoxQuantitytextfieldLocator(){
	
	String SmallBoxQuantitytextfieldLocator = "//div[@role='tablist']/div[1]/div[2]/div[1]/div[3]/div[1]/div[3]/input";
	return SmallBoxQuantitytextfieldLocator;
}

public String FlowersQuantitytextfieldLocator(){
	
	String FlowersQuantitytextfieldLocator = "//div[@role='tablist']/div[1]/div[2]/div[1]/div[4]/div[1]/div[3]/input";
	return FlowersQuantitytextfieldLocator;
}

public String LargeBoxQuantitytextfieldLocator(){
	
	String LargeBoxQuantitytextfieldLocator = "//div[@role='tablist']/div[1]/div[2]/div[1]/div[5]/div[1]/div[3]/input";
	return LargeBoxQuantitytextfieldLocator;
}

public String QuantityDocumentAddbtnLocator(){
	
	String QuantityAddbtn = "//div[@role='tablist']/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/button[2]/span";
	return QuantityAddbtn;
}

public String QuantityLaptopsAddbtnLocator(){
	
	String QuantityAddbtn = "//div[@role='tablist']/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/button[2]/span";
	return QuantityAddbtn;
}

public String QuantitySmallBoxAddbtnLocator(){
	
	String QuantityAddbtn = "//div[@role='tablist']/div[1]/div[2]/div[1]/div[3]/div[1]/div[3]/button[2]/span";
	return QuantityAddbtn;
}

public String QuantityFlowersAddbtnLocator(){
	
	String QuantityAddbtn = "//div[@role='tablist']/div[1]/div[2]/div[1]/div[4]/div[1]/div[3]/button[2]/span";
	return QuantityAddbtn;
}

public String QuantityLargeBoxAddbtnLocator(){
	
	String QuantityAddbtn = "//div[@role='tablist']/div[1]/div[2]/div[1]/div[5]/div[1]/div[3]/button[2]/span";
	return QuantityAddbtn;
}

public String QuantityDocumentMinusbtnLocator(){
	
	String QuantityMinusbtn = "//div[@role='tablist']/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/button[1]/span";
	return QuantityMinusbtn;
}

public String QuantityLaptopsMinusbtnLocator(){
	
	String QuantityMinusbtn = "//div[@role='tablist']/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/button[1]/span";
	return QuantityMinusbtn;
}

public String QuantitySmallBoxMinusbtnLocator(){
	
	String QuantityMinusbtn = "//div[@role='tablist']/div[1]/div[2]/div[1]/div[3]/div[1]/div[3]/button[1]/span";
	return QuantityMinusbtn;
}

public String QuantityFlowersMinusbtnLocator(){
	
	String QuantityMinusbtn = "//div[@role='tablist']/div[1]/div[2]/div[1]/div[4]/div[1]/div[3]/button[1]/span";
	return QuantityMinusbtn;
}

public String QuantityLargeBoxMinusbtnLocator(){
	
	String QuantityMinusbtn = "//div[@role='tablist']/div[1]/div[2]/div[1]/div[5]/div[1]/div[3]/button[1]/span";
	return QuantityMinusbtn;
}

public String LabelPickupanddropoffAddresses(){
	
	String PickupanddropoffAddress = "//div[@class='pickup_drop_detail-panel']/div[1]/div[1]/div[1]";
	return PickupanddropoffAddress;
}

public String PickupaddresstextfieldLocator(){
	
	String PickupaddresstextfieldLocator = "//div[@class='pickup_drop_detail-panel']/div[1]/div[1]/div[2]/input[2]";
	return PickupaddresstextfieldLocator;
}

public String DropoffAddresstextfieldLocator(){
	
	String DropoffAddresstextfield = "//div[@class='pickup_drop_detail-panel']/div[1]/div[2]/div[1]/input[2]";
	return DropoffAddresstextfield;
}

public String Getquotebtn(){
	
	//String Getquotebtn = "//*[@id='quoteForm']/div[2]/div/button";
	String Getquotebtn = ".//*[@id='quoteForm']/div[2]/div/button";
	//String  Getquotebtn = "//*[@id='quoteForm']/div[2]/div[@class='footer-content']/button[@class='primary-button']";
	return Getquotebtn;
}

public String FirstDeliveryoptionLocator(){
	
	String Sameday = ".//*[@id='quoteForm']/div/div/div[6]/div[1]";
	return Sameday;
}

public String SecondDeliveryoptionLocator(){
	
	String Sameday = ".//*[@id='quoteForm']/div/div/div[6]/div[2]";
	return Sameday;
}

public String ThirdDeliveryoptionLocator(){
	
	String Sameday = ".//*[@id='quoteForm']/div/div/div[6]/div[3]";
	return Sameday;
}

public String FourthDeliveryoptionLocator(){
	
	String Sameday = ".//*[@id='quoteForm']/div/div/div[6]/div[4]";
	return Sameday;
}

public String FirstDeliveryoptionETALocator(){
	
	String FirstDeliveryoptionETA = ".//*[@id='quoteForm']/div/div/div[6]/div[1]/div[1]";
	return FirstDeliveryoptionETA;
}

public String SecondDeliveryoptionETALocator(){
	
	String SecondDeliveryoptionETA = ".//*[@id='quoteForm']/div/div/div[6]/div[2]/div[1]";
	return SecondDeliveryoptionETA;
	

}

public String ThirdDeliveryoptionETALocator(){
	
	String ThirdDeliveryoptionETA = ".//*[@id='quoteForm']/div/div/div[6]/div[3]/div[1]";
	return ThirdDeliveryoptionETA;
}

public String FourthDeliveryoptionETALocator(){
	
	String FourthDeliveryoptionETA = ".//*[@id='quoteForm']/div/div/div[6]/div[4]/div[1]";
	return FourthDeliveryoptionETA;
}

public String PickupGetQuoteDateLocator(){
	
	String PickupGetQuoteDate = ".//*[@id='quoteForm']/div/div/div[4]/div[2]/div[1]/div/input";
	return PickupGetQuoteDate;
}

public String PickupGetQuoteTimeLocator(){
	
	String PickupGetQuoteTime = ".//*[@id='quotePickupTime']";
	return PickupGetQuoteTime;
}

public String FirstPriceLocators(){
	
	String FirstPrice = ".//*[@id='quoteForm']/div/div/div[6]/div[1]/div[2]/span";
	return FirstPrice;
}

public String SecondPriceLocators(){
	
	String SecondPrice = ".//*[@id='quoteForm']/div/div/div[6]/div[2]/div[2]/span";
	return SecondPrice;
}

public String ThirdPriceLocators(){
	
	String ThirdPrice = ".//*[@id='quoteForm']/div/div/div[6]/div[3]/div[2]/span";
	return ThirdPrice;
}

public String FourthPriceLocators(){
	
	String FourthPrice = ".//*[@id='quoteForm']/div/div/div[6]/div[4]/div[2]/span";
	return FourthPrice;
}

public String FirstBookNowbtnLocator() {
	
	String FirstBookNowbtnLocator = ".//*[@id='quoteForm']/div/div/div[6]/div[1]/button";
	return FirstBookNowbtnLocator;
}

public String SecondBookNowbtnLocator() {
	
	String SecondBookNowbtnLocator = ".//*[@id='quoteForm']/div/div/div[6]/div[2]/button";
	return SecondBookNowbtnLocator;
}

public String ThirdBookNowbtnLocator() {
	
	String ThirdBookNowbtnLocator = ".//*[@id='quoteForm']/div/div/div[6]/div[3]/button";
	return ThirdBookNowbtnLocator;
}

public String FourthBookNowbtnLocator() {
	
	String FourthBookNowbtnLocator = ".//*[@id='quoteForm']/div/div/div[6]/div[4]/button";
	return FourthBookNowbtnLocator;
}
}
