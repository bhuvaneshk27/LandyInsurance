package producertestclasses;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import producerpageobject.AddExitstingLicenseFromDatabase;
import base.Initialization;

public class AddExitstingLicenseDBTest extends Initialization {
	
	
	@BeforeTest
	public void setup() throws IOException{
		initialize();
	}
@Test ()
public void code() throws InterruptedException{
	
	AddExitstingLicenseFromDatabase adb=PageFactory.initElements(wd, AddExitstingLicenseFromDatabase.class);
adb.Producertab();
	adb.serachcode("AAUN001");
adb.producername("A&A Underwriters, Inc.");
adb.producerlocation("8778 SW 8th Street,Miami,FL,33174");
adb.phonenumber("305-220-7447");
adb.producerAAclick();
adb.addlicense();
adb.addlicenseselect("Add Existing License from Database");
adb.licensefromDatabase("Access First Insurance, LLC");
Thread.sleep(2000);
adb.CancelButton();
//adb.savebutton()

}

@AfterTest
public void teardown() throws InterruptedException{
	Thread.sleep(4000);
	wd.close();
}
}
