package Task;

import java.io.*;
import java.util.ArrayList;

public class FileHandler {

    ArrayList<String> Lines;

    public void read(String a) {
        String fileName = a;

        String line = null;

        try {

            FileReader fileReader = new FileReader(fileName);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {

                Lines.add(line);

            }

            bufferedReader.close();

        } catch (FileNotFoundException ex) {

            System.out.println("Unable to open file '" + fileName + "'");

        } catch (IOException ex) {

            System.out.println("Error reading file '" + fileName + "'");

        }
    }

    public FileHandler(String a) {

        Lines = new ArrayList<String>();
        read(a);

    }

//    public int getNumberOfWords() {
//        return Lines.toString().split("[\\s,;]").length;
//    }

    public int getNumberOfWords() {

        int count = 0;
        String[] data = Lines.toString().split("[\\s,;]+");

        for (int i = 0; i < data.length; i++) {
            count++;
        }

        return count;

    }

    public int getNumberOfChars() {
        return Lines.toString().length() - 2;
    }

    public int getNumberOfLines() {
        return Lines.size();
    }

    public void printInfo() {
        System.out.println("The number of lines is: " + getNumberOfLines() + "\nThe number of Chars are: "
                + getNumberOfChars() + "\nThe number of Words are: " + getNumberOfWords());
    }

}