package by.it_academy;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class timeConverterTest {

    @Test
    public void testToHoursMinuteSecondMillisecond_FullFormat() {
        long ms = 1 * 3600000 + 2 * 60000 + 3 * 1000 + 4;
        String expected = "1 час 2 минуты 3 секунды 4 миллисекунды";
        assertEquals(expected, timeConverter.toHoursMinuteSecondMillisecond(ms, false));
    }

    @Test
    public void testToHoursMinuteSecondMillisecond_ShortFormat() {
        long ms = 1 * 3600000 + 2 * 60000 + 3 * 1000 + 4;
        String expected = "01:02:03.004";
        assertEquals(expected, timeConverter.toHoursMinuteSecondMillisecond(ms, true));
    }

    @Test
    public void testToHoursMinuteSecondMillisecond_ZeroValues() {
        long ms = 0;
        String expectedFull = "";
        assertEquals(expectedFull, timeConverter.toHoursMinuteSecondMillisecond(ms, false).replaceAll(" +", " ").trim());
        String expectedShort = "00:00:00.000";
        assertEquals(expectedShort, timeConverter.toHoursMinuteSecondMillisecond(ms, true));
    }

    @Test
    public void testToHoursMinuteSecondMillisecond_OnlyMilliseconds() {
        long ms = 789;
        String expectedFull = "   789 миллисекунд";
        assertEquals(expectedFull, timeConverter.toHoursMinuteSecondMillisecond(ms, false));
        String expectedShort = "00:00:00.789";
        assertEquals(expectedShort, timeConverter.toHoursMinuteSecondMillisecond(ms, true));
    }

    @Test
    public void testToHoursMinuteSecondMillisecond_MultipleHours() {
        long ms = 25 * 3600000 + 0 * 60000 + 0 * 1000 + 0;
        String expectedFull = "25 часов   ";
        assertEquals(expectedFull, timeConverter.toHoursMinuteSecondMillisecond(ms, false));
        String expectedShort = "25:00:00.000";
        assertEquals(expectedShort, timeConverter.toHoursMinuteSecondMillisecond(ms, true));
    }

    @Test
    public void testToHoursMinuteSecondMillisecond_CorrectPlural() {

        long ms = 11 * 3600000;
        String expectedFull = "11 часов   ";
        assertEquals(expectedFull, timeConverter.toHoursMinuteSecondMillisecond(ms, false));


        ms = 21 * 3600000;
        expectedFull = "21 час   ";
        assertEquals(expectedFull, timeConverter.toHoursMinuteSecondMillisecond(ms, false));
    }
}
