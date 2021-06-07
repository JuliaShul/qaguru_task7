package tests;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static tweaks.Files.readTextFromPath;

public class DocxFile {
    @Test
    void checkDocFile() throws IOException {
        String Path = "./src/test/resources/files/newdoc.docx";
        String expectedData = "I FEEL SUCCESS";
        String actualData = readTextFromPath(Path);

        assertThat(actualData, containsString(expectedData));

    }
}
