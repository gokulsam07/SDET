package framework;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataLib {
	
	public static void main(String[] args) {
		try {
			XSSFWorkbook wb = new XSSFWorkbook("C://MyWorkspace//SDET//src//main//java//framework//DataFile.xlsx");
			XSSFSheet sheet = wb.getSheetAt(0);
			int row = sheet.getLastRowNum();
			int cellCount = sheet.getRow(0).getLastCellNum();
			for (int i = 1; i <=row; i++) {
				for (int j = 0; j < cellCount; j++) {
					String details = sheet.getRow(i).getCell(j).getStringCellValue();
					System.out.println(details);
				}
				
			}
			wb.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
