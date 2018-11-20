import java.util.Scanner;

public class Tuesday {

    public static Scanner sc = new Scanner(System.in);

    public static String prompt(String s) {
        return "Please enter your " + s + ": ";

    }

    public static void print_prompt(String z) {
        System.out.print(prompt(z));

    }

    public  static String get_user_input(){
        return sc.next();
    }

    public  static int get_user_input_int() {
        return sc.nextInt();
    }



    public static void main(String[] args) {


        print_prompt("name");
        String name = get_user_input();


        print_prompt("age");
        int age = print_prompt("age")get_user_input_int();

        print_prompt("score");
        int score = get_user_input_int();

        System.out.println("Hello " + name + ".\nYou are " + age + " years old!" + "\nYour Score is: " + score + "!");

        sc.close();

    }
}
