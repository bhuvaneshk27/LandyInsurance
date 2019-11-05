package producertestclasses;

import java.io.IOException;

import org.junit.experimental.theories.suppliers.TestedOn;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import producerpageobject.ErrorMessageValidation;
import base.Initialization;

public class ErrorMessageValidationTest extends Initialization {
	ErrorMessageValidation emv=new ErrorMessageValidation(); 
	@BeforeTest
public void setup() throws IOException{
	initialize() ;
}
	@Test
	public void ValidationTest(){
		
	emv.producerTab();
	emv.AddProducerbutton();}
	@Test
	public void producername(){
		WebElement we=wd.findElement(By.xpath("//input[@placeholder='Producer Name']"));
		we.sendKeys(Keys.ENTER);
		
	}
	@Test
	public void validationMessages(){
	WebElement pnm=wd.findElement(By.xpath("//span[contains(text(),'Producer Name is required!')]"));
	String actual=pnm.getText();
	String expected="Producer Name is required";
	Assert.assertTrue(actual.equals(expected));
	
	}
	//emv.ProducerNameValidation();
	//emv.ProducerCodeValidation();
		
//	@AfterTest
//public void teardown() throws InterruptedException{
//		Thread.sleep(4000);
//wd.close();	
//}
}
