package tests;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.Matchers.containsString;
import static tweaks.Files.readTextFromPath;
import static org.hamcrest.MatcherAssert.assertThat;


public class TxtFile {
    @Test
    void checkTxtFile() throws IOException {
        String Path = "./src/test/resources/files/text.txt";
        String expectedData = "I FEEL SUCCESS";
        String actualData = readTextFromPath(Path);

        assertThat(actualData, containsString(expectedData));

    }
}
