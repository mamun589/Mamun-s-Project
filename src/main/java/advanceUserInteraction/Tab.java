package advanceUserInteraction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tab {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElementByName("email").sendKeys("abc@yahoo.com");
		
		Actions action = new Actions(driver);
		
		action.sendKeys(Keys.TAB).perform();
		// for tab function under action class we use sendkeys method 
		// And inside the sendkeys function we have to use Keys.TAB
		// and it should be capital K For Keys
		
		driver.findElementByXPath("//input[@id='pass']").sendKeys("abc");
		
		action.sendKeys(Keys.ENTER).perform();
		// this line is to make enter under action class
		
		//driver.close();

	}

}
