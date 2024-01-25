public class person1 {
    String name;
     int age;

    public person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Name= " + name);
        System.out.println("Age= " + age);
    }
    public void writeRandomName(){

        System.out.println("name is random");
    }
    public  int writeRandomNumber(){
        return  10;


    }

    public static void main(String[] args) {

        person1 person101 = new person1("Krishna", 50);
        person1 person102 = new person1("Rama", 47);

        // Print their name and age
        System.out.println("Person 1:");
        person101.printInfo();

        System.out.println("Person 2:");
        person102.printInfo();

        person101.writeRandomName();
        person102.writeRandomName();

        person101.writeRandomNumber();
    }
}

