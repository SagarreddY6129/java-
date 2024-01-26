public class Employee {
    private String name;
    private String jobTitle;
    private double salary;


    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }


    public String getName() {

        return name;
    }


    public void setName(String name) {

        this.name = name;
    }


    public String getJobTitle() {
        return jobTitle;
    }


    public void setJobTitle(String jobTitle) {

        this.jobTitle = jobTitle;
    }


    public double getSalary() {
        return salary;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }


    public void raiseSalary(double percentage) {
        salary += salary * (percentage / 100.0);
    }


    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Badri", "Manager", 50000);
        employee.printInfo();
        employee.raiseSalary(10);
        System.out.println("\nAfter raise:");
        employee.printInfo();
    }
}