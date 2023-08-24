package mandatoryHomeWork.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class W3Schools {

	@Test
	public void w3schoolTest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		WebElement fr = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(fr);
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		WebElement tryButton = driver.findElement(By.xpath("//button[normalize-space()='Try it']"));
	
		jsExecutor.executeScript("arguments[0].click();", tryButton);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Assert.assertEquals(true, driver.findElement(By.xpath("//p[normalize-space()='You pressed OK!']")).isDisplayed());
		driver.quit();
	}
}
