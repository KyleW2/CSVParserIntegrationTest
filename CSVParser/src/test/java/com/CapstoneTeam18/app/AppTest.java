package com.CapstoneTeam18.app;

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
}