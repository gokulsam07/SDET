package mandatoryHomeWork.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

import java.time.Duration;

import org.junit.Test;

public class SampleTest {
	
	@Test
	public void d2Test() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://10.194.54.130:8080/D2-Smartview/ui/#d2/nodes/repository");
		driver.findElement(By.cssSelector("input[placeholder='User name']")).sendKeys("cs234user",Keys.TAB,"Password@1234567");
		Select select = new Select(driver.findElement(By.cssSelector("select[aria-label='Select a repository']")));
		select.selectByVisibleText("testenv");
		driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
		WebElement shadowHost = driver.findElement(By.xpath("//otc-tristatecheckbox[@title='Select CabGokul']"));
		Object shadowRoot = (WebElement)((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowHost);
		((JavascriptExecutor) shadowRoot).executeScript("return arguments[0].querySelector('span[role='checkbox']')", shadowRoot);
		// WebElement shadowCheckbox = shadowContext.querySelector("span[role='checkbox']");
		//WebElement shadowCheckbox = (WebElement) jsExecutor.executeScript("return arguments[0].querySelector('span[role=\"checkbox\"]')", shadowRoot);
		if (shadowContent.getAttribute("aria-checked").equals("false")) {
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		    jsExecutor.executeScript("arguments[0].click();", shadowHost);
		    System.out.println("Element selected");
		}
		
//		 WebElement shadowContent = ele.findElement(By.cssSelector("span[role='checkbox']"));
//      JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//        Object shadowRoot = jsExecutor.executeScript("return arguments.shadowRoot", shadowContent);
//        SearchContext shadowContext = (SearchContext) shadowRoot;
//
//		if(shadowContext.getAttribute("aria-checked").equals("false")){
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("arguments[0].click();", ele);
//			System.out.println("Element selected");
//			}
		
	}

}
