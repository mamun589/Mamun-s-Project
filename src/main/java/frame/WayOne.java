package frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WayOne {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.switchTo().frame("iframeResult");
		//here 'iframeResult' is the value of id
		// id and name locator should be in the first line with iframe tagname
		// that means this is the code for frame line not the element line
		//line should be like this "<iframe frameborder="0" id="iframeResult" name="iframeResult" allowfullscreen="true"></iframe>"
					
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
