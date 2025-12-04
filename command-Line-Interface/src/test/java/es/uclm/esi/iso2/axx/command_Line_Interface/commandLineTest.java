package es.uclm.esi.iso2.axx.command_Line_Interface;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.After;
import org.junit.Test;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class commandLineTest {

    private static final double DELTA = 1e-9;

 
    @After
    public void restoreInputOutput() {
        System.setIn(System.in);
        System.setOut(System.out);
    }

    private void setInput(String data) {
        System.setIn(new ByteArrayInputStream(data.getBytes()));
    }

    @Test
    public void testReadInt() {
        setInput("2\n");
        assertEquals(2, new commandLine().readInt());
        
        restoreInputOutput();

        setInput("-6\n");
        assertEquals(-6, new commandLine().readInt());
        restoreInputOutput();

        setInput("2.5\n3\n");
        assertEquals(3, new commandLine().readInt());
        restoreInputOutput();

        setInput("hello\n10\n");
        assertEquals(10, new commandLine().readInt());
        restoreInputOutput();

        setInput("   \n8\n");
        assertEquals(8, new commandLine().readInt());
        restoreInputOutput();

        setInput("45b\n4\n");
        assertEquals(4, new commandLine().readInt());
        restoreInputOutput();

        setInput("2147483647\n");
        assertEquals(2147483647, new commandLine().readInt());
        restoreInputOutput();

        setInput("-2147483648\n");
        assertEquals(-2147483648, new commandLine().readInt());
        restoreInputOutput();

        setInput("2147483648\n0\n");
        assertEquals(0, new commandLine().readInt());
        restoreInputOutput();
    }

    @Test
    public void testReadDouble() {
        setInput("2\n");
        assertEquals(2.0, new commandLine().readDouble(), DELTA);

        setInput("2.5\n");
        assertEquals(2.5, new commandLine().readDouble(), DELTA);

        setInput("hello\n3.14\n");
        assertEquals(3.14, new commandLine().readDouble(), DELTA);

        setInput("   \n10.5\n");
        assertEquals(10.5, new commandLine().readDouble(), DELTA);

        setInput("1.7E308\n");
        assertEquals(1.7E308, new commandLine().readDouble(), DELTA);

        setInput("1.8E308\n1.0\n");
        assertEquals(Double.POSITIVE_INFINITY, new commandLine().readDouble(), DELTA);
        
        setInput("-1.8E308\n1.0\n");
        assertEquals(Double.NEGATIVE_INFINITY, new commandLine().readDouble(), DELTA);
    
    }

    @Test
    public void testReadDate() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        setInput("08/04/2005\n");
        assertEquals("08/04/2005", sdf.format(new commandLine().readDate()));
        restoreInputOutput();

        setInput("hello\n05/03/2020\n");
        assertEquals("05/03/2020", sdf.format(new commandLine().readDate()));
        restoreInputOutput();

        setInput("    \n05/03/2020\n");
        assertEquals("05/03/2020", sdf.format(new commandLine().readDate()));
        restoreInputOutput();

        setInput("31/03/2025\n");
        assertEquals("31/03/2025", sdf.format(new commandLine().readDate()));
        restoreInputOutput();

        setInput("00/04/2025\n05/03/2020\n");
        assertEquals("05/03/2020", sdf.format(new commandLine().readDate()));
        restoreInputOutput();

        setInput("32/04/2025\n05/03/2020\n");
        assertEquals("05/03/2020", sdf.format(new commandLine().readDate()));
        restoreInputOutput();

        setInput("06/01/2025\n05/03/2020\n");
        assertEquals("06/01/2025", sdf.format(new commandLine().readDate()));
        restoreInputOutput();

        setInput("06/13/2025\n05/03/2020\n");
        assertEquals("05/03/2020", sdf.format(new commandLine().readDate()));
        restoreInputOutput();

        setInput("06/00/2025\n05/03/2020\n");
        assertEquals("05/03/2020", sdf.format(new commandLine().readDate()));
        restoreInputOutput();

        setInput("06/04/-0001\n05/03/2020\n");
        assertEquals("05/03/2020", sdf.format(new commandLine().readDate()));
        restoreInputOutput();
        
        setInput("03-24-1950\n24/03/1950\n");
        assertEquals("24/03/1950", sdf.format(new commandLine().readDate()));
        restoreInputOutput();
        
        setInput("01/08/2025\n");
        assertEquals("01/08/2025", sdf.format(new commandLine().readDate()));
        restoreInputOutput();
        
        setInput("01/06/2025  \n05/03/2020\n");
        assertEquals("01/06/2025", sdf.format(new commandLine().readDate()));
        restoreInputOutput();

    }

    @Test
    public void testReadBoolean() {

        setInput("true\n");
        assertTrue(new commandLine().readBoolean());

        setInput("false\n");
        assertFalse(new commandLine().readBoolean());

        setInput("TRUE\n");
        assertTrue(new commandLine().readBoolean());

        setInput("tRuE\n");
        assertTrue(new commandLine().readBoolean());
        
        setInput("1\ntrue\n");
        assertTrue(new commandLine().readBoolean());

        setInput("yes\ntrue\n");
        assertTrue(new commandLine().readBoolean());
    }

    @Test
    public void testReadString() {
        setInput("abc\n");
        assertEquals("abc", new commandLine().readString());

        setInput("123\n");
        assertEquals("123", new commandLine().readString());

        setInput("     \nabc");
        assertEquals("abc", new commandLine().readString());
    }

    @Test
    public void testReadLine() {
        setInput("abc\n");
        assertEquals("abc", new commandLine().readLine());

        setInput("123\n");
        assertEquals("123", new commandLine().readLine());

        setInput("     \n");
        assertEquals("     ", new commandLine().readLine());
    }

    @Test
    public void testPrintLine() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new commandLine().printLine("abc");
        assertEquals("abc" + System.lineSeparator(), out.toString());
    }

    @Test
    public void testPrint() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new commandLine().print("abc");
        assertEquals("abc", out.toString());
    }
}
