package sequentialParallelTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateLead {
	
	// for sequential we have to run from "TestNGSequential" xml file in the left bottom
	// for parallel we have to run from "TestNGParallel" xml file in the left bottom
	
	@Test
	public void createLead() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mamun\\drivers\\chromedriver.exe");
		// WebDriverManager.firefoxdriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// maximize
		driver.manage().window().maximize();
		//implecitly wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// load URL
		driver.get("http://leaftaps.com/opentaps");
		// Enter Username 
		driver.findElementById("username").sendKeys("DemoSalesManager");
		// driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		// Enter Password 
		driver.findElementById("password").sendKeys("crmsfa");
		// Click Login Button 
		driver.findElementByClassName("decorativeSubmit").click();
		// click crm/sfa link
		driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(2000);
		
		// click leads
		driver.findElementByLinkText("Leads").click();
		// click create lead link
		driver.findElementByLinkText("Create Lead").click();
		// enter company name
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
		// enter firstName
		driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys("Hema");
		// enter lastName
		driver.findElementByCssSelector("#createLeadForm_lastName").sendKeys("Ma");
		Thread.sleep(3000);
		// driver.findElementById("createLeadForm_lastName").sendKeys("J");
		// Choose source
		/*WebElement src = driver.findElementById("createLeadForm_dataSourceId");
		Select dd = new Select(src);
		dd.selectByVisibleText("Website");
		// enter phone number
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneNumber']").sendKeys("1234567");
		// enter department
		driver.findElementByXPath("//input[@id='createLeadForm_departmentName']").sendKeys("QA");
		// Enter phone number
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("1234567");
		// Enter email address
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("hema@gmail.com");*/
				
		// Click Create lead
		driver.findElementByXPath("//input[@name='submitButton']").click();
		
		driver.close();
	}

}
