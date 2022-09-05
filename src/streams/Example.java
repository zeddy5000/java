package streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Example {
    public static void main(String[] args) {
        Dog dog = new Dog("bingo",7);
        try {
            ObjectOutputStream out = new ObjectOutputStream( new FileOutputStream("Dog"));
            out.writeObject(dog);

        }

        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
