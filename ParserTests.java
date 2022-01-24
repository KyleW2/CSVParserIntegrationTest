import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

/*
  Valid.csv:

  letter,number
  a,1
  b,2
  c,3
  d,4
  e,5
*/

public class ParserTests {
    @Test
    public void testRandomElements() {
      CSVParser test = new CSVParser("csv/valid.csv");
      ArrayList<String[]> testCsv = test.getCSV();
      assertEquals("failure - element is not correct", "1", testCsv.get(1)[1]);
      assertEquals("failure - element is not correct", "d", testCsv.get(4)[0]);
      assertEquals("failure - element is not correct", "5", testCsv.get(5)[1]);
      assertEquals("failure - element is not correct", "b", testCsv.get(2)[0]);
    }

    @Test
    public void testNumberOfRows() {
      CSVParser test = new CSVParser("csv/valid.csv");
      assertEquals("failure - number of rows are not equal", 6, test.getNumRows());
    }
}