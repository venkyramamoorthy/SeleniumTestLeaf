package Excelfilemaintanace;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
public class ReadExcelBasic {
	@Test
	public void excelread() throws IOException
	{
		XSSFWorkbook wbook = new XSSFWorkbook("./Excel/Login.xlsx");
		XSSFSheet sheet = wbook.getSheet("loginsheet");
		int lastRowNum = sheet.getLastRowNum();
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		for(int i=1;i<=lastRowNum;i++)
		{
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<lastCellNum;j++)
			{
				XSSFCell cell = row.getCell(j);
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
			}
		}
		wbook.close();
	}
}
