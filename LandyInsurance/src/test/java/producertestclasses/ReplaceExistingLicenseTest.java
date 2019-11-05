package producertestclasses;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import producerpageobject.ReplaceExistingLicense;
import base.Initialization;

public class ReplaceExistingLicenseTest extends Initialization {

	@BeforeTest
	public void setup() throws IOException{
		initialize();	
	}
	@Test
	public void replace() throws InterruptedException{
	ReplaceExistingLicense rps=PageFactory.initElements(wd, ReplaceExistingLicense.class);
	rps.Producertab();
	rps.procode("ZOLI001");
	rps.proname("Zolofra Insurance Agency");
	rps.proaddress("PO Box 8787,Red Bank,NJ,7701");
	rps.producerphonenumber("732-542-1757");
	rps.producerclick();
	rps.addlicense();
	rps.licenseselect("Replace Existing License");
	rps.licensesend("The Buckner Company");
	//rps.licensesave();
	rps.resetbutton();
	Thread.sleep(2000);
	rps.licenseclose();
	
	
	}
	
	@AfterTest
	public void teardown() throws InterruptedException{
		Thread.sleep(5000);
		wd.close();
	}
}
