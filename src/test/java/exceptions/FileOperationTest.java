package exceptions;

import exceptions.FileOperation;
import org.junit.Test;
import static org.junit.Assert.*;

public class FileOperationTest {
    @Test
    public void testWithExsistingFile(){
        String filePath = "C:/Users/ramya/OneDrive/Desktop/test.txt";
        assertTrue(FileOperation.readContents(filePath));
    }
    @Test
    public void testWithNonExsistingFile(){
        String filePath="helloWorld.txt";
        assertFalse(FileOperation.readContents(filePath));
    }
}
