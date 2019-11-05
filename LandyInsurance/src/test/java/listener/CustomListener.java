package listener;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import base.Initialization;

public class CustomListener extends Initialization implements ITestListener{

	 public void onTestStart(ITestResult result) {
	 
	 
	 }
	 public void onTestSuccess(ITestResult result) {
		// String timestamp= new SimpleDateFormat("yyyy-mm-dd/hh:mm").format(new Date());
		 File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		 try {
			FileUtils.copyFile(src, new File("C:\\Users\\admin\\workspaceLuna\\LandyInsurance\\src\\test\\screenshot"+result.getName()+"_"+"png"));
		} catch (IOException e) {
		
			e.printStackTrace();
		}	 }
		
	 
	 
	 public void onTestFailure(ITestResult result) {
	 String timestamp= new SimpleDateFormat("yyyy-mm-dd/hh:mm").format(new Date());
	 File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	 try {
		FileUtils.copyFile(src, new File("C:\\Users\\admin\\workspaceLuna\\LandyInsurance\\src\\test\\screenshot"+result.getName()+"_"+"png"+timestamp));
	} catch (IOException e) {
	
		e.printStackTrace();
	}	 }
	 
	 public void onTestSkipped(ITestResult result) {
	
	 
	 }
	 
	 public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	 
	 }
	 
	 public void onStart(ITestContext context) {
	System.out.println("Execution is started");
	 
	 }
	 
	 public void onFinish(ITestContext context) {
	
	 System.out.println("Execution is Finished");
	 }
}
