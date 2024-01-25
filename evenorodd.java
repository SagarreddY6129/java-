import java.util.Scanner;
public class evenorodd
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number ");
        int number= sc.nextInt();
        int evensum=0;
        int oddsum=0;
        for(int i=1;i<=number;i++){

            if (i % 2 == 0) {
                evensum+=i;

            } else {
                oddsum+=i;

            }

        }
        System.out.println("sum of odd number is " +oddsum );
        System.out.println("sum of even numbers is " +evensum );

    }
}
