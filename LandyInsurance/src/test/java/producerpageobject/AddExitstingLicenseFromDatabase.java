package producerpageobject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Initialization;

public class AddExitstingLicenseFromDatabase extends Initialization {
	@FindBy(xpath="//a[@class='ng-tns-c6-2 ng-star-inserted']")
	WebElement protb;
	public void Producertab(){
		protb.click();
	}
@FindBy(xpath="//input[@placeholder='Search Code']")
WebElement srcd;
public void serachcode(String cde){
	srcd.sendKeys(cde);
}
@FindBy(xpath="//input[@placeholder='Search Name']")
WebElement prnm;
public void producername(String nme){
	prnm.sendKeys(nme);
}
@FindBy(xpath="//input[@placeholder='Search Location']")
WebElement pradd;
public void producerlocation(String add){
	pradd.sendKeys(add);
}
@FindBy(xpath="//input[@placeholder='Search Phone No']")
WebElement phn;
public void phonenumber(String prmb){
	WebDriverWait wait=new WebDriverWait(wd,30);
	phn.sendKeys(prmb);
}
@FindBy(xpath="//tr[1]//td[1]")       ////tr[2]//td[1]
WebElement prck;
public void producerAAclick(){
	prck.click();
}
@FindBy(xpath="//span[contains(@class,'ion-plus-round')]")
WebElement adls;
public void addlicense(){
	adls.click();
}
@FindBy(xpath="//div[contains(@class,'form-group')]//select[@id='exampleFormControlSelect1']")
WebElement selct;
public void addlicenseselect(String adfdb){
	Select sct=new Select(selct);
	sct.selectByVisibleText(adfdb);
	
}
@FindBy(xpath="//input[@id='mat-input-1']")
WebElement aed;
public void licensefromDatabase(String lcs){
	aed.sendKeys(lcs);
}
@FindBy(xpath="//button[contains(@class,'appearance-filled size-small status-success shape-rectangle transitions')]")
WebElement sve;
public void savebutton(){
	sve.submit();


}
@FindBy(xpath="//div[@class='col-sm-2']//button[@class='appearance-filled size-tiny status-primary shape-rectangle transitions']")
WebElement cnl;
public void CancelButton(){
	cnl.click();
}

}
