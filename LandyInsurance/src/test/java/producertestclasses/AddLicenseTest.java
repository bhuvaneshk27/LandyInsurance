package producertestclasses;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import producerpageobject.AddNewLicenseforExistingProducer;
import base.Initialization;

public class AddLicenseTest extends  Initialization {
	@BeforeTest
	public void setup() throws IOException{
		initialize();
	}
	@Test
	public void addlicenseexitsproducer() throws InterruptedException{
		
		AddNewLicenseforExistingProducer anlp=PageFactory.initElements(wd, AddNewLicenseforExistingProducer.class);
		anlp.Producertab();
		anlp.Abizproducerclick();
anlp.Addlicenseclick();
anlp.licensedropdown("Create New");
anlp.selectstate("Illinois");
anlp.Statelicense("2345689");
Thread.sleep(2000);
anlp.expiredate();
	}
	@AfterTest
	public void teardown() throws InterruptedException{
		Thread.sleep(5000);
	wd.close();
	}
}
