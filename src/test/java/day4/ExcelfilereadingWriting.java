package day4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelfilereadingWriting {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//file--WorkBook-Sheet-row-cell

		//FileInputStream and FileOutPutStream
		
		File src= new File("C:\\Users\\subes\\eclipse-workspace1\\2\\testdata\\data.xlsx");
		FileInputStream file = new FileInputStream(src);

		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");

		int a=sheet.getLastRowNum();
		
		int b= sheet.getRow(1).getLastCellNum();
		System.out.println(a+"  "+b);

		
		for (int r=0 ;r<=a;r++)
		{
			XSSFRow currentrow =sheet.getRow(r);
			
			for(int c=0;c<b;c++)
			{
				XSSFCell cell =currentrow.getCell(c);
				System.out.println(cell.toString());
			}
			
		}
		
		
		
		
		
	}

}
