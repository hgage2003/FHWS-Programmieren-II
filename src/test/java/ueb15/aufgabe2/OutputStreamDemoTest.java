package ueb15.aufgabe2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OutputStreamDemoTest {

    OutputStreamDemo osd = null;
    String text = null;
    byte[] b = null;

    @BeforeEach
    public void setUp() {
        osd = new OutputStreamDemo();
        text = "Hallo Welt";
        b = text.getBytes();
    }

    @Test
    void testOffsetNegative() {
        assertThrows(IndexOutOfBoundsException.class, () -> osd.write(b, -1, 5));
        assertThrows(IndexOutOfBoundsException.class, () -> osd.write(b, -12, -10));
        assertThrows(IndexOutOfBoundsException.class, () -> osd.write(b, -99, 6));
    }

    @Test
    void testLengthNegative() {
        assertThrows(IndexOutOfBoundsException.class, () -> osd.write(b, 0, -1));
        assertThrows(IndexOutOfBoundsException.class, () -> osd.write(b, 5, -17));
        assertThrows(IndexOutOfBoundsException.class, () -> osd.write(b, -5, -98));
    }

    @Test
    void testOffsetPlusLengthGreaterArrayLength() {
        assertThrows(IndexOutOfBoundsException.class, () -> osd.write(b, 0, 11));
        assertThrows(IndexOutOfBoundsException.class, () -> osd.write(b, 5, 6));
    }

    @Test
    void testThrowsNPE() {
        b = null;
        assertThrows(NullPointerException.class, () -> osd.write(b, 0, 2));
    }
}