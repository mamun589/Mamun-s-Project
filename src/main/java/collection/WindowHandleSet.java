package collection;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleSet {

	public static void main(String[] args) throws InterruptedException {
		
		//get window handles
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\drivers\\chromedriver.exe");
				
		ChromeDriver driver = new ChromeDriver();
				
		driver.get("https://www.w3schools.com/jsref/met_win_open.asp");
				
		driver.manage().window().maximize();
				
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
		driver.findElementByLinkText("Try it Yourself »").click();
				
		// this is the way one which is get window handle
		String CurrentWinRef = driver.getWindowHandle();
		// this is only one window thats why string came
		System.out.println("Current window reference = "  + CurrentWinRef);
				
		// way two which is get window handle
		Set<String> allWinRef = driver.getWindowHandles();
		// this is multiple window thats why set came with string
		// if we use ctrl+2 L then set will come automatic
				
		//System.out.println(allWinRef);
				
		for (String eachWinRef : allWinRef) {
			System.out.println(eachWinRef);
			driver.switchTo().window(eachWinRef);
			//this will transfer the control from first window two second window
			System.out.println(driver.getTitle());
			// it will print only title of the second window
		}
				
		driver.switchTo().frame("iframeResult");
		/*when we get control in the second window the we want click on the 'Try it' button on the right
		 but if we want click that button we need to switch to frame  */
		// iframeResult is the value of the Id in the frame code line
				
		Thread.sleep(3000);
		// Click on Try it button
		driver.findElementByXPath("//button[text()='Try it']").click();
				
		Thread.sleep(3000);
		//switch back to primary window/First window (see above code of getWindowHandle() for FirstWindow)
		driver.switchTo().window(CurrentWinRef);
						
		//Get title of First window (after back to first window)
		System.out.println(driver.getTitle());
				
		Thread.sleep(3000);
		//closing all the windows which open in this session/in this run
		driver.quit();

	}

}
