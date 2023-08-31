package mandatoryHomeWork.selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WaitDemo {
	@Test
	public void windowsTest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.navigate().to("https://www.leafground.com/window.xhtml");
		driver.findElement(By.xpath("//span[normalize-space()='Open with delay']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		Set<String> win = driver.getWindowHandles();
		ArrayList<String> list = new ArrayList<>(win);
		driver.switchTo().window(list.get(1));
		Assert.assertEquals(true, driver.getTitle().contains("Dashboard"));
		driver.quit();
	}

}
