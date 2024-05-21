package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static boolean isPalindrome(int numb) {
        int absNumb = Math.abs(numb);
        String strNumb = String.valueOf(absNumb);
        String reverseNumb = "";
        for (int i = strNumb.length() - 1; i >= 0; i--) {
            reverseNumb += strNumb.charAt(i);
        }
        return strNumb.equals(reverseNumb);
    }
    public static boolean isPerfectNumber (int numb) {
        if ( numb < 0 ) {
            return false;
        }
        int total = 0;
        for (int i = numb-1 ; i > 0 ; i-- ) {
            if ( numb % i == 0 ) {
                total += i;
            }
        }
        return numb == total;
    }
    public static String numberToWords (int numb) {
        if ( numb < 0 ) {
            return "Invalid Value";
        }
        String result = "";
        String[] numbers = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String number = String.valueOf(numb);
        for (int i = 0 ; i < number.length() ; i++ ) {
            int intNumb = Character.getNumericValue(number.charAt(i));
            if ( i == 0 ) {
                result += numbers[intNumb];
            } else {
                result += " " + numbers[intNumb];
            }
        }
        return result;
    }
}


