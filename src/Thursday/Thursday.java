package Thursday;


import java.util.Scanner;

public class Thursday {

//    public static final int N = 5;


    public static int get_user_input_int(Scanner sc) {
        return sc.nextInt();
    }

    public static String print_array(int[] a) {
        String separator = "===================================\n";
        String str = separator + "Here is your Array\n" + separator;
        for (int i = 0; i < a.length; i++) {
            str = str + "Element " + i + ": " + a[i] + "\n";
        }
        return str + separator;
    }

    public static String elements(){
        String el = " of elements is: ";

        return el;
    }


    public static int array_sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];

        }
        return sum;

    }

    public static double array_average(int[] a) {

        return array_sum(a) / a.length;
    }

    public static int array_min(int[] a) {
        int min = a[0];
        int max = a[0];
        for (int i = 0; i < a.length; i++) {

            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }

        }
        return min;
    }

    public static int array_product(int[] a) {
        int product = 1;

        for (int i = 0; i < a.length; i++) {
            product *= a[i];
        }
        return product;
    }

    public static int array_max(int[] a) {
        int min = a[0];
        int max = a[0];
        for (int i = 0; i < a.length; i++) {

            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }

        }
        return max;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declare an array
        int[] a = new int[3];


        //input all elements of the array
        for (int i = 0; i < a.length; i++) {
            System.out.print("Please enter element " + i + ": ");
            a[i] = get_user_input_int(sc);
        }
        sc.close();

        //output all elements of the array
//        for (int i  = 0; i <N;i++){
//            System.out.println("Element " + i + ": "+ a[i]);
//        }

        System.out.println(print_array(a));


//        // calculate sum of array
//        int sum = 0;
//        int product = 1;
//        int min = a[0];
//        int max = a[0];
//        for(int i  = 0; i < a.length; i++){
//            product *= a[i];
//            sum = sum +  a[i];
//
//            if (a[i] < min) {
//                min = a[i];
//            }
//            if (a[i] > max) {
//                max = a[i];
//            }
//        }
//        System.out.println("\nSum of elements is " + sum);
//        System.out.println("\nProduct of elements is " + product);
//        System.out.println("\nMin of elements is " + min);
//        System.out.println("\nMax of elements is " + max);
//        double average = sum / a.length;
//        System.out.println("\nAverage of elements is " + average);

//        int min = a[0];
//        int max = a[0];
//        for(int i  = 0; i < a.length; i++){
//            if (a[i] < min) {
//                min = a[i];
//            }
//            if (a[i] > max) {
//                max = a[i];
//            }
//        }
//
//        System.out.println("\nMin of elements is " + min);
//        System.out.println("\nMax of elements is " + max);


        System.out.println("Sum" + elements() + array_sum(a));
        System.out.println("\nAverage" + elements() + array_average(a));
        System.out.println("\nMin" + elements() + array_min(a));
        System.out.println("\nMax" + elements() + array_max(a));
        System.out.println("\nProduct" + elements() + array_product(a));

//        System.out.println(a[4]);
    }


}
