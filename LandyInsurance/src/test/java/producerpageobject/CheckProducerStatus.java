package producerpageobject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.Initialization;

public class CheckProducerStatus extends Initialization {
	

	@FindBy(xpath="//a[@class='ng-tns-c6-2 ng-star-inserted']")
	WebElement protb;
	public void Producertab(){
		protb.click();
	}
@FindBy(xpath="//input[@placeholder='Search Code']")
WebElement srcd;
public void searchcode(String cod){
	srcd.sendKeys(cod);
}
@FindBy(xpath="//input[@placeholder='Search Name']")
WebElement nam;
public void producername(String name){
	nam.sendKeys(name);
}
@FindBy(xpath="//input[@placeholder='Search Location']")
WebElement add;
public void produceraddress(String addrs){
	add.sendKeys(addrs);
}
@FindBy(xpath="//input[@placeholder='Search Phone No']")
WebElement promb;
public void producerphonenumber(String mob){
	promb.sendKeys(mob);
}
@FindBy(xpath="//td[contains(text(),'4ALL001')]")
WebElement pro;
public void producerclick(){
	//SeleniumWait.withDriver(wd).withTimeOut(15).forElementToClick(pro);
	pro.click();
}
	@FindBy(xpath="//div[4]//div[4]")
	WebElement act;
	public void active(){
		act.isDisplayed();
		System.out.println("Status=="+act.getText());
	}
	@FindBy(xpath="//span[contains(@class,'ng-star-inserted')][contains(text(),'5')]")
	WebElement pag5;
	public void page5(){
		pag5.click();
		pag5.isDisplayed();
		System.out.println(pag5.getText());
}
	
}
