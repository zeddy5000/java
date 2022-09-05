package streams;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class streams2 {
    public static void main(String[] args) {
        //write to a file
        try {
            PrintWriter printWriter = new PrintWriter("test.txt");
            printWriter.println("Oma is a princess");
            printWriter.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //try with resources
        try( PrintWriter printWriter = new PrintWriter("test2.txt")) {

            printWriter.println("Oma is a princess");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
