/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    Main test;
    @BeforeEach

    void setup() {
        test=new Main();
    }
    @Test
    public void testLinterMessage() {
        String expected =
                ("Line 1: Missing semicolon\n" +
                "Line1: has double quotes\n" +
                "Line 2: Missing semicolon\n" +
                "Line3: has double quotes\n" +
                "Line4: has double quotes\n" +
                "Line 5: Missing semicolon\n" +
                "Line8: has double quotes\n" +
                "Line9: has double quotes\n" +
                "Line11: has double quotes\n" +
                "Line12: has double quotes\n" +
                "Line 13: Missing semicolon\n" +
                "Line13: has double quotes\n" +
                "Line14: has double quotes\n" +
                "Line 15: Missing semicolon\n" +
                "Line17: has double quotes\n" +
                "Line18: has double quotes\n" +
                "Line19: has double quotes\n" +
                "Line20: has double quotes\n" +
                "Line21: has double quotes\n" +
                "Line22: has double quotes\n" +
                "Line23: has double quotes\n" +
                "Line24: has double quotes\n" +
                "Line25: has double quotes\n" +
                "Line26: has double quotes\n" +
                "Line27: has double quotes\n" +
                "Line28: has double quotes\n" +
                "Line29: has double quotes\n" +
                "Line30: has double quotes\n" +
                "Line 31: Missing semicolon\n" +
                "Line32: has double quotes\n" +
                "Line33: has double quotes\n" +
                "Line 34: Missing semicolon\n" +
                "Line35: has double quotes\n" +
                "Line36: has double quotes\n" +
                "Line 37: Missing semicolon\n" +
                "Line38: has double quotes\n" +
                "Line39: has double quotes\n" +
                "Line 40: Missing semicolon\n");
        Main.ReadFile("test.js");
        assertEquals(expected,Main.ReadFile("../lib/src/main/resources/"+"test.js"));

    }
}
