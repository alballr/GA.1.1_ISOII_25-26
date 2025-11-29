package es.uclm.esi.iso2.axx.command_Line_Interface;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class commandLineTest {

    private static final double DELTA = 1e-9;

 
    @After
    public void restoreSystemInputOutput() {
        System.setIn(System.in);
        System.setOut(System.out);
    }

    private void setInput(String data) {
        System.setIn(new ByteArrayInputStream(data.getBytes()));
    }

    // ===========================================================
    //                    TESTS FOR readInt()
    // ===========================================================

    @Test
    public void testReadIntValidPositive() {
        setInput("2\n");
        commandLine cl = new commandLine();
        assertEquals(2, cl.readInt());
    }

    @Test
    public void testReadIntValidNegative() {
        setInput("-6\n");
        commandLine cl = new commandLine();
        assertEquals(-6, cl.readInt());
    }

    @Test
    public void testReadIntInvalidDecimal() {
        setInput("2.5\n3\n");
        commandLine cl = new commandLine();
        assertEquals(3, cl.readInt());
    }

    @Test
    public void testReadIntInvalidText() {
        setInput("hello\n10\n");
        commandLine cl = new commandLine();
        assertEquals(10, cl.readInt());
    }

    @Test
    public void testReadIntSpaces() {
        setInput("   \n8\n");
        commandLine cl = new commandLine();
        assertEquals(8, cl.readInt());
    }

    @Test
    public void testReadIntAlphanum() {
        setInput("45b\n4\n");
        commandLine cl = new commandLine();
        assertEquals(4, cl.readInt());
    }

    @Test
    public void testReadIntMaxInt() {
        setInput("2147483647\n");
        commandLine cl = new commandLine();
        assertEquals(2147483647, cl.readInt());
    }

    @Test
    public void testReadIntMinInt() {
        setInput("-2147483648\n");
        commandLine cl = new commandLine();
        assertEquals(-2147483648, cl.readInt());
    }

    @Test
    public void testReadIntOverflow() {
        setInput("2147483648\n0\n");
        commandLine cl = new commandLine();
        assertEquals(0, cl.readInt());
    }

    // ===========================================================
    //                  TESTS FOR readDouble()
    // ===========================================================

    @Test
    public void testReadDoubleValidInt() {
        setInput("2\n");
        commandLine cl = new commandLine();
        assertEquals(2.0, cl.readDouble(), DELTA);
    }

    @Test
    public void testReadDoubleValidDouble() {
        setInput("2.5\n");
        commandLine cl = new commandLine();
        assertEquals(2.5, cl.readDouble(), DELTA);
    }

    @Test
    public void testReadDoubleInvalidText() {
        setInput("hello\n3.14\n");
        commandLine cl = new commandLine();
        assertEquals(3.14, cl.readDouble(), DELTA);
    }

    @Test
    public void testReadDoubleInvalidComma() {
        setInput("3,66\n3.66\n");
        commandLine cl = new commandLine();
        assertEquals(3.66, cl.readDouble(), DELTA);
    }

    @Test
    public void testReadDoubleSpaces() {
        setInput("   \n10.5\n");
        commandLine cl = new commandLine();
        assertEquals(10.5, cl.readDouble(), DELTA);
    }

    @Test
    public void testReadDoubleMaxDouble() {
        setInput("1.7E308\n");
        commandLine cl = new commandLine();
        assertEquals(1.7E308, cl.readDouble(), DELTA);
    }

    @Test
    public void testReadDoubleOverflow() {
        setInput("1.8E308\n1.0\n");
        commandLine cl = new commandLine();
        assertEquals(Double.POSITIVE_INFINITY, cl.readDouble(), DELTA);
    }

    // ===========================================================
    //                      TESTS FOR readDate()
    // ===========================================================

    @Test
    public void testReadDateValid() throws Exception {
        setInput("08/04/2005\n");
        commandLine cl = new commandLine();
        Date d = cl.readDate();
        assertEquals("08/04/2005", new SimpleDateFormat("dd/MM/yyyy").format(d));
    }

    @Test
    public void testReadDateInvalidText() throws Exception {
        setInput("hello\n01/01/2020\n");
        commandLine cl = new commandLine();
        Date d = cl.readDate();
        assertEquals("01/01/2020", new SimpleDateFormat("dd/MM/yyyy").format(d));
    }

    @Test
    public void testReadDateInvalidDay() throws Exception {
        setInput("32/13/2000\n05/05/2020\n");
        commandLine cl = new commandLine();
        Date d = cl.readDate();
        assertEquals("05/05/2020", new SimpleDateFormat("dd/MM/yyyy").format(d));
    }

    @Test
    public void testReadDateInvalidFormat() throws Exception {
        setInput("03-24-1950\n24/03/1950\n");
        commandLine cl = new commandLine();
        Date d = cl.readDate();
        assertEquals("24/03/1950", new SimpleDateFormat("dd/MM/yyyy").format(d));
    }

    @Test
    public void testReadDateMinusYear() throws Exception {
        setInput("06/04/-0001\n01/04/2025\n");
        commandLine cl = new commandLine();
        Date d = cl.readDate();
        assertEquals("01/04/2025", new SimpleDateFormat("dd/MM/yyyy").format(d));
    }

    // ===========================================================
    //               TESTS FOR readString() & readLine()
    // ===========================================================

    @Test
    public void testReadString() {
        setInput("abcd 123\n");
        commandLine cl = new commandLine();
        assertEquals("abcd", cl.readString());
    }

    @Test
    public void testReadLine() {
        setInput("Hola mundo\n");
        commandLine cl = new commandLine();
        assertEquals("Hola mundo", cl.readLine());
    }

    // ===========================================================
    //                 TESTS FOR print() & printLine()
    // ===========================================================

    @Test
    public void testPrintLine() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        commandLine cl = new commandLine();
        cl.printLine("test");
        assertEquals("test\r\n", out.toString());
    }

    @Test
    public void testPrint() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        commandLine cl = new commandLine();
        cl.print("hello");

        assertEquals("hello", out.toString());
    }
}
