package Assignment03;

import java.util.Scanner;
public class equalornot {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("enter a  four number");
        int a=obj.nextInt();
        int b=obj.nextInt();
        int c=obj.nextInt();
        int d=obj.nextInt();
        System.out.println("input first number : " +a);
        System.out.println("input second number: " +b);
        System.out.println("input third number : " +c);
        System.out.println("input fourth number : " +d);
        if((a==b) && (b==c) && (c==d)){
            System.out.println("numbers are equal");
        }
        else
        {
            System.out.println("numbers are not equal");
        }


        }


}
