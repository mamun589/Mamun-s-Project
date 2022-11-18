package alart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromtAlart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		// WebDriver driver = new ChromeDriver();
		
		/* Here instead of ChromeDriver we can use WebDriver because Webdriver is an interface and all 
		 classes i.e Chromedriver, edgeDriver etc fall under the Wevdriver.
		 i need this explanation because i know that we can make object only for class
		 And when we use wevDriver, the format of driver.findelent... will be change
		 */
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//button[text()='Click for JS Prompt']").click();
		
		Alert promtAlert = driver.switchTo().alert();
		System.out.println(promtAlert.getText());
		
		Thread.sleep(3000);
		
		promtAlert.sendKeys("i got the result");
		
		Thread.sleep(3000);
		
		promtAlert.accept();
		//promtAlert.dismiss();
		
		Thread.sleep(3000);
		
		System.out.println(driver.findElementById("result").getText());
		//this line is only to see the result. we find the element here, get the text and print over here all together
		// this is a smart technique
		
		System.out.println(driver.getCurrentUrl());
		// to see the current url
		
		System.out.println(driver.getTitle());
		
		driver.close();

	}

}
