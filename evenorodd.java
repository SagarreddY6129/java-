import java.util.Scanner;
public class evenorodd {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter a number");
        int a = obj.nextInt();

        if (a % 2 == 0) {
            System.out.println(+a + " is even number");
        } else {
            System.out.println(+a + " is odd number");
        }

    }
}