package advanceUserInteraction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverOn {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://mrbool.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement content = driver.findElementByClassName("menulink");
		// we have create a variable using ctrl+2 L and content is element name
		// and element name also is content in the web page
		
		Actions action = new Actions(driver);
		/* we have to create an of Actions class. then we have to import from Actions because any time we
		we create an object have to import from there. then we have to pass the driver inside the
		Actions function*/
		
		Thread.sleep(3000);
		
		action.moveToElement(content).perform();
		// any time we call a method i.e move to element by using object. 
		// then we have to pass the web element i.e content here
		
		Thread.sleep(3000);
		
							// click on Articles
		driver.findElementByXPath("(//a[text()='Articles'])[1]").click();
		//here we used text base xpath but there are three menu thats why we used collection xpath
		// and this is the first option(Aricle) from the content element
		
		Thread.sleep(3000);
		driver.close();

	}

}
