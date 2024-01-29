package hashSet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class RemoveDuplicatesTest {
    @Test
    public void testRemoveDuplicatesChars() {
        String input1 = "programming";
        String output1 = RemoveDuplicates.removeDuplicatesChars(input1);
        Assertions.assertEquals("progamin", output1);
        String input2 = "hello";
        String output2 = RemoveDuplicates.removeDuplicatesChars(input2);
        Assertions.assertEquals("helo", output2);
    }
}
