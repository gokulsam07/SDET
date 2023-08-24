package mandatoryHomeWork.selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SalesforceMobile {

	@Test
	public void mobilePusblisherTest() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.navigate().to("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com",Keys.TAB,"Leaf$1234",Keys.TAB,Keys.ENTER);
		driver.findElement(By.xpath("//span[normalize-space()='Learn More']")).click();


		Set<String> window= driver.getWindowHandles();

		ArrayList<String> winList =  new ArrayList<>(window);
		driver.switchTo().window(winList.get(1));
		driver.findElement(By.xpath("//button[normalize-space()='Confirm']")).click();
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(winList.get(0));
		System.out.println(driver.getTitle());
		driver.close();

	}

}
