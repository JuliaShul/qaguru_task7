package tests;

import com.codeborne.xlstest.XLS;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static tweaks.Files.getXls;

public class XlsFile {
    @Test
    void checkXlsFile() {
        String path = "./src/test/resources/files/Excel.xls";
        String expectedData = "I FEEL SUCCESS";

        XLS xls = getXls(path);

        String actualData = xls.excel.getSheetAt(0).getRow(8).getCell(3).toString();
        assertThat(xls, XLS.containsText(expectedData));

    }
}