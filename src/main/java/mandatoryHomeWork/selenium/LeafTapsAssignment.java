package mandatoryHomeWork.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LeafTapsAssignment {
	@Test
	public void test()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.navigate().to("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/S")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gokul");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Saminathan");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Mechanical");
		driver.findElement(By.name("description")).sendKeys("Mechanical DAWWWW");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gokuls2381@gmail.com");
		Select options = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		options.selectByVisibleText("Arizona");
		driver.findElement(By.name("submitButton")).submit();
		System.out.println(driver.getTitle());
		driver.close();
	}
}
