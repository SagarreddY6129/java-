public class person1 {
    private String name;
    private int age;

    public person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Create two instances of the Person class and set their attributes using the constructor
        person1 person01= new person1("Alice", 30);
        person1  person2 = new person1("Bob", 25);

        // Print their name and age
        System.out.println("Person 1:");
        person01.printInfo();

        System.out.println("\nPerson 2:");
        person2.printInfo();
    }
}
