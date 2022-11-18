package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
								// Verify the title of the first page using if else and contains method
		String title = driver.getTitle();
		System.out.println(driver.getTitle());
		if (title.contains("Leaf")) {   		// if we use contains we can pick any word from the page title
			System.out.println("Verification Successful");
		} else {
			System.out.println("Verififacation Failed");
			}
	
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[@name='PASSWORD']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[contains(@type,'submi')]").click();
		driver.findElementByLinkText("CRM/SFA").click();
		
								//Verify the title of the crm/sfa page using if else and contains method
		String title1 = driver.getTitle();
		System.out.println("View Page Title  = "+title1);
		if(title1.contains("My")) {
			System.out.println("Varifaction Pass");
		}else {
			System.out.println("Varifaction fail");
		}
		
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys("25255");// type this in the lead id field
		driver.findElementByXPath("//button[text()='Find Leads']").click();// click find lead button
		
		WebElement dis = driver.findElementByXPath("//div[@class='x-paging-info']");
		// locating  the text " no record to display" on the bottom right of the same page using xpath
		// then store that in the variable "dis"
		dis.getText();
		System.out.println(dis.getText());
		
					//Verify the text using if else and equals method
		if(dis.getText().equals("No records to display")) {
			// if we use equals then we have to use whole sentence i. e "No records to display"
			System.out.println("Varifaction Passed");
		}else {
			System.out.println("Varifaction Failed");
		}
	
	}

}
