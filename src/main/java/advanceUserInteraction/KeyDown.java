package advanceUserInteraction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/selectable/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		// because there is only one frame
		// and we have to move from main page to frame
		
		WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement item3 = driver.findElementByXPath("//li[text()='Item 3']");
		WebElement item5 = driver.findElementByXPath("//li[text()='Item 5']");
		// we used text base xpath
		// we want to go down like this 1, 3, 5
		// if we want to go down 1 by 1, then we have to make web element for every item like item1, item2, item3 etc
		
		Actions action = new Actions(driver);
		// created aa object i.e action for the class Actions
		// import from Actions as always
		// and pass the driver
		
		action.keyDown(Keys.CONTROL).click(item1).click(item3).click(item5).release().perform();
		// we use method key down where we have to use keys.control function
		// because this is click thats why we used click function
		// we have pass the web element inside click function i.e item1, item3, item5
		// release function for release the key
		
		driver.switchTo().parentFrame();
		
		driver.close();

	}

}
