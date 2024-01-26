package Assignment07;

import java.util.Scanner;

public class sumofdigitscalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = scanner.nextInt();

        int temp = num;
        int sum = 0;
        int remainder=0;
        while (num > 0)
        {
            remainder = num % 10;
            sum = sum+ remainder;
            num =num/10;
        }


        System.out.println("Sum of digits of " + temp + " is " + sum);
        scanner.close();
    }
}
/*
import java.util.Scanner;

public class assignment2question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers do you want to add?");
        int count = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= count; i++) {
            System.out.println("Enter number #" + i + ":");
            int number = scanner.nextInt();
            sum += number;
        }

        System.out.println("The sum of the " + count + " numbers is: " + sum);

        scanner.close();
    }
}
 */