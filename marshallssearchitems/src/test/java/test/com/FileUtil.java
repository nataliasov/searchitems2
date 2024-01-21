/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.com;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Natalia
 */
public class FileUtil {
    public static Items getData() throws Exception {

            //read excel file

     FileInputStream inputStream = new FileInputStream(new File("c:\\data\\Items.xlsx"));

         

        Workbook workbook = new XSSFWorkbook(inputStream);


        //getting first worksheet

        Sheet firstSheet = workbook.getSheetAt(0);

        

       //get first row

        Row r =  firstSheet.getRow(0);  //first row

        Cell c = r.getCell(1); //username value

        String item = c.getStringCellValue();

        

        

        r =  firstSheet.getRow(1);  //second row 

        c = r.getCell(1); //password value

        String item2 = c.getStringCellValue();

        

        

        r =  firstSheet.getRow(2);  //third row 

        c = r.getCell(1); //email value

        String item3 = c.getStringCellValue();

        

        //Populate POJO

        Items items  = new Items ("Items");

        

        System.out.println(items);

        inputStream.close();

        return items;

    }
}
