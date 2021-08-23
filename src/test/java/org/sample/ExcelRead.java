package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\SURESH GOPI\\eclipse-workspace\\MavenProject\\studentData\\Student Detail.xlsx");

		FileInputStream fin = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fin);

		Sheet sh = w.getSheet("Student Detail");

		for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
			
			Row row = sh.getRow(i);
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				
				Cell cell = row.getCell(j);

				System.out.println(cell);
			}
			
			
			
			
		}

	}
}
