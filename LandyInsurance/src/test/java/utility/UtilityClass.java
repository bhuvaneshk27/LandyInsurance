package utility;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;





import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class UtilityClass {

public static String[][] getExcelData(String Sheetname) throws IOException {
	
		

File fl=new File("C:\\Users\\admin\\workspaceLuna\\LandyInsurance\\src\\test\\exceldata\\Agent.xlsx");
			FileInputStream xlfis = new FileInputStream(fl);
		
			String[][] arrayExcelData =null;
			XSSFWorkbook wb = new XSSFWorkbook(xlfis);
			XSSFSheet sh = wb.getSheet(Sheetname);

			int totalNoOfRows = sh.getLastRowNum() + 1;
			int totalNoOfCols = sh.getRow(1).getLastCellNum();

			
			arrayExcelData = new String[totalNoOfRows - 1][totalNoOfCols];

			for (int i = 1; i < totalNoOfRows; i++) {

			for (int j = 0; j < (totalNoOfCols); j++) {
			arrayExcelData[i - 1][j] = sh.getRow(i).getCell(j).getStringCellValue();

			}

			}
			wb.close();
			return arrayExcelData;
			}

}
