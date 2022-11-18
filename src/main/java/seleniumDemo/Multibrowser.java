package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multibrowser {
	
			//@Test
			//public void test1() throws InterruptedException {
			public static void main(String[] args) throws InterruptedException {
				
			// we can use any browser
			// for that we have to use WebDriverManager
			//Syntax WebDriverManager.chromedriver().setup(); for chromebrowser
			
							// Chrome browser
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			
							//IE browser
			//WebDriverManager.iedriver().setup();
			//WebDriver driver = new InternetExplorerDriver();
			
							//FireFox
			//WebDriverManager.firefoxdriver().setup();
			//WebDriver driver = new FirefoxDriver();
			
							// Edge
			//WebDriverManager.edgedriver().setup();
			//WebDriver driver = new EdgeDriver();
			
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			
			String title = driver.getTitle();
			System.out.println(title);
			//Enter 'facebook login' in Google search box
			driver.findElement(By.name("q")).sendKeys("facebook login");
			
			Thread.sleep(2000);
			
			driver.quit();

}
			
}
