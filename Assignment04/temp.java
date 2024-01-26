package Assignment04;

class Animal {
    public String name;
    protected int age;
    private String color;
    private float height;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public float getHeight() {

        return height;
    }

    public void setHeight(float height) {

        this.height = height;
    }

}

class car{
    public String model;
    public int year;
    public  String color;
    public String company;

    public String getModel() {

        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }





}
class person {
    String name;
    int age;
    String DOB;
    float height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
    class Employee{

        int Emp_id;
        String Emp_name;
        float salary;

        public int getEmp_id() {
            return Emp_id;
        }

        public void setEmp_id(int emp_id) {
            Emp_id = emp_id;
        }

        public String getEmp_name() {
            return Emp_name;
        }

        public void setEmp_name(String emp_name) {
            Emp_name = emp_name;
        }

        public float getSalary() {
            return salary;
        }

        public void setSalary(float salary) {
            this.salary = salary;
        }
    }




public class temp{
    public  static  void main(String[] args){
        Animal elephant=new Animal();


        elephant.setAge(10);
        elephant.setColor("yellow");
        elephant.setName("gaja");
        elephant.name="gaja";
        elephant.age=2;


        String name=elephant.getName();
        System.out.println(name);

     car ob2= new car();
       ob2.setColor("White");
       ob2.setCompany("swift");
       ob2.setModel("2010");
        System.out.println(ob2.color);


        person people1= new person();
        people1.setAge (12) ;
        people1.setName("sai") ;
        people1.setDOB("12/31/1998");
        people1.setHeight(6.0f);
        System.out.println(people1.name );
        System.out.println(people1.DOB );


        Employee emp1=new Employee();
        emp1.setEmp_id (12014) ;
        emp1.setEmp_name("krishna") ;
        emp1.setSalary(12000.23f) ;
        System.out.println(emp1.Emp_name );


    }
}


