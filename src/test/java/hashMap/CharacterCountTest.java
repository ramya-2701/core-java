package hashMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CharacterCountTest {

    @Test
    public void testPrintCharacterCounts() {
        String inputString = "test string";
        String expectedOutput = "t-3, e-1, s-2,  -1, r-1, i-1, n-1, g-1, ";
        CharacterCount.printCharacterCounts(inputString);
        System.out.println();
        Assertions.assertEquals(expectedOutput, System.out.toString());
    }

    @Test
    public void testPrintCharacterCountsEmptyString() {
        String inputString = "";
        String expectedOutput = "";
        System.out.println("Expected Output: " + expectedOutput);
        System.out.print("Actual Output: ");
        CharacterCount.printCharacterCounts(inputString);
        System.out.println();
        Assertions.assertEquals(expectedOutput, System.out.toString());
    }
}
