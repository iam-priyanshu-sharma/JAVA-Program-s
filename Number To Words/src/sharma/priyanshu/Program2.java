// Converting Large Numbers into Words

package sharma.priyanshu;

import java.text.DecimalFormat;

public class Program2 {

    public static void main (String[] args) {
        System.out.println (convertNumberToWord (2));
        System.out.println (convertNumberToWord (99));
        System.out.println (convertNumberToWord (456));
        System.out.println (convertNumberToWord (1101));
        System.out.println (convertNumberToWord (19812));
        System.out.println (convertNumberToWord (674319));
        System.out.println (convertNumberToWord (909087531));
        System.out.println (convertNumberToWord (1000000000));
        System.out.println (convertNumberToWord (359999999));
        System.out.println (convertNumberToWord (1213000000L));
        System.out.println (convertNumberToWord (1000000));
        System.out.println (convertNumberToWord (1111111111));
        System.out.println (convertNumberToWord (3000200));
        System.out.println (convertNumberToWord (700000));
        System.out.println (convertNumberToWord (9000000));
    }

    private static final String[] twodigits = {"", " Ten", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", " Seventy", " Eighty", " Ninety"};

    private static final String[] onedigit = {"", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten", " Eleven", " Twelve", " Thirteen", " Fourteen", " Fifteen", " Sixteen", " Seventeen", " Eighteen", " Nineteen"};

    private void NumberToWordExample2 () {
    }

    private static String convertUptoThousand (int number) {
        String soFar;
        if ( number % 100 < 20 ) {
            soFar = onedigit[number % 100];
            number = number / 100;
        } else {
            soFar = onedigit[number % 10];
            number = number / 10;
            soFar = twodigits[number % 10] + soFar;
            number = number / 10;
        }

        if ( number == 0 ) {
            return soFar;
        }
        return onedigit[number] + " Hundred " + soFar;
    }

    public static String convertNumberToWord (long number) {
        if ( number == 0 ) {
            return "zero";
        }

        String num;
        String pattern = "000000000000";

        DecimalFormat decimalFormat = new DecimalFormat (pattern);
        num = decimalFormat.format (number);

        int billions = Integer.parseInt (num.substring (0, 3));
        int millions = Integer.parseInt (num.substring (3, 6));
        int hundredThousands = Integer.parseInt (num.substring (6, 9));
        int thousands = Integer.parseInt (num.substring (9, 12));

        String tradBillions = switch (billions) {
            case 0 -> "";
            default -> convertUptoThousand (billions) + " Billion ";
        };

        String result = tradBillions;
        String tradMillions = switch (millions) {
            case 0 -> "";
            default -> convertUptoThousand (millions) + " Million ";
        };

        result = result + tradMillions;
        String tradHundredThousands = switch (hundredThousands) {
            case 0 -> "";
            case 1 -> "One Thousand ";
            default -> convertUptoThousand (hundredThousands) + " Thousand ";
        };

        result = result + tradHundredThousands;
        String tradThousand;
        tradThousand = convertUptoThousand (thousands);

        result = result + tradThousand;
        return result.replaceAll ("^\\s+", "").replaceAll ("\\b\\s{2,}\\b", " ");
    }
}
