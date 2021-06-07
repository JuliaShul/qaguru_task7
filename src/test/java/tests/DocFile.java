package tests;

import org.junit.jupiter.api.Test;
import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static tweaks.Files.readTextFromPath;

public class DocFile {
    @Test
    void checkDocFile() throws IOException {
        String path = "./src/test/resources/files/doc.doc";
        String expectedData = "I FEEL SUCCESS";
        String actualData = readTextFromPath(path);

        assertThat(actualData, containsString(expectedData));

    }
}
