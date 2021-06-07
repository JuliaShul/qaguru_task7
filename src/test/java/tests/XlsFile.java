package tests;

import com.codeborne.xlstest.XLS;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static tweaks.Files.getXls;

public class XlsFile {
    @Test
    void checkXlsFile() throws IOException {
        String Path = "./src/test/resources/files/Excel.xls";
        String expectedData = "I FEEL SUCCESS";

        XLS xls = getXls(Path);

        String actualData = xls.excel.getSheetAt(0).getRow(8).getCell(3).toString();
        assertThat(xls, XLS.containsText(expectedData));

    }
}