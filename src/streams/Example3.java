package streams;

import java.io.*;

public class Example3 {
    public static void main(String[] args) {
        try {

            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("dog"));
            Dog dog = (Dog)objectInputStream.readObject();
            System.out.println(dog);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
