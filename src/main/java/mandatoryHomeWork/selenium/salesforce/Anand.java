package mandatoryHomeWork.selenium.salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Anand {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.cssSelector("input.username")).sendKeys("rajalakshmisdet@gmail.com");
		driver.findElement(By.cssSelector("input.password")).sendKeys("Raji@3693");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
	}

	@Test(priority=1)
	public void TC1() throws InterruptedException {
		driver.findElement(By.xpath("//p[text()=\"Sales\"]")).click();
		WebElement element = driver.findElement(By.xpath("//span[@class='slds-truncate'][normalize-space()='Opportunities']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);	
		driver.findElement(By.xpath("//a[@title='New']")).click();
		WebElement enterName = driver.findElement(By.xpath("//label[text()='Opportunity Name']/following::input"));
		enterName. sendKeys("Salesforce Automation by Anand");
		driver.findElement(By.xpath("//label[text()='Close Date']/following::input")).sendKeys("27/08/2023");
		driver.findElement(By.xpath("(//div[@class=\"slds-form-element__control\"])[3]")).click();
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		WebElement findName = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']"));
		String attribute = findName.getText();
		if(attribute.endsWith("Anand")) {
			System.out.println("Created by Anand");

		}else {
			System.out.println("Invalid user");
		}
	}


	@Test(priority=2)
	public void TC2() throws InterruptedException {
		driver.findElement(By.xpath("//p[text()=\"Sales\"]")).click();
		WebElement element = driver.findElement(By.xpath("//span[@class='slds-truncate'][normalize-space()='Opportunities']"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		driver.findElement(By.xpath("//a[@title='New']")).click();
		driver.findElement(By.xpath("//label[text()='Close Date']/following::input")).clear();
		driver.findElement(By.xpath("//label[text()='Close Date']/following::input")).sendKeys("31/08/2023");
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		WebElement alertMessage =driver.findElement(By.xpath("//header[@class=\"pageErrorHeader slds-popover__header\"]"));
		System.out.println(alertMessage.getText());
	}


	@Test(priority=3)
	public void TC3() throws InterruptedException{
		driver.findElement(By.xpath("//p[text()=\"Sales\"]")).click();
		WebElement element = driver.findElement(By.xpath("//span[@class='slds-truncate'][normalize-space()='Opportunities']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		WebElement es = driver.findElement(By.xpath("(//span[@class='slds-grid slds-grid--align-spread'])[3]"));
		executor.executeScript("arguments[0].click();", es);
		es.click();
		driver.findElement(By.xpath("//a[@title='Edit']")).click();
		driver.findElement(By.xpath("//label[text()='Close Date']/following::input")).clear();
		driver.findElement(By.xpath("//label[text()='Close Date']/following::input")).sendKeys("02/09/2023",Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
		driver.findElement(By.xpath("//span[@title='Perception Analysis']")).click();	
		driver.findElement(By.xpath("//textarea[@class='slds-textarea']")).sendKeys("SalesForce");
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		Assert.assertEquals(true, driver.findElement(By.xpath("//a[normalize-space()='Salesforce Automation by Anand']/ancestor::tr/td[5]/span/span")).getText().contains("Perception"));
	}

	@Test(priority=4)
	public void TC4() throws InterruptedException {
		driver.findElement(By.xpath("//p[text()=\"Sales\"]")).click();
		WebElement element = driver.findElement(By.xpath("//span[@class='slds-truncate'][normalize-space()='Opportunities']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", element);
		driver.findElement(By.xpath("//button[@title=\"Display as Table\"]")).click();
		driver.findElement(By.xpath("//span[normalize-space()=\"Table\"]")).click();
		driver.findElement(By.xpath("//th[contains(@title,\"Close Date\")]//a[contains(@role,\"button\")]")).click();
		WebElement getTopDate = driver.findElement(By.xpath("//th[contains(@title,\"Close Date\")]//a[contains(@role,\"button\")]//span[1]"));
		String Date = getTopDate.getText();
		String[] dateformat = Date.split("//.");
		int day = Integer.parseInt(dateformat[0]);
		int Month = Integer.parseInt(dateformat[1]);
		int Year = Integer.parseInt(dateformat[2]);

		WebElement getNextDate = driver.findElement(By.xpath("//td[contains(@class,\"slds-cell-edit cellContainer slds-has-focus\")]"));
		String nextDate = getTopDate.getText();
		String[] newdateformat = Date.split("//.");
		int day1 = Integer.parseInt(newdateformat[0]);
		int Month2 = Integer.parseInt(newdateformat[1]);
		int Year3 = Integer.parseInt(newdateformat[2]);
		//
		System.out.println("");

		if(day>day1&&Month<=Month2&&Year<=Year3) {
			System.out.println("Displayed in ascending order");
		}

	}

	@Test(priority=5)
	public void TC5() throws InterruptedException {	
		driver.findElement(By.xpath("//p[text()=\"Sales\"]")).click();
		WebElement element = driver.findElement(By.xpath("//span[@class='slds-truncate'][normalize-space()='Opportunities']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	    driver.findElement(By.xpath("(//input[@type='search'])[2]")).click();
	    driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys("Anand");
	    driver.findElement(By.name("(//input[@type='search'])[2]")).sendKeys(Keys.ENTER);
	    System.out.println("Searched Anand");
	    WebElement findElement = driver.findElement(By.xpath("//div[@class=\"forceVirtualActionMarker forceVirtualAction\"]"));
	    executor.executeScript("arguments[0].click();", findElement);
	    driver.findElement(By.xpath("//a[@title='Delete']")).click();
	}

	@AfterMethod
	public void tearDown()
	{
			driver.quit();
	}
}
