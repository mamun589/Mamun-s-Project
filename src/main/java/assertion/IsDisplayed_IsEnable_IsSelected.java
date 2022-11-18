package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class IsDisplayed_IsEnable_IsSelected {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\mamun\\drivers\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			//maximize the window
			driver.manage().window().maximize();

			//Load url		
			driver.get("https://secure.bankofamerica.com/login/sign-in/signOnV2Screen.go");

			//get title of the page
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("----------------------------------");

			//Assertion
			Assert.assertEquals(title, "Bank of America | Online Banking | Log In | User ID","Verify page title");
			// we know assertEquals has three part actual, expected and message
			// "title" variable that is actual result
			// "Bank of America | Online Banking | Log In | User ID" expected result
			// "Verify page title" message
			// message will only show when the actual and expected result does not match
			
			//isDisplayed(); -"Bank of America" Logo is displayed (true/false)
			boolean logo = driver.findElement(By.xpath("//img[@alt='Bank of America']")).isDisplayed();
			System.out.println(logo);
			System.out.println("----------------------------------");
			
			//Assertion
			Assert.assertTrue(logo, "logo is displayed");
			if (logo==true) {
				System.out.println("logo is displayed");
			} else {
				System.out.println("logo is not displayed");
			}
			System.out.println("----------------------------------");

			//isEnabled() -Get The App link is Enable(true/false)
			boolean getTheAppLink = driver.findElement(By.xpath("//a[@id='choose-device-get-the-app']/span[1]")).isEnabled();
			if(getTheAppLink==true) {
				System.out.println("The Get the App link is Enabled");
			}else {
				System.out.println("The Get the App link is not Enabled");
			}
			System.out.println("----------------------------------");

			//isSelected();-to do this validation we can use only-RadioButton,a CheckBox & Drop-down (true/false)
			//1st click on the "Save this online Id CheckBox"(select) then verify isSelected() otherwise else part will be work
			driver.findElement(By.xpath("//div[@class='remember-info']/input ")).click();
			boolean SaveThisOnlineIdCheckbox = driver.findElement(By.xpath("//div[@class='remember-info']/input ")).isSelected();
			System.out.println(SaveThisOnlineIdCheckbox);
			System.out.println("----------------------------------");

			//Assertion
			Assert.assertTrue(SaveThisOnlineIdCheckbox, "SaveThisOnlineId CheckBox is selected");

			//Validation
			if(SaveThisOnlineIdCheckbox==true) {
				System.out.println("The checkbox is Selected");
			}else {
				System.out.println("The checkbox is not Selected");
			}

			driver.quit();

	}

}
