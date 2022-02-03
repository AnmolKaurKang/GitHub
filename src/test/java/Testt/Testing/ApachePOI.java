package Testt.Testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

public class ApachePOI {
	/*//Reading
	//Path of the excel file
	FileInputStream fs = new FileInputStream("C:\\Users\\10694225\\Desktop\\SELENIUM\\Book1.xlsx");
	//Creating a workbook
	XSSFWorkbook workbook = new XSSFWorkbook(fs);
	XSSFSheet sheet1 = workbook.getSheetAt(0);
	Row row = sheet1.getRow(0);
	Cell cell = (Cell) row.getCell(0);
	System.out.println(sheet1.getRow(0).getCell(0));
	Row row1 = sheet1.getRow(1);
	Cell cell1 = (Cell) row1.getCell(1);
	System.out.println(sheet1.getRow(0).getCell(1));
	Row row2 = sheet1.getRow(1);
	Cell cell2 = (Cell) row2.getCell(1);
	System.out.println(sheet.getRow(1).getCell(0));
	Row row3 = sheet1.getRow(1);
	Cell cell3 = (Cell) row3.getCell(1);
	System.out.println(sheet.getRow(1).getCell(1));
	//String cellval = cell.getStringCellValue();
	//System.out.println(cellval);
	}
	}





/////--------------------------
	
	FileInputStream fis=new FileInputStream("C:\\Users\\10694225\\Desktop\\SELENIUM\\Bokk1.xlx");
	Workbook wrbk =new XSSFWorkbook(fis);
	org.apache.poi.ss.usermodel.Sheet sheet=wrbk.getSheetAt(0);
	int lastRow=sheet1.getLastRowNum();
//	System.out.print("Last Row" + lastRow);
	for(int i=0;i<=lastRow;i++)
	{
	Row row=sheet1.getRow(i);
	int lastCell=row.getLastCellNum();
	for(int j=0;j<lastCell;j++)
	{
	Cell cell=(Cell) row.getCell(j);
	String value=((org.apache.poi.ss.usermodel.Cell) cell).getStringCellValue();
	System.out.print(value);
	}
	}
	



	////Write
	public static void main(String[] args) throws IOException 
	{
	String path = "D://DemoFile.xlsx";
	FileInputStream fs = new FileInputStream(path);
	Workbook wb = new XSSFWorkbook(fs);
	Sheet sheet1 = wb.getSheetAt(0);
	int lastRow = ((org.apache.poi.ss.usermodel.Sheet) sheet1).getLastRowNum();
	for(int i=0; i<=lastRow; i++){
	Row row = sheet1.getRow(i);
	Cell cell = row.createCell(2);



	cell.setCellValue("WriteintoExcel");



	}



	FileOutputStream fos = new FileOutputStream(path);
	wb.write(fos);
	fos.close();
	}




	/////////////////




	@Test
	public void write() throws IOException
	{
	//define the file path where excel sheet will be generated
	String filepath= (".\\excelsheet\\write.xlsx");
	File file= new File(filepath);
	FileOutputStream fos=new FileOutputStream(file);
	//create the blank workbook
	Workbook wb= new XSSFWorkbook();
	//create the blank excel sheet
	Sheet sh= wb.createSheet("Webl");
	//define the position in the excel sheet where write operation needs to perform
	Row rw= sh.createRow(4);
	Cell cl=rw.createCell(1);
	//define input type
	cl.setCellType(CellType.STRING);
	//define the data value
	cl.setCellValue("Webul Software");
	//write the workbook
	wb.write(fos);
	}
	}
	
	

*/
}
	



	

