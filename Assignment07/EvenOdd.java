package Assignment07;

import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);
        System.out.println("Enter a number");
        int a = obj.nextInt();
        if (a % 2 == 0)
        {
            System.out.println(a + "is even");
        }
        else {
            System.out.println(a + "is odd");
        }
}
}