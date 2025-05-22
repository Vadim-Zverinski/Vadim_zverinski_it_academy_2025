package by.it_academy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class dayToWeekTest {

    @Test
    public void testToWeek_365() {
        assertEquals("52 недели", dayToWeek.toWeek(365));
    }

    @Test
    public void testToWeek_1() {
        assertEquals("0 недель", dayToWeek.toWeek(1));
    }

    @Test
    public void testToWeek_7() {
        assertEquals("1 неделя", dayToWeek.toWeek(7));
    }

    @Test
    public void testToWeek_14() {
        assertEquals("2 недели", dayToWeek.toWeek(14));
    }

    @Test
    public void testToWeek_21() {
        assertEquals("3 недели", dayToWeek.toWeek(21));
    }

    @Test
    public void testToWeek_28() {
        assertEquals("4 недели", dayToWeek.toWeek(28));
    }

    @Test
    public void testToWeek_11Weeks() {
        assertEquals("11 недель", dayToWeek.toWeek(11 * 7));
    }

    @Test
    public void testToWeek_111Weeks() {
        assertEquals("111 недель", dayToWeek.toWeek(111 * 7));
    }

    @Test
    public void testToWeek_22Weeks() {
        assertEquals("22 недели", dayToWeek.toWeek(22 * 7));
    }
}
