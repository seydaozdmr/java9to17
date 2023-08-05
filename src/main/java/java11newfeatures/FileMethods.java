package java11newfeatures;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;
public class FileMethods {
    @Test
    public void fileMethods() throws IOException {
        //It reads all content from a file into a string, decoding from bytes to characters using the UTF-8 charset.
        Path filePath = Files.writeString(Files.createTempFile(Path.of(""), "demo", ".txt"), "Sample text");
        String fileContent = Files.readString(filePath);
        assertEquals(fileContent,"Sample text");

        //The method ensures that the file is closed when all content have been read or an I/O error, or other runtime exception, is thrown.
    }

    @Test
    public void writeString() throws IOException {
        Path path = Paths.get("exampleFile.txt");
        String fileContent = "{\n" +
                " \"name\":\"John\",\n" +
                " \"age\":30,\n" +
                " \"car\":null\n" +
                " }";

        Files.writeString(path, fileContent);
    }
}
