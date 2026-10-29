package com.example.wordcounter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class WordCounterUnitTest {
    @Test
    public void getCharCount_Test1_lettersOnly() {
        String inputValue= "labas";
        int expectedResult=5;
        int actualResult=Counter.getCharCount(inputValue);

        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void getCharCount_Test2_emptyString() {
        String inputValue= "";
        int expectedResult=0;
        int actualResult=Counter.getCharCount(inputValue);

        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void getCharCount_Test3_nullString() {
        String inputValue= null;
        int expectedResult=-1;
        int actualResult=Counter.getCharCount(inputValue);

        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void getCharCount_Test4_specChar() {
        String inputValue= "labas?";
        int expectedResult=6;
        int actualResult=Counter.getCharCount(inputValue);

        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void getSpecCount_Test5_specChar() {
        String inputValue= "labas?";
        int expectedResult=1;
        int actualResult=Counter.getSpecCount(inputValue);

        assertEquals(expectedResult,actualResult);
    }
}
