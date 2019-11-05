package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Initialization {
	
	public static WebDriver wd=null;
	
	
	public static void initialize() throws IOException {
	//System.getProperty("user.dir");
	//FileInputStream fis=new FileInputStream(new File("C:\\Users\\admin\\workspaceLuna\\LandyInsurance\\src\\test\\propfile\\config.properties")); 
	//p=new Properties(); 
	//p.load(fis);
	//if(p.getProperty("browser").equals("chrome")) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\workspaceLuna\\LandyInsurance\\src\\test\\browser\\chromedriver.exe");
	wd=new ChromeDriver();
	//}else if(p.getProperty("browser").equals("firefox"))
	//{System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\browser\\geckodriver.exe");
	//wd=new FirefoxDriver();
	//}
	//else {
	//System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\browser.ie.exe");
	//wd=new InternetExplorerDriver();
		//}
	wd.get("http://www.landydev.com");
	wd.manage().window().maximize();
	wd.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	//wd.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	WebDriverWait wait=new WebDriverWait(wd,60);
	}
	}