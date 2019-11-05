package producerpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import base.Initialization;

public class ReplaceExistingLicense extends Initialization{
	@FindBy(xpath="//a[@class='ng-tns-c6-2 ng-star-inserted']")
	WebElement protb;
	public void Producertab(){
		protb.click();}
	
@FindBy(xpath="//input[@placeholder='Search Code']")
WebElement srcd;
public void procode (String cde){
	srcd.sendKeys(cde);
}
//Zolofra Insurance Agency
@FindBy(xpath="//input[@placeholder='Search Name']")
WebElement prnm;
public void proname (String nme){
	prnm.sendKeys(nme);
}
@FindBy(xpath="//input[@placeholder='Search Location']")
WebElement pradd;
public void proaddress(String add){
	pradd.sendKeys(add);
}
@FindBy(xpath="//input[@placeholder='Search Phone No']")
WebElement prmob;
public void producerphonenumber(String mob){
	prmob.sendKeys(mob);
	
}
@FindBy(xpath="//td[contains(text(),'ZOLI001')]")
WebElement prock;
public void producerclick(){
	prock.click();
}
@FindBy(xpath="//span[@class='ion-plus-round']")
WebElement addck;
public void addlicense (){
	addck.click();
	
}
@FindBy(xpath="//div[@class='form-group']//select[@id='exampleFormControlSelect1']")
WebElement sel;
public void licenseselect(String lssl){
Select sct=new Select(sel);
sct.selectByVisibleText(lssl);

}
@FindBy(xpath="//input[@id='mat-input-1']")
WebElement repsd;
public void licensesend(String replc){
	repsd.sendKeys(replc);
}
@FindBy(xpath="//button[@class='appearance-filled size-small status-success shape-rectangle transitions']")
WebElement sve;
public void licensesave(){
sve.click();
}
@FindBy(xpath="//button[@class='appearance-filled size-small status-primary shape-rectangle transitions']")
WebElement res;
public void resetbutton(){
	res.click();
}
@FindBy(xpath="//div[@class='col-sm-2']//span[@class='ion-close-round'][contains(text(),'Close')] ")
WebElement cls;
public void licenseclose(){
	cls.click();
}
}