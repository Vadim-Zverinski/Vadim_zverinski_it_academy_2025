package by.it_academy;

public class dayToWeek {
    public static void main(String[] args) {
        int a = 365;
        System.out.println(toWeek(a));
    }

    public static String toWeek(int day) {
        int weeks = day / 7;


        String suffix;
        if (weeks % 100 >= 11 && weeks % 100 <= 14) {
            suffix = "недель";
        } else {
            switch (weeks % 10) {
                case 1:
                    suffix = "неделя";
                    break;
                case 2:
                case 3:
                case 4:
                    suffix = "недели";
                    break;
                default:
                    suffix = "недель";
            }
        }

        return weeks + " " + suffix;
    }


}
