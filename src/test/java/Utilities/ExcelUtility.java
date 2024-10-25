package Utilities;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ExcelUtility {

    public static List<List<String>> getData(String path, String sheetName, int istenenColonSayisi) {

        List<List<String>> tablo = new ArrayList<>();
        Sheet sheet = null;
        try {
            FileInputStream inputStream = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(inputStream);
            sheet = workbook.getSheet(sheetName);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            ArrayList<String> satir = new ArrayList<>();
            for (int j = 0; j < istenenColonSayisi; j++) {
                satir.add(sheet.getRow(i).getCell(j).toString());
            }
            tablo.add(satir);
        }
        return tablo;

    }

    public static void writeToExcel(String path, String testName, String testSonuc) {
        File dosya = new File(path);
        try {
            if (dosya.exists()) {

                FileInputStream inputStream = new FileInputStream(path);
                Workbook workbook = WorkbookFactory.create(inputStream);
                Sheet sheet = workbook.getSheetAt(0);
                Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
                Cell cell = row.createCell(row.getPhysicalNumberOfCells());
                cell.setCellValue(testName);
                cell = row.createCell(row.getPhysicalNumberOfCells());
                cell.setCellValue(testSonuc);
                FileOutputStream outputStream = new FileOutputStream(path);
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();

            } else {
                XSSFWorkbook workbook = new XSSFWorkbook();
                XSSFSheet sheet = workbook.createSheet("OrnekSayfasi");
                Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
                Cell cell = row.createCell(row.getPhysicalNumberOfCells());
                cell.setCellValue(testName);
                cell = row.createCell(row.getPhysicalNumberOfCells());
                cell.setCellValue(testSonuc);
                FileOutputStream outputStream = new FileOutputStream(path);
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();
            }

        } catch (Exception ex) {
            ex.getMessage();
        }
    }
}
