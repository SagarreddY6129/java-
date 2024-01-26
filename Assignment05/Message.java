package Assignment05;

public class Message {

        public String text;

        public Message(String text) {
            this.text= text;
        }




        public static void main(String[] args) {

            Message obj1 = new Message("Hi this is Sagar");

                System.out.println(obj1.text);
        }
    }

