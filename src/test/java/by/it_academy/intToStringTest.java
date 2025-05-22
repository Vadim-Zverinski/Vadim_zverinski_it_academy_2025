package by.it_academy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class intToStringTest {

    @Test
    public void testZero() {
        assertEquals("ноль", intToString.toString(0));
    }

    @Test
    public void testPositiveSingleDigit() {
        assertEquals("один  ", intToString.toString(1));
        assertEquals("девять  ", intToString.toString(9));
    }

    @Test
    public void testNegativeSingleDigit() {
        assertEquals("минус      один  ", intToString.toString(-1));
        assertEquals("минус      девять  ", intToString.toString(-9));
    }

    @Test
    public void testThousand() {
        assertEquals("одна  тысяча  один  ", intToString.toString(1001));
        assertEquals("две  тысячи пятьсот  ", intToString.toString(2500));
        assertEquals("пять  тысяч   ", intToString.toString(5000));
    }

    @Test
    public void testMillion() {
        assertEquals("один  миллион     ", intToString.toString(1000000));
        assertEquals("два  миллиона     ", intToString.toString(2000000));
        assertEquals("пять  миллионов     ", intToString.toString(5000000));
    }

    @Test
    public void testNegativeLargeNumber() {
        assertEquals("минус девятьсот девяносто девять миллионов девятьсот девяносто девять девятьсот девяносто девять ", intToString.toString(-999999999));
    }

    @Test
    public void testOutOfBounds() {
        assertEquals("Число не корректно!", intToString.toString(1000000000));
        assertEquals("Число не корректно!", intToString.toString(-1000000000));
    }
}
