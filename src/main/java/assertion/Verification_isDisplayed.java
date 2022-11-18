package assertion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Verification_isDisplayed {

	public static void main(String[] args) throws InterruptedException {
		
				//Launch Chrome browser
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\drivers\\chromedriver.exe");
				
				//ChromeDriver is a class
				ChromeDriver driver = new ChromeDriver();
				
				//Load URL
				driver.get("http://leaftaps.com/opentaps/control/login");
				
				//Get page title
				System.out.println(driver.getTitle());
				
				//Maximize window
				driver.manage().window().maximize();
				
				//Implicit wait
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
				//Enter UserName
				driver.findElementById("username").sendKeys("DemoSalesManager");
				
				//Enter password
				driver.findElementById("password").sendKeys("crmsfa");
				
				Thread.sleep(2000);
				//Click login
				driver.findElementByClassName("decorativeSubmit").click();
				
				// another way of getting title
				String title = driver.getTitle();
				System.out.println(title);
				
				//Logout button is displayed or not
				boolean LogoutBtn = driver.findElementByClassName("decorativeSubmit").isDisplayed();
				Assert.assertTrue(LogoutBtn, "logout button is displayed");
				// there is no relation between assert and isDisplayed method
				// assert is also used for verification
				// "LogoutBtn" this is the variable(that will be actual result) and "logout button is displayed" this is the expected result
				// assert not going to show anything if the variable and expected result match
				// assert will show result only when the expected result is false
				
				if (LogoutBtn==true) {
					System.out.println("Logout Button is Displayed");
				} else {
					System.out.println("Logout Button is Not Displayed");
				}
				// isDisplayed method is not going to work if we dont put "if else" formula
				// because the data type is boolean thats why we use ==true
				// because we know boolean only show true or false
			
				
				//click logout
				driver.findElement(By.className("decorativeSubmit")).click();
				
				//Explicit wait
				Thread.sleep(3000);
								
				//close browser
				driver.close();
	}

}
