package by.it_academy;

public class timeConverter {

    public static void main(String[] args) {
        long a = 45888888675L;
        System.out.println(toHoursMinuteSecondMillisecond(a, false));

    }

    public static String toHoursMinuteSecondMillisecond(long millisecond, boolean shortFormat) {

        long hours = millisecond / 3600000;
        long minutes = (millisecond % 3600000) / 60000;
        long seconds = (millisecond % 60000) / 1000;
        long milliseconds = millisecond % 1000;

        if (shortFormat) {
            return String.format("%02d:%02d:%02d.%03d", hours, minutes, seconds, milliseconds);
        } else {
            return formatFullTime(hours, "час") + " " +
                    formatFullTime(minutes, "минута") + " " +
                    formatFullTime(seconds, "секунда") + " " +
                    formatFullTime(milliseconds, "миллисекунда");
        }
    }

    private static String formatFullTime(long value, String unit) {

        if (value == 0) {
            return "";
        }

        String result = value + " ";
        switch (unit) {
            case "час":
                if (value % 10 == 1 && value % 100 != 11) {
                    result += "час";
                } else if ((value % 10 >= 2 && value % 10 <= 4) && (value % 100 < 10 || value % 100 >= 20)) {
                    result += "часа";
                } else {
                    result += "часов";
                }
                break;
            case "минута":
                if (value % 10 == 1 && value % 100 != 11) {
                    result += "минута";
                } else if ((value % 10 >= 2 && value % 10 <= 4) && (value % 100 < 10 || value % 100 >= 20)) {
                    result += "минуты";
                } else {
                    result += "минут";
                }
                break;
            case "секунда":
                if (value % 10 == 1 && value % 100 != 11) {
                    result += "секунда";
                } else if ((value % 10 >= 2 && value % 10 <= 4) && (value % 100 < 10 || value % 100 >= 20)) {
                    result += "секунды";
                } else {
                    result += "секунд";
                }
                break;
            case "миллисекунда":
                if (value % 10 == 1 && value % 100 != 11) {
                    result += "миллисекунда";
                } else if ((value % 10 >= 2 && value % 10 <= 4) && (value % 100 < 10 || value % 100 >= 20)) {
                    result += "миллисекунды";
                } else {
                    result += "миллисекунд";
                }
                break;
        }
        return result.trim();
    }


}

