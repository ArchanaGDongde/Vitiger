package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
 public  void writeExcel(String sheetName,String cellvalue,int row,int col) throws IOException {
	 
	 String excelPath="C:\\Users\\vijay\\eclipse-workspace\\assignments\\src\\test\\resources\\Data\\QA\\Book1.xlsx";
	 File file=new File(excelPath);
	 FileInputStream fi=new FileInputStream(file);
	 XSSFWorkbook wb=new XSSFWorkbook(fi);
	 //to read the XL Sheet 
	 XSSFSheet sheet=wb.getSheet(sheetName);
	 sheet.getRow(row).createCell(col).setCellValue(cellvalue);
	 FileOutputStream fos=new FileOutputStream(new File(excelPath));
	 wb.write(fos);
	 wb.close();
	 fos.close();
	 
 }
}
