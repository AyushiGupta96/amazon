package Data;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class data {
    public  static  String user_name;
    public static String password;
    public void d() throws IOException {
        FileInputStream f = new FileInputStream("D:\\eclipse-workspace\\Amazon_Project01\\data.xlsx");
        Workbook w = new WorkbookFactory.create(f);
        user_name = w.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
        password = w.getsheet("sheet1").getRow(0).getCell(1).getStringCellValue();
    }
}
