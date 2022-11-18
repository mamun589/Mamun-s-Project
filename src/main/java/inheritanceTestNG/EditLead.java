package inheritanceTestNG;

import org.testng.annotations.Test;

import wrapper.ProjectSpecificWrapper;

public class EditLead extends ProjectSpecificWrapper {
	
	// for connect we use extends keyword
	// ProjectSpecificWrapper is the super class which is inside the wrapper package
		
	
	@Test(priority = 1)
	public void editLead() {
		
		// click leads link
		driver.findElementByLinkText("Leads").click();
		// click Find leads link
		driver.findElementByLinkText("Find Leads").click();
		// Enter first name
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Hema");
		// click Find lead button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
	}

}
