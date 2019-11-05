package producertestclasses;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import producerpageobject.EditProducer;
import base.Initialization;

public class EditProducerTest extends Initialization {
	EditProducer edp=PageFactory.initElements(wd, EditProducer.class);
	
	@BeforeTest
	public void setup() throws IOException{
		initialize();
	}

	@Test
	public void producereditbutton(){
		edp.producerinfoeditbutton();
	}
	@Test
	public void producername(){
		edp.producername("ABP Insurance Agency Inc");
		
	}
@Test
public void producercode(){
	edp.producercode("ABPI001");
}
@Test
public void createdate(){
	edp.createddate("8/09/2019");
}
@Test //293
public void website(){
	edp.website("NA");
}@Test
public void NewProfileSent(){
	edp.newprofilesend("9/11/2019");
}
@Test
public void ProducerProfileReceived(){
	edp.profilerecived();
}
@Test
public void wholesaler(){
	edp.wholesaler("No");
}
@Test
public void Activestatus(){
	edp.activeststatus("yes");
}
@Test
public void RenewalPolicyTowholesaler(){
	edp.RenewalpolicyToWholesaler("No");
}
@Test
public void cancel(){
	edp.cancelbutton();
}
@Test
public void Notes(){
	edp.notes("Note is added");
}
@Test
public void NotesCancel(){
	edp.notescancel();
}
@Test
public void ContactInfo(){
	edp.ContactInfoEdit();
}
@Test
public void ContactFirstname(){
	edp.FirstName("Todd");
}
@Test
public void ContactLastName(){
	edp.Lastname("Rooney");
}
@Test
public void ContactEmail(){
	edp.EmailId("todd@abpinsurance.com");
}
@Test
public void ContactDepartment( ){
	edp.ContactDropDown("Underwriter");
}
@Test
public void Actions(){
	edp.contactplus();
}
@Test
public void ContactCancel(){
	edp.ContactCancel();
}
@Test
public void AccountingInfo(){
	edp.AccountingInfoEdit();
}
@Test
public void AccountingLandysales(){
	edp.LandySalesDrp("Yes");
}
@Test
public void Accountcurrent(){
	edp.AccountCurrent("No");
}
@Test
public void DoesCafilling(){
	edp.DoesCaFilling("No");
}
@Test
public void Casruplus(){
	edp.CaSruplusLineLicense("No");
}
@Test
public void Address1(){
	edp.address1("7202 Arlington Blvd. #300");
}
@Test
public void Address2(){
	edp.address2("NA");
}
@Test
public void Zipcode(){
	edp.zipcode("22042");
}
@Test
public void AccCity(){
	edp.AccountingCity();
}
@Test
public void AccState(){
	edp.AccountingState();
}
@Test
public void realEstateNew(){
	edp.RealEstateNew("14");
}
@Test
public void realestateRew(){
	edp.RealEstateRenewal("14");
}
@Test
public void appraisernew(){
	edp.AppraisalNew("10");
}
@Test
public void appraiserrew(){
	edp.AppraisalRenewal("10");
}
@Test
public void accountingnew(){
	edp.AccountantNew("15");
}
@Test
public void accountingrew(){
	edp.AccountantRenewal("15");
}
@Test
public void Miscellaneousnew(){
	//edp.MiscellonusNew("12");
	edp.MiscellonusNew("0");
}
@Test
public void Miscellaneousrew(){
	edp.MiscellonusRenewal("0");
}
@Test
public void lawyerNew(){
	edp.LawyerNew("0");
}
@Test
public void LawyerRew(){
	edp.LawyerRenewal("0");
}
@Test
public void AccountingClose(){
	edp.AccountingInfoClose();
}
@Test
public void LicenseEdit(){
	edp.LicenseEdit();
}
@Test
public void LicenseStateCheck(){
	edp.LicenseStateCheck();
}
@Test
public void StateSearch(){
	edp.SearchState("MD");
	edp.LicenseNumber();
}
@Test
public void LicenseClose(){
	edp.LicenseClose();
}
@Test
public void EandoEdit(){
	edp.EandOInsuranceEdit();
}
@Test
public void EandOCompanyname(){
	edp.EandocompanyName("American Southern Home Ins Co");
}
@Test
public void EandoPolicyNumber(){
	edp.Eandopolicynumber("3TA6PL000001100");
}
@Test
public void EandOClose(){
	edp.Eandocancel();}

@AfterTest
public void teardown(){
	wd.close();
}

}