import java.util.Scanner;
public class squareofnumbers{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter a number");
        double num = obj.nextDouble();
        double square = Math.pow(num, 2);
        double cube = Math.pow(num, 3);
        double fourthPower = Math.pow(num, 4);
        System.out.println("Square of " + num + " is: " + square);
        System.out.println("Cube of " + num + " is: " + cube);
        System.out.println("Fourth power of " + num + " is: " + fourthPower);

        obj.close();

    }
}