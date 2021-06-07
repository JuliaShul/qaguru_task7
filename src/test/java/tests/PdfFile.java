package tests;

import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Test;
import java.io.IOException;

import static tweaks.Files.getPdf;
import static org.hamcrest.MatcherAssert.assertThat;


public class PdfFile {
    @Test
    void checkPdfFile() throws IOException {
        String path = "./src/test/resources/files/document.pdf";
        String expectedData = "I FEEL SUCCESS";
        PDF pdf = getPdf(path);
        assertThat(pdf, PDF.containsText(expectedData));
    }
}