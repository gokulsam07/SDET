package mandatoryHomeWork.selenium;

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
import org.testng.annotations.Test;

public class SalesforceContent {
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

		driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Content");
		driver.findElement(By.xpath("//mark[normalize-space()='Content']")).click();
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		WebElement chatter = driver.findElement(By.xpath("//span[normalize-space()='Chatter']"));
		jsExecutor.executeScript("arguments[0].click();", chatter);
		WebElement ques = driver.findElement(By.xpath("//span[normalize-space()='Question']"));
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(ques));
		Assert.assertEquals(true, driver.getTitle().contains("Chatter"));

		ques.click();
		driver.findElement(By.xpath("//textarea[@placeholder='What would you like to know?']")).sendKeys("How are you guys?",Keys.TAB,"I'd like to how are you");

		driver.findElement(By.xpath("//button[contains(text(),'Ask')]")).click();
		Assert.assertEquals(true, driver.findElement(By.xpath("//span[normalize-space()='How are you?']")).isDisplayed());
		driver.quit();

	}
}
