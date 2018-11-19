
import java.util.Scanner;



public class HelloWorld {

    //public static final String jp = "James Pond"; // to access outside the main class 
    public static void main(String[] args) {

        //System.out.println("Hello, World!");

        System.out.print("What is your Name? : ");
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        System.out.print("What is your Age? : ");

        int age = (input.nextInt());


        System.out.print("What is your Score? : ");
        int score = input.nextInt();


        System.out.println("Hello " + name + ".\nYou are " + age + " years old!" + "\nYour Score is : " + score + "!");
        input.close();

        if (age >= 18) {
            System.out.print("YOU CAN DRINK!!!!!!");

        } else {
            System.out.println("TOO YOUNG!");
        }

        final String jp = "James Pond";

        if (name.equalsIgnoreCase(jp)){
            System.out.println("\njames bond 007");
        }

    }



}
