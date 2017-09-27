

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

public class SeleniumTests {

	
	public static void main (String[] args) throws InterruptedException
	{
		String uuid = UUID.randomUUID().toString();

		//Now this uuid enter to your text box
		
	
	 
        WebDriver driver = new FirefoxDriver();
        //driver.get("localhost:8080/thalamus/bo/app");
        driver.get("https://testa-thalamus-bocc.thalamuslive.com/thalamus/bo/login.jsp");
        
        //Wait for element to show
        	WebDriverWait wait = new WebDriverWait(driver, 10);
        	WebElement loginOk = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("j_username")));
        
        //Complete and login user
        
	        loginOk = driver.findElement(By.id("j_username"));
	        loginOk.sendKeys("core@thalamuscorp.com");
	        loginOk = driver.findElement(By.id("j_password"));
	        
	        loginOk.sendKeys("C12345678");
	        loginOk.submit();
	        
	        
        //Wait for element to show
 
        	WebElement configurationHome = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='thalamusboapp-218829419']/div/div[2]/div[3]/div/div/div[3]/div/span/span")));

        
        	
	        configurationHome.click();
        
        	WebElement touchPoint = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".v-gridlayout-margin-top > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > span:nth-child(1) > span:nth-child(1)")));

        	touchPoint.click();
        	
        	
        	//create
        	WebElement touchPointCreate = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.v-slot-linksbarpanel:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > span:nth-child(1) > span:nth-child(1)")));
        	
        	touchPointCreate.click();
        	
        	//Name

        	WebElement touchPointName = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#gwt-uid-32")));
        	
        	touchPointName.click();
        	touchPointName.sendKeys(uuid);
        	
        	//code
        	WebElement touchPointCode = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#gwt-uid-34")));
        	touchPointCode.click();
        	touchPointCode.sendKeys(uuid);
        	
        	//description        	
        	WebElement touchPointDescription = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#gwt-uid-36")));
        	touchPointDescription.click();
        	touchPointDescription.sendKeys(uuid);
        	
        	
        	//active
        	WebElement touchPointActive = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#gwt-uid-21")));
        	touchPointActive.click();
        	
        	//seleccionar arg
        	WebElement touchPointCountry = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".v-select-twincol-options > option:nth-child(11)")));
        	touchPointCountry.click();        
        	
        	//agrego pais
        	WebElement touchPointCountrySelect = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".v-select-twincol-buttons > div:nth-child(1) > span:nth-child(1) > span:nth-child(1)")));
        	touchPointCountrySelect.click();        
        	
        	
        	//boton brand families
        	WebElement touchPointBrandButton = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.v-filterselect-required:nth-child(1) > div:nth-child(2)")));
        	touchPointBrandButton.click();        
        	
        	//elige valor drop
        	WebElement touchPointBrandSelection = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".v-filterselect-suggestmenu > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1)")));
        	touchPointBrandSelection.click();        
        	
        	//session in time
        	WebElement touchPointSession = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#gwt-uid-44")));
        	touchPointSession.click();
        	touchPointSession.sendKeys("999");
        	
        	
        	//allow login validation
        	WebElement touchPointLoginValid = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.v-gridlayout-slot:nth-child(33) > div:nth-child(1) > div:nth-child(2)")));
        	touchPointLoginValid.click();
        	
        	
        	//valor login validation
        	WebElement touchPointLoginValidSelec = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".gwt-MenuItem-selected")));
        	touchPointLoginValidSelec.click();
        	
        	//save Button
        	WebElement touchPointSave = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".v-align-right > div:nth-child(1) > span:nth-child(1)")));
        	touchPointSave.click();
        	
        	//Name Column
        	WebElement touchPointColum = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".v-align-right > div:nth-child(1) > span:nth-child(1)")));
        	touchPointColum.click();
        	
        	touchPointColum.sendKeys(uuid);
        	touchPointColum.submit();
        	//
        	
        	driver.close();
	}
	
}
