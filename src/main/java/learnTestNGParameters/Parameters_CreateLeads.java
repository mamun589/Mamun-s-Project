package learnTestNGParameters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Parameters_CreateLeads extends ProjectSpecificWrapper {

	@Test	
	public void createLead() throws InterruptedException {

		// click leads
		driver.findElementByLinkText("Leads").click();

		// click create lead link
		driver.findElementByLinkText("Create Lead").click();

		// Company name
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
		//driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		
		// enter firstName
		driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys("Hema");
		//driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys(fName);

		// enter lastName
		driver.findElementById("createLeadForm_lastName").sendKeys("Mali");
		//driver.findElementById("createLeadForm_lastName").sendKeys(lName);

		Thread.sleep(2000);
		// Choose source
		WebElement src = driver.findElementById("createLeadForm_dataSourceId");
		Select dd = new Select(src);
		dd.selectByVisibleText("Website");

		// choose industry
		WebElement element = driver.findElementById("createLeadForm_industryEnumId");
		Select dd1 = new Select(element);
		dd1.selectByVisibleText("Insurance");

		// choose ownership
		WebElement ele = driver.findElementByName("ownershipEnumId");
		Select dd2 = new Select(ele);
		dd2.selectByVisibleText("Sole Proprietorship");

		// Click Create lead
		driver.findElementByXPath("//input[@name='submitButton']").click();

	}

}
