package collection;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameArrayList {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// load URL
		driver.get("http://leaftaps.com/opentaps");

		//driver.get("http://www.indeed.com");

		// maximize
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Enter Username 
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

		// Enter Password 
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		// Click Login Button 
		driver.findElement(By.className("decorativeSubmit")).click();

		// click crm/sfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		// findElements is because we have multiple 'a' tagname
		// when we press ctrl+2 then list come automatic because this is collection
		
		System.out.println(linkList.size());
		// linkList.size() is the array list method to count certain elements in the list
		
		List<WebElement> list = driver.findElements(By.tagName("input"));
		
		int total = list.size();
		
		System.out.println(total);
		
		System.out.println("Total link in this page = " + linkList.size());
		// to add 2 things in java is called concatenation
		// + is the method for concatenation
		
		System.out.println("Total Input tag we have in this page is " + total);
		
		driver.close();

	}

}
