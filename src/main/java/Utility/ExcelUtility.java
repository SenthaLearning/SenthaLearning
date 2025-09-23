package Utility;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class ExcelUtility {

    public static File file = new File("C:\\Users\\admin\\IdeaProjects\\JavaPractice\\TestDataWB.xlsx");


    public static void main(String[] args) {
        // print data from Excel
        try {
            getExcelData(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getExcelData(File file) throws IOException {
        XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(file));
        XSSFSheet ws = wb.getSheet("TestData");
        int lastRowNum = ws.getLastRowNum();
        for(int i=0; i<lastRowNum; i++ ) {
            XSSFRow row = ws.getRow(i);
            Iterator<Cell> iterator = row.cellIterator();
            while(iterator.hasNext()) {
                Cell cell = iterator.next();
                System.out.print(cell.getStringCellValue()+ " ");
            }
            System.out.println();
        }

    }

}
