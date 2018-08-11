package Excelfilemaintanace;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
public class ReadExcelAdvance {
	@Test
	public Object[][] excelread(String excelname) throws IOException
	{
		//System.out.println("Excel name : "+excelname);
		XSSFWorkbook wbook = new XSSFWorkbook("./Excel/"+excelname+".xlsx");
		//XSSFSheet sheet = wbook.getSheet("loginsheet");
		XSSFSheet sheet = wbook.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		Object[][] stringCellValue = new Object[lastRowNum][lastCellNum];
		for(int i=1;i<=lastRowNum;i++)
		{
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<lastCellNum;j++)
			{
				try {
					XSSFCell cell = row.getCell(j);
					stringCellValue[i-1][j] = cell.getStringCellValue();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					stringCellValue[i-1][j]= "";
				}
				//System.out.println(stringCellValue);
			}
		}
		wbook.close();
		return stringCellValue;
	}
}
