package producerpageobject;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import base.Initialization;

public class EditProducer extends Initialization{
	//ABP Insurance Agency Inc.
@FindBy(xpath="//h6[contains(text(),'Producer Information')]")
WebElement proinf;
public void producerinfoeditbutton(){
Actions act=new Actions(wd);
act.doubleClick(proinf).build().perform();
}
@FindBy(xpath="//input[@placeholder='producer name']")
WebElement pronm;
public void producername(String proname){
pronm.sendKeys(proname);

}

@FindBy(xpath="//input[@placeholder='producer code']")
WebElement procd;
public void producercode(String procde){
	procd.sendKeys( procde);
	
}

@FindBy(xpath="//input[@placeholder='website']")
WebElement web;
public void website(String proweb){
web.sendKeys(proweb);

}

@FindBy(xpath="//div[@id='cdk-overlay-5']//div[1]//div[4]//div[1]//div[1]//input[1]")
WebElement cdate;
public void createddate(String crdat){
cdate.sendKeys(crdat);
}
@FindBy(xpath="//div[contains(@class,'cdk-global-overlay-wrapper')]//div[2]//div[1]//div[1]//div[1]//input[1]")
WebElement prost;
public void newprofilesend(String prosed){
prost.sendKeys(prosed);
}
@FindBy(xpath="//div[contains(@class,'cdk-global-overlay-wrapper')]//div[2]//div[2]//div[1]//div[1]//input[1]")
WebElement prorec;
public void profilerecived(){

}
@FindBy(xpath="//div[contains(@class,'cdk-global-overlay-wrapper')]//div[2]//div[3]//div[1]//select[1]")
WebElement act;
public void activeststatus(String acts ){
Select sct=new Select(act);
sct.selectByVisibleText(acts);

}
@FindBy(xpath="//span[contains(text(),'--- choose an option ---')]")
WebElement lob;
public void lineofbussiness(String lb){
Select sct=new Select(lob);
sct.selectByVisibleText(lb);
}
@FindBy(xpath="//div[4]//div[1]//div[1]//textarea[1]")
WebElement add1;
public void address1(String adds1){
add1.sendKeys(adds1);
}
@FindBy(xpath="//div[4]//div[2]//div[1]//textarea[1]")
WebElement add2;
public void address2(String adds2){
add2.sendKeys(adds2);
}
@FindBy(xpath="//div[contains(@class,'col-sm-3')]//input[contains(@placeholder,'city')]")
WebElement cty;
public void city(String cts){
cty.sendKeys(cts);
}
@FindBy(xpath="//div[5]//div[2]//div[1]//select[1]")
WebElement ste;
public void state(String proste){
ste.sendKeys(proste);
}
@FindBy(xpath="//div[contains(@class,'col-sm-3')]//input[contains(@placeholder,'zip code')]")
WebElement zpc;
public void zipcode(String zip){
zpc.sendKeys(zip);
}
@FindBy(xpath="//div[@id='cdk-overlay-0']//div[1]//div[1]//select[1]")
WebElement whsl;
public void wholesaler(String whl){
	Select sct=new Select(whsl);
	sct.selectByVisibleText(whl);
}
@FindBy(xpath="//input[contains(@placeholder,'phone number')]")
WebElement phnum;
public void phonenumber(String mob){
phnum.sendKeys(mob);
}
@FindBy(xpath="//input[@placeholder='fax']")
WebElement fx;
public void fax(String profx){
fx.sendKeys(profx);
}
@FindBy(xpath="//div[contains(@class,'col-sm-6')]//select[@id='exampleFormControlSelect1']")
WebElement rpwo;
public void RenewalpolicyToWholesaler(String rewpol){
	rpwo.sendKeys(rewpol);
}
@FindBy(xpath="//button[contains(text(),'Cancel')]")
WebElement cnl;
public void cancelbutton(){
	cnl.click();
}
@FindBy(xpath="//button[contains(@class,'appearance-filled size-tiny status-success shape-rectangle transitions')]")
WebElement sve;
public void savebutton(){ 
	sve.click();
}
@FindBy(xpath="//div[contains(@class,'col-sm-2')]//span[contains(@class,'ion-close-round')][contains(text(),'Close')]")
WebElement cls;
public void closebutton(){
	cls.click();
}
@FindBy(xpath="//textarea[@id='desc']")
WebElement nts;
public void notes(String nte){
	nts.sendKeys(nte);
}
@FindBy(xpath="//span[contains(@class,'setTitle')]//span//span[contains(@class,'fa fa-times')]")
WebElement ntscnl;
public void notescancel(){
	ntscnl.click();
}
@FindBy(xpath="//span[contains(@class,'fa fa-check disable_check')]")
WebElement ntsadd;
public void notesadd(){
	ntsadd.click();
}
@FindBy(xpath="//h6[contains(text(),'Contact Information')]")
WebElement cntinf;
public void ContactInfoEdit(){
	cntinf.click();
}
@FindBy(xpath="//input[contains(@placeholder,'firstName')]")
WebElement fnm;
public void FirstName(String fnme){
	fnm.sendKeys(fnme);
}
@FindBy(xpath="//input[contains(@placeholder,'lastName')]")
WebElement lnm;
public void Lastname(String lnme){
	lnm.sendKeys(lnme);
}
@FindBy(xpath="//input[contains(@placeholder,'emailId')]")
WebElement eid; // 136501
public void EmailId(String emid){
	eid.sendKeys(emid);
}
@FindBy(xpath="//span[contains(@class,'dropdown-btn')]")
WebElement ctdrp;
public void ContactDropDown(String drp){
	Select sct=new Select(ctdrp);
	sct.selectByVisibleText(drp);
}
@FindBy(xpath="//i[contains(@class,'fa fa-plus')]")
WebElement ctpl;
public void contactplus(){
	ctpl.click();
}
@FindBy(xpath="//button[contains(@class,'appearance-filled size-tiny status-success shape-rectangle transitions')]")
WebElement ctsv;
public void ContactSave(){
	ctsv.click();
}
@FindBy(xpath="//button[contains(text(),'Cancel')]")
WebElement ctcn;
public void ContactCancel(){
	ctcn.click();
}
@FindBy(xpath="//div[contains(@class,'col-sm-2')]//span[contains(@class,'ion-close-round')][contains(text(),'Close')]")
WebElement ctcls;
public void ContactClose(){
	ctcls.click();
}
@FindBy(xpath="//h6[contains(text(),'Accounting Information')]")
WebElement aced;
public void AccountingInfoEdit(){
	aced.click();
}
@FindBy(xpath="//div[contains(@class,'row')]//div[1]//div[1]//select[1]")
WebElement Lsd;
public void LandySalesDrp(String drp){
	Select sct =new Select(Lsd);
	sct.selectByVisibleText(drp);
}
@FindBy(xpath="//div[contains(@class,'cdk-global-overlay-wrapper')]//div[2]//div[1]//select[1]")
WebElement Acc;
public void AccountCurrent(String ac){
	Select sct=new Select(Acc);
	sct.selectByVisibleText(ac);
}
@FindBy(xpath="//div[@id='cdk-overlay-4']//div[1]//div[3]//div[1]//select[1]")
WebElement Cafil;
public void DoesCaFilling(String ca){
	Select sct=new Select(Cafil);
	sct.selectByVisibleText(ca);
}
@FindBy(xpath="//div[contains(@class,'row')]//div[4]//div[1]//select[1]")
WebElement Casrp;
public void CaSruplusLineLicense(String call){
	Select sct=new Select(Casrp);
	sct.selectByVisibleText(call);
}
@FindBy(xpath="//div[@id='cdk-overlay-4']//div[1]//div[1]//textarea[1]")
WebElement acinfad;
public void AccountingInfoAddress1(String Add1){
	acinfad.sendKeys(Add1);
}//csstr td 
@FindBy(xpath="//div[contains(@class,'cdk-global-overlay-wrapper')]//div[2]//div[1]//textarea[1]")
WebElement acinad2;
public void AccountingInfoAddress2(String add2){
	acinad2.sendKeys(add2);
	
}
@FindBy(xpath="//input[contains(@placeholder,'zip code')]")
WebElement aczp;
public void AccountingZipCode(String zpc){
	aczp.sendKeys(zpc);
}
@FindBy(xpath="//input[contains(@placeholder,'city')]")
WebElement acty;
public void AccountingCity(){
	String expected="Falls Church";
	acty.getText();
	Assert.assertEquals(acty,expected );
	
}
@FindBy(xpath="//div[contains(@class,'col-sm-4')]//select[@id='exampleFormControlSelect1']")
WebElement Accste;
public void AccountingState(){
	String Expected="virginia";
	Accste.getText();
	Assert.assertEquals(Accste, Expected);
	
}
@FindBy(xpath="//td[contains(@class,'ng-star-inserted')]//input[contains(@class,'form-control ng-pristine ng-valid ng-touched')]")
WebElement ren;
public void RealEstateNew(String renu){
	Select sct=new Select(ren);
	sct.selectByVisibleText(renu);
}
@FindBy(xpath="//tr[2]//td[1]//input[1]")
WebElement rer;
public void RealEstateRenewal(String Rew){
	Select sct=new Select(rer);
	sct.selectByVisibleText(Rew);
}
@FindBy(xpath="//div[contains(@class,'cdk-overlay-container')]//tr[1]//td[2]//input[1]")
WebElement appn;
public void AppraisalNew(String aprsn){
	Select sct=new Select(appn);
	sct.selectByVisibleText(aprsn);
}
@FindBy(xpath="//div[contains(@class,'cdk-overlay-container')]//tr[2]//td[2]//input[1]")
WebElement appr;
public void AppraisalRenewal(String apprs){
Select sct=new Select( appr);
sct.selectByVisibleText(apprs);
}
@FindBy(xpath="//div[contains(@class,'cdk-overlay-container')]//tr[1]//td[3]//input[1]")
WebElement accnw ;
public void AccountantNew(String acn){
	Select sct=new Select(accnw);
	sct.selectByVisibleText(acn);
}
@FindBy(xpath="//div[contains(@class,'cdk-overlay-container')]//tr[2]//td[3]//input[1]")
WebElement accrw;
public void AccountantRenewal(String accr){
	Select sct=new Select(accrw);
	sct.selectByVisibleText(accr);
}
@FindBy(xpath="//tr[1]//td[4]//input[1]")
WebElement miscn;
public void MiscellonusNew(String misn){
	Select sct=new Select(miscn);
	sct.selectByVisibleText(misn);
	//miscn.clear();
	//sct.selectByVisibleText(misn);
}
@FindBy(xpath="//tr[2]//td[4]//input[1]")
WebElement miscr;
public void MiscellonusRenewal(String misr){
	Select sct=new Select(miscr);
	sct.selectByVisibleText(misr);
}
@FindBy(xpath="//tr[1]//td[5]//input[1]")
WebElement lwn;
public void LawyerNew(String lwyn){
	Select sct=new Select(lwn);
	sct.selectByVisibleText(lwyn);
}
@FindBy(xpath="//tr[2]//td[5]//input[1]")
WebElement lwr;
public void LawyerRenewal(String lwyr){
	Select sct=new Select(lwr);
	sct.selectByVisibleText(lwyr);
}
@FindBy(xpath="//button[contains(text(),'Cancel')]")
WebElement accnl;
public void AccountingInfoCancel(){
	accnl.click();
}
@FindBy(xpath="//div[contains(@class,'col-sm-2')]//span[contains(@class,'ion-close-round')][contains(text(),'Close')]")
WebElement accls;
public void AccountingInfoClose(){
	accls.click();
}
@FindBy(xpath="//button[contains(@class,'appearance-filled size-tiny status-success shape-rectangle transitions')]")
WebElement acsve;
public void AccountingInfoSave(){
	acsve.click();
}
@FindBy(xpath="//h6[contains(text(),'License Information')]")
WebElement LicEdt;
public void LicenseEdit(){
	LicEdt.click();
}
@FindBy(xpath="//div[contains(@class,'columns')]//div//tr[1]//td[4]//a[1]//i[1]")
WebElement Lisck;
public void LicenseStateCheck(){
	Lisck.click();
}
@FindBy(xpath="//input[contains(@placeholder,'Search State')]")
WebElement scode;
public void SearchState(String MD){
	scode.getText();
	WebElement State=wd.findElement(By.xpath("//span[contains(text(),'MD')]"));
	Assert.assertTrue(scode.equals(State));
}
@FindBy(xpath="//tr[1]//td[4]//a[3]//i[1]")
WebElement linfcl;
public void licenseInfoCancel(){
	linfcl.click();
}
@FindBy(xpath="//tr[1]//td[4]//a[4]//i[1]")
WebElement linfck;
public void LicenseInfoAccept(){
	linfck.click();
}
@FindBy(xpath="//h6[contains(text(),'License Information')]")
WebElement Licls;
public void LicenseClose(){
	Licls.click();
}
@FindBy(xpath="//input[contains(@placeholder,'Search License No')]")
WebElement Licnum;
public void LicenseNumber(){
	//Licnum.sendKeys("3958");
	Licnum.getText();
	String Expected ="3958";
	Assert.assertEquals(Licnum,Expected);
}
@FindBy(xpath="//h6[contains(text(),'E & O Insurance Information')]")
WebElement EandO;
public void EandOInsuranceEdit(){
	EandO.click();
}
@FindBy(xpath="//a[@class='edit']//i[@class='material-icons']")
WebElement EandOLie;
public void EandOInsuranceLicenseEdit(){
	EandOLie.click();
}
@FindBy(xpath="//input[@class='form-control ng-pristine ng-valid ng-touched']")
WebElement Eandocmp;
public void EandocompanyName(String cpy){
	Eandocmp.sendKeys(cpy);	
}
@FindBy(xpath="//table[@class='table table-bordered separateColor table-sm ng-star-inserted']//td[2]//input[1]")
WebElement Eandopol;
public void Eandopolicynumber(String pol){
	Eandopol.sendKeys(pol);
}
@FindBy(xpath="//table[contains(@class,'table table-bordered separateColor table-sm ng-star-inserted')]//span//input[contains(@class,'form-control ng-untouched ng-pristine ng-valid')]")
WebElement Eandoexp;
public void EandoExpdate(String exp){
	Eandoexp.sendKeys(exp);
}

@FindBy(xpath="//i[contains(@class,'fa fa-times')]")
WebElement Eandocl;
public void EandoClose(String exp){
	Eandocl.click();


}

@FindBy(xpath="//i[contains(@class,'fa fa-check')]")
WebElement Eandok;
public void EandoAccept(){
	Eandok.click();


}
@FindBy(xpath="//h6[contains(text(),'E & O Insurance Information')]")
WebElement Eandocnl;
public void Eandocancel(){
	Eandocnl.click();

}}