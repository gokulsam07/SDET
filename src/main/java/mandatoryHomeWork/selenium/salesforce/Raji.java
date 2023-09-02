package mandatoryHomeWork.selenium.salesforce;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Raji {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.cssSelector("input.username")).sendKeys("rajalakshmisdet@gmail.com");
		driver.findElement(By.cssSelector("input.password")).sendKeys("Raji@3693");
		driver.findElement(By.id("Login")).click();
	}

	@Test
	public void TC1() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class=\"slds-icon-waffle\"]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'View All')]")).click();
		driver.findElement(By.xpath("//input[@class=\"slds-input\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"slds-input\"]")).sendKeys("Work Types");
		driver.findElement(By.xpath("//p/mark[text() = 'Work Types']")).click();

		driver.findElement(By.xpath("//div[@title='New']")).click();
		driver.findElement(By.xpath("//input[@class=' input']")).sendKeys("Salesforce Project");
		driver.findElement(By.xpath("//textarea[@class=' textarea']")).sendKeys("Specimen");
		driver.findElement(By.xpath("//input[@role=\"combobox\"]")).click();
		driver.findElement(By.xpath("//span[@title='New Operating Hours']")).click();
		driver.findElement(By.xpath("(//input[@class=' input'])[2]")).sendKeys("UK Shift");
		driver.findElement(By.xpath("(//span[contains(text(),'Save')])[5]")).click();
		driver.findElement(By.xpath("(//input[@class=\"input uiInputSmartNumber\"])[1]")).sendKeys("7");
		driver.findElement(By.xpath("(//span[contains(text(),'Save')])[3]")).click();
		String ActualText = driver.findElement(By.xpath("(//span[contains(text(),'Salesforce Project')])[3]")).getText();
		Assert.assertEquals("Salesforce Project", ActualText);

		Assert.assertEquals(true, driver.findElement(By.xpath("//span[@data-aura-class='forceActionsText']")).isDisplayed());
		String ActualText2 = driver.findElement(By.xpath("//span[@data-aura-class=\"forceActionsText\"]")).getText();
		System.out.println(ActualText2);
		Assert.assertEquals("Work Type \"Salesforce Project\" was created.", ActualText2);
	}


	@Test
	public void TC2() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class=\"slds-icon-waffle\"]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'View All')]")).click();
		driver.findElement(By.xpath("//input[@class=\"slds-input\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"slds-input\"]")).sendKeys("Work Types");
		driver.findElement(By.xpath("//p/mark[text() = 'Work Types']")).click();

		WebElement java = driver.findElement(By.xpath("//span[contains(text(),'Show Actions')]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", java);

		driver.findElement(By.xpath("//a[@title = 'Edit']")).click();

		driver.findElement(By.xpath("(//input[@data-aura-class=\"uiInputSmartNumber\"])[4]")).sendKeys("9");
		driver.findElement(By.xpath("(//input[@data-aura-class=\"uiInputSmartNumber\"])[5]")).clear();
		driver.findElement(By.xpath("(//input[@data-aura-class=\"uiInputSmartNumber\"])[5]")).sendKeys("6");
		driver.findElement(By.xpath(" (//span[contains(text(),'Save')])[3]")).click();
		String ActualText = driver.findElement(By.xpath("//li[contains(text(),'Timeframe Start')]")).getText();
		Assert.assertEquals("Enter a Timeframe End number that is greater than the Timeframe Start number.: Timeframe Start", ActualText);


	}


	@Test
	public void TC3() throws InterruptedException{
		driver.findElement(By.xpath("//div[@class=\"slds-icon-waffle\"]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'View All')]")).click();
		driver.findElement(By.xpath("//input[@class=\"slds-input\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"slds-input\"]")).sendKeys("Work Types");
		driver.findElement(By.xpath("//p/mark[text() = 'Work Types']")).click();

		WebElement java = driver.findElement(By.xpath("//span[contains(text(),'Show Actions')]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", java);

		driver.findElement(By.xpath("//a[@title = 'Edit']")).click();
		driver.findElement(By.xpath("(//input[@data-aura-class=\"uiInputSmartNumber\"])[4]")).clear();
		driver.findElement(By.xpath("(//input[@data-aura-class=\"uiInputSmartNumber\"])[4]")).sendKeys("9");
		driver.findElement(By.xpath("(//input[@data-aura-class=\"uiInputSmartNumber\"])[5]")).clear();
		driver.findElement(By.xpath("(//input[@data-aura-class=\"uiInputSmartNumber\"])[5]")).sendKeys("18");
		driver.findElement(By.xpath(" (//span[contains(text(),'Save')])[3]")).click();
		Assert.assertEquals(true, driver.findElement(By.xpath("//span[@data-aura-class='forceActionsText']")).isDisplayed());
		String ActualText = driver.findElement(By.xpath("//span[@data-aura-class=\"forceActionsText\"]")).getText();
		System.out.println(ActualText);
		Assert.assertEquals("Work Type \"Salesforce Project\" was saved.", ActualText);

	}

	@Test
	public void TC4() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class=\"slds-icon-waffle\"]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'View All')]")).click();
		driver.findElement(By.xpath("//input[@class=\"slds-input\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"slds-input\"]")).sendKeys("Work Types");
		driver.findElement(By.xpath("//p/mark[text() = 'Work Types']")).click();

		WebElement java = driver.findElement(By.xpath("//span[contains(text(),'Show Actions')]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", java);

		driver.findElement(By.xpath("//a[@title = 'Delete']")).click();
		driver.findElement(By.xpath("//Span[contains(text(),'Delete')]")).click();

		Assert.assertEquals(true, driver.findElement(By.xpath("//span[@data-aura-class='forceActionsText']")).isDisplayed());
		String ActualText = driver.findElement(By.xpath("//span[@data-aura-class=\"forceActionsText\"]")).getText();
		System.out.println(ActualText);
		Assert.assertEquals("Work Type \"Salesforce Project\" was deleted. Undo", ActualText);

	}

	@Test
	public void TC5() throws InterruptedException {	
		driver.findElement(By.xpath("//div[@class=\"slds-icon-waffle\"]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'View All')]")).click();
		driver.findElement(By.xpath("//input[@class=\"slds-input\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"slds-input\"]")).sendKeys("Work Types");
		driver.findElement(By.xpath("//p/mark[text() = 'Work Types']")).click();
		driver.findElement(By.xpath("//div[@title='New']")).click();
		driver.findElement(By.xpath("//input[@class=' input']")).sendKeys("Bootcamp");
		driver.findElement(By.xpath("(//span[contains(text(),'Save')])[3]")).click();
		Assert.assertEquals(true, driver.findElement(By.xpath("//li[contains(text(),'Complete this field.')]")).isDisplayed());
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
