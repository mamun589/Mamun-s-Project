package exceptionHandling;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTryCatch {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Thread.sleep(2000);
		
		try {
		driver.findElementById("username1").sendKeys("DemoSalesManager");
		System.out.println("The element Username entered");
		// here intentionally we made mistake using "username1" instead of "username" but in the original software may be an error 
		// this is try syntax 
		}
		
		catch (Exception e){
			System.err.println("The element Username not entered");
			// if try is an error then system will automatically print catch
			// but in catch we use "System.err.println" and it will print the result in console in RED
			// this is catch syntax "catch (Exception e)" E should be capital letter in Exception
			
			//Create RunTime exception
			//throw new RuntimeException();
			//this run time exception will stop the code here
			// but this will stay as a comment until we want to open it
			// we use this one for remembering that there is an error in try method
		}
		
		finally {
			File src = driver.getScreenshotAs(OutputType.FILE);
			File dest = new File("C:\\Users\\mamun\\Desktop\\Selenium Final\\Selenium\\Snapshot\\Screenshot\\image1.png");
			FileUtils.copyFile(src, dest);
			System.out.println("The element found");
			// does not try or catch work finally will print what we want print here
			// same time we also can take screen shot using snapshot code
		}
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
	
        driver.findElementByLinkText("CRM/SFA").click();

        driver.findElementByLinkText("Leads").click();
        
        driver.findElementByLinkText("Create Lead").click();
        
        // enter company name
        driver.findElementById("createLeadForm_companyName").sendKeys("ABC");
        
        // enter first name
        driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
        
        // enter last name
        driver.findElementById("createLeadForm_lastName").sendKeys("Ma");
        
        // enter annual revenue
        driver.findElementById("createLeadForm_annualRevenue").sendKeys("100");
        
        //enter description
        driver.findElementById("createLeadForm_description").sendKeys("Software Testing");
        
        //click create lead
        driver.findElementByClassName("smallSubmit").click();
        
        Thread.sleep(5000);
        
        driver.findElementByPartialLinkText("Request").click();

        driver.close();
	}

}
