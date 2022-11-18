package sequentialParallelTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditLead {
	
	// for sequential we have to run from "TestNGSequential" xml file in the left bottom
	// for parallel we have to run from "TestNGParallel" xml file in the left bottom
	
	@Test
	public void editLead() throws InterruptedException {
		
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
		
		// click leads link
		driver.findElementByLinkText("Leads").click();
		// click Find leads link
		driver.findElementByLinkText("Find Leads").click();
		// Enter first name
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Hema");
		// click Find lead button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		driver.close();
	}

}
