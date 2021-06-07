package tests;

import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Test;
import tweaks.Files;

import java.io.IOException;

import static com.codeborne.pdftest.PDF.containsText;
import static tweaks.Files.getPdf;
import static org.hamcrest.MatcherAssert.assertThat;


public class PdfFile {
    @Test
    void checkPdfFile() throws IOException {
        String Path = "./src/test/resources/files/document.pdf";
        String expectedData = "I FEEL SUCCESS";
        PDF pdf = getPdf(Path);
        assertThat(pdf, PDF.containsText(expectedData));
    }
}