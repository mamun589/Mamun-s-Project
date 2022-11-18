package learnWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateLead_WebDriverWait {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Thread.sleep(2000);
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
	
		driver.findElementById("password").sendKeys("crmsfa");
		
		
		driver.findElementByClassName("decorativeSubmit").click();
		
							// WebDriverWait for the button Login
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.className("decorativeSubmit")));
		// WebDriverWait should put on the bottom of the field which one we want the system to be wait
		// here we want for the log in button "driver.findElementByClassName("decorativeSubmit").click();"
		// syntax should be exactly like this
		// WebDriverWait works exactly the same way how the implicitly wait works
		// but implicit wait works for whole class and WebDriverWait works for only those particular field
	
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
