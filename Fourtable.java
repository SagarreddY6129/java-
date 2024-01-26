
import java.util.Scanner;
public class Fourtable {


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number to write table: ");
        int number= sc.nextInt();
        System.out.println(+number+ " table");
        for(int i=1;i<=10;i++){
            System.out.println(+number+"*"+i+"="+(number*i));
        }


    }

}
