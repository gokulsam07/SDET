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
		driver.findElement(By.xpath("//button[@id='truste-consent-button']")).click();
		WebElement results = driver.findElement(By.xpath("//span[normalize-space()='Results']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(results).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'Driver Standings')]")).click();
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
