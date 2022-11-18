package integrateDataProWExcel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils_IntegrateExcelWDatapro.ReadExcel;


public class ProjectSpecificWrapper {
	
public ChromeDriver driver;
	
	/*<parameter name="url" value="http://leaftaps.com/opentaps"></parameter>
	<parameter name="uname" value="DemoSalesManager"></parameter>
	<parameter name="pwd" value="crmsfa"></parameter> */
	// add this 3 tagname to the xml file called "DataProvider_Excel"

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
					// add DataProvider annotation after method
	@DataProvider
	//public void getData() {
	public String[][] getData() throws IOException {
		//add method "public void getData()"
		// but when you add return data in the bottom it will show red
		// mouse over on it and select "change method return type to String[][]"
		// then method will look like public String[][] getData()
		
		ReadExcel r1 = new ReadExcel();
		// make sure import from utils_IntegrateExcelWDatapro
		// we make this object because we want to connect ProjectSpecificWrapper to ReadExcel class
		//return data;
		return r1.readExcel();
		// then call readExcell() from ReadExcel class to use the methods component from here
	}

}
