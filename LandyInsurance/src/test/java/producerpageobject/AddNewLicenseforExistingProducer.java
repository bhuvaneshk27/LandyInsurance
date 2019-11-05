package producerpageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import base.Initialization;

public class AddNewLicenseforExistingProducer extends Initialization {
	@FindBy(xpath="//a[@class='ng-tns-c6-2 ng-star-inserted']")
	WebElement protb;
	public void Producertab(){
		protb.click();
	}@FindBy(xpath="//td[contains(text(),'ABIZ001')]")
WebElement Abizclick;
public void Abizproducerclick(){
	Abizclick.click();
}
@FindBy(xpath="//span[@class='ion-plus-round']")
WebElement Addlicsclick;
public void Addlicenseclick(){
	Addlicsclick.click();}

@FindBy(xpath="//div[contains(@class,'form-group')]//select[@id='exampleFormControlSelect1']")
WebElement licsel;
public void licensedropdown(String sel){
	Select sct=new Select(licsel);
	sct.selectByVisibleText(sel);
}

@FindBy(xpath="//div[contains(@class,'col-sm-3')]//select[@id='exampleFormControlSelect1']")
WebElement selst;
public void selectstate(String stesel){
	Select sct=new Select(selst);
	sct.selectByVisibleText(stesel);
}
@FindBy(xpath="//input[contains(@placeholder,'License Number')]")
WebElement lics;
public void Statelicense(String stelic){
	lics.sendKeys(stelic);
	
}
@FindBy(xpath="//input[contains(@class,'form-control ng-untouched ng-pristine ng-invalid')]")
WebElement expdat;
@FindBy(xpath="//span[@class='owl-dt-calendar-cell-content'][contains(text(),'13')]")
WebElement dtck;
public void expiredate(){
	expdat.click();

	JavascriptExecutor jse2 = (JavascriptExecutor)wd;
	jse2.executeScript("arguments[0].scrollIntoView()",dtck); 
}


}
