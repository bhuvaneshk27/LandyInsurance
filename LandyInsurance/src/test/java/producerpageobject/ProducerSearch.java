package producerpageobject;





import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import base.Initialization;

public class ProducerSearch extends Initialization{
	@FindBy(xpath="//span[contains(text(),'Producer')]")
	WebElement protab;
	public void Producertab(){
	Actions act=new Actions(wd);
	act.click(protab).build().perform();
	}
	
	@FindBy(xpath="//input[@placeholder='Search Code']")
WebElement srch;
public void serachcode(String cod){
	srch.sendKeys(cod);
}
@FindBy(xpath="//input[@placeholder='Search Name']")
WebElement pronm;
public void producername(String proname ){
	pronm.sendKeys(proname);
}
/*@FindBy(xpath="//input[@placeholder='Search Location']")
WebElement loc;
public void address(String add){
	loc.sendKeys(add);;
}
@FindBy(xpath="//input[@placeholder='Search Ph No']")
WebElement mob;
public void phonenumber(String mobnum){
	mob.sendKeys(mobnum);
	
}*/

}

