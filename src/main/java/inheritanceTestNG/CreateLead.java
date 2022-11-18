package inheritanceTestNG;

import org.testng.annotations.Test;

import wrapper.ProjectSpecificWrapper;

public class CreateLead extends ProjectSpecificWrapper {
	
	// for connect we use extends keyword
	// ProjectSpecificWrapper is the super class which is inside the wrapper package
	
	@Test(priority = 0)
	public void createLead() throws InterruptedException {
		
		// click leads
		driver.findElementByLinkText("Leads").click();
		// click create lead link
		driver.findElementByLinkText("Create Lead").click();
		// enter company name
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
		// enter firstName
		driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys("Hema");
		// enter lastName
		driver.findElementByCssSelector("#createLeadForm_lastName").sendKeys("Ma");
		Thread.sleep(3000);
		// driver.findElementById("createLeadForm_lastName").sendKeys("J");
		// Choose source
		/*WebElement src = driver.findElementById("createLeadForm_dataSourceId");
		Select dd = new Select(src);
		dd.selectByVisibleText("Website");
		// enter phone number
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneNumber']").sendKeys("1234567");
		// enter department
		driver.findElementByXPath("//input[@id='createLeadForm_departmentName']").sendKeys("QA");
		// Enter phone number
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("1234567");
		// Enter email address
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("hema@gmail.com");*/
		
		// Click Create lead
		driver.findElementByXPath("//input[@name='submitButton']").click();
	}

}
