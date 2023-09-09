package mandatoryHomeWork.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JIRATC {
	String name ="Automation JIRA - Gokul1";

	@Test
	public void JIRABacklog() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://api-training.atlassian.net");
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@testleaf.com",Keys.TAB,Keys.ENTER);
		driver.findElement(By.id("password")).sendKeys("India@123",Keys.TAB,Keys.ENTER);
		driver.findElement(By.xpath("//p[normalize-space()='SDET-5']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Create']")).click();
		driver.findElement(By.xpath("//input[@name='summary']")).sendKeys(name);
		driver.findElement(By.xpath("(//span[normalize-space()='Create'])[2]")).click();
		driver.findElement(By.xpath("(//span[normalize-space()='Backlog'])[3]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search backlog']")).sendKeys("Gokul");
		Assert.assertEquals("Gokul",driver.findElement(By.xpath("//div[@data-rbd-droppable-id='TRANSITION-ZONE::BACKLOG']/following-sibling::div//mark")).getText());
		driver.quit();

	}

}
