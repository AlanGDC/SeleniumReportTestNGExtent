

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.UUID;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.ITestResult;

public class SeleniumTests {

	
	public static void main (String[] args) throws InterruptedException
	{

			//Random String Generator
			String uuid = UUID.randomUUID().toString();
	
		
		 
	        WebDriver driver = new FirefoxDriver();
	        driver.get("https://crmwebtest.capsulecrm.com/");
	        
	      
	        //Wait for element to show
        	WebDriverWait wait = new WebDriverWait(driver, 10);
	        	
	        	
	        //Report
        	ExtentReportsClass report = new ExtentReportsClass();  
	        
        	report.startReport();
	        //Complete and login user
        	
        	
        	WebElement loginOk = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login:usernameDecorate:username")));
        	
        	loginOk = driver.findElement(By.id("login:usernameDecorate:username"));
	        loginOk.sendKeys("Alan_Carvalhosa");
	        
	        loginOk = driver.findElement(By.id("login:passwordDecorate:password"));
	        loginOk.sendKeys("faithless9");

   	
        	WebElement buttonLogin = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("login:login")));
        	buttonLogin.click();
        	try {
        	 	WebElement personNew = wait.until(
                        ExpectedConditions.visibilityOfElementLocated(By.id("ember551")));
        	 	personNew.click();
        	}
        	catch (Exception e) {
        	System.out.println("Hubo error con el usuario '" + e + "'");	
        	
        	report.failTest("Fallo login usuario");
        	report.endTestNew();
        	report.endReport();
        	driver.get("file:///home/thalamus1/selenium/ThalamusTest/test-output/STMExtentReport.html");
        	
        	}
        	report.passTest("Login OK");
        	report.endTestNew();
        	
        	//New Person
 
       
        	

        	        	
        	//Click "Add Person"
        	WebElement buttonAddPerson = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.className("btn-primary")));

        	buttonAddPerson.click();
          	
        	
        	//Complete FirstName and press Save
        	WebElement firstName = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("party:fnDecorate:fn")));
        	firstName.sendKeys(uuid);

        	
        	WebElement saveButton = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("party:save")));
        	saveButton.click();        	
        	
        	//Click Person List
        	 
        	WebElement personList = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#wrapper > div.nav-bar > div.nav-bar-section.nav-bar-main > nav > a.nav-bar-item.nav-bar-item-parties.tipped")));
        	personList.click();        	
         	
        	
        	report.passTest("Create New person OK");
        	report.endTestNew();
        	

          	  	        	
        	report.endReport();
        	driver.get("file:///home/thalamus1/selenium/ThalamusTest/test-output/STMExtentReport.html");
        	
        	
	}
	
}
