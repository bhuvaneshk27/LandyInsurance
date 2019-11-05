package producertestclasses;


import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import listener.CustomListener;
import listener.Retry;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import producerpageobject.AddProducer;
import base.Initialization;
//@Listeners(CustomListener.class)
public class AddNewProducerTest extends Initialization {
	public static 
	AddProducer adp=PageFactory.initElements(wd, AddProducer.class);
	
	@BeforeTest
public void setup() throws IOException{
		initialize();
}    @Test()//retryAnalyzer=Retry.class)
	public void ProducerInfo(){
		adp.ProducerTab();
		adp.addproducerButton();
		
}
@Test
public  void producerinfo(){
	 
	WebElement nme=wd.findElement(By.xpath("//input[contains(@placeholder,'Producer Name')]"));
	nme.sendKeys("wellfigo");
	WebElement web=wd.findElement(By.xpath("//input[contains(@placeholder,'Website')]"));
	web.sendKeys("wellfigo@gmail.com");}

	@Test
	public  void producerDate(){	
		String value="2/2/2020";
		WebElement departCal= wd.findElement(By.xpath("//input[@placeholder='Created Date']"));
		((JavascriptExecutor) wd).executeScript("arguments[0].value='"+value+"'",departCal);}
		@Test 
		public void profilerecived(){
			String value="2/2/2020";
			WebElement departCal= wd.findElement(By.xpath("//input[@placeholder='Profile Received']"));
			((JavascriptExecutor) wd).executeScript("arguments[0].value='"+value+"'",departCal);}	
		
		@Test
		public void profilesend(){
			String value="4/2/2020";
			WebElement departCal= wd.findElement(By.xpath("//input[@placeholder='Profile Sent']"));
			((JavascriptExecutor) wd).executeScript("arguments[0].value='"+value+"'",departCal);
			
	}
	/*	@Test
		public void Active() throws InterruptedException{0000
			WebElement we=wd.findElement(By.xpath(""));
			WebDriverWait wait=new WebDriverWait(wd,30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#exampleFormControlSelect1]")));
			Actions act=new Actions(wd);
			act.click(we).sendKeys(Keys.TAB);
			act.sendKeys(Keys.ENTER);
			
			
			8056063734
			;}*/
		@Test
		public void Active(){
		adp.activeststatus();
		}
		@Test
public void lineofbussiness(){
	WebElement we=wd.findElement(By.xpath("//div[contains(@class,'form-group')]//ng-multiselect-dropdown[contains(@class,'ng-untouched ng-valid ng-dirty')]//div[contains(@class,'multiselect-dropdown')]//div//span[contains(@class,'dropdown-btn')]"));
	we.click();
	we.sendKeys(Keys.TAB);
	WebElement we2=wd.findElement(By.xpath("//div[contains(@class,'form-group')]//div[contains(text(),'Select All')]"));
	we.click();
	}

		
		@Test
		public void Address(){
	adp.address1();
	adp.address2();
		}
		@Test
		public void zipcode(){
			String st="Alaska";
			String ct="Anchorage";
			WebElement we=wd.findElement(By.xpath("//div[contains(@class,'col-sm-3')]//input[contains(@placeholder,'Zip Code')]"));
			WebDriverWait wait=new WebDriverWait(wd, 30);
 wait.until(ExpectedConditions.visibilityOf(we));
we.sendKeys("99501");    
WebElement state=wd.findElement(By.xpath("//div[5]//div[3]//div[1]//select[1]"));

if(state.isDisplayed()){
	
	System.out.println(state.getText().contentEquals(st));
	
	}

	else {
		System.out.println("+++++++false+++++++");
		
		
	}
}


//WebElement city=wd.findElement(By.xpath("//div[@class='col-sm-3']//input[@placeholder='City']"));
//boolean ss=city.equals(ct);
//Assert.assertEquals(s, ct);

		
		@Test
		public void phonenumber(){
			WebElement we=wd.findElement(By.xpath("//input[contains(@placeholder,'Phone Number')]"));
			we.sendKeys("1223456789");
		}
		@Test
		public void faxNumber(){
			WebElement we=wd.findElement(By.xpath("//input[contains(@placeholder,'Fax')]"));
			we.sendKeys("56793023");
		}
		@Test
		public void contactinfo(){
			WebElement we=wd.findElement(By.xpath("//input[contains(@placeholder,'First Name')]"));
			we.sendKeys("bhuvan345");
			WebElement we1=wd.findElement(By.xpath("//input[contains(@placeholder,'Last Name')]"));
			we1.sendKeys("kkeqwe");
		WebElement we3=wd.findElement(By.xpath("//input[contains(@placeholder,'Email Id')]"));
		we3.sendKeys("bkqwer@gmail.com");
		}
		@Test
		public void SameAddress(){
			WebElement we=wd.findElement(By.xpath("//div[contains(@class,'custom-control custom-checkbox')]"));
			 
		}
		@Test
		public void ErrorAndOmmission(){
			String value="23/2/2020";
			try{
			WebElement we=wd.findElement(By.xpath("//input[contains(@placeholder,'Company Name')]"));
			we.sendKeys("hibbgos");
			WebElement we2=wd.findElement(By.xpath("//input[contains(@placeholder,'Policy No')]"));
			we2.sendKeys("2345678");
			WebElement we3=wd.findElement(By.xpath("//input[contains(@placeholder,'Expiration Date')]"));
			((JavascriptExecutor) wd).executeScript("arguments[0].value='"+value+"'",we3);}
			catch(Exception NoSuchElementException){
				
			}
		}
		@AfterTest
	public void teardown() throws InterruptedException  {
		Thread.sleep(2000);
		wd.close();
	}
}
