package mandatoryHomeWork.selenium.salesforce;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Govindh {

	WebDriver driver;
	String expectedLegalEntityName="Salesforce Automation by Govind";
	String status="Active";
	String actualAlertText="Review the following fields";

	@BeforeMethod
	public void setUp()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.cssSelector("input.username")).sendKeys("mgovindarajm@gmail.com");
		driver.findElement(By.cssSelector("input.password")).sendKeys("Qwerty@5016");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
	}

	@Test
	public void TC1() throws InterruptedException {
		WebElement element=driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);

		driver.findElement(By.xpath("//span[text()='Legal Entities']//following::one-app-nav-bar-item-dropdown//div/one-app-nav-bar-menu-button/a")).click();
		WebElement newLegalEntityElement=driver.findElement(By.xpath("//span[text()='New Legal Entity']"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", newLegalEntityElement);

		driver.findElement(By.xpath("//label[text()='Name']//following::input[1]")).sendKeys(expectedLegalEntityName);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		String legalEntityName=driver.findElement(By.xpath("//div[text()='Legal Entity']//following::slot[1]/lightning-formatted-text")).getText();
		Assert.assertEquals(legalEntityName, expectedLegalEntityName);
	}


	@Test
	public void TC2() throws InterruptedException {
		WebElement element=driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);

		driver.findElement(By.xpath("//input[@aria-label='Search Recently Viewed list view.']")).sendKeys(expectedLegalEntityName,Keys.TAB,Keys.ENTER);

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='"+expectedLegalEntityName+"']/ancestor::tr/td[5]")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Edit']")).click();


		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//label[text()='Description']//following::div[1]/textarea")).sendKeys("SalesForce");
		WebElement statusElement=driver.findElement(By.xpath("//label[text()='Status']//following::div/lightning-base-combobox/div/div/button"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", statusElement);

		driver.findElement(By.xpath("//span[text()='"+status+"']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='"+expectedLegalEntityName+"']")).click();
		String expectedStatus=driver.findElement(By.xpath("//p[text()='Status']/following::p[1]")).getText();
		Assert.assertEquals(status, expectedStatus);


	}


	@Test
	public void TC3() throws InterruptedException{
		WebElement element=driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);

		driver.findElement(By.xpath("//span[text()='Legal Entities']//following::one-app-nav-bar-item-dropdown//div/one-app-nav-bar-menu-button/a")).click();
		WebElement newLegalEntityElement=driver.findElement(By.xpath("//span[text()='New Legal Entity']"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", newLegalEntityElement);

		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//label[text()='Description']//following::div[1]/textarea")).sendKeys("SalesForce");
		WebElement statusElement=driver.findElement(By.xpath("//label[text()='Status']//following::div/lightning-base-combobox/div/div/button"));
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click();", statusElement);

		driver.findElement(By.xpath("//span[text()='Active']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		String expectedText=driver.findElement(By.xpath("//strong[text()='"+actualAlertText+"']")).getText();
		Assert.assertEquals(actualAlertText, expectedText);

	}

	@Test
	public void TC4() throws InterruptedException {
		WebElement element=driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);

		driver.findElement(By.xpath("//span[normalize-space()='Last Modified Date']//following::div[1]/button")).click();

		List<WebElement> recordRows = driver.findElements(By.xpath("//table[@data-aura-class='uiVirtualDataTable']/tbody/tr"));
		boolean isAscending = true;

		for (int i = 1; i < recordRows.size(); i++) {
			WebElement currentRow = recordRows.get(i);
			WebElement previousRow = recordRows.get(i - 1);

			// Extract the Last Modified timestamps from the current and previous rows
			String currentTimestamp = currentRow.findElement(By.xpath(".//td[3]")).getText();
			String previousTimestamp = previousRow.findElement(By.xpath(".//td[3]")).getText();

			System.out.println("currentTimestamp :" + currentTimestamp);
			System.out.println("previousTimestamp :" + previousTimestamp);

			if (currentTimestamp.compareTo(previousTimestamp) < 0) {
				isAscending = false;
				break;
			}
		}

		if (isAscending) {
			System.out.println("Records are displayed in ascending order by Last Modified timestamp.");
		} else {
			System.out.println("Records are not displayed in ascending order by Last Modified timestamp.");
		}


	}

	@Test
	public void TC5() throws InterruptedException {	
		WebElement element=driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);

		driver.findElement(By.xpath("//input[@aria-label='Search Recently Viewed list view.']")).sendKeys(expectedLegalEntityName,Keys.TAB,Keys.ENTER);

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='"+expectedLegalEntityName+"']/ancestor::tr/td[5]")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Delete']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Delete']")).click();
		int size=driver.findElements(By.xpath("//a[normalize-space()='"+expectedLegalEntityName+"']")).size();
		if (size==0) {
			System.out.println("No legal entity is found ,its deleted");
		}
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
