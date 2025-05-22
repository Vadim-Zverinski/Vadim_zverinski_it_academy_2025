package by.it_academy;

public class dobleToString {
    public static void main(String[] args) {
        double a = 0;

        System.out.println(doubleToString(a));
    }

    public static String doubleToString(double number) {
        String[] thousand = {"тысяча", "тысячи ", "тысяч "};
        String[] million = {"миллион ", "миллиона ", "миллионов "};
        String[] point = {"целая ", "целые ", "целых "};
        String[] tenths = {"десятая ", "десятых ", "сотая ", "сотых"};
        String point1 = "";
        String point2 = "";
        String point3 = "";
        String point4 = "";
        StringBuilder sb = new StringBuilder();
        int one;
        int two;
        int three;
        int four = (int) number;
        double five = number - (double) four;

        if (number < -999999999 || number > 999999999) {
            return "Число не корректно!";
        } else if (number == 0) {
            return "ноль";
        }

        if (number < 0) {
            sb.append("минус ");
            four *= -1;
            five *= -1;
        }

        if (number > 999 && number < 999999) {
            if (number % 10000 > 4999) {
                point1 = thousand[2];
            } else if (number % 10000 > 999 && number % 10000 < 2000) {
                point1 = thousand[0];
            } else if (number % 10000 > 1999 && number % 10000 < 5000) {
                point1 = thousand[1];
            } else point1 = thousand[2];
        }

        if (number > 999999) {
            if (number % 10000000 > 4999999) {
                point2 = million[2];
            } else if (number % 10000000 > 999999 && number % 10000000 < 2000000) {
                point2 = million[0];
            } else if (number % 10000000 > 1999999 && number % 10000000 < 5000000) {
                point2 = million[1];
            } else point2 = million[2];
        }

        five *= 100;

        if (five % 10 == 1) {
            point4 = tenths[2];
        } else point4 = tenths[3];

        one = four % 1000;
        four /= 1000;
        two = four % 1000;
        four /= 1000;
        three = four % 1000;

        if (one % 10 == 0 || one % 10 >= 5) {
            point3 = point[2];
        } else if (one % 10 >= 2 && one % 10 < 5) {
            point3 = point[1];
        } else point3 = point[0];


        sb.append(intToString.numberToString(three, false));
        sb.append(point2);
        sb.append(intToString.numberToString(two, true));
        sb.append(point1);
        if (one % 10 == 1) {
            sb.append(intToString.numberToString(one, true));
            sb.append(point3);
        } else {
            sb.append(intToString.numberToString(one, false));
            sb.append(point3);
        }
        if ((int) five % 10 != 0) {
            sb.append(intToString.numberToString((int) five, false));
            sb.append(point4);
        }

        String str = sb.toString();
        return str.replaceAll("^\s+", "");
    }
}