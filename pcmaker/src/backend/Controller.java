package backend;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public abstract class Controller {
	
	public static XSSFWorkbook workbook;
	
	
	public boolean checkRowEmpty(Row row) {
		for (int c = row.getFirstCellNum(); c < row.getLastCellNum(); c++) {
			Cell cell = row.getCell(c);
			if (cell != null && cell.getCellType() != CellType.BLANK) {
				return false;
			}
		}
		return true;
	}

	public abstract String[][] getSortedData(String field, String order);

	public abstract String[] getFieldTitle();

	public abstract String[][] getTableData();

}
