package com.capstoneteam18.app;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.io.IOException;


/*
  Valid.csv:

  letter,number
  a,1
  b,2
  c,3
  d,4
  e,5
*/

public class AppTest {
    @Test
    public void testRandomElements() throws IOException {
      CSVParser test = new CSVParser("./src/test/java/com/CapstoneTeam18/app/csv/valid.csv");
      ArrayList<String[]> testCsv = test.getCSV();

      assertEquals("failure - element is not correct", "1", testCsv.get(1)[1]);
      assertEquals("failure - element is not correct", "d", testCsv.get(4)[0]);
      assertEquals("failure - element is not correct", "5", testCsv.get(5)[1]);
      assertEquals("failure - element is not correct", "b", testCsv.get(2)[0]);
    }

    @Test
    public void testNumberOfRows() throws IOException {
      CSVParser test = new CSVParser("./src/test/java/com/CapstoneTeam18/app/csv/valid.csv");
      assertEquals("failure - number of rows are not equal", 6, test.getNumRows());
    }

    @Test
    public void testEnglishNumberOfRows() throws IOException {
      CSVParser test = new CSVParser("./src/test/java/com/CapstoneTeam18/app/csv/english.csv");
      assertEquals("failure - number of rows are not equal", 27, test.getNumRows());
    }

    @Test
    public void testEnglishNumberElements() throws IOException {
      CSVParser test = new CSVParser("./src/test/java/com/CapstoneTeam18/app/csv/english.csv");
      ArrayList<String[]> testCsv = test.getCSV();
      String errorString = "failure - number element is not correct";

      assertEquals(errorString, "1", testCsv.get(0)[1]);
      assertEquals(errorString, "2", testCsv.get(1)[1]);
      assertEquals(errorString, "3", testCsv.get(2)[1]);
      assertEquals(errorString, "4", testCsv.get(3)[1]);
      assertEquals(errorString, "5", testCsv.get(4)[1]);
      assertEquals(errorString, "6", testCsv.get(5)[1]);
      assertEquals(errorString, "7", testCsv.get(6)[1]);
      assertEquals(errorString, "8", testCsv.get(7)[1]);
      assertEquals(errorString, "9", testCsv.get(8)[1]);
      assertEquals(errorString, "10", testCsv.get(9)[1]);
      assertEquals(errorString, "11", testCsv.get(10)[1]);
      assertEquals(errorString, "12", testCsv.get(11)[1]);
      assertEquals(errorString, "13", testCsv.get(12)[1]);
      assertEquals(errorString, "14", testCsv.get(13)[1]);
      assertEquals(errorString, "15", testCsv.get(14)[1]);
      assertEquals(errorString, "16", testCsv.get(15)[1]);
      assertEquals(errorString, "17", testCsv.get(16)[1]);
      assertEquals(errorString, "18", testCsv.get(17)[1]);
      assertEquals(errorString, "19", testCsv.get(18)[1]);
      assertEquals(errorString, "20", testCsv.get(19)[1]);
      assertEquals(errorString, "21", testCsv.get(20)[1]);
      assertEquals(errorString, "22", testCsv.get(21)[1]);
      assertEquals(errorString, "23", testCsv.get(22)[1]);
      assertEquals(errorString, "24", testCsv.get(23)[1]);
      assertEquals(errorString, "25", testCsv.get(24)[1]);
      assertEquals(errorString, "26", testCsv.get(25)[1]);
    }

    @Test
    public void testEnglishLetterElements() throws IOException {
      CSVParser test = new CSVParser("./src/test/java/com/CapstoneTeam18/app/csv/english.csv");
      ArrayList<String[]> testCsv = test.getCSV();
      String errorString = "failure - letter element is not correct";

      assertEquals(errorString, "a", testCsv.get(0)[0]);
      assertEquals(errorString, "b", testCsv.get(1)[0]);
      assertEquals(errorString, "c", testCsv.get(2)[0]);
      assertEquals(errorString, "d", testCsv.get(3)[0]);
      assertEquals(errorString, "e", testCsv.get(4)[0]);
      assertEquals(errorString, "f", testCsv.get(5)[0]);
      assertEquals(errorString, "g", testCsv.get(6)[0]);
      assertEquals(errorString, "h", testCsv.get(7)[0]);
      assertEquals(errorString, "i", testCsv.get(8)[0]);
      assertEquals(errorString, "j", testCsv.get(9)[0]);
      assertEquals(errorString, "k", testCsv.get(10)[0]);
      assertEquals(errorString, "l", testCsv.get(11)[0]);
      assertEquals(errorString, "m", testCsv.get(12)[0]);
      assertEquals(errorString, "n", testCsv.get(13)[0]);
      assertEquals(errorString, "o", testCsv.get(14)[0]);
      assertEquals(errorString, "p", testCsv.get(15)[0]);
      assertEquals(errorString, "q", testCsv.get(16)[0]);
      assertEquals(errorString, "r", testCsv.get(17)[0]);
      assertEquals(errorString, "s", testCsv.get(18)[0]);
      assertEquals(errorString, "t", testCsv.get(19)[0]);
      assertEquals(errorString, "u", testCsv.get(20)[0]);
      assertEquals(errorString, "v", testCsv.get(21)[0]);
      assertEquals(errorString, "w", testCsv.get(22)[0]);
      assertEquals(errorString, "x", testCsv.get(23)[0]);
      assertEquals(errorString, "y", testCsv.get(24)[0]);
      assertEquals(errorString, "z", testCsv.get(25)[0]);
    }

    @Test
    public void testSpanishNumberOfRows() throws IOException {
      CSVParser test = new CSVParser("./src/test/java/com/CapstoneTeam18/app/csv/spanish.csv");
      assertEquals("failure - number of rows are not equal", 31, test.getNumRows());
    }

    @Test
    public void testSpanishNumberElements() throws IOException {
      CSVParser test = new CSVParser("./src/test/java/com/CapstoneTeam18/app/csv/spanish.csv");
      ArrayList<String[]> testCsv = test.getCSV();
      String errorString = "failure - number element is not correct";

      assertEquals(errorString, "1", testCsv.get(0)[1]);
      assertEquals(errorString, "2", testCsv.get(1)[1]);
      assertEquals(errorString, "3", testCsv.get(2)[1]);
      assertEquals(errorString, "4", testCsv.get(3)[1]);
      assertEquals(errorString, "5", testCsv.get(4)[1]);
      assertEquals(errorString, "6", testCsv.get(5)[1]);
      assertEquals(errorString, "7", testCsv.get(6)[1]);
      assertEquals(errorString, "8", testCsv.get(7)[1]);
      assertEquals(errorString, "9", testCsv.get(8)[1]);
      assertEquals(errorString, "10", testCsv.get(9)[1]);
      assertEquals(errorString, "11", testCsv.get(10)[1]);
      assertEquals(errorString, "12", testCsv.get(11)[1]);
      assertEquals(errorString, "13", testCsv.get(12)[1]);
      assertEquals(errorString, "14", testCsv.get(13)[1]);
      assertEquals(errorString, "15", testCsv.get(14)[1]);
      assertEquals(errorString, "16", testCsv.get(15)[1]);
      assertEquals(errorString, "17", testCsv.get(16)[1]);
      assertEquals(errorString, "18", testCsv.get(17)[1]);
      assertEquals(errorString, "19", testCsv.get(18)[1]);
      assertEquals(errorString, "20", testCsv.get(19)[1]);
      assertEquals(errorString, "21", testCsv.get(20)[1]);
      assertEquals(errorString, "22", testCsv.get(21)[1]);
      assertEquals(errorString, "23", testCsv.get(22)[1]);
      assertEquals(errorString, "24", testCsv.get(23)[1]);
      assertEquals(errorString, "25", testCsv.get(24)[1]);
      assertEquals(errorString, "26", testCsv.get(25)[1]);
      assertEquals(errorString, "27", testCsv.get(26)[1]);
      assertEquals(errorString, "28", testCsv.get(27)[1]);
      assertEquals(errorString, "29", testCsv.get(28)[1]);
      assertEquals(errorString, "30", testCsv.get(29)[1]);
    }

    @Test
    public void testSpanishLetterElements() throws IOException {
      CSVParser test = new CSVParser("./src/test/java/com/CapstoneTeam18/app/csv/spanish.csv");
      ArrayList<String[]> testCsv = test.getCSV();
      String errorString = "failure - letter element is not correct";

      assertEquals(errorString, "a", testCsv.get(0)[0]);
      assertEquals(errorString, "b", testCsv.get(1)[0]);
      assertEquals(errorString, "c", testCsv.get(2)[0]);
      assertEquals(errorString, "ch", testCsv.get(3)[0]);
      assertEquals(errorString, "d", testCsv.get(4)[0]);
      assertEquals(errorString, "e", testCsv.get(5)[0]);
      assertEquals(errorString, "f", testCsv.get(6)[0]);
      assertEquals(errorString, "g", testCsv.get(7)[0]);
      assertEquals(errorString, "h", testCsv.get(8)[0]);
      assertEquals(errorString, "i", testCsv.get(9)[0]);
      assertEquals(errorString, "j", testCsv.get(10)[0]);
      assertEquals(errorString, "k", testCsv.get(11)[0]);
      assertEquals(errorString, "l", testCsv.get(12)[0]);
      assertEquals(errorString, "ll", testCsv.get(13)[0]);
      assertEquals(errorString, "m", testCsv.get(14)[0]);
      assertEquals(errorString, "n", testCsv.get(15)[0]);
      assertEquals(errorString, "ñ", testCsv.get(16)[0]);
      assertEquals(errorString, "o", testCsv.get(17)[0]);
      assertEquals(errorString, "p", testCsv.get(18)[0]);
      assertEquals(errorString, "q", testCsv.get(19)[0]);
      assertEquals(errorString, "r", testCsv.get(20)[0]);
      assertEquals(errorString, "rr", testCsv.get(21)[0]);
      assertEquals(errorString, "s", testCsv.get(22)[0]);
      assertEquals(errorString, "t", testCsv.get(23)[0]);
      assertEquals(errorString, "u", testCsv.get(24)[0]);
      assertEquals(errorString, "v", testCsv.get(25)[0]);
      assertEquals(errorString, "w", testCsv.get(26)[0]);
      assertEquals(errorString, "x", testCsv.get(27)[0]);
      assertEquals(errorString, "y", testCsv.get(28)[0]);
      assertEquals(errorString, "z", testCsv.get(29)[0]);
    }
}