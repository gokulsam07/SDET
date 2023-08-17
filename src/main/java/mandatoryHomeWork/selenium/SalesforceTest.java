package mandatoryHomeWork.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SalesforceTest {


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

		WebElement sales = driver.findElement(By.xpath("//p[normalize-space()='Sales']"));
		sales.click();
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		WebElement acc =	driver.findElement(By.xpath("//span[@class='slds-truncate'][normalize-space()='Accounts']"));
		jsExecutor.executeScript("arguments[0].click();", acc);

		driver.findElement(By.xpath("//div[@title='New']")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Gokul");
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		driver.quit();
	}
}
