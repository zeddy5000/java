package streams;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("C:\\Users\\ISU ZEDDY\\IdeaProjects\\strings.regex\\test2.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String sentence = reader.readLine();
            System.out.println(sentence);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
}
