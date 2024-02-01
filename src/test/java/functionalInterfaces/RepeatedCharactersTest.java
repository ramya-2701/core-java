package functionalInterfaces;
import static org.junit.Assert.*;
import org.junit.Test;

public class RepeatedCharactersTest {

    @Test
    public void testCharacterRepetitionWithRepeats() {
        String inputString = "programming";
        RepeatedCharacters.characterRepetation(inputString);
    }

    @Test
    public void testCharacterRepetitionWithoutRepeats() {
        String inputString = "abcdef";
        RepeatedCharacters.characterRepetation(inputString);
    }

    @Test
    public void testCharacterRepetitionEmptyString() {
        String inputString = "";
        RepeatedCharacters.characterRepetation(inputString);
    }

    @Test
    public void testCharacterRepetitionSingleCharacter() {
        String inputString = "a";
        RepeatedCharacters.characterRepetation(inputString);

    }
}
