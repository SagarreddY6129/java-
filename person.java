import java.util.Scanner;

public class person {
    private String name;
    private int age;

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter the name and age of two persons: ");

         String na=sc.nextLine();
         int ag= sc.nextInt();

        person p1= new person(sc.nextLine(), sc.nextInt());
        sc.nextLine();
        person p2= new person(sc.nextLine(), sc.nextInt());

        System.out.println(p1.name+" ,"+p1.age);
        System.out.println(p2.name+" ,"+p2.age);

    }
    public person(){

    }

    public person(String n, int a) {
        this.name = n;
        this.age = a;

    }
}
