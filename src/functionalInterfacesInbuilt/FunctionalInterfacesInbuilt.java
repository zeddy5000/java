package functionalInterfacesInbuilt;

import streams.Str;

import java.util.function.*;

public class FunctionalInterfacesInbuilt {
    //Functional Interfaces are
    //Consumer
    //BiConsumer
    //Predicate
    //BiPredicate
    //Function
    //BiFunction
    //UnaryOperator
    //BinaryOperator
    public static void main(String[] args) {
        Consumer<Integer> consumer = System.out::println;
        consumer.accept(234);

        BiConsumer<String,Integer> biConsumer = (name,age)-> System.out.println("My name is "+name+"  and i am "+age+" years");
        biConsumer.accept("zed",30);

        Predicate<Integer> predicate = (number)-> number == 24;
        System.out.println(predicate.test(24));
        BiPredicate<Integer, String> biPredicate = (num,name)->
                String.valueOf(num).equals(name);
        System.out.println(biPredicate.test(5,"5"));
        Function<String,String> func = (word)->  new StringBuilder(word).reverse().toString();
        System.out.println(func.apply("james"));

    }

}
