package producerpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import base.Initialization;

public class SharedProducer extends Initialization{
	
	@FindBy(xpath="//a[@class='ng-tns-c6-2 ng-star-inserted']")
	WebElement protb;
	public void Producertab(){
		protb.click();
	}
@FindBy(xpath="//input[contains(@placeholder,'Search Code')]")
WebElement procd;
public void producercode(String code){
	procd.sendKeys(code);
}
@FindBy(xpath="//input[contains(@placeholder,'Search Name')]")
WebElement pronme;
public void producername(String name){
	pronme.sendKeys(name);

}
@FindBy(xpath="//input[contains(@placeholder,'Search Location')]")
WebElement proadd;
public void produceraddress(String add){
	proadd.sendKeys(add);

}
@FindBy(xpath="//input[@placeholder='Search Phone No']")
WebElement promb;
public void producerphonenumber(String mob){
	promb.sendKeys(mob);
}
@FindBy(xpath="//a[contains(text(),'mAR - Marsh')]")
WebElement marpro;
@FindBy(xpath="//i[contains(@class,'fa fa-link ng-star-inserted')]")
WebElement shrd;
public void sharedproducerclick(){
	Actions act=new Actions (wd);
	act.moveToElement(shrd).build().perform();
	act.doubleClick(marpro).build().perform();

}

@FindBy(xpath="//tr[1]//td[1]//div[2]//div[1]//h6[1]")
WebElement title;
public void sharedproducer(){
 String actual=title.getText();
 String expected="garsh";
Assert.assertTrue(actual.equals(expected));



	

}

}