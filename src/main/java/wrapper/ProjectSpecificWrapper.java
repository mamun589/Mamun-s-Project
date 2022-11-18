package wrapper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificWrapper {
	
public ChromeDriver driver;
	

	@BeforeMethod
	public void login() throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mamun\\drivers\\chromedriver.exe");
		// WebDriverManager.firefoxdriver().setup();
		 driver = new ChromeDriver();
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
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
