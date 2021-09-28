package basicLibrary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LibraryTest {
Library test;
    @BeforeEach

    void setup() {
     test=new Library();
    }

    @Test
    @DisplayName("Simple average should work")
    void testAverage(){
        int [] arr=new int []{2,5,5,8,10};
        assertEquals(6, test.average(arr),"Regular average should work");


    }

    @Test
    @DisplayName("tally function should out the most votes")
    void testTally(){
        List<String> votes = new ArrayList<>();
        votes.add("snape");
        votes.add("snape");
        votes.add("voldemort");
        votes.add("snape");
        votes.add("voldemort");
        votes.add("snape");
        votes.add("harry_potter");
        votes.add("snape");
        votes.add("harry_potter");

        assertEquals("snape", test.tally(votes),"tally votes should work");

    }
}