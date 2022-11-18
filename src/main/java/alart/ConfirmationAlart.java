package alart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		
		driver.findElementByXPath("//input[@name='PASSWORD']").sendKeys("crmsfa");
		// here we used different attribute i.e name and value i.e PASSWORD. and this is 1 of 1
		
		driver.findElementByXPath("//input[@type='submit']").click();
		
		 driver.findElementByLinkText("CRM/SFA").click();
		 // in case of any link normally we dont use xpath.  we goona use direct locator that is linktext
		 
		 driver.findElementByXPath("//a[text()='Leads']").click();
		 // here we used text base xpath which is based on the text of the element i.e Leads 
		 
		 driver.findElementByLinkText("Merge Leads").click();
		 
		 driver.findElementByXPath("//a[text()='Merge']").click();
		 
		 Thread.sleep(3000);
		 
		 Alert confirmationAlertTxt = driver.switchTo().alert();
		 System.out.println(confirmationAlertTxt.getText());
		 /*we can put getText after driver.SwitchTo().alert() but we can also put inside the sysout statement
		  confirmationAlertTxt.getText() like this. both of this are same thing. this is called alert class.
		  because we did not put getText on top line thats why its came Alert instead of String 
		  */
		 
		 Thread.sleep(3000);
		 
		 confirmationAlertTxt.accept();
		 //confirmationAlertTxt.dismiss();
		 
		 /*this is different way of accept or dismiss the alert message. we can also use 
		  driver.switchto().alert().accept(); 
		  both are correct
		  */
		 
		 Thread.sleep(3000);
		 
		 driver.close();

	}

}
