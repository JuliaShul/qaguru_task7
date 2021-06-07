package tests;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static tweaks.Files.getDoc;

public class DocxFile {
    @Test
    void checkDocFile() throws IOException {
        String path = "./src/test/resources/files/Doc.docx";
        String expectedData = "I FEEL SUCCESS";

        String actualData = getDoc(path);
        assertThat(actualData, containsString(expectedData));
    }
}

