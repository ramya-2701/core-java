package functionalInterfaces;
import static org.junit.Assert.*;
import org.junit.Test;
public class CharacterCaseTest {
    @Test
    public void testReplaceCase() {
        String inputString = "Hello World!";
        String result = CharacterCase.replaceCase(inputString);
        assertEquals("hELLO wORLD!", result);
    }
    @Test
    public void testReplaceCaseWithEmptyString() {
        String inputString = "";
        String result = CharacterCase.replaceCase(inputString);
        assertEquals("", result);
    }
    @Test
    public void testReplaceCaseWithMixedCase() {
        String inputString = "ThIs Is A MiXeD CaSe StRiNg";
        String result = CharacterCase.replaceCase(inputString);
        assertEquals( "tHiS iS a mIxEd cAsE sTrInG", result);
    }
    public void testReplaceCaseWithNumbers() {
        String inputString = "String With Numbers 2468";
        String result = CharacterCase.replaceCase(inputString);
        assertEquals( "sTRING wITH nUMBERS 2468", result);
    }
}
