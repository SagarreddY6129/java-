package Assignment03;

import java.sql.SQLOutput;
import java.util.Scanner;
public class inchestometers {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("enter the number in inches");
        float num=obj.nextFloat();

        float meters = (num*0.0254F);
        System.out.println(+num+ " inches converts to " +meters+ " meters");





    }
}
