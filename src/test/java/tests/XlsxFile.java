package tests;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static tweaks.Files.readXlsxFromPath;

public class XlsxFile {
    @Test
    void checkXlsFile() {
        String path = "./src/test/resources/files/Excel.xlsx";
        String expectedData = "I FEEL SUCCESS";

        String xlsx = readXlsxFromPath(path);
        assertThat(xlsx, containsString(expectedData));
    }
}