package producerpageobject;

import org.junit.Assert
;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Initialization;

/*@FindBy(xpath="")
WebElement  ;
public void Producer(){

	String Val="";
	.getText();
	Assert.assertTrue( .equals(Val));
}
*/

public class ErrorMessageValidation extends Initialization {
//@FindBy(xpath="/html[1]/body[1]/ngx-app[1]/ngx-pages[1]/ngx-one-column-layout[1]/nb-layout[1]/div[1]/div[1]/div[1]/nb-sidebar[1]/div[1]/div[1]/nb-menu[1]/ul[1]/li[2]/a[1]/span[1]")
//WebElement protab;
public void producerTab(){
	WebDriverWait wait =new WebDriverWait(wd,40);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/ngx-app[1]/ngx-pages[1]/ngx-one-column-layout[1]/nb-layout[1]/div[1]/div[1]/div[1]/nb-sidebar[1]/div[1]/div[1]/nb-menu[1]/ul[1]/li[2]/a[1]/span[1]"))).click();
	//protab.click();
	
}//@FindBy(xpath="//span[@class='ion-plus-round']")
//WebElement addpro;
public void AddProducerbutton(){
	WebDriverWait wait =new WebDriverWait(wd,40);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/ngx-app[1]/ngx-pages[1]/ngx-one-column-layout[1]/nb-layout[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nb-layout-column[1]/ngx-producer-details[1]/nb-card[1]/nb-card-header[1]/div[1]/div[2]/button[1]/span[1]"))).click();
	//addpro.click();
}
@FindBy(xpath="//input[@placeholder='Producer Name']")
WebElement pronm;
public void ProducerName(String nme){
	//WebDriverWait wait =new WebDriverWait(wd,40);
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/ngx-app[1]/ngx-pages[1]/ngx-one-column-layout[1]/nb-layout[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nb-layout-column[1]/ngx-producernew-form[1]/nb-card[1]/nb-card-body[1]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/div[2]/div[1]/div[1]/div[1]/input[1]"))).click();
	//JavascriptExecutor js= (JavascriptExecutor)wd;
	//js.executeScript("retrun arguments[0].click();",pronm );
	//pronm.sendKeys(Keys.ENTER);
	//pronm.click();
	//Actions act=new Actions(wd);
	//act.moveToElement(pronm).build().perform();
	
	pronm.sendKeys(nme);
}
@FindBy(xpath="//span[contains(text(),'Producer Name is required!')]")
WebElement Prnmval ;
public void ProducerNameValidation(){
	String Val="Producer Name is required!";
	 Prnmval.getText();
	Assert.assertTrue( Prnmval.equals(Val));
}
@FindBy(xpath="//span[contains(text(),'Producer Code is required!')]")
WebElement Prcdval ;
public void ProducerCodeValidation(){
	String Val="Producer Code is required!";
	 Prcdval.getText();
	Assert.assertTrue( Prcdval.equals(Val));
}
@FindBy(xpath="//span[contains(text(),'Created Date is required!')]")
WebElement Prcdeval ;
public void ProducerCreatedateValidation(){
	String Val="Created Date is required!";
	Prcdeval.getText();
	Assert.assertTrue( Prcdeval.equals(Val));

}
@FindBy(xpath="//div[4]//div[1]//div[1]//bfv-messages[1]//span[1]")
WebElement add1 ;
public void ProducerAddress1(){
	String Val="Address Line 1 is required!";
	add1.getText();
	Assert.assertTrue( add1.equals(Val));

}
@FindBy(xpath="//div[contains(@class,'col-sm-3')]//span[contains(@class,'invalid-feedback ng-star-inserted')][contains(text(),'Zip Code is required!')]")
WebElement zpc  ;
public void ProducerZipCode(){
	String Val="Zip Code is required!";
	zpc.getText();
	Assert.assertTrue( zpc.equals(Val));

}
@FindBy(xpath="//div[contains(@class,'col-sm-3')]//span[contains(@class,'invalid-feedback ng-star-inserted')][contains(text(),'City is required!')]")
WebElement cty  ;
public void ProducerCity(){
	String Val="City is required!";
	cty.getText();
	Assert.assertTrue( cty.equals(Val));

}
@FindBy(xpath="//div[contains(@class,'col-sm-3')]//span[contains(@class,'invalid-feedback ng-star-inserted')][contains(text(),'State is required!')]")
WebElement ste ;
public void ProducerState(){
	String Val="State is required!";
	ste.getText();
	Assert.assertTrue( ste.equals(Val));

}
@FindBy(xpath="//span[contains(text(),'Phone Number is required!')]")
WebElement phn  ;
public void ProducerPhone(){
	String Val="Phone Number is required!";
	phn.getText();
	Assert.assertTrue( phn.equals(Val));
}
@FindBy(xpath="//span[contains(text(),'Wholesaler is required!')]")
WebElement whsl ;
public void ProducerWholesaler(){
	String Val="Wholesaler is required!";
	whsl.getText();
	Assert.assertTrue( whsl.equals(Val));
}
@FindBy(xpath="//span[contains(text(),'Renewals/Policies to Wholesaler Only is required!')]")
WebElement rews ;
public void  RenewalsAndWholesaler (){
	String Val="Renewals/Policies to Wholesaler Only is required!";
	rews.getText();
	Assert.assertTrue(rews .equals(Val));
}
@FindBy(xpath="//mat-error[@id='mat-error-7']")
WebElement Frsnm ;
public void FirstName(){
	String Val="First Name is required";
	Frsnm.getText();
	Assert.assertTrue(Frsnm .equals(Val));
}
@FindBy(xpath="//mat-error[@id='mat-error-8']")
WebElement Lstnm ;
public void LastName(){
	String Val="Last Name is required";
	Lstnm.getText();
	Assert.assertTrue(Lstnm .equals(Val));
}
@FindBy(xpath="//mat-error[@id='mat-error-9']")
WebElement Eml  ;
public void EmailId(){
	String Val="EmailId is required";
	Eml.getText();
	Assert.assertTrue( Eml.equals(Val));
}
@FindBy(xpath="//mat-error[@id='mat-error-10']")
WebElement dpt ;
public void ProducerDepartment(){
	String Val="Department is required";
	dpt.getText();
	Assert.assertTrue(dpt .equals(Val));
}
@FindBy(xpath="//span[contains(text(),'Account Current is required!')]")
WebElement Acc ;
public void AccountCurent(){
	String Val="Account Current is required!";
	Acc.getText();
	Assert.assertTrue( Acc.equals(Val));
}
@FindBy(xpath="//span[contains(text(),'Does CA Filling is required!')]")
WebElement Dca ;
public void ProducerCAFilling(){
	String Val="Does CA Filling is required!";
	Dca.getText();
	Assert.assertTrue( Dca.equals(Val));
}
@FindBy(xpath="//span[contains(text(),'CA Surplus Lines License is required!')]")
WebElement Cas ;
public void CASurplus(){
	String Val="CA Surplus Lines License is required!";
	Cas.getText();
	Assert.assertTrue( Cas.equals(Val));
}
@FindBy(xpath="//tr[3]//td[1]//div[5]//div[1]//div[1]//bfv-messages[1]//span[1]")
WebElement BillAdd1 ;
public void BillingAddress1(){
	String Val="";
	 BillAdd1.getText();
	Assert.assertTrue( BillAdd1 .equals(Val));
}
@FindBy(xpath="//div[contains(@class,'col-sm-4')]//span[contains(@class,'invalid-feedback ng-star-inserted')][contains(text(),'Zip Code is required!')]")
WebElement Bzcd ;
public void BillingZipCode(){
	String Val="Zip Code is required!";
	Bzcd.getText();
	Assert.assertTrue( Bzcd.equals(Val));
}
@FindBy(xpath="//div[contains(@class,'col-sm-4')]//span[contains(@class,'invalid-feedback ng-star-inserted')][contains(text(),'City is required!')]")
WebElement Bcty ;
public void BillingCity(){
	String Val="City is required!";
	Bcty.getText();
	Assert.assertTrue( Bcty.equals(Val));
}
@FindBy(xpath="//div[contains(@class,'col-sm-4')]//span[contains(@class,'invalid-feedback ng-star-inserted')][contains(text(),'State is required!')]")
WebElement Bilste ;
public void BillingState(){
	String Val="State is required!";
	Bilste.getText();
	Assert.assertTrue(Bilste .equals(Val));
}
@FindBy(xpath="//mat-error[@id='mat-error-11']")
WebElement ECmpy ;
public void EandOCompany(){
	String Val="Company Name is required";
	ECmpy.getText();
	Assert.assertTrue(ECmpy .equals(Val));
}
@FindBy(xpath="//mat-error[@id='mat-error-12']")
WebElement Epol  ;
public void EandOPolicy (){
	String Val="Policy Number is required";
	Epol.getText();
	Assert.assertTrue(Epol .equals(Val));
}
@FindBy(xpath="//mat-error[@id='mat-error-13']")
WebElement Expd ;
public void Expirationdate(){
	String Val="Expiration Date is required";
	Expd.getText();
	Assert.assertTrue(Expd .equals(Val));
}
}



