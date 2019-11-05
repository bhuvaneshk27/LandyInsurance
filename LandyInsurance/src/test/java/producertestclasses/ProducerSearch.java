package producertestclasses;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.UtilityClass;
import base.Initialization;

public class ProducerSearch extends Initialization{
	@BeforeTest
public void setup() throws IOException{
	initialize() ;
}
@Test
public void ProducerTab(){
	wd.findElement(By.xpath("//span[contains(text(),'Producer')]")).click();
}
/*@Test(dataProvider="TestData")
	public void ProducerCode(String cod){
	WebElement code=wd.findElement(By.xpath("//input[@placeholder='Search Code']"));
	code.sendKeys(cod);}*/
	

@Test(dataProvider="TestData")
public void producerName(String cde,String nme) throws InterruptedException{
	WebElement code=wd.findElement(By.xpath("//input[contains(@placeholder,'Search Code')]"));
	code.sendKeys(cde);
	WebElement name=wd.findElement(By.xpath("//input[@placeholder='Search Name']"));
	Thread.sleep(2000);
	name.sendKeys(nme);
	WebElement tab1=wd.findElement(By.xpath("//table[contains(@class,'table-striped')]//tbody"));
	List <WebElement> tab=tab1.findElements(By.tagName("tr"));
	for(WebElement tr:tab){
		List<WebElement> tdata=tr.findElements(By.tagName("td"));
		Assert.assertEquals(cde, tdata);
			Assert.assertEquals(nme, tdata);
		}
	}


@DataProvider(name="TestData")
public String[][] testdata() throws IOException{
	String data[][]=UtilityClass.getExcelData("Sheet2");
	return data;
}

@AfterTest
public void teardown(){
	wd.quit();
}
}
