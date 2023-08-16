package mandatoryHomeWork.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FormulaOne {

	
	@Test
	public void formulaTest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.navigate().to("https://www.formula1.com");
		WebElement frame = driver.findElement(By.xpath("//iframe[@title='SP Consent Message']"));
		driver.switchTo().frame(frame);
		WebElement accept = driver.findElement(By.xpath("//button[@title='ACCEPT ALL']"));
		accept.click();
		WebElement results = driver.findElement(By.xpath("//span[normalize-space()='Results']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(results).build().perform();
		WebElement standings = driver.findElement(By.xpath("//a[contains(@href,'driver-standings')]"));
		standings.click();
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@title='SP Consent Message']"));
		driver.switchTo().frame(frame1);
		WebElement accept1 = driver.findElement(By.xpath("//button[@title='ACCEPT ALL']"));
		accept1.click();
		String name ="oscar-piastri";
		WebElement xname = driver.findElement(By.xpath("(//a[contains(@href, '" + name + "')]/@href)[3]/ancestor::tr/td[2]"));
		int pos = Integer.parseInt(xname.getText());
		
		if(pos<10) {
			System.out.println(name);
		}
		else {
			System.out.println(name+" is out of 10 position by " +(pos-10));
	
		}
		driver.close();
		
	}
}
