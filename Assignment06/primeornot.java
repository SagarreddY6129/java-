package Assignment06;

import java.util.Scanner;

public class primeornot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number  ");
        int number= sc.nextInt();
        if(number<=0) {

            System.out.println(" not a prime");
        }
        for(int i=2;i<number;i++)

        if( number%i==0)
        {
            System.out.println(+number +" is not prime number");
            break;
        }
        else{
            System.out.println(+number + "is  a prime number");
            break;
        }
    }
}
