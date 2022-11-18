package learnTestNGParameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificWrapper {
	
public ChromeDriver driver;
	
	/*<parameter name="url" value="http://leaftaps.com/opentaps"></parameter>
	<parameter name="uname" value="DemoSalesManager"></parameter>
	<parameter name="pwd" value="crmsfa"></parameter> */
	// add this 3 tagname to the xml file called "Parameters_CreateLead"

	@Parameters({"url","uname","pwd"})
	//pass this three key from xml file to the Parameters annotation
	
	@BeforeMethod
	public void login(String url, String uname, String pwd) throws InterruptedException  {
		// pass this three key from xml file to the method as an argument
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mamun\\drivers\\chromedriver.exe");
		// WebDriverManager.firefoxdriver().setup();
		 driver = new ChromeDriver();
		// maximize
		driver.manage().window().maximize();
		//implecitly wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// load URL
		driver.get(url);
		// then we dont have to put full url anymore 
		// we just put the variable "url"
		
		// Enter Username 
		driver.findElementById("username").sendKeys(uname);
		// driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		// Enter Password 
		driver.findElementById("password").sendKeys(pwd);
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
