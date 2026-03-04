package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isPerfectNumber(27));
        System.out.println(numberToWords(-258));
    }

    public static boolean isPalindrome(int number) {
        int value = Math.abs(number);
        int original = value;
        int reversed = 0;

        while (value > 0) {
            int digit = value % 10;
            reversed = reversed * 10 + digit;
            value /= 10;
        }

        return original == reversed;
    }

    public static boolean isPerfectNumber(int number) {
        if(number < 0) {
            return false;
        }
        int toplam = 0;
       for(int i = 1; i < number; i++) {
           if(number % i == 0) {
               toplam +=i;
           }
       }
       if(number == toplam) {
           return true;
       }else  {
           return false;
       }
    }

    public static String numberToWords(int a){
        if(a<0){
            return "Invalid Value";
        }

        String numberText = String.valueOf(a);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numberText.length(); i++) {
            char digit = numberText.charAt(i);

            switch (digit) {
                case '0':
                    result.append("Zero");
                    break;
                case '1':
                    result.append("One");
                    break;
                case '2':
                    result.append("Two");
                    break;
                case '3':
                    result.append("Three");
                    break;
                case '4':
                    result.append("Four");
                    break;
                case '5':
                    result.append("Five");
                    break;
                case '6':
                    result.append("Six");
                    break;
                case '7':
                    result.append("Seven");
                    break;
                case '8':
                    result.append("Eight");
                    break;
                case '9':
                    result.append("Nine");
                    break;
                default:
                    break;
            }

            if (i < numberText.length() - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
