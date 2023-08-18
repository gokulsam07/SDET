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

public class SalesforceTestDashboard {


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
		WebElement dash =	driver.findElement(By.xpath("//p[normalize-space()='Dashboards']"));
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);", dash);
		dash.click();

		driver.findElement(By.xpath("//div[@title='New Dashboard']")).click();
		WebElement frame = driver.findElement(By.xpath("//iframe[@title='dashboard']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("dashboardNameInput")).sendKeys("Salesforce Automation by Gokul");
		driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();
		WebElement frame2 = driver.findElement(By.xpath("//div[@class='windowViewMode-normal oneContent active lafPageHost']//iframe[@title='dashboard']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//button[normalize-space()='Done']")).click();
		driver.quit();
	}
}
