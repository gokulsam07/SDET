package mandatoryHomeWork.selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SalesforceCampaign {


	@Test
	public void salesforceTest() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.navigate().to("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com",Keys.TAB,"Leaf$1234",Keys.TAB,Keys.ENTER);

		WebElement launcher = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
		launcher.click();

		WebElement viewAll = driver.findElement(By.xpath("//button[normalize-space()='View All']"));
		viewAll.click();

		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		WebElement camp = 	driver.findElement(By.xpath("//p[normalize-space()='Campaigns']"));
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);", camp);
		camp.click();

		driver.findElement(By.xpath("//a[@title='New']")).click();
		driver.findElement(By.xpath("//input[@type='text' and @maxlength='80']")).sendKeys("Gokul");
		driver.findElement(By.xpath("//div[@data-target-selection-name='sfdc:RecordField.Campaign.StartDate']//a[@class='datePicker-openIcon display']")).click();
		List<WebElement> dates = driver.findElements(By.xpath("//td[@aria-selected='true']/ancestor::tbody/child::tr/td"));
		for (int i = 0; i < dates.size(); i++) {
			WebElement temp = dates.get(i);
			if(temp.getAttribute("aria-selected").equalsIgnoreCase("true")) {
				dates.get(i+1).click();
				break;
			}
		}

		driver.findElement(By.xpath("//div[@data-target-selection-name='sfdc:RecordField.Campaign.EndDate']//input[@type='text']")).click();

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		List<WebElement> dateEnd= driver.findElements(By.xpath("//td[@aria-selected='true']/ancestor::tbody/child::tr/td"));
		wait.until(ExpectedConditions.visibilityOfAllElements(dateEnd));



		for (int i = 0; i < dateEnd.size(); i++) {
			WebElement temp = dateEnd.get(i);
			if(temp.getAttribute("aria-selected").equalsIgnoreCase("true")) {
				dateEnd.get(i+2).click();
				break;
			}
		}
		driver.findElement(By.cssSelector("button[title='Save']")).click();
		Assert.assertEquals(true, driver.findElement(By.xpath("//lightning-formatted-text[normalize-space()='Gokul']")).isDisplayed());
		driver.quit();
	}

}
