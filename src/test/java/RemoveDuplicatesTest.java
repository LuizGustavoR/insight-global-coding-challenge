import org.example.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicatesWithDuplicateCharacters() {
        String input = "abcbc12323";
        String expectedOutput = "abc123";
        assertEquals(expectedOutput, Main.RemoveDuplicates.removeDuplicates(input));
    }

    @Test
    public void testRemoveDuplicatesWithMixedCase() {
        String input = "JavaProgram()";
        String expectedOutput = "JavProgm()";
        assertEquals(expectedOutput, Main.RemoveDuplicates.removeDuplicates(input));
    }

    @Test
    public void testRemoveDuplicatesWithEmptyString() {
        String input = "";
        String expectedOutput = "";
        assertEquals(expectedOutput, Main.RemoveDuplicates.removeDuplicates(input));
    }

    @Test
    public void testRemoveDuplicatesWithNoDuplicates() {
        String input = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        assertEquals(input, Main.RemoveDuplicates.removeDuplicates(input));
    }

    @Test
    public void testRemoveDuplicatesWithAllCharactersDuplicates() {
        String input = "AAAAA";
        String expectedOutput = "A";
        assertEquals(expectedOutput, Main.RemoveDuplicates.removeDuplicates(input));
    }

    @Test
    public void testRemoveDuplicatesWithSpecialCharactersAndSpaces() {
        String input = "!@#$%^&*()   ";
        String expectedOutput = "!@#$%^&*() ";
        assertEquals(expectedOutput, Main.RemoveDuplicates.removeDuplicates(input));
    }

    @Test
    public void testRemoveDuplicatesWithMixedCaseCharacters() {
        String input = "aAbbCcDd";
        String expectedOutput = "aAbCcDd";
        assertEquals(expectedOutput, Main.RemoveDuplicates.removeDuplicates(input));
    }
}
