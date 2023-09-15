package mandatoryHomeWork.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ReadExcel {
	static Object[][] data;
	private static XSSFWorkbook workbook;

	@Test
	public void passExcelData() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Amazon",Keys.ENTER);
		System.out.println(driver.getTitle());
		takeScreenshot(driver,"amazon");
		driver.quit();
	}

//	@DataProvider(name="loginData")
//	public  Object[] callPOI() throws IOException{
//		Object[] data = readExcel();
//		return data;
//
//	}
	
	public void takeScreenshot(WebDriver driver, String qname) {
		File shoot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destination = ("F:\\SDET\\src\\main\\java\\mandatoryHomeWork\\selenium\\screenshot\\"+qname+".png");
		try {
			FileHandler.copy(shoot, new File(destination));
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}


//	public static Object[] readExcel() throws IOException {
//		FileInputStream fs = new FileInputStream("F:\\SDET\\src\\main\\java\\mandatoryHomeWork\\selenium\\Book1.xlsx");
//		workbook = new XSSFWorkbook(fs);
//		XSSFSheet sheet = workbook.getSheet("search");
//
//		int rowCount = sheet.getLastRowNum();
//		short colCount = sheet.getRow(1).getLastCellNum();
//		data = new Object[rowCount][colCount];
//
//		for (int i = 0; i < rowCount; i++) {
//			XSSFRow rows = sheet.getRow(i+1);
//			for (int j = 0; j < colCount; j++) {
//				XSSFCell cell = rows.getCell(j);
//				CellType cellType = cell.getCellType();
//				switch (cellType) {
//				case STRING: 
//					data[i][j] = cell.getStringCellValue();	
//					break;
//
//				case NUMERIC: 
//					data[i][j] = cell.getNumericCellValue();
//					break;
//
//				case BOOLEAN: 
//					data[i][j] = cell.getBooleanCellValue();	
//					break;
//				default:
//					System.out.println("Value type doesn't match");
//					break;
//				}
//			}
//		}
//		return data; 
//	}


}
