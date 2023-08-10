package mandatoryHomeWork.selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AmazonBookSearch {


	@Test
	public void test() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in");
		WebElement list = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select opt = new Select(list);
		opt.selectByVisibleText("Books");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Atomic Habits", Keys.TAB, Keys.ENTER);
		List<WebElement> title = driver.findElements(By.xpath("//span[contains(@class,'a-size-medium a-color-base')]"));
		List<WebElement> sTitle = driver.findElements(By.xpath("//span[text()='Results']//following::img[@class='s-image']"));

		for (WebElement webElement : title) {
			System.out.println(webElement.getText());

		}

		for (WebElement webElement : sTitle) {
			if(!webElement.getAttribute("alt").contains("Sponsored")){
				webElement.click();
				break;
			}
		}
		Set<String> tab = driver.getWindowHandles();
		ArrayList ls = new ArrayList(tab);
		driver.switchTo().window(ls.get(1).toString());

		System.out.println("Name of the Author is : " + driver.findElement(By.xpath("//div[@id='bylineInfo_feature_div']//a")).getText());
		System.out.println("--------------------------");
		driver.quit();


	}
}
