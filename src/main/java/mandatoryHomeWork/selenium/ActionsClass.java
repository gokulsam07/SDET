package mandatoryHomeWork.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class ActionsClass {
	WebDriver driver ;
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

	}

	@Test(enabled=true)
	public void draggableTest() {
		driver.get("https://jqueryui.com/draggable");
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement element = driver.findElement(By.xpath("//p[normalize-space()='Drag me around']"));
		Point p = element.getLocation();
		Actions action = new Actions(driver);
		action.moveToElement(element).clickAndHold(element).moveByOffset(p.getX()+50, p.getY()+50).build().perform();
		Point p2 = element.getLocation();
		Assert.assertEquals(true, p.getX()<p2.getX());
		
	}


	@Test(enabled=true)
	public void droppableTest() {
		driver.get("https://jqueryui.com/droppable");
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement source = driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
		WebElement target = driver.findElement(By.xpath("//p[normalize-space()='Drop here']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).build().perform();
		Assert.assertEquals(true, driver.findElement(By.xpath("//p[normalize-space()='Dropped!']")).isDisplayed());
	}

	@Test(enabled=true)
	public void selectableTest() {
		driver.get("https://jqueryui.com/selectable");
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement start = driver.findElement(By.xpath("//li[normalize-space()='Item 1']"));
		WebElement end = driver.findElement(By.xpath("//li[normalize-space()='Item 7']"));
		Actions action = new Actions(driver);
		action.moveToElement(start).clickAndHold(start).moveToElement(end).release().build().perform();
		Assert.assertEquals(true, driver.findElement(By.xpath("//li[@class='ui-widget-content ui-selectee ui-selected']")).isDisplayed());
		
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
