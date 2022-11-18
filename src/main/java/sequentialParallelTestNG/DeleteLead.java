package sequentialParallelTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeleteLead {
	
	// for sequential we have to run from "TestNGSequential" xml file in the left bottom
	// for parallel we have to run from "TestNGParallel" xml file in the left bottom
	
	@Test
	public void deleteLead() throws InterruptedException {
		
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
		
		// click Leads
		driver.findElementByLinkText("Leads").click();
		// click Find lead link
		driver.findElementByLinkText("Find Leads").click();
		// click on phone
		driver.findElementByXPath("//span[text()='Phone']").click();
		// click on email
		// driver.findElementByXPath("//span[text()='Email']").click();
		// enter phone number(areaCode)
		driver.findElementByXPath("//input[@name='phoneAreaCode']").sendKeys("201");
		// enter phone number
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("1234567");
		// enter email address
		// driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("abc@abc.com");	
		
		driver.close();
	}

}
