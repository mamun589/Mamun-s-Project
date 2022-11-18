package advanceUserInteraction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement rightclick = driver.findElementByXPath("//span[text()='right click me']");
		// we find element here by id locator. and created web element
		// because we know anything we find by element we have to store in a variable
		
		Actions action = new Actions(driver);
		// created object i.e action for the class Actions
		// import from Actions as always
		// and pass the driver
		
		Thread.sleep(3000);
		
		action.contextClick(rightclick).perform();
		// used context click method for right click
		// passed the web element where to right click
		
		driver.close();

	}

}
