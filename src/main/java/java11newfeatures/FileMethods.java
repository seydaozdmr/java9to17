package java11newfeatures;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import static org.junit.Assert.assertEquals;
public class FileMethods {
    @Test
    public void fileMethods() throws IOException {

        Path filePath = Files.writeString(Files.createTempFile(Path.of(""), "demo", ".txt"), "Sample text");
        String fileContent = Files.readString(filePath);
        assertEquals(fileContent,"Sample text");
    }
}
