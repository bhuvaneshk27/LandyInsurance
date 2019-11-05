package listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry  implements IRetryAnalyzer {
	   private int count = 0;
	    private static int maxTry = 4;
	 
	    @Override
	    public boolean retry(ITestResult iTestResult) {
	         
	                              
	          if (count < maxTry) {
	            count++;
	                      
	            return true;     
	            } 
	            
	        return false;
	    }
	    }
	
	