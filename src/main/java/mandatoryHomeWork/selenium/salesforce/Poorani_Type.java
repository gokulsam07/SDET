package mandatoryHomeWork.selenium.salesforce;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Poorani_Type {
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

	@Test(priority=1)
	public void workTypeGroupCreation() {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		WebElement hamburgerMenu = driver.findElement(By.xpath("//div[@role = 'navigation']/button"));
		hamburgerMenu.click();
		driver.findElement(By.xpath("//button[text() = 'View All']")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder, 'Search apps')]")).sendKeys("Work Type Groups");
		driver.findElement(By.xpath("//p/mark[text() = 'Work Type Groups']")).click();
		driver.findElement(By.xpath(
				"//div[@class='slds-context-bar__label-action slds-p-left--none slds-p-right--x-small']//a[@role='button']//lightning-primitive-icon//*[name()='svg']"))
		.click();

		WebElement groupButton = driver.findElement(By.xpath("//span[contains(text(), \"New Work Type Group\")]"));
		jsExecutor.executeScript("arguments[0].click();", groupButton);

		driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys(groupName);
		driver.findElement(By.xpath("//button[text() = 'Save']")).click();


		if (driver.findElement(By.xpath("//div[@role = 'alertdialog']")).getText().equals("Work Type Group" +groupName+ "was created.")) {
			System.out.println("Verified");
		}

	}


	@Test(priority=2)
	public void withoutMandatoryFields() {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		WebElement hamburgerMenu = driver.findElement(By.xpath("//div[@role = 'navigation']/button"));
		hamburgerMenu.click();
		driver.findElement(By.xpath("//button[text() = 'View All']")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder, 'Search apps')]")).sendKeys("Work Type Groups");
		driver.findElement(By.xpath("//p/mark[text() = 'Work Type Groups']")).click();
		driver.findElement(By.xpath(
				"//div[@class='slds-context-bar__label-action slds-p-left--none slds-p-right--x-small']//a[@role='button']//lightning-primitive-icon//*[name()='svg']"))
		.click();

		WebElement groupButton = driver.findElement(By.xpath("//span[text() = 'New Work Type Group']"));
		jsExecutor.executeScript("arguments[0].click();", groupButton);

		driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys(Keys.TAB, editGroupName);

		driver.findElement(By.xpath("//button[@role = 'combobox']")).click();
		driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value = 'Capacity']")).click();
		driver.findElement(By.xpath("//div[text() = 'Complete this field.']")).isDisplayed();
	}

	@Test(priority=3)
	public void editWorkTypeGroup() {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		WebElement hamburgerMenu = driver.findElement(By.xpath("//div[@role = 'navigation']/button"));
		hamburgerMenu.click();
		driver.findElement(By.xpath("//button[text() = 'View All']")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder, 'Search apps')]")).sendKeys("Work Type Groups");
		driver.findElement(By.xpath("//p/mark[text() = 'Work Type Groups']")).click();
		driver.findElement(By.xpath("//input[@type='search' and @placeholder = 'Search this list...']")).sendKeys(groupName);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();

		WebElement arrow = driver.findElement(By.xpath("//a[normalize-space()='Salesforce Automation']/ancestor::tr/td[5]//a"));
		jsExecutor.executeScript("arguments[0].click();", arrow);

		WebElement edit = driver.findElement(By.xpath("//a[@title = 'Edit']"));
		jsExecutor.executeScript("arguments[0].click();", edit);
		WebElement textBox = driver.findElement(By.xpath("//input[@name = 'Name']"));
		textBox.clear();
		textBox.sendKeys("Automation");
		WebElement groupType = driver.findElement(By.xpath("//button[@role = 'combobox']"));
		jsExecutor.executeScript("arguments[0].click();", groupType);
		driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value = 'Capacity']")).click();
		driver.findElement(By.xpath("//button[text() = 'Save']")).click();

		if (driver.findElement(By.xpath("//div[@role = 'alertdialog']")).getText().equals("Work Type Group" +editGroupName+ "was saved.")) {
			System.out.println("Verified");
		}

	}


	@Test(priority=4)
	public void checkSorting()
	{
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		WebElement hamburgerMenu = driver.findElement(By.xpath("//div[@role = 'navigation']/button"));
		hamburgerMenu.click();
		driver.findElement(By.xpath("//button[text() = 'View All']")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder, 'Search apps')]")).sendKeys("Work Type Groups");
		driver.findElement(By.xpath("//p/mark[text() = 'Work Type Groups']")).click();
		WebElement sort = driver.findElement(By.xpath("//span[@title = 'Work Type Group Name']"));
		jsExecutor.executeScript("arguments[0].click();", sort);
		List<WebElement> groupNames = driver.findElements(By.xpath("//span[@title = 'Work Type Group Name']/following::tr/th/span"));

		List<String> getText = new ArrayList<>();
		for (WebElement groupNameElement : groupNames) {
			getText.add(groupNameElement.getText());
		}

		List<String> sortedGroupNames = new ArrayList<>(getText);
		Collections.sort(sortedGroupNames);

		if (getText.equals(sortedGroupNames)) {
			System.out.println("Displayed in ascending order.");
		} else {
			System.out.println("Not displayed in ascending order.");
		}
	}

	@Test(priority=5)
	public void deleteWorkTypeGroup()
	{
		WebElement hamburgerMenu = driver.findElement(By.xpath("//div[@role = 'navigation']/button"));
		hamburgerMenu.click();
		driver.findElement(By.xpath("//button[text() = 'View All']")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder, 'Search apps')]")).sendKeys("Work Type Groups");
		driver.findElement(By.xpath("//p/mark[text() = 'Work Type Groups']")).click();
		driver.findElement(By.xpath("//input[@type='search' and @placeholder = 'Search this list...']")).sendKeys(groupName);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();

		WebElement arrow = driver.findElement(By.xpath("//a[normalize-space()='Salesforce Automation']/ancestor::tr/td[5]//a"));
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].click();", arrow);
		driver.findElement(By.xpath("//a[@title = 'Delete']")).click();
		driver.findElement(By.xpath("//button[@title = 'Delete']")).click();
		String actual = driver.findElement(By.xpath("//div[@role = 'alertdialog']")).getText();

		Assert.assertEquals(actual, "Work Type Group" +editGroupName+ "was deleted.");
	}


	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
