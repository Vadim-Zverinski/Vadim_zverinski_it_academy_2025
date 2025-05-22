package by.it_academy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class dobleToStringTest {

    @Test
    void testZero() {
        assertEquals("ноль", dobleToString.doubleToString(0));
    }

    @Test
    void testPositiveNumber() {
        String result = dobleToString.doubleToString(687987.09090);
        assertNotNull(result);
        assertFalse(result.isEmpty());

        assertTrue(result.contains("тысяч") || result.contains("миллион") || result.contains("целая"));
    }

    @Test
    void testNegativeNumber() {
        String result = dobleToString.doubleToString(-1234.56);
        assertNotNull(result);
        assertTrue(result.startsWith("минус"));
    }

    @Test
    void testLargeNumberTooBig() {
        assertEquals("Число не корректно!", dobleToString.doubleToString(1_000_000_000));
        assertEquals("Число не корректно!", dobleToString.doubleToString(-1_000_000_000));
    }

    @Test
    void testFractionalPartZero() {
        String result = dobleToString.doubleToString(1234.00);
        assertFalse(result.contains("десятая") || result.contains("сотая"));
    }
}