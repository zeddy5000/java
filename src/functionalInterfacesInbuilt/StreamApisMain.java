package functionalInterfacesInbuilt;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class StreamApisMain {
    public static void main(String[] args) {
        //creating streams
        // by calling .stream method on a collection
        Stream<Integer> numbers = Stream.empty();
        Stream<Integer> numbers2 = Stream.of(20,30,40,50);
        Supplier<Integer> sup = ()-> new Random().nextInt();
      //  Stream<Integer> numberList = Stream.generate((sup));
        // numberList.forEach((numb)-> System.out.println(numb));
        UnaryOperator<Integer> unaryOperator = (number)->number+1;
        Stream<Integer> badChars = Stream.iterate(1,unaryOperator).limit(10);
        badChars.forEach((c)-> System.out.println(c));
    }
    private static  Stream<Integer> getStream(){
        return Stream.empty();
    }
    private static List<Integer> integerList(){
        return Collections.emptyList();
    }
}
