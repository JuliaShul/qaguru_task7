package tests;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static tweaks.Files.readXlsxFromPath;

public class XlsxFile {
    @Test
    void checkXlsFile() throws IOException {
        String Path = "./src/test/resources/files/Excel.xlsx";
        String expectedData = "I FEEL SUCCESS";

        String xlsx = readXlsxFromPath(Path);
        assertThat(xlsx, containsString(expectedData));
    }
}