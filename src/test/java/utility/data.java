package utility;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.InterruptedIOException;

import static jdk.internal.foreign.abi.ppc64.PPC64Architecture.Regs.f1;

@Test
public class data {
public static String user;
public static String passwo;
public void Data() throws IllegalArgumentException,InterruptedException, InterruptedIOException {
    FileInputStream f = new FileInputStream("E://Intellij//project//MProject01.xlsx");
    Workbook w1 = WorkbookFactory.create(f1);

    user = w1.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();

    passwo = w1.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();


}
}
