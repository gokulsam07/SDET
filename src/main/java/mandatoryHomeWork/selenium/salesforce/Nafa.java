package mandatoryHomeWork.selenium.salesforce;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Nafa {
	WebDriver driver;
	String groupName = "Salesforce Automation";
	String editGroupName = "Automation";

	@BeforeMethod
	public void setUp()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.cssSelector("input.username")).sendKeys("pooranimenon5@gmail.com");
		driver.findElement(By.cssSelector("input.password")).sendKeys("Totest@123");
		driver.findElement(By.id("Login")).click();
	}

	@Test
	public void TC1() throws InterruptedException {

		driver.findElement(By.className("slds-icon-waffle")).click();	
		driver.findElement(By.xpath("//button[@class='slds-button']")).click();		
		driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Individuals");
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;		
		WebElement individual = driver.findElement(By.xpath("//p[@class='slds-truncate']"));	 
		jsExecutor.executeScript("arguments[0].click();", individual);			 
		Thread.sleep(1000);		
		driver.findElement(By.xpath("//div[text()='New']")).click();					
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Kumar");						
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		String lastName = driver.findElement(By.xpath("//div[@class='slds-page-header__title slds-m-right--small slds-align-middle clip-text slds-line-clamp']")).getText();		
		if(lastName.equals("Kumar"))		
		{			
			System.out.println("Individuals Name verified");	
		}		
		else 		
		{			
			System.out.println("Individuals Name not verified");
		}		
	}


	@Test
	public void TC2() throws InterruptedException {
		driver.findElement(By.className("slds-icon-waffle")).click();
		driver.findElement(By.xpath("//button[@class='slds-button']")).click();
		driver.findElement(By.xpath("//input[@part='input']")).sendKeys("individual");
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		WebElement individual = driver.findElement(By.xpath("//p[@class='slds-truncate']"));
		jsExecutor.executeScript("arguments[0].click();", individual);
		driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys("Kumar");
		Thread.sleep(1000);
		WebElement java = driver.findElement(By.xpath("//span[@class='slds-icon_container slds-icon-utility-down']//span[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", java);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@title='Edit']")).click();
		WebElement salutation = driver.findElement(By.xpath("(//a[@role='button'][normalize-space()='--None--'])[1]"));
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click();", salutation);
		driver.findElement(By.xpath("(//a[text()='Mr.'])[1]")).click();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Ganesh");
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();

		String firstName = driver.findElement(By.xpath("//a[@data-refid='recordId']")).getText();
		if(firstName.equals("Ganesh"))
		{
			System.out.println("Name verified");
		}
		else 
			System.out.print("Name not verified");

	}


	@Test
	public void TC3() throws InterruptedException{
		driver.findElement(By.className("slds-icon-waffle")).click();	
		driver.findElement(By.xpath("//button[@class='slds-button']")).click();								
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;		
		driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Individuals");
		WebElement individual = driver.findElement(By.xpath("//p[@class='slds-truncate']"));
		jsExecutor.executeScript("arguments[0].click();", individual);	 
		driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys("Kumar"); 
		WebElement java = driver.findElement(By.xpath("//span[@class='slds-icon_container slds-icon-utility-down']//span[1]"));	 
		JavascriptExecutor js = (JavascriptExecutor)driver;	 
		js.executeScript("arguments[0].click();", java);	 
		Thread.sleep(1000);	 
		driver.findElement(By.xpath("//a[@title='Delete']")).click();	 
		driver.findElement(By.xpath("//span[text()='Delete']")).click();	 	 
		Thread.sleep(5000);	 
		boolean deletedName = driver.getPageSource().contains("Kumar");		
		if(deletedName==true)		
		{			
			System.out.println("Deleted name is available");		
		}		
		else			
			System.out.println("Deleted name is not available");	
	}

	@Test
	public void TC4() throws InterruptedException {

		driver.findElement(By.className("slds-icon-waffle")).click();				

		driver.findElement(By.xpath("//button[@class='slds-button']")).click();		
		driver.findElement(By.xpath("//input[@part='input']")).sendKeys("individual");				
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;		
		WebElement individual = driver.findElement(By.xpath("//span[@class='slds-truncate label-display']"));	 
		jsExecutor.executeScript("arguments[0].click();", individual);			 
		Thread.sleep(1000);		
		driver.findElement(By.xpath("//div[text()='New']")).click();				
		WebElement salutation = driver.findElement(By.xpath("(//a[@role='button'][normalize-space()='--None--'])[1]"));	 
		JavascriptExecutor js1 = (JavascriptExecutor)driver;	 
		js1.executeScript("arguments[0].click();", salutation);	 
		driver.findElement(By.xpath("(//a[text()='Mr.'])[1]")).click();				
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Ganesh");				
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();				 
		String expected = "Complete this field.";	 
		String actual = driver.findElement(By.xpath("//li[@class='form-element__help']")).getText();	 
		if (actual.equals(expected))	 
		{	 	
			System.out.print("Alert message verified");	 
		}	 
		else	 
		{	 	
			System.out.print("Alert message is not verified");	 
		}	 

	}

	@Test
	public void TC5() throws InterruptedException {	
		driver.findElement(By.className("slds-icon-waffle")).click();					
		driver.findElement(By.xpath("//button[@class='slds-button']")).click();		
		driver.findElement(By.xpath("//input[@part='input']")).sendKeys("individual");				
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;		
		WebElement individual = driver.findElement(By.xpath("//span[@class='slds-truncate label-display']"));	 
		jsExecutor.executeScript("arguments[0].click();", individual);	 	 
		JavascriptExecutor jsExecutor1 = (JavascriptExecutor) driver;		
		WebElement name = driver.findElement(By.xpath("//span[@title='Name']"));	 
		jsExecutor1.executeScript("arguments[0].click();", name);	 	  
		List<WebElement> beforeSort = driver.findElements(By.xpath("//tbody/tr/th//a"));		
		List<String> before = new ArrayList<>();		
		for (WebElement webElement : beforeSort) 		
		{			
			before.add(webElement.getText());		
		}		
		Collections.sort(before);		
		WebElement sort = driver.findElement(By.xpath("//span[@title='Name']"));
		JavascriptExecutor jsExecutor2 = (JavascriptExecutor) driver;
		jsExecutor2.executeScript("arguments[0].click();", sort);		
		Thread.sleep(2000);		
		List<WebElement> afterSort = driver.findElements(By.xpath("//tbody/tr/th//a"));		
		List<String> after = new ArrayList<>();		
		for (WebElement webElement : afterSort) 
		{			
			after.add(webElement.getText());		
		}	
		if(after.equals(before))		
		{			
			System.out.println("Individuals displayed in ascending order by Name.");		
		}		
		else		
		{			
			System.out.println("Individuals displayed in descending order by Name.");		
		}	 	
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
