package Wednesday;

public class Wednesday {


    public static String build_string(int start, int end, String separator) {


        String output = "";

        for (int i = start; i <= end; i++) {

            output = output + i + separator;
        }

        return output.substring(0, output.length() - separator.length()) + ".";

    }

    public static String repeatStr( int end, String separator) {


        String output = "";

        for (int i = 0; i < end; i++) {

            output = output + separator ;
        }

        return output;

    }

    public static String repeatStrLn( int end, String separator) {


        String output = "";

        for (int i = 0; i < end; i++) {

            output = output + separator ;
        }

        return output;

    }

//    public static String repeatStrSpace( int end, String separator, int spaces) {
//        String output = "";
//
//        for (int i = 0; i < spaces; i++ ){
//            output = output + " ";
//        }
//
//        return output + repeatStr(end, separator);
//
//    } Long^^^^^ Short\/\/\/\/\/

    public static String repeatStrSpace( int end, String separator, int spaces) {


        return repeatStr(spaces , " " ) + repeatStr(end, separator);

    }

    public static String repeatStrSpaceLn( int end, String separator, int spaces) {


        return repeatStr(spaces , " " ) + repeatStr(end, separator);

    }


    public static void main(String[] args) {

        // 5 * 3 "*"
        for(int x = 0 ; x < 3; x++){
            for (int y = 0 ; y < 5; y++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n Diag ");
        // diag
        for(int x = 0 ; x <= 6; x++){
            for (int y = x ; y < 5; y++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n Diag opp" );
        // diag opposite
        for(int x = 6 ; x >= 0; x--){
            for (int y = x ; y < 5; y++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n  Reverse Diag ");


        for(int x = 0 ; x < 6; x++){
            for (int y = 0 ; y < x; y++){
                System.out.print(" ");
            }

            for (int y = x ; y < 5; y++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n Reverse Diag opp" );
        // diag opposite
        for(int x = 6 ; x >= 0; x--){
            for (int y = 0 ; y < x; y++){
                System.out.print(" ");
            }

            for (int y = x ; y < 5; y++){
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println(build_string(1, 10, ", "));

        System.out.println();
        System.out.print(repeatStr(   20,"~"));
        System.out.print(repeatStrSpace(20,"~",  5));

        System.out.println();
        System.out.print(repeatStrLn(   20,"~"));
        System.out.print(repeatStrSpaceLn(20,"~",  5));


        //loop header
    /*for('initial value' 'control variable' int i=0; 'exit variable' i<9; 'increment variable' i++; )   {
        //Loop body. will run 9 times

    }
     */
//    int [] a = new int[10];
//
//    for(int i = 0 ; i < a.length; i++){
//        System.out.println(i);
//    }


//        for(int i = 0 ; i < 21; i++){ //0, 5, 10.... 100 always try to increment by 1 (i++)
//            System.out.println(i*5);
//        }


//        for(int i = -3 ; i < 3; i++){
//            System.out.print(i + " ");
//        }
//        System.out.println("\n");
//
//
//        for(int i = 8 ; i < 12; i++){
//            System.out.print(i +",\n");
//        }
//        System.out.println("\n");
//
//        for(int i = 0 ; i < 6; i++) {
//            if (i == 5) {
//                System.out.print(i * 3 + ". ");
//            } else {
//                System.out.print( i * 3  + ", " );
//            }
//        }

//        public static String counter; {
//            String output = "";
//            for (int i = 0; i < 6; i++) {
//                output = output + i * 3 + ", ";
//            }
//            System.out.println(output.substring(0, 18) + ".");
//            System.out.println(output.substring(0, output.length() - 2) + ".");
//
//
//            String starOutput = "*";
//            for (int i = 0; i < 6; i++) {
//
//                starOutput = starOutput + i + "*";
//            }
//            System.out.println(starOutput.substring(0, 6) + "\n" + starOutput.substring(0, 6) + "\n" + starOutput.substring(0, 6));
//
//        }


//        for(int i = 15 ; i < 16; i++){
//            System.out.print( i   + ". " );
//        }

//        for (int i = 0; i < 15; i = i + 3  ){
//            System.out.print("\n" + i + 3);
//        }
    }
}
