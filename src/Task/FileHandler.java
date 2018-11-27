package Task;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class FileHandler {

    ArrayList<String> Lines;


    public void read(String a){
        // The name of the file to open.
        String fileName = a;

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =
                    new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                Lines.add(line);
            }

            // Always close files.
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");
        } catch (IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }

    public  FileHandler(String a) {

        Lines = new ArrayList<String>();
        read(a);

    }

//
//    public void getNumberOfWords() {
//
//    }
//
//    public void getNumberOfChars() {
//
//
//    }
//
    public int getNumberofLines()  {
return Lines.size();
    }


}