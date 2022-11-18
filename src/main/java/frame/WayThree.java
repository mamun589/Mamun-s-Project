package frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WayThree {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// there is two way for web element 
		
		Thread.sleep(2000);
								//way one or easy way
		driver.switchTo().frame(driver.findElementByXPath("//iframe[@id='iframeResult']"));
		// here we used xpath inside the frame function so that we don't have to use index
		// This xpath belong to the frame line to enter into the frame not in the element
		
		Thread.sleep(2000);
								//way two or using variable
		//WebElement anything = driver.findElementByXPath("//iframe[@id='iframeResult']");
		// we start from driver...... then ctrl+2 then L
		// anything is the variable
		
		//driver.switchTo().frame(anything);
		// we have to pass the variable (anything) inside the frame function as an argument
		
		Thread.sleep(2000);
								//input first name
		driver.findElementByXPath("//input[@id='fname']").clear();
		//if something already written in the box i.e john, then we use function clear(). it will clear the box
		driver.findElementByXPath("//input[@id='fname']").sendKeys("Mamun");
		
		Thread.sleep(2000);
								// input last name
		driver.findElementByXPath("//input[@id='lname']").clear();
		driver.findElementByXPath("//input[@id='lname']").sendKeys("Rahman");
		
		Thread.sleep(2000);
								// click on submit
		driver.findElementByXPath("//input[@value='Submit']").click();
		
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		//driver.switchTo().parentFrame();
		// this code is use for switching back to the main web page from frame

		driver.close();

	}

}
