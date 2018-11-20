import java.util.Scanner;

public class Tuesday {


    public static String prompt(String s) {
        return "Please enter your " + s + ": ";

    }

    public static void print_prompt(String z) {
        System.out.print(prompt(z));

    }

    public  static String get_user_input(Scanner sc_String, String a){
        print_prompt(a);
        return sc_String.next();
    }

    public  static int get_user_input_int(Scanner sc_int,String a) {
        print_prompt(a);
        return sc_int.nextInt();
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = get_user_input( sc, "name");

        int age  = get_user_input_int( sc, "age");

        int score = get_user_input_int(sc, "score");

        System.out.println("Hello " + name + ".\nYou are " + age + " years old!" + "\nYour Score is: " + score + "!");

        sc.close();

    }
}
