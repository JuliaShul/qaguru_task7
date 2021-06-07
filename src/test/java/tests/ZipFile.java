package tests;

import net.lingala.zip4j.exception.ZipException;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static tweaks.Files.readXlsxFromPath;
import static tweaks.Zip.unzip;

public class ZipFile {
    @Test
    void checkZipFile() throws ZipException {
        String path = "./src/test/resources/files/Excel.zip";
        String expectedData = "I FEEL SUCCESS";
        String unzipFolderPath = "./src/test/resources/files/unzip";
        String zipPassword = "";
        String unzipExcelFilePath = "./src/test/resources/files/unzip/Excel.xlsx";

        unzip(path, unzipFolderPath, zipPassword);

        String actualData = readXlsxFromPath(unzipExcelFilePath);
        assertThat(actualData, containsString(expectedData));

    }
}
