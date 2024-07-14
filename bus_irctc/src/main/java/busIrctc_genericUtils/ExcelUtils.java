package busIrctc_genericUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {

	/**@author Admin Jyoti Jogur
	 * Read data from excel sheet
	 * @throws IOException 
	 * @throws EncryptedDocumentException 
	 */
	public String readDataFromExcelSheet(String sheetName, int rowNum, int cellNum) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./TestData/Excel Data.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		String excelData=workbook.getSheet(sheetName).getRow(rowNum).createCell(cellNum).getStringCellValue();
		return excelData;
	}


	/**@author Admin Jyoti Jogur
	 * Write data in excel sheet
	 * @throws IOException 
	 * @throws EncryptedDocumentException 
	 */
	public void writeDataFromExcelSheet(String sheetName, int rowNum, int cellNum, String value) throws EncryptedDocumentException, IOException {	
		FileInputStream fis=new FileInputStream("./TestData/Excel Data.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		workbook.getSheet(sheetName).getRow(rowNum).createCell(cellNum).setCellValue(value);
		FileOutputStream fos=new FileOutputStream("./TestData/Excel Data.xlsx");
		workbook.write(fos);
		workbook.close();
	}

	/**@author Admin Jyoti Jogur
	 * Read the all data from excel sheet
	 * @throws IOException 
	 * @throws EncryptedDocumentException 
	 */
	public void readAllDataFromExcel(String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./TestData/Excel Data.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		int lasrRowNum=sheet.getLastRowNum();
		short lastCellCount = sheet.getRow(0).getLastCellNum();
		for(int i=0; i<=lasrRowNum; i++) {
			for(int j=0; j<=lastCellCount; j++) {
				String value=workbook.getSheet(sheetName).getRow(i).getCell(j).getStringCellValue();
				System.out.println(value);
			}
		}

	}

}
