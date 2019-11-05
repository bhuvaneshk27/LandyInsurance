package producertestclasses;

import java.io.IOException;

import junit.framework.Assert;
import listener.CustomListener;
import listener.Retry;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import producerpageobject.SharedProducer;
import base.Initialization;
//@Listeners(CustomListener.class)
public class SharedproducerTest extends Initialization {
		
	@BeforeTest()
	public void setup() throws IOException{
	initialize();
	}
	@Test(priority=1)
	
public void sharedproducer(){
		SharedProducer shp=PageFactory.initElements(wd, SharedProducer.class);
		shp.Producertab();
		shp.producercode("4ALL001");
		shp.producername("4 All Insurance Services");
        shp.produceraddress("1149 Apache,NA12,Topanga,CA,90290");
		shp.producerphonenumber("818-346-4555");}
		
	
	@Test(priority=2)
	public void producerclick() throws InterruptedException{
    SharedProducer shp=PageFactory.initElements(wd, SharedProducer.class);
    Thread.sleep(2000);
	shp.sharedproducerclick();
	}
@Test(priority=3)
public void producernamedisplay(){
	SharedProducer shp=PageFactory.initElements(wd, SharedProducer.class);
	shp.sharedproducer();
  
	}

	
	@AfterTest
	
	public void teardown() throws InterruptedException{
		Thread.sleep(3000);
		wd.close();
	}}


