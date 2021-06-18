package SeleniumRevisionPackage;

import com.excel.lib.util.Xls_Reader;

public class Selenium_14_01_ExcelUtilTest {

	public static void main(String[] args) {
		
		Xls_Reader reader = new Xls_Reader("./src/main/java/com/excel/lib/util/SampleExcel.xlsx");
		String sheetName ="login";
		String data = reader.getCellData(sheetName, 0, 2);
		System.out.println(data);
		
		int rowCount = reader.getRowCount(sheetName);
		System.out.println("total rows: "+rowCount);
		
		//reader.addColumn(sheetName, "status");
		
		//reader.addSheet("Registration");
		
		if(!reader.isSheetExist("Registration")){
			reader.addSheet("Registration");
		}
		
		reader.setCellData(sheetName, "status", 2, "PASS");
		
		System.out.println(reader.getCellData(sheetName, "username", 3));
		
		System.out.println(reader.getColumnCount(sheetName));
		
		reader.removeColumn(sheetName, 2);
		
		System.out.println(reader.getCellData("Registration", "phoneNumber", 2));
		System.out.println(reader.getCellData("Registration", "age", 2));
		System.out.println(reader.getCellData("registration", "Date", 2));
		System.out.println(reader.getCellData("registration", "married", 2));
		

	}

}
