package functionalInterfaces;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class RepeatedCharactersTest {
    @Test
    public void testCharacterRepetitionWithNoRepeats() {
        String input = "abcdef";
        String result = RepeatedCharacters.characterRepetition(input);
        assertEquals("", result);
    }
    @Test
    public void testCharacterRepetitionWithSingleRepeat() {
        String input = "abcdeff";
        String result = RepeatedCharacters.characterRepetition(input);
        assertEquals("f", result);
    }
    @Test
    public void testCharacterRepetitionWithMultipleRepeats() {
        String input = "aabbcc";
        String result = RepeatedCharacters.characterRepetition(input);
        assertEquals("abc", result);
    }
    @Test
    public void testCharacterRepetitionWithMixedRepeats() {
        String input = "aabcbdeff";
        String result = RepeatedCharacters.characterRepetition(input);
        assertEquals("abf", result);
    }
    @Test
    public void testCharacterRepetitionWithEmptyString() {
        String input = "";
        String result = RepeatedCharacters.characterRepetition(input);
        assertEquals("", result);
    }
}
