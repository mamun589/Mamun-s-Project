package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElementById("username").sendKeys("DemoSalesManager");

		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
        driver.findElementByLinkText("CRM/SFA").click();
        
        driver.findElementByLinkText("Leads").click();
        
        driver.findElementByLinkText("Create Lead").click();
        
        Thread.sleep(2000);
        
        					// dropdown "source" 
        
        WebElement source = driver.findElementById("createLeadForm_dataSourceId");
        
        /* we start this line from driver.find..., then for every dropdown we need to store the value in a 
         variable that means we have to press ctrl+2 then press L. then write down the name of the variable 
         for this particular element i.e source and here variable type is webelement instead of string or int etc
         because in selenium everything is webelement */
         
        Select dd = new Select(source);
        /* here we have to create the object of this particular element. dropdown alwayys use select class.
         Select have starts from capital S. then we have to import from Select. then we pass the variable 
         as an argument i.e Select(source). when we pass the variable as an argumenet then we don't need 
         double cottetion"".*/
          
        dd.selectByVisibleText("Employee");
        // we have call with the variable i.e dd
        
        Thread.sleep(2000);
        
        				// dropdown "Marketing Campaign"
        WebElement mktcampaign = driver.findElementByName("marketingCampaignId");
        // every time we need to create a new variable for every dropdown in the same page
        Select dd1 = new Select(mktcampaign);
        // here we dont need to import from select again. we only need one time import
        // variable i.e dd1 should change for every different dropdown
        dd1.selectByValue("CATRQ_AUTOMOBILE");
        // here "CATRQ_AUTOMOBILE" belong to Automobile because we used value
        
        Thread.sleep(2000);
        
        				// dromdown "Industry"
        WebElement industry = driver.findElementByXPath("//select[@id='createLeadForm_industryEnumId']");
        Select dd2 = new Select(industry);
        dd2.selectByIndex(4);
        // java index start from 0 i.e 0,1,2,3 etc
        // here we put 4 that means it gonna select Finance from the dropdown industry
        
        Thread.sleep(2000);
        
        				// dropdown "Ownership" 
        WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId");
        Select dd3 = new Select(ownership);
        dd3.selectByVisibleText("Partnership");
        
        driver.close();
        
	}

	}


