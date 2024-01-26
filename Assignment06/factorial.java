package Assignment06;

import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int number = sc.nextInt();
        int fact=1;
        for (int i =0;i<number;--number){
            fact *=number;
        }
        System.out.println(fact);

    }
}