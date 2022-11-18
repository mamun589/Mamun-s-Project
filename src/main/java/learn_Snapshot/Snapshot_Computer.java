package learn_Snapshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapshot_Computer {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// enter username
		driver.findElementById("username").sendKeys("DemoSalesManager");

		// enter password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

		// click login button
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		// click CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();// click CRM/SFA link


		// click create lead link
		driver.findElement(By.linkText("Create Lead")).click();

		//enter Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC");

		//enter FirstName Name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hema");
		System.out.println("FirstName entered");

		//enter LastName Name
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Ma");
		System.out.println("Enter lastName successfully");

		//Take snapshot/ScreenShot
		// take snapshot and store in Temp File
		File src = driver.getScreenshotAs(OutputType.FILE);
		
		//Path/location-1, where it will store after moved
		//define the destination file
		File dest = new File("C:\\Users\\mamun\\Desktop\\Selenium Final\\Selenium\\Snapshot\\Screenshot\\image.png");
		// this is my path where i wanted to store the screenshot in my computer

		FileUtils.copyFile(src, dest);
		//FileUtils.copyFile(src, dest); //moved file source to destination(img or image file)


		// click create lead
		driver.findElementByXPath("//input[@value='Create Lead']").click();

		driver.close();

	}

}
