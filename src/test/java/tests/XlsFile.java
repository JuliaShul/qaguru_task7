package tests;

import com.codeborne.xlstest.XLS;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static tweaks.Files.getXls;
import static tweaks.Files.readTextFromPath;

public class XlsFile {
    @Test
    void checkXlsFile() throws IOException {
        String Path = "./src/test/resources/files/text.txt";
        String expectedData = "I FEEL SUCCESS";

        XLS xls = getXls(Path);


        String actualData = readTextFromPath(Path);

        assertThat(actualData, containsString(expectedData));

    }
}