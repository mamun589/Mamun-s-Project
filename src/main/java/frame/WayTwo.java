package frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WayTwo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/selectable/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		// we used 0 because there is only one frame. ( index starts from 0)
		// if there is more than one frame it will show i.e 1 of 8 than we use arrow ^ to check which one our frame
		// then we use index number i.e frame(0), frame(1), frame(2) etc
		
		Thread.sleep(2000);
						//click item 1
		driver.findElementByXPath("//ol[@id='selectable']/li[1]").click();
		/* here we used parent to child xpath. here ol is the parent tag name, then another / for syntax,
		 then li is the child tag name, then [1] is the index for selecting the first item.
		 */
		
		Thread.sleep(2000);
		driver.findElementByXPath("//ol[@id='selectable']/li[3]").click();
		// [3] for selecting the third item
		
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		driver.close();

	}

}
