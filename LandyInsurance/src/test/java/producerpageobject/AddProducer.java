package producerpageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Initialization;

public class AddProducer extends Initialization {
	//@FindBy(xpath="/html[1]/body[1]/ngx-app[1]/ngx-pages[1]/ngx-one-column-layout[1]/nb-layout[1]/div[1]/div[1]/div[1]/nb-sidebar[1]/div[1]/div[1]/nb-menu[1]/ul[1]/li[2]/a[1]/span[1]")
	//WebElement protab;
	public void ProducerTab(){
		
		WebDriverWait wait =new WebDriverWait(wd,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/ngx-app[1]/ngx-pages[1]/ngx-one-column-layout[1]/nb-layout[1]/div[1]/div[1]/div[1]/nb-sidebar[1]/div[1]/div[1]/nb-menu[1]/ul[1]/li[2]/a[1]/span[1]"))).click();}

	//@FindBy(xpath="//span[contains(@class,'ion-plus-round')]")
	//WebElement addbtn;
	public void addproducerButton(){
		WebDriverWait wait =new WebDriverWait(wd,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class,'ion-plus-round')]"))).click();
	}
	
	@FindBy(xpath="/html[1]/body[1]/ngx-app[1]/ngx-pages[1]/ngx-one-column-layout[1]/nb-layout[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nb-layout-column[1]/ngx-producernew-form[1]/nb-card[1]/nb-card-body[1]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
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

@FindBy(xpath="//input[@placeholder='created Date']")
WebElement cdate;
public void createddate(String crdat){
	cdate.sendKeys(crdat);
}
//need to complete 
@FindBy(xpath="//input[@placeholder='profile Sent']")
WebElement prost;
public void newprofilesend(String prosnd ){
	prost.sendKeys(prosnd);
}

@FindBy(xpath="//input[@placeholder='profile Received']")
WebElement prorec;
public void profilerecived(String recvd){
	prorec.sendKeys(recvd);
}
public void activeststatus(){
	WebElement we=wd.findElement(By.xpath("//div[3]//div[3]//div[1]//select[1]"));
WebDriverWait wait =new WebDriverWait(wd,30);
	
	wait.until(ExpectedConditions.elementToBeClickable(we));
	we.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
	
}
@FindBy(xpath="//span[contains(text(),'--- choose an option ---')]")
WebElement lob;
public void lineofbussiness(String lb){
	Select sct=new Select(lob);
	sct.selectByVisibleText(lb);
}
public void address1(){
	WebElement we1=wd.findElement(By.xpath("//div[4]//div[1]//div[1]//textarea[1]"));
	WebDriverWait wait =new WebDriverWait(wd,30);
	
	wait.until(ExpectedConditions.elementToBeSelected(we1));
	we1.sendKeys("dfhdfsdjkfs hfhshbb");

}
public void address2(){
	WebElement we2=wd.findElement(By.xpath("//div[4]//div[2]//div[1]//textarea[1]"));
WebDriverWait wait =new WebDriverWait(wd,30);
	
	wait.until(ExpectedConditions.elementToBeSelected(we2));
	we2.sendKeys("afjifiwo fkefke");
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
@FindBy(xpath="//div[6]//div[2]//div[1]//select[1]")
WebElement whsl;
public void wholsaler(String prowhsl){
	Select sct=new Select(whsl);
	sct.selectByVisibleText(prowhsl);
}
@FindBy(xpath="//div[@class='col-sm-6']//select[@id='exampleFormControlSelect1']")
WebElement rewhsl;
public void RenewalsPoliciestoWholesalerOnly(String whsl){
	Select sct=new Select(rewhsl);
	sct.selectByVisibleText(whsl);
}
@FindBy(xpath="//tr[@class='ng-star-inserted']//td//ng-multiselect-dropdown[@class='ng-untouched ng-valid ng-dirty']//div[@class='multiselect-dropdown']//div//span[@class='dropdown-btn']")
WebElement Dept;
public void Department(String dprt){
	Select sct=new Select(Dept);
	sct.selectByVisibleText(dprt);
}
@FindBy(xpath="//input[@placeholder='firstName']")
WebElement fstnm;
public void firstname(String fname){
fstnm.sendKeys(fname);	
}
@FindBy(xpath="//input[@placeholder='lastName']")
WebElement lstnm;
public void lastname(String lname){
	lstnm.sendKeys(lname);
}
@FindBy(xpath="//input[@placeholder='emailId']")
WebElement proem;
public void email(String eml){
	proem.sendKeys(eml);
}
@FindBy(xpath="//td[5]//button[1]")
WebElement plus;
public void adddepartment (){
	plus.click();
}
@FindBy(xpath="//button[contains(@class,'alignButton appearance-filled size-tiny status-danger shape-rectangle ng-star-inserted transitions')]")
WebElement cnl;
public void canceldepartment(){
	cnl.click();
}
@FindBy(xpath="//div[contains(@class,'columns')]//div[1]//div[1]//select[1]")
WebElement laysl;
public void landysales(String lse){
Select sct=new Select(laysl);
sct.selectByVisibleText(lse);
}
@FindBy(xpath="//div[2]//div[2]//div[1]//select[1]")
WebElement accrt;
public void accountcurrent(String act){
	Select sct=new Select(accrt);
	sct.selectByVisibleText(act);
}
@FindBy(xpath="//div[2]//div[3]//div[1]//select[1]")
WebElement dsca;
public void doescafiling(String cafill){
	Select sct=new Select(dsca);
	sct.selectByVisibleText(cafill);
}
@FindBy(xpath="//div[4]//div[1]//select[1]")
WebElement casrp;
public void casurpluslicense(String casp){
	Select sct=new Select(casrp);
	sct.selectByVisibleText(casp);
}
@FindBy(xpath="//tr[3]//td[1]//div[4]//div[1]//div[1]//textarea[1]")
WebElement billadd1;
public void billingaddress(String biladd){
	billadd1.sendKeys(biladd);
}
@FindBy(xpath="//tr[3]//td[1]//div[4]//div[2]//div[1]//textarea[1]")
WebElement billadd2;
public void billingaddress2(String biladdrs){
	billadd2.sendKeys(biladdrs);
	
}
@FindBy(xpath="//div[contains(@class,'col-sm-4')]//input[contains(@placeholder,'city')]")
WebElement bilcty;
public void billingcity(String bcity)
{
	bilcty.sendKeys(bcity);
}
@FindBy(xpath="//div[contains(@class,'col-sm-4')]//select[@id='exampleFormControlSelect1']")
WebElement bilste;
public void billingstate(String bstate){
	bilste.sendKeys(bstate);
}
@FindBy(xpath="//div[contains(@class,'col-sm-4')]//input[contains(@placeholder,'zip code')]")
WebElement bilzip;
public void billingzipcode(String bzip){
	bilzip.sendKeys(bzip);
}
@FindBy(xpath="//input[contains(@class,'form-control ng-valid ng-dirty ng-touched')]")
WebElement comnew;
public void commissionnewaccountant(String cmna){
	Select sct=new Select (comnew);
	sct.selectByVisibleText(cmna);
	
}
@FindBy(xpath="//body[contains(@class,'pace-done')]//tr//tr[2]//td[1]//input[1]")
WebElement comrew;
public void commissionrewaccountant(String cmra){
	Select sct=new Select (comrew);
	sct.selectByVisibleText(cmra);
}
@FindBy(xpath="//body[contains(@class,'pace-done')]/ngx-app/ngx-pages[contains(@class,'ng-star-inserted')]/ngx-one-column-layout/nb-layout[contains(@class,'window-mode with-scroll')]/div[contains(@class,'scrollable-container')]/div[contains(@class,'layout')]/div[contains(@class,'layout-container')]/div[contains(@class,'content')]/div[contains(@class,'columns')]/nb-layout-column/ngx-producernew-form[contains(@class,'ng-star-inserted')]/nb-card/nb-card-body/form[contains(@class,'example-form ng-untouched ng-pristine ng-invalid')]/table[contains(@class,'table-bordered')]/tbody/tr/td/table[contains(@class,'table-sm')]/tbody/tr[1]/td[2]/input[1]")
WebElement comnewre;
public void commissionnewrealestate(String cmnre ){
	Select sct=new Select (comnewre);
	sct.selectByVisibleText(cmnre);
	
}
 @FindBy(xpath="//body[contains(@class,'pace-done')]//tr//tr[2]//td[2]//input[1]")
 WebElement comreres;
 public void commissionrewrealestate(String rewre){
	 Select sct=new Select (comreres);
		sct.selectByVisibleText(rewre);
 }
 @FindBy(xpath="//tr[3]//td[1]//table[1]//tbody[1]//tr[1]//td[3]//input[1]")
 WebElement comnerep;
 public void commissionnewappraisal(String newap){
	 Select sct=new Select (comnerep);
		sct.selectByVisibleText(newap);
	 
 }
 @FindBy(xpath="//body[contains(@class,'pace-done')]//tr//tr[2]//td[3]//input[1]")
 WebElement comrerep;
 public void commissionreappraisal(String reap){
	 Select sct=new Select (comrerep);
		sct.selectByVisibleText(reap);
 }
 @FindBy(xpath="//body[contains(@class,'pace-done')]/ngx-app/ngx-pages[contains(@class,'ng-star-inserted')]/ngx-one-column-layout/nb-layout[contains(@class,'window-mode with-scroll')]/div[contains(@class,'scrollable-container')]/div[contains(@class,'layout')]/div[contains(@class,'layout-container')]/div[contains(@class,'content')]/div[contains(@class,'columns')]/nb-layout-column/ngx-producernew-form[contains(@class,'ng-star-inserted')]/nb-card/nb-card-body/form[contains(@class,'example-form ng-untouched ng-pristine ng-invalid')]/table[contains(@class,'table-bordered')]/tbody/tr/td/table[contains(@class,'table-sm')]/tbody/tr[1]/td[4]/input[1]")
  WebElement newmis;
 public void commissionnewmisc(String nwmis){
	 Select sct=new Select (newmis);
		sct.selectByVisibleText(nwmis);
 }
 @FindBy(xpath="//body[contains(@class,'nb-theme-default pace-done pace-done')]//tr//tr[2]//td[4]//input[1]")
 WebElement remis;
public void commissionrewmisc(String rewmis){
	 Select sct=new Select (remis);
		sct.selectByVisibleText(rewmis);
}
@FindBy(xpath="//tr[1]//td[5]//input[1]")
WebElement newlaw;
public void commissionnewlawer(String newlawr){
	 Select sct=new Select (newlaw);
		sct.selectByVisibleText(newlawr);}

@FindBy(xpath="//tr[2]//td[5]//input[1]")
WebElement relaw;
public void commissionrelawer(String rewlawr){
	 Select sct=new Select (relaw);
		sct.selectByVisibleText(rewlawr);}


@FindBy(xpath="//input[contains(@placeholder,'companyName')]")
WebElement eocmpy;
public void errorandommissioncompany(String ecmpy){
	eocmpy.sendKeys(ecmpy);}

@FindBy(xpath="//input[contains(@placeholder,'policyNo')]")
WebElement eopol;
public void errorandommissionpolicy(String epoly){
	eocmpy.sendKeys(epoly);}

@FindBy(xpath="//input[contains(@placeholder,'expiration Date')]")
WebElement expdt;
public void errorandommissionexpdate(String edate){
	expdt.sendKeys( edate);}

@FindBy(xpath="//button[contains(@class,'appearance-filled size-tiny status-success shape-rectangle transitions')]")
WebElement save;
public void addproducersave(){
	save.submit();}

}


