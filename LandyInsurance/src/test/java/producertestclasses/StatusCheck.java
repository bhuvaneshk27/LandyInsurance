package producertestclasses;

import java.io.IOException;







import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import producerpageobject.CheckProducerStatus;
import base.Initialization;

public class StatusCheck extends Initialization {
@BeforeTest
public void setup() throws IOException{
	initialize();
}
@Test //818-346-4555
public void status(){
	CheckProducerStatus ps=PageFactory.initElements(wd,CheckProducerStatus.class);
	ps.Producertab();
	
	ps.searchcode("4ALL001");
	ps.producername("4 All Insurance Services");
	ps.produceraddress("1149 Apache,NA12,Topanga,CA,90290");
	ps.producerphonenumber("818-346-4555");
    ps.producerclick();
    ps.active();
}
@AfterTest
public void teardown() throws InterruptedException{
	Thread.sleep(4000);
	wd.close();
}
}//  //span[@class='ng-star-inserted'][contains(text(),'1')]
// //span[contains(text(),'206')]
// //body[contains(@class,'pace-done')]