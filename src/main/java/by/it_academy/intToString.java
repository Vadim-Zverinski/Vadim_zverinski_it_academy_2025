package by.it_academy;

public class intToString {
    public static void main(String[] args) {

        int number = 1000000;

        System.out.println(toString(number));
    }


    public static String toString(int number) {
        String thousand = "тысяча ";
        String thousands = "тысячи ";
        String thousandss = "тысяч ";
        String million = "миллион ";
        String millions = "миллиона ";
        String millionss = "миллионов ";
        String point1 = "";
        String point2 = "";
        StringBuilder sb = new StringBuilder();
        int one;
        int two;
        int three;

        if (number < -999999999 || number > 999999999) {
            return "Число не корректно!";
        } else if (number == 0) {
            return "ноль";
        }

        if (number < 0) {
            sb.append("минус ");
            number *= -1;
        }

        if ( number > 999 && number < 999999) {
            if (number % 10000 > 4999) {
                point1 = thousandss;
            } else if (number % 10000 > 999 && number % 10000 < 2000) {
                point1 = thousand;
            } else if (number % 10000 > 1999 && number % 10000 < 5000) {
                point1 = thousands;
            } else point1 = thousandss;
        }

        if (number > 999999) {
            if (number % 10000000 > 4999999) {
                point2 = millionss;
            } else if (number % 10000000 > 999999 && number % 10000000 < 2000000) {
                point2 = million;
            } else if (number % 10000000 > 1999999 && number % 10000000 < 5000000) {
                point2 = millions;
            } else point2 = millionss;
        }

        one = number % 1000;
        number /= 1000;
        two = number % 1000;
        number /= 1000;
        three = number % 1000;


        sb.append(numberToString(three, false));
        sb.append(point2);
        sb.append(numberToString(two, true));
        sb.append(point1);
        sb.append(numberToString(one, false));

        String str = sb.toString();
        return str.replaceAll("^\\s+", "");
    }


    public static String numberToString(int number, boolean order) {
        int tho = number / 100;
        int doz = number % 100;
        String[] stringNumberM = new String[]{"", "один ", "два ", "три ", "четыре ", "пять ", "шесть ", "семь ", "восемь ", "девять ",};
        String[] stringNumberT = new String[]{"", "одна ", "две ", "три ", "четыре ", "пять ", "шесть ", "семь ", "восемь ", "девять ",};
        String[] stringDecade = new String[]{"", "", "двадцать", "тридцать", "сорок", "пятьдесят",
                "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
        int units = number % 10;

        StringBuilder sb = new StringBuilder();

        switch (tho) {
            case 1:
                sb.append("сто");
                break;
            case 2:
                sb.append("двести");
                break;
            case 3:
                sb.append("триста");
                break;
            case 4:
                sb.append("четыреста");
                break;
            case 5:
                sb.append("пятьсот");
                break;
            case 6:
                sb.append("шестьсот");
                break;
            case 7:
                sb.append("семьсот");
                break;
            case 8:
                sb.append("восемьсот");
                break;
            case 9:
                sb.append("девятьсот");
                break;
            default:
                sb.append("");
                break;
        }

        sb.append(" ");

        if (doz < 10 && order)
            sb.append(stringNumberT[units]);

        if (doz < 10 && order == false)
            sb.append(stringNumberM[units]);

        if (doz >= 10 && doz < 20) {
            switch (doz) {

                case 10:
                    sb.append("десять");
                    break;
                case 11:
                    sb.append("одиннадцать");
                    break;
                case 12:
                    sb.append("двенадцать");
                    break;
                case 13:
                    sb.append("тринадцать");
                    break;
                case 14:
                    sb.append("четырнадцать");
                    break;
                case 15:
                    sb.append("пятнадцать");
                    break;
                case 16:
                    sb.append("шеснадцать");
                    break;
                case 17:
                    sb.append("семнадцать");
                    break;
                case 18:
                    sb.append("восемнадцать");
                    break;
                case 19:
                    sb.append("девятнадцать");
                    break;
                default:
                    sb.append("");
                    break;
            }
        }

        sb.append(stringDecade[doz / 10]);
        sb.append(" ");

        if (doz >= 20 && order) {
            sb.append(stringNumberT[units]);
        }
        if (doz >= 20 && order == false) {
            sb.append(stringNumberM[units]);
        }

        String str = sb.toString();
        return sb.toString();
    }
}
