package Assignment08;

import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman numeral (e.g., V, IX, XII): ");
        String romanNumeral = scanner.nextLine().toUpperCase();

        int result = romanToInt(romanNumeral);
        System.out.println("The integer value of " + romanNumeral + " is: " + result);

        scanner.close();
    }

    public static int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = getValue(s.charAt(i));
            int next = (i + 1 < s.length()) ? getValue(s.charAt(i + 1)) : 0;

            if (current >= next) {
                result += current;
            } else {
                result -= current;
            }
        }

        return result;
    }

    public static int getValue(char romanChar) {
        switch (romanChar) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new IllegalArgumentException("Invalid Roman numeral character: " + romanChar);
        }
    }
}

