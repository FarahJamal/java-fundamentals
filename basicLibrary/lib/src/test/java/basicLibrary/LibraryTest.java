package basicLibrary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
        //[2,5,5,8,10]
        int [] arr=new int []{2,5,5,8,10};
        assertEquals(6, test.average(arr),"Regular average should work");


    }
}