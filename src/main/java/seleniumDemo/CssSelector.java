package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
				
		driver.get("http://leaftaps.com/opentaps/control/main");
				
		driver.manage().window().maximize();
				
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElementByCssSelector("#username").sendKeys("DemoSalesManager");
		// for id attribute we use this syntax that means #idvalue
		
		driver.findElementByCssSelector("input[type='password']").sendKeys("crmsfa");
		// for all other attribute i.e name, value, type etc this syntax except class
		// syntax is tagName[AttributeName='AttributeValue']
		
		driver.findElementByCssSelector(".decorativeSubmit").click();
		// for class attribute we use this syntax that means .classvalue
		
						//starts with
		//driver.findElementByCssSelector("input[id^='use']").sendKeys("DemoSalesManager");
		// this is 1st 3 letter of id value of the username field
		// syntax is tagname[attribute^='startValue of attribute']
		
						//ends with 
		// driver.findElementByCssSelector("input[name$='AME']").sendKeys("DemoSalesManager");
		// this is last 3 letter of name value of the username field
		// syntax is tagname[attribute$='EndValue of attribute']
		
						// contains
		// driver.findElementByCssSelector("input[name*='AME']").sendKeys("DemoSalesManager");
		// this is last 3 letter of name value of the username field
		// syntax is tagname[attribute*='PartialValue of attribute']
		
						// parent to child
		// driver.findElementByCssSelector(".top>input").sendKeys("DemoSalesManager");
		// top is the parent html tag for username field
		// input is the tag for username field
		// syntax is .parentAttributeValue>ChildTagname
		
						// shibling to shibling
		// driver.findElementByCssSelector("label[for='username']+input").sendKeys("DemoSalesManager");
		// label is the tagname for username word 
		// input is the tag for username field
		// syntax is SiblingTagname[attributename='Attbvalue']+DesiredSibling tagname
		

	}

}
