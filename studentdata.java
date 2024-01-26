public class studentdata {
    public static void main(String[] args) {
        byte age= 11;
        short roll_number= 10567;
        long ph_no= 9603677289L;
        float height=5.9f;
        double weight=75.3d;
        int number=23;
        char gender= '1';
        boolean fail= false;

        System.out.println("age : "+age);
        System.out.println("roll_number :"+roll_number);
        System.out.println("ph_no : "+ph_no);
        System.out.println("height : "+height);
        System.out.println("weight : "+weight);
        System.out.println("number :"+number);
        System.out.println("gender :"+gender );
        System.out.println(fail);

        String[] studentNames = new String[10];
        studentNames[0] = "John Doe";
        studentNames[1] = "Jane Smith";
        studentNames[2] = "Alice Johnson";
        studentNames[3] = "Bob Brown";
        studentNames[4] = "Eve White";
        studentNames[5] = "Michael Lee";
        studentNames[6] = "Sarah Miller";
        studentNames[7] = "David Davis";
        studentNames[8] = "Emily Wilson";
        studentNames[9] = "Alex Anderson";


        for (String fullName : studentNames) {

            String[] names = fullName.split(" ");
            String firstName = names[0];
            String lastName = names[names.length - 1];
            System.out.println("First Name: " + firstName + ", Last Name: " + lastName);
        }



        }
}
