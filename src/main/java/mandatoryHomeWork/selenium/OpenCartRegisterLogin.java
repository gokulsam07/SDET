package mandatoryHomeWork.selenium;

import java.sql.Timestamp;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartRegisterLogin {

	public static String email;

	@Test(priority=1)
	public void RegisterTest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("http://www.tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		driver.findElement(By.cssSelector("#input-firstname")).sendKeys("Gokul",Keys.TAB,"Saminathan",Keys.TAB);
		driver.findElement(By.cssSelector("#input-email")).sendKeys(generateRandomMail());
		driver.findElement(By.cssSelector("#input-telephone")).sendKeys("9876543215");
		driver.findElement(By.cssSelector("#input-password")).sendKeys("Roulette@123",Keys.TAB,"Roulette@123");
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		Assert.assertEquals("Your Account Has Been Created!", driver.findElement(By.xpath("//h1[normalize-space()='Your Account Has Been Created!']")).getText());
		driver.close();
	}

	@Test(priority=2)
	public void loginTest() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("http://www.tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']")).click();
		driver.findElement(By.id("input-email")).sendKeys(email,Keys.TAB,"Roulette@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Assert.assertEquals(true, driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed());
		driver.close();
	}


	public static String generateRandomMail() {
		Timestamp date = new Timestamp(System.currentTimeMillis());
		String timeStamp=	date.toString().replace(" ", "_").replace(":", "_");
		email = "gokul"+timeStamp+"@gmail.com";
		return "gokul"+timeStamp+"@gmail.com";
	}


}
